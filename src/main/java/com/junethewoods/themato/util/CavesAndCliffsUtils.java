package com.junethewoods.themato.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class CavesAndCliffsUtils {
    public static ItemStack createFilledResult(ItemStack filledStack, PlayerEntity player, ItemStack emptyStack, boolean bool) {
        boolean flag = player.abilities.instabuild;
        if (bool && flag) {
            if (!player.inventory.contains(emptyStack)) {
                player.inventory.add(emptyStack);
            }

            return filledStack;
        } else {
            if (!flag) {
                filledStack.shrink(1);
            }

            if (filledStack.isEmpty()) {
                return emptyStack;
            } else {
                if (!player.inventory.add(emptyStack)) {
                    player.drop(emptyStack, false);
                }

                return filledStack;
            }
        }
    }

    public static ItemStack createFilledResult(ItemStack filledStack, PlayerEntity player, ItemStack emptyStack) {
        return createFilledResult(filledStack, player, emptyStack, true);
    }
}
