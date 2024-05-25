package com.junethewoods.themato.item.custom;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.item.MTItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.*;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class DyedWaterBucketItem extends Item implements IDyeableArmorItem {
    public DyedWaterBucketItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getDefaultInstance() {
        ItemStack bucketStack = new ItemStack(MTItems.DYED_WATER_BUCKET.get());
        CompoundNBT tag = bucketStack.getOrCreateTag();
        tag.putInt("dyed_water_color", 0x3F76E4);
        return bucketStack;
    }

    @Override
    public int getColor(ItemStack stack) {
        CompoundNBT tag = stack.getOrCreateTag();
        return tag.contains("dyed_water_color", 99) ? tag.getInt("dyed_water_color") : 0x3F76E4;
    }

    @Override
    public void setColor(ItemStack stack, int color) {
        stack.getOrCreateTag().putInt("dyed_water_color", color);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        if (stack.getTag() != null && stack.getTag().contains("dyed_water_color", 99)) {
            Style style = Style.EMPTY.withColor(Color.fromRgb(stack.getTag().getInt("dyed_water_color")));
            tooltip.add(new TranslationTextComponent("tooltip." + TheMato.MOD_ID + ".dyed_water_color", new StringTextComponent(String.format("#%06X", stack.getTag().getInt("dyed_water_color"))).withStyle(style)).withStyle(TextFormatting.GRAY));
        }
        super.appendHoverText(stack, world, tooltip, flag);
    }
}
