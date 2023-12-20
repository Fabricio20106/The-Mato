package com.junethewoods.themato.biome;

import com.junethewoods.themato.world.MTFeatures;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;

public class MTDefaultBiomeFeatures {
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
}
