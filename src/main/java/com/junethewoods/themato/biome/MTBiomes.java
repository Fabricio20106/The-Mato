package com.junethewoods.themato.biome;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.world.MTFeatures;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.world.biome.DefaultBiomeFeatures.*;

public class MTBiomes {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, TheMato.MOD_ID);

    public static final RegistryObject<Biome> IPE_FOREST = BIOMES.register("ipe_forest", MTBiomes::ipeForest);

    private static Biome ipeForest() {
        MobSpawnInfo.Builder spawns = new MobSpawnInfo.Builder().setPlayerCanSpawn();
        BiomeGenerationSettings.Builder settings = new BiomeGenerationSettings.Builder().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS);

        settings.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MTFeatures.YELLOW_IPE_TREES);

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
}
