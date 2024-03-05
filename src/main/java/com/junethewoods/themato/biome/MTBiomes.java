package com.junethewoods.themato.biome;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.sound.MTSounds;
import com.junethewoods.themato.world.surface.MTSurfaceBuilders;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.junethewoods.themato.biome.MTDefaultBiomeFeatures.*;
import static net.minecraft.world.biome.DefaultBiomeFeatures.*;

public class MTBiomes {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, TheMato.MOD_ID);

    public static final RegistryObject<Biome> IPE_FOREST = BIOMES.register("ipe_forest", MTBiomes::ipeForest);
    public static final RegistryObject<Biome> THE_WOODS = BIOMES.register("the_woods", MTBiomes::theWoods);

    // 1.18 Biomes
    public static final RegistryObject<Biome> MEADOW = BIOMES.register("meadow", MTBiomes::meadow);
    public static final RegistryObject<Biome> GROVE = BIOMES.register("grove", MTBiomes::grove);
    public static final RegistryObject<Biome> FROZEN_PEAKS = BIOMES.register("frozen_peaks", MTBiomes::frozenPeaks);

    private static Biome ipeForest() {
        MobSpawnInfo.Builder spawns = new MobSpawnInfo.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder settings = new BiomeGenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        addIpeTrees(settings);
        addWaterLakes(settings);

        addDefaultUndergroundVariety(settings);
        addJungleGrass(settings);
        addDefaultOres(settings);
        addDefaultCarvers(settings);
        addDefaultSoftDisks(settings);
        addDefaultSprings(settings);
        addDefaultFlowers(settings);
        addDefaultMonsterRoom(settings);
        addSurfaceFreezing(settings);
        addDefaultOverworldLandStructures(settings);

        commonSpawns(spawns);
        farmAnimals(spawns);

        return new Biome.Builder().precipitation(Biome.RainType.RAIN).biomeCategory(Biome.Category.FOREST).depth(0.1F).scale(0.2F).temperature(0.7F)
                .downfall(0.8F).specialEffects(new BiomeAmbience.Builder().waterColor(4159204).waterFogColor(329011).fogColor(12638463)
                        .skyColor(0x82A8FF).ambientMoodSound(MoodSoundAmbience.LEGACY_CAVE_SETTINGS).grassColorOverride(0x3B9444).build())
                .mobSpawnSettings(spawns.build()).generationSettings(settings.build()).build();
    }

    private static Biome theWoods() {
        MobSpawnInfo.Builder spawns = new MobSpawnInfo.Builder();
        BiomeGenerationSettings.Builder settings = new BiomeGenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        addDefaultUndergroundVariety(settings);
        addJuniumTrees(settings);
        addJungleGrass(settings);
        addDefaultOres(settings);
        addDefaultCarvers(settings);
        addDefaultSoftDisks(settings);
        addDefaultSprings(settings);
        addForestFlowers(settings);
        addDefaultMonsterRoom(settings);
        addSurfaceFreezing(settings);
        addWaterLakes(settings);
        addDefaultOverworldLandStructures(settings);
        settings.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD);

        commonSpawns(spawns);
        farmAnimals(spawns);

        return new Biome.Builder().precipitation(Biome.RainType.RAIN).biomeCategory(Biome.Category.FOREST).depth(0.1F).scale(0.2F).temperature(0.7F)
                .downfall(0.8F).specialEffects(new BiomeAmbience.Builder().waterColor(0x24E2FF).waterFogColor(0x17E5E0).fogColor(12638463)
                        .skyColor(0x82A8FF).ambientMoodSound(MoodSoundAmbience.LEGACY_CAVE_SETTINGS).grassColorOverride(0x2DB171).build())
                .mobSpawnSettings(spawns.build()).generationSettings(settings.build()).build();
    }

    private static Biome meadow() {
        MobSpawnInfo.Builder spawns = new MobSpawnInfo.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder settings = new BiomeGenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        settings.addStructureStart(StructureFeatures.VILLAGE_PLAINS);
        settings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST);
        MTDefaultBiomeFeatures.globalOverworldGeneration(settings);
        DefaultBiomeFeatures.addPlainGrass(settings);
        DefaultBiomeFeatures.addDefaultOres(settings);
        DefaultBiomeFeatures.addDefaultSoftDisks(settings);
        DefaultBiomeFeatures.addExtraEmeralds(settings);
        MTDefaultBiomeFeatures.addMeadowVegetation(settings);
        DefaultBiomeFeatures.addInfestedStone(settings);

        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.DONKEY, 1, 1, 2)).addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.RABBIT,
                2, 2, 6)).addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.SHEEP, 2, 2, 4));
        commonSpawns(spawns);

        return new Biome.Builder().precipitation(Biome.RainType.RAIN).biomeCategory(Biome.Category.EXTREME_HILLS).depth(1.5F).scale(0.1F).temperature(0.5F).downfall(0.8F).specialEffects(
                new BiomeAmbience.Builder().waterColor(937679).waterFogColor(329011).fogColor(12638463).skyColor(MTDefaultBiomeFeatures.calculateSkyColor(0.8F)).ambientMoodSound(
                        MoodSoundAmbience.LEGACY_CAVE_SETTINGS).backgroundMusic(BackgroundMusicTracks.createGameMusic(MTSounds.MEADOW_MUSIC.get())).build()).mobSpawnSettings(spawns.build()).generationSettings(settings.build()).build();
    }

    private static Biome grove() {
        MobSpawnInfo.Builder spawns = new MobSpawnInfo.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder settings = new BiomeGenerationSettings.Builder().surfaceBuilder(MTSurfaceBuilders.GROVE);

        MTDefaultBiomeFeatures.globalOverworldGeneration(settings);
        MTDefaultBiomeFeatures.addCavesAndCliffsMountainOres(settings);
        MTDefaultBiomeFeatures.addGroveTrees(settings);
        MTDefaultBiomeFeatures.addPowderSnow(settings);
        DefaultBiomeFeatures.addDefaultOres(settings);
        DefaultBiomeFeatures.addDefaultSoftDisks(settings);
        DefaultBiomeFeatures.addDefaultExtraVegetation(settings);
        DefaultBiomeFeatures.addInfestedStone(settings);

        spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.WOLF, 8, 4, 4)).addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.RABBIT, 4,
                2, 3)).addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.FOX, 8, 2, 4));
        commonSpawns(spawns);
        farmAnimals(spawns);

        return new Biome.Builder().precipitation(Biome.RainType.SNOW).biomeCategory(Biome.Category.FOREST).depth(1.5F).scale(0.7F).temperature(-0.2F).downfall(0.8F).specialEffects(
                new BiomeAmbience.Builder().waterColor(4159204).waterFogColor(329011).fogColor(12638463).skyColor(calculateSkyColor(-0.2F)).ambientMoodSound(MoodSoundAmbience.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(BackgroundMusicTracks.createGameMusic(MTSounds.GROVE_MUSIC.get())).build()).mobSpawnSettings(spawns.build()).generationSettings(settings.build()).build();
    }

    private static Biome frozenPeaks() {
        MobSpawnInfo.Builder spawns = new MobSpawnInfo.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder settings = new BiomeGenerationSettings.Builder().surfaceBuilder(MTSurfaceBuilders.FROZEN_PEAKS);

        settings.addStructureStart(StructureFeatures.PILLAGER_OUTPOST);
        MTDefaultBiomeFeatures.globalOverworldGeneration(settings);
        MTDefaultBiomeFeatures.addCavesAndCliffsMountainOres(settings);
        MTDefaultBiomeFeatures.addPowderSnow(settings);
        // Todo: Fix this later.
        // MTDefaultBiomeFeatures.addFrozenSprings(settings);
        DefaultBiomeFeatures.addDefaultOres(settings);
        DefaultBiomeFeatures.addDefaultSoftDisks(settings);
        DefaultBiomeFeatures.addInfestedStone(settings);

        commonSpawns(spawns);

        return new Biome.Builder().precipitation(Biome.RainType.SNOW).biomeCategory(Biome.Category.EXTREME_HILLS).depth(3).scale(1).temperature(-0.7F).downfall(0.9F).specialEffects(
                new BiomeAmbience.Builder().waterColor(4159204).waterFogColor(329011).fogColor(12638463).grassColorOverride(0x80B497).foliageColorOverride(0x60A17B).skyColor(
                        MTDefaultBiomeFeatures.calculateSkyColor(0.9F)).ambientMoodSound(MoodSoundAmbience.LEGACY_CAVE_SETTINGS).backgroundMusic(BackgroundMusicTracks.createGameMusic(MTSounds.FROZEN_PEAKS_MUSIC.get())).build())
                .mobSpawnSettings(spawns.build()).generationSettings(settings.build()).build();
    }
}
