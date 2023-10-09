package com.junethewoods.themato.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class MTCommonConfigs {
    public final BooleanValue ipeForestGeneration;

    public MTCommonConfigs(ForgeConfigSpec.Builder builder) {
        builder.comment("Welcome to the Mato's config files. This will be used to turn on or off features from the mod, mainly related to world generation.");

        builder.push("worldGeneration");
        this.ipeForestGeneration = builder.comment("Allow Ipe Forests to generate?").translation("configs.themato.ipeForestGeneration").define("ipeForestGeneration", true);
        builder.pop();
    }
}
