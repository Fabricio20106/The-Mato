package com.junethewoods.themato.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MTCavesAndCliffsConfigs {
    // World Generation
    public final ForgeConfigSpec.BooleanValue meadowGeneration;
    public final ForgeConfigSpec.BooleanValue groveGeneration;
    public final ForgeConfigSpec.BooleanValue frozenPeaksGeneration;
    public final ForgeConfigSpec.BooleanValue snowySlopesGeneration;
    public final ForgeConfigSpec.BooleanValue jaggedPeaksGeneration;
    public final ForgeConfigSpec.BooleanValue stonyPeaksGeneration;

    // Blocks
    public final ForgeConfigSpec.DoubleValue waterCauldronFillChance;
    public final ForgeConfigSpec.DoubleValue powderSnowCauldronFillChance;
    public final ForgeConfigSpec.BooleanValue lavaCauldronsLeaveLava;

    public MTCavesAndCliffsConfigs(ForgeConfigSpec.Builder builder) {
        builder.push("worldGeneration");
        this.meadowGeneration = builder.comment("Allow Meadows to generate?").define("meadowGeneration", true);
        this.groveGeneration = builder.comment("Allow Groves to generate?").define("groveGeneration", true);
        this.frozenPeaksGeneration = builder.comment("Allow Frozen Peaks to generate?").define("frozenPeaksGeneration", true);
        this.snowySlopesGeneration = builder.comment("Allow Snowy Slopes to generate?").define("snowySlopesGeneration", true);
        this.jaggedPeaksGeneration = builder.comment("Allow Jagged Peaks to generate?").define("jaggedPeaksGeneration", true);
        this.stonyPeaksGeneration = builder.comment("Allow Stony Peaks to generate?").define("stonyPeaksGeneration", true);
        builder.pop();

        builder.push("blocks");
        this.waterCauldronFillChance = builder.comment("Chance of Water Cauldrons getting filled during rain.").defineInRange("waterCauldronFillChance", 0.05, 0, 1);
        this.powderSnowCauldronFillChance = builder.comment("Chance of Powder Snow Cauldrons getting filled during snowfalls.").defineInRange("powderSnowCauldronFillChance", 0.1, 0, 1);
        this.lavaCauldronsLeaveLava = builder.comment("Whether Lava Cauldrons, when blown up, leave lava in their place.").define("lavaCauldronsLeaveLava", true);
        builder.pop();
    }
}
