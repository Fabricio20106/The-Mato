package com.junethewoods.themato.event;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.MTBlocks;
import com.junethewoods.themato.blockentity.custom.DyedWaterCauldronBlockEntity;
import com.junethewoods.themato.data.lang.MTEnglishLanguageProvider;
import com.junethewoods.themato.data.loottables.MTLootTableProvider;
import com.junethewoods.themato.data.models.MTBlockStateProvider;
import com.junethewoods.themato.data.models.MTItemModelProvider;
import com.junethewoods.themato.data.tags.MTBlockTagsProvider;
import com.junethewoods.themato.data.tags.MTEntityTypeTagsProvider;
import com.junethewoods.themato.data.tags.MTItemTagsProvider;
import com.junethewoods.themato.item.MTItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = TheMato.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MTEventBusEvents {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        // Models
        generator.addProvider(new MTItemModelProvider(generator, fileHelper));
        generator.addProvider(new MTBlockStateProvider(generator, fileHelper));

        // Tags
        MTBlockTagsProvider blockTagsProvider = new MTBlockTagsProvider(generator, fileHelper);
        generator.addProvider(blockTagsProvider);
        generator.addProvider(new MTItemTagsProvider(generator, blockTagsProvider, fileHelper));
        generator.addProvider(new MTEntityTypeTagsProvider(generator, fileHelper));

        // Loot Tables
        generator.addProvider(new MTLootTableProvider(generator));

        // Translations
        generator.addProvider(new MTEnglishLanguageProvider(generator));
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerBlockColorHandlers(final ColorHandlerEvent.Block event) {
        event.getBlockColors().register((state, world, pos, color) -> world != null && pos != null ? BiomeColors.getAverageWaterColor(world, pos) : -1, MTBlocks.WATER_CAULDRON.get());

        event.getBlockColors().register((state, world, pos, color) -> {
            TileEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof DyedWaterCauldronBlockEntity) {
                DyedWaterCauldronBlockEntity dyedWaterCauldron = (DyedWaterCauldronBlockEntity) blockEntity;
                return dyedWaterCauldron.getWaterColor();
            } else {
                return 0x5DB7EF; // Cherry Grove water color
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
