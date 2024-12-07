package com.junethewoods.themato.block.custom.cauldron;

import com.junethewoods.themato.cauldron.CauldronInteraction;
import com.junethewoods.themato.config.MTConfigs;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class LavaCauldronBlock extends AbstractCauldronBlock {
    public LavaCauldronBlock(Properties properties) {
        super(properties, CauldronInteraction.LAVA);
    }

    @Override
    protected double getContentHeight(BlockState state) {
        return 0.9375D;
    }

    @Override
    public boolean isFull(BlockState state) {
        return true;
    }

    @Override
    public void entityInside(BlockState state, World world, BlockPos pos, Entity entity) {
        if (this.isEntityInsideContent(state, pos, entity)) {
            entity.setSecondsOnFire(15);
            if (entity.hurt(DamageSource.LAVA, 4)) {
                entity.playSound(SoundEvents.GENERIC_BURN, 0.4F, 2 + world.random.nextFloat() * 0.4F);
            }
        }
    }

    @Override
    public void onBlockExploded(BlockState state, World world, BlockPos pos, Explosion explosion) {
        if (MTConfigs.CAVES_AND_CLIFFS_CONFIGS.lavaCauldronsLeaveLava.get()) {
            world.setBlockAndUpdate(pos, Blocks.LAVA.defaultBlockState());
            getBlock().wasExploded(world, pos, explosion);
        }
        super.onBlockExploded(state, world, pos, explosion);
    }

    @Override
    public int getAnalogOutputSignal(BlockState state, World world, BlockPos pos) {
        return 3;
    }
}
