package com.junethewoods.themato.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockBucketItem extends BlockItem {
//    private final SoundEvent emptySound;
//    SoundEvent emptySound,

    public BlockBucketItem(Block block, Properties properties) {
        super(block, properties);
        DispenserBlock.registerBehavior(this, new DefaultDispenseItemBehavior() {
            private final DefaultDispenseItemBehavior defaultBehavior = new DefaultDispenseItemBehavior();

            public ItemStack execute(IBlockSource source, ItemStack stack) {
                BucketItem bucket = (BucketItem) stack.getItem();
                BlockPos pos = source.getPos().relative(source.getBlockState().getValue(DispenserBlock.FACING));
                World world = source.getLevel();
                if (emptyContents(null, world, pos, null)) {
                    bucket.checkExtraContent(world, stack, pos);
                    return new ItemStack(Items.BUCKET);
                } else {
                    return this.defaultBehavior.dispense(source, stack);
                }
            }
        });
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        ActionResultType resultType = super.useOn(context);
        PlayerEntity player = context.getPlayer();
        if (resultType.consumesAction() && player != null && !player.isCreative()) {
            Hand hand = context.getHand();
            player.setItemInHand(hand, Items.BUCKET.getDefaultInstance());
        }
        return resultType;
    }

    @Override
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
