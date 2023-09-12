package com.junethewoods.themato.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class MTCommonConfigs {
    public final BooleanValue absolutelyNothing;

    public MTCommonConfigs(ForgeConfigSpec.Builder builder) {
        builder.comment("Welcome to the Mato's config files. This will be used to turn on/off features from the mod, mainly related to world generation.");

        builder.push("absolutelyNothing");
        this.absolutelyNothing = builder.comment("This does absolutely nothing.").translation("configs.themato.absolutelyNothing").define("absolutelyNothing", false);
        builder.pop();
    }
}
