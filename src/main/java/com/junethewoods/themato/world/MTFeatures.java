package com.junethewoods.themato.world;

import com.google.common.collect.ImmutableList;
import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.MTBlocks;
import com.junethewoods.themato.world.stateprovider.custom.MatoFlowerBlockStateProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.DarkOakFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FancyFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.NoiseDependant;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.trunkplacer.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.FancyTrunkPlacer;

import java.util.OptionalInt;
import java.util.function.Supplier;

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

    public static final ConfiguredFeature<?, ?> IPE_TREES = register("ipe_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
                    PINK_IPE_TREE.weighted(0.25f), PURPLE_IPE_TREE.weighted(0.25f), RED_IPE_TREE.weighted(0.25f)), YELLOW_IPE_TREE)).decorated(
                            Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(7, 0.3f, 2))));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JUNIUM_TREE = register("junium_tree",
            Feature.TREE.configured(new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(MTBlocks.JUNIUM_LOG.get().defaultBlockState()),
                    new SimpleBlockStateProvider(MTBlocks.JUNIUM_LEAVES.get().defaultBlockState()),
                    new DarkOakFoliagePlacer(FeatureSpread.fixed(0), FeatureSpread.fixed(0)),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    new ThreeLayerFeature(1, 1, 0, 1, 2, OptionalInt.empty()))
                    .maxWaterDepth(Integer.MAX_VALUE).ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    public static final ConfiguredFeature<?, ?> JUNIUM_TREES = register("junium_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            JUNIUM_TREE.weighted(0.667f)), JUNIUM_TREE)).decorated(
            Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(7, 0.3f, 2))));

    private static final ImmutableList<Supplier<ConfiguredFeature<?, ?>>> MATO_FLOWERS_LIST = ImmutableList.of(
            () -> Feature.RANDOM_PATCH.configured(new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(MTBlocks.ROSE.get().defaultBlockState()), new SimpleBlockPlacer()).tries(64).noProjection().build()),
            () -> Feature.RANDOM_PATCH.configured(new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(MTBlocks.CYAN_ROSE.get().defaultBlockState()),new SimpleBlockPlacer()).tries(64).noProjection().build()),
            () -> Feature.RANDOM_PATCH.configured(new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(MTBlocks.PAEONIA.get().defaultBlockState()),new SimpleBlockPlacer()).tries(64).noProjection().build()));

    public static final ConfiguredFeature<?, ?> MATO_FLOWERS_MOD = register("mato_flowers_mod", Feature.SIMPLE_RANDOM_SELECTOR.configured(
                    new SingleRandomFeature(MATO_FLOWERS_LIST)).count(FeatureSpread.of(-3, 4)).decorated(Features.Placements.ADD_32)
            .decorated(Features.Placements.HEIGHTMAP_SQUARE).count(5));

    public static final ConfiguredFeature<?, ?> MATO_FLOWERS_VANILLA = register("mato_flowers_vanilla", Feature.FLOWER.configured(new BlockClusterFeatureConfig.Builder(MatoFlowerBlockStateProvider.INSTANCE, SimpleBlockPlacer.INSTANCE)
            .tries(64).build()));
    public static final ConfiguredFeature<?, ?> DECORATED_MATO_FLOWERS = register("decorated_mato_flowers", MATO_FLOWERS_VANILLA.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP).squared().decorated(
            Placement.COUNT_NOISE.configured(new NoiseDependant(-0.8D, 15, 4))));

    public static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, TheMato.resourceLoc(name), configuredFeature);
    }
}
