package com.junethewoods.themato.world;

import com.google.common.collect.ImmutableList;
import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.MTBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.FancyFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.trunkplacer.FancyTrunkPlacer;

import java.util.OptionalInt;

public class MTFeatures {
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PINK_IPE_TREE = register("pink_ipe_tree",
            Feature.TREE.configured(new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(MTBlocks.PINK_IPE_LOG.get().defaultBlockState()),
                    new SimpleBlockStateProvider(MTBlocks.PINK_IPE_LEAVES.get().defaultBlockState()),
                    new FancyFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(4), 4),
                    new FancyTrunkPlacer(3, 11, 0),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))
                    .ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> PURPLE_IPE_TREE = register("purple_ipe_tree",
            Feature.TREE.configured(new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(MTBlocks.PURPLE_IPE_LOG.get().defaultBlockState()),
                    new SimpleBlockStateProvider(MTBlocks.PURPLE_IPE_LEAVES.get().defaultBlockState()),
                    new FancyFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(4), 4),
                    new FancyTrunkPlacer(3, 11, 0),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))
                    .ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RED_IPE_TREE = register("red_ipe_tree",
            Feature.TREE.configured(new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(MTBlocks.RED_IPE_LOG.get().defaultBlockState()),
                    new SimpleBlockStateProvider(MTBlocks.RED_IPE_LEAVES.get().defaultBlockState()),
                    new FancyFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(4), 4),
                    new FancyTrunkPlacer(3, 11, 0),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))
                    .ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> YELLOW_IPE_TREE = register("yellow_ipe_tree",
            Feature.TREE.configured(new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(MTBlocks.YELLOW_IPE_LOG.get().defaultBlockState()),
                    new SimpleBlockStateProvider(MTBlocks.YELLOW_IPE_LEAVES.get().defaultBlockState()),
                    new FancyFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(4), 4),
                    new FancyTrunkPlacer(3, 11, 0),
                    new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))
                    .ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    public static final ConfiguredFeature<?, ?> YELLOW_IPE_TREES = register("yellow_ipe_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
                    PINK_IPE_TREE.weighted(0.25f), PURPLE_IPE_TREE.weighted(0.25f), RED_IPE_TREE.weighted(0.25f), YELLOW_IPE_TREE.weighted(
                            0.25f)), YELLOW_IPE_TREE)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
                                    new AtSurfaceWithExtraConfig(7, 0.3f, 2))));

    public static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, TheMato.resourceLoc(name), configuredFeature);
    }
}
