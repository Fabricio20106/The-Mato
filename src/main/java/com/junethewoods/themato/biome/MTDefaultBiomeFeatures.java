package com.junethewoods.themato.biome;

import com.junethewoods.themato.world.MTFeatures;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.ConfiguredCarvers;
import net.minecraft.world.gen.feature.Features;

public class MTDefaultBiomeFeatures {
    public static int calculateSkyColor(float downfall) {
        float f = downfall / 3;
        f = MathHelper.clamp(f, -1, 1);
        return MathHelper.hsvToRgb(0.62222224F - f * 0.05F, 0.5F + f * 0.1F, 1);
    }

    public static void addWaterLakes(BiomeGenerationSettings.Builder settings) {
        settings.addFeature(GenerationStage.Decoration.LAKES, Features.LAKE_WATER);
    }

    // Trees
    public static void addIpeTrees(BiomeGenerationSettings.Builder settings) {
        settings.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MTFeatures.IPE_TREES);
    }

    public static void addJuniumTrees(BiomeGenerationSettings.Builder settings) {
        settings.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MTFeatures.JUNIUM_TREES);
    }

    public static void addMeadowVegetation(BiomeGenerationSettings.Builder settings) {
        settings.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_TALL_GRASS_2);
        settings.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MTFeatures.MEADOW_TREES);
        settings.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MTFeatures.MEADOW_FLOWERS);
    }

    public static void addFrozenSprings(BiomeGenerationSettings.Builder settings) {
        settings.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MTFeatures.FROZEN_LAVA_SPRING);
    }

    public static void addGroveTrees(BiomeGenerationSettings.Builder settings) {
        settings.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MTFeatures.GROVE_TREES);
    }

    public static void addPowderSnow(BiomeGenerationSettings.Builder settings) {
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, MTFeatures.POWDER_SNOW_VEIN);
    }

    public static void addCalciteVeins(BiomeGenerationSettings.Builder settings) {
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, MTFeatures.CALCITE_VEIN);
    }

    public static void addStonyPeaksVeins(BiomeGenerationSettings.Builder settings) {
        addCalciteVeins(settings);
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_ANDESITE);
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_GRANITE);
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_GRAVEL);
    }

    public static void addCavesAndCliffsMountainOres(BiomeGenerationSettings.Builder settings) {
        DefaultBiomeFeatures.addExtraEmeralds(settings);
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, MTFeatures.CAC_IRON_ORE);
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, MTFeatures.CAC_COAL_ORE);
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, MTFeatures.CAC_EMERALD_ORE);
    }

    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder settings, boolean undergroundVariety) {
        settings.addCarver(GenerationStage.Carving.AIR, ConfiguredCarvers.CAVE);
        settings.addCarver(GenerationStage.Carving.AIR, ConfiguredCarvers.CANYON);

        DefaultBiomeFeatures.addDefaultMonsterRoom(settings);
        DefaultBiomeFeatures.addDefaultSprings(settings);
        DefaultBiomeFeatures.addSurfaceFreezing(settings);
        if (undergroundVariety) DefaultBiomeFeatures.addDefaultUndergroundVariety(settings);
    }
}
