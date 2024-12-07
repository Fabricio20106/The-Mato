package com.junethewoods.themato.world.surface;

import com.junethewoods.themato.util.MTUtils;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class MTSurfaceBuilders {
    public static final BlockState PACKED_ICE = Blocks.PACKED_ICE.defaultBlockState();
    public static final BlockState SNOW_BLOCK = Blocks.SNOW_BLOCK.defaultBlockState();
    public static final BlockState DIRT = Blocks.DIRT.defaultBlockState();
    public static final BlockState STONE = Blocks.STONE.defaultBlockState();
    public static final BlockState GRAVEL = Blocks.GRAVEL.defaultBlockState();

    public static final SurfaceBuilderConfig FROZEN_PEAKS_CONFIG = new SurfaceBuilderConfig(SNOW_BLOCK, PACKED_ICE, SNOW_BLOCK);
    public static final SurfaceBuilderConfig SNOWY_SLOPES_CONFIG = new SurfaceBuilderConfig(SNOW_BLOCK, SNOW_BLOCK, SNOW_BLOCK);
    public static final SurfaceBuilderConfig JAGGED_PEAKS_CONFIG = new SurfaceBuilderConfig(SNOW_BLOCK, STONE, STONE);
    public static final SurfaceBuilderConfig STONY_PEAKS_CONFIG = new SurfaceBuilderConfig(STONE, STONE, STONE);
    public static final SurfaceBuilderConfig GROVE_CONFIG = new SurfaceBuilderConfig(SNOW_BLOCK, DIRT, GRAVEL);

    public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> FROZEN_PEAKS = register("frozen_peaks", SurfaceBuilder.DEFAULT.configured(FROZEN_PEAKS_CONFIG));
    public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> SNOWY_SLOPES = register("snowy_slopes", SurfaceBuilder.DEFAULT.configured(SNOWY_SLOPES_CONFIG));
    public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> JAGGED_PEAKS = register("snowy_slopes", SurfaceBuilder.DEFAULT.configured(JAGGED_PEAKS_CONFIG));
    public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> STONY_PEAKS = register("stony_peaks", SurfaceBuilder.DEFAULT.configured(STONY_PEAKS_CONFIG));
    public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> GROVE = register("grove", SurfaceBuilder.DEFAULT.configured(GROVE_CONFIG));

    private static <SC extends ISurfaceBuilderConfig> ConfiguredSurfaceBuilder<SC> register(String name, ConfiguredSurfaceBuilder<SC> csb) {
        return WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, MTUtils.theMato(name), csb);
    }

    public static void init() {}
}
