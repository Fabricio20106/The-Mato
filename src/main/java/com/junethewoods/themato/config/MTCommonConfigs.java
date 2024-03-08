package com.junethewoods.themato.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class MTCommonConfigs {
    public final BooleanValue ipeForestGeneration;
    public final BooleanValue theWoodsGeneration;
    public final BooleanValue meadowGeneration;
    public final BooleanValue groveGeneration;
    public final BooleanValue frozenPeaksGeneration;
    public final BooleanValue snowySlopesGeneration;
    public final BooleanValue jaggedPeaksGeneration;
    public final BooleanValue stonyPeaksGeneration;
    public final BooleanValue matoFlowersGeneration;

    public MTCommonConfigs(ForgeConfigSpec.Builder builder) {
        builder.comment("Welcome to the Mato's config files. This will be used to turn on or off features from the mod, mainly related to world generation.");

        builder.push("worldGeneration");
        this.ipeForestGeneration = builder.comment("Allow Ipe Forests to generate?").translation("configs.themato.ipeForestGeneration").define("ipeForestGeneration", true);
        this.theWoodsGeneration = builder.comment("Allow The Woods (biome) to generate?").translation("configs.themato.theWoodsGeneration").define("theWoodsGeneration", true);
        this.meadowGeneration = builder.comment("Allow Meadows (from 1.18) to generate?").define("meadowGeneration", true);
        this.groveGeneration = builder.comment("Allow Groves (from 1.18) to generate?").define("groveGeneration", true);
        this.frozenPeaksGeneration = builder.comment("Allow Frozen Peaks (from 1.18) to generate?").define("frozenPeaksGeneration", true);
        this.snowySlopesGeneration = builder.comment("Allow Snowy Slopes (from 1.18) to generate?").define("snowySlopesGeneration", true);
        this.jaggedPeaksGeneration = builder.comment("Allow Jagged Peaks (from 1.18) to generate?").define("jaggedPeaksGeneration", true);
        this.stonyPeaksGeneration = builder.comment("Allow Stony Peaks (from 1.18) to generate?").define("stonyPeaksGeneration", true);
        this.matoFlowersGeneration = builder.comment("Allow flowers added by The Mato (roses, cyan roses and paeonias) to generate?").translation("configs.themato.matoFlowersGeneration").define("matoFlowersGeneration", true);
        builder.pop();
    }
}
