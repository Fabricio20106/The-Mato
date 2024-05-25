package com.junethewoods.themato.block.custom.cauldron;

import com.junethewoods.themato.block.MTBlocks;
import com.junethewoods.themato.cauldron.CauldronInteraction;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import java.util.Map;
import java.util.function.Predicate;

public class LayeredCauldronBlock extends AbstractCauldronBlock {
    public static final IntegerProperty LEVEL = IntegerProperty.create("level", 1, 3);
    public static final Predicate<Biome.RainType> RAIN = (precipitation) -> precipitation == Biome.RainType.RAIN;
    public static final Predicate<Biome.RainType> SNOW = (precipitation) -> precipitation == Biome.RainType.SNOW;
    private final Predicate<Biome.RainType> fillPredicate;

    public LayeredCauldronBlock(Properties properties, Predicate<Biome.RainType> fillPredicate, Map<Item, CauldronInteraction> interactionMap) {
        super(properties, interactionMap);
        this.fillPredicate = fillPredicate;
        this.registerDefaultState(this.stateDefinition.any().setValue(LEVEL, 1));
    }

    @Override
    public boolean isFull(BlockState state) {
        return state.getValue(LEVEL) == 3;
    }

    @Override
    protected double getContentHeight(BlockState state) {
        return (6 + (double) state.getValue(LEVEL) * 3) / 16;
    }

    @Override
    public void entityInside(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClientSide && entity.isOnFire() && this.isEntityInsideContent(state, pos, entity)) {
            entity.clearFire();
            this.handleBurningEntityInside(state, world, pos);
        }
    }

    protected void handleBurningEntityInside(BlockState state, World world, BlockPos pos) {
        lowerFillLevel(state, world, pos);
    }

    public static void lowerFillLevel(BlockState state, World world, BlockPos pos) {
        int level = state.getValue(LEVEL) - 1;
        world.setBlockAndUpdate(pos, level == 0 ? MTBlocks.CAULDRON.get().defaultBlockState() : state.setValue(LEVEL, level));
    }

    @Override
    public void handleRain(World world, BlockPos pos) {
        if (EmptyCauldronBlock.shouldHandlePrecipitation(world, world.getBiome(pos).getPrecipitation()) && world.getBlockState(pos).getValue(LEVEL) != 3 && this.fillPredicate.test(world.getBiome(pos).getPrecipitation())) {
            world.setBlockAndUpdate(pos, world.getBlockState(pos).cycle(LEVEL));
        }
    }

    @Override
    public int getAnalogOutputSignal(BlockState state, World world, BlockPos pos) {
        return state.getValue(LEVEL);
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(LEVEL);
    }
}
