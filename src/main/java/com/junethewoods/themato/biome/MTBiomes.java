package com.junethewoods.themato.biome;

import com.junethewoods.themato.TheMato;
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

        return new Biome.Builder().precipitation(Biome.RainType.RAIN).biomeCategory(Biome.Category.FOREST).depth(0.1f).scale(0.2f).temperature(0.7f)
                .downfall(0.8f).specialEffects(new BiomeAmbience.Builder().waterColor(4159204).waterFogColor(329011).fogColor(12638463)
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

        return new Biome.Builder().precipitation(Biome.RainType.RAIN).biomeCategory(Biome.Category.FOREST).depth(0.1f).scale(0.2f).temperature(0.7f)
                .downfall(0.8f).specialEffects(new BiomeAmbience.Builder().waterColor(0x24E2FF).waterFogColor(0x17E5E0).fogColor(12638463)
                        .skyColor(0x82A8FF).ambientMoodSound(MoodSoundAmbience.LEGACY_CAVE_SETTINGS).grassColorOverride(0x2DB171).build())
                .mobSpawnSettings(spawns.build()).generationSettings(settings.build()).build();
    }
}
