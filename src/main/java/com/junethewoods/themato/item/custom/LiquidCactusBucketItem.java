package com.junethewoods.themato.item.custom;

import com.junethewoods.themato.item.MTItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class LiquidCactusBucketItem extends Item {
    public LiquidCactusBucketItem(Properties properties) {
        super(properties);
    }

    @Override
    @Nonnull
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (player.isShiftKeyDown()) {
            ItemStack handStack = player.getItemInHand(hand);
            player.setItemSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.BUCKET));
            player.addItem(new ItemStack(MTItems.CACTUS_CANDY.get()));
            return ActionResult.success(handStack);
        }
        return super.use(world, player, hand);
    }
}
