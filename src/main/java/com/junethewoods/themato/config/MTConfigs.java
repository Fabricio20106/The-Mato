package com.junethewoods.themato.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class MTConfigs {
    public static final MTCommonConfigs MT_COMMON_CONFIGS;
    public static final ForgeConfigSpec COMMON_SPEC;

    static {
        final Pair<MTCommonConfigs, ForgeConfigSpec> serverConfigPair = new ForgeConfigSpec.Builder().configure(MTCommonConfigs::new);

        MT_COMMON_CONFIGS = serverConfigPair.getLeft();
        COMMON_SPEC = serverConfigPair.getRight();
    }

    public static void init() {}
}
