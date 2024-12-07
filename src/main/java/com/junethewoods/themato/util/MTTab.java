package com.junethewoods.themato.util;

import com.junethewoods.themato.item.MTItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class MTTab extends ItemGroup {
    public static final MTTab TAB = new MTTab("themato_tab");

    public MTTab(String label) {
        super(label);
    }

    @Override
    @Nonnull
    public ItemStack makeIcon() {
        return new ItemStack(MTItems.YELLOW_IPE_PLANKS.get());
    }
}
