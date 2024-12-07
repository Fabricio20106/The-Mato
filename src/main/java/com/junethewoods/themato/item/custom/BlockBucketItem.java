package com.junethewoods.themato.item.custom;

import com.junethewoods.themato.dispenser.BlockBucketDispenseBehavior;
import com.junethewoods.themato.util.MTUtils;
import net.minecraft.block.Block;
import net.minecraft.block.DispenserBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class BlockBucketItem extends BlockItem {
//    private final SoundEvent emptySound;
//    SoundEvent emptySound,

    public BlockBucketItem(Block block, Properties properties) {
        super(block, properties);
        DispenserBlock.registerBehavior(this, new BlockBucketDispenseBehavior());
    }

    @Override
    @Nonnull
    public ActionResultType useOn(ItemUseContext context) {
        ActionResultType resultType = super.useOn(context);
        PlayerEntity player = context.getPlayer();
        if (resultType.consumesAction() && player != null && !player.isCreative()) {
            MTUtils.setItemInHand(player, context.getHand(), new ItemStack(Items.BUCKET));
        }
        return resultType;
    }

    @Override
    @Nonnull
    public String getDescriptionId() {
        return this.getOrCreateDescriptionId();
    }

    /*@Override
    protected SoundEvent getPlaceSound(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        return this.emptySound;
    }*/

    public boolean emptyContents(@Nullable PlayerEntity player, World world, BlockPos pos, @Nullable BlockRayTraceResult hitResult) {
        if (World.isInWorldBounds(pos) && world.isEmptyBlock(pos)) {
            if (!world.isClientSide) world.setBlock(pos, this.getBlock().defaultBlockState(), 3);
//            world.playSound(player, pos, MTSounds.POWDER_SNOW_BUCKET_EMPTY.get(), SoundCategory.BLOCKS, 1, 1);
            return true;
        } else {
            return false;
        }
    }
}
