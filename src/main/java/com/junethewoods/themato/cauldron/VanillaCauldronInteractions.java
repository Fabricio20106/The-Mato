package com.junethewoods.themato.cauldron;

import com.junethewoods.themato.block.custom.cauldron.LayeredCauldronBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.BannerTileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VanillaCauldronInteractions implements CauldronInteraction {
    // Item Cleaning
    // Shulker Box
    public static final CauldronInteraction CLEAN_SHULKER_BOX = (state, world, pos, player, hand, stack) -> {
        Block block = Block.byItem(stack.getItem());
        if (!(block instanceof ShulkerBoxBlock)) {
            return ActionResultType.PASS;
        } else {
            if (!world.isClientSide) {
                ItemStack shulkerBoxStack = new ItemStack(Blocks.SHULKER_BOX);
                if (stack.hasTag() && stack.getTag() != null) shulkerBoxStack.setTag(stack.getTag().copy());

                player.setItemInHand(hand, shulkerBoxStack);
                player.awardStat(Stats.CLEAN_SHULKER_BOX);
                LayeredCauldronBlock.lowerFillLevel(state, world, pos);
            }
            return ActionResultType.sidedSuccess(world.isClientSide);
        }
    };

    public static final CauldronInteraction CLEAN_BANNER = (state, world, pos, player, hand, stack) -> {
        if (BannerTileEntity.getPatternCount(stack) <= 0) {
            return ActionResultType.PASS;
        } else {
            if (!world.isClientSide) {
                ItemStack copyStack = stack.copy();
                copyStack.setCount(1);
                BannerTileEntity.removeLastPattern(copyStack);
                if (!player.abilities.instabuild) stack.shrink(1);

                if (stack.isEmpty()) {
                    player.setItemInHand(hand, copyStack);
                } else {
                    player.drop(copyStack, false);
                }

                player.awardStat(Stats.CLEAN_BANNER);
                LayeredCauldronBlock.lowerFillLevel(state, world, pos);
            }
            return ActionResultType.sidedSuccess(world.isClientSide);
        }
    };

    public static final CauldronInteraction CLEAN_DYED_ITEM = (state, world, pos, player, hand, stack) -> {
        Item item = stack.getItem();
        if (!(item instanceof DyeableArmorItem)) {
            return ActionResultType.PASS;
        } else {
            DyeableArmorItem dyeableArmorItem = (DyeableArmorItem) item;
            if (!dyeableArmorItem.hasCustomColor(stack)) {
                return ActionResultType.PASS;
            } else {
                if (!world.isClientSide) {
                    dyeableArmorItem.clearColor(stack);
                    player.awardStat(Stats.CLEAN_ARMOR);
                    LayeredCauldronBlock.lowerFillLevel(state, world, pos);
                }
                return ActionResultType.sidedSuccess(world.isClientSide);
            }
        }
    };

    @Override
    public ActionResultType interact(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, ItemStack stack) {
        return ActionResultType.PASS;
    }
}
