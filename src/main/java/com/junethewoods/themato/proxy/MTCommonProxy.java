package com.junethewoods.themato.proxy;

import com.google.common.collect.ImmutableMap;
import com.junethewoods.themato.biome.MTBiomes;
import com.junethewoods.themato.blockentity.MTBlockEntities;
import com.junethewoods.themato.block.MTBlocks;
import com.junethewoods.themato.config.MTConfigs;
import com.junethewoods.themato.item.MTItems;
import com.junethewoods.themato.util.MTWoodTypes;
import net.minecraft.block.Block;
import net.minecraft.block.WoodType;
import net.minecraft.item.AxeItem;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

public class MTCommonProxy {
    MTCommonProxy() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MTItems.ITEMS.register(eventBus);
        MTBlocks.BLOCKS.register(eventBus);
        MTBlockEntities.BLOCK_ENTITIES.register(eventBus);
        MTBiomes.BIOMES.register(eventBus);

        eventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            AxeItem.STRIPABLES = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.STRIPABLES)
                    .put(MTBlocks.YELLOW_IPE_LOG.get(), MTBlocks.STRIPPED_YELLOW_IPE_LOG.get())
                    .put(MTBlocks.YELLOW_IPE_WOOD.get(), MTBlocks.STRIPPED_YELLOW_IPE_WOOD.get()).build();

            RegistryKey<Biome> ipeForestKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.IPE_FOREST.getId());

            if (MTConfigs.COMMON_CONFIGS.ipeForestGeneration.get()) {
                BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(ipeForestKey, 15));
            }

            WoodType.register(MTWoodTypes.YELLOW_IPE);
        });
    }
}
