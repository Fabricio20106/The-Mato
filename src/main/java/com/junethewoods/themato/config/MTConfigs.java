package com.junethewoods.themato.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class MTConfigs {
    public static final MTCommonConfigs COMMON_CONFIGS;
    public static final MTCavesAndCliffsConfigs CAVES_AND_CLIFFS_CONFIGS;
    public static final ForgeConfigSpec COMMON_SPEC;
    public static final ForgeConfigSpec CAVES_AND_CLIFFS_SPEC;

    static {
        final Pair<MTCommonConfigs, ForgeConfigSpec> commonConfigPair = new ForgeConfigSpec.Builder().configure(MTCommonConfigs::new);
        final Pair<MTCavesAndCliffsConfigs, ForgeConfigSpec> cavesAndCliffsConfigPair = new ForgeConfigSpec.Builder().configure(MTCavesAndCliffsConfigs::new);

        COMMON_CONFIGS = commonConfigPair.getLeft();
        COMMON_SPEC = commonConfigPair.getRight();
        CAVES_AND_CLIFFS_CONFIGS = cavesAndCliffsConfigPair.getLeft();
        CAVES_AND_CLIFFS_SPEC = cavesAndCliffsConfigPair.getRight();
    }

    public static void init() {}
}
