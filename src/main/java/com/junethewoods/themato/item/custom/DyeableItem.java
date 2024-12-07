package com.junethewoods.themato.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public interface DyeableItem {
    default boolean hasCustomColor(ItemStack stack) {
        CompoundNBT displayTag = stack.getTagElement("display");
        return displayTag != null && displayTag.contains("color", 99);
    }

    default int getColor(ItemStack stack) {
        CompoundNBT displayTag = stack.getTagElement("display");
        return displayTag != null && displayTag.contains("color", 99) ? displayTag.getInt("color") : 0xFFFFFF;
    }

    default void clearColor(ItemStack stack) {
        CompoundNBT displayTag = stack.getTagElement("display");
        if (displayTag != null && displayTag.contains("color")) displayTag.remove("color");
    }

    default void setColor(ItemStack stack, int color) {
        stack.getOrCreateTagElement("display").putInt("color", color);
    }
}
