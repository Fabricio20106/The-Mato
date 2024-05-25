package com.junethewoods.themato.event;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.MTBlocks;
import com.junethewoods.themato.blockentity.custom.DyedWaterCauldronBlockEntity;
import com.junethewoods.themato.item.MTItems;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TheMato.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MTEventBusEvents {
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerBlockColorHandlers(final ColorHandlerEvent.Block event) {
        event.getBlockColors().register((state, world, pos, color) -> world != null && pos != null ? BiomeColors.getAverageWaterColor(world, pos) : -1, MTBlocks.WATER_CAULDRON.get());

        event.getBlockColors().register((state, world, pos, color) -> {
            if (world.getBlockEntity(pos) instanceof DyedWaterCauldronBlockEntity) {
                DyedWaterCauldronBlockEntity dyedWaterCauldron = (DyedWaterCauldronBlockEntity) world.getBlockEntity(pos);
                if (dyedWaterCauldron != null) {
                    return dyedWaterCauldron.getDyedWaterColor();
                } else {
                    return 0x3A7A6A; // mangrove swamp
                }
            } else {
                return 0x5DB7EF; // cherry grove
            }
        }, MTBlocks.DYED_WATER_CAULDRON.get());
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerItemColorHandlers(final ColorHandlerEvent.Item event) {
        event.getItemColors().register((stack, color) -> color > 0 ? -1 : getDyedWaterColor(stack), MTItems.DYED_WATER_BUCKET.get());
    }

    private static int getDyedWaterColor(ItemStack stack) {
        CompoundNBT tag = stack.getOrCreateTag();
        if (tag.contains("dyed_water_color", 99)) {
            return tag.getInt("dyed_water_color");
        } else {
            return 0x3F76E4;
        }
    }
}
