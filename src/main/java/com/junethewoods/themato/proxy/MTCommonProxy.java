package com.junethewoods.themato.proxy;

import com.google.common.collect.ImmutableMap;
import com.junethewoods.themato.biome.MTBiomes;
import com.junethewoods.themato.blockentity.MTBlockEntities;
import com.junethewoods.themato.block.MTBlocks;
import com.junethewoods.themato.config.MTConfigs;
import com.junethewoods.themato.item.MTItems;
import com.junethewoods.themato.sound.MTSounds;
import com.junethewoods.themato.util.MTWoodTypes;
import com.junethewoods.themato.world.stateprovider.MTStateProviders;
import com.junethewoods.themato.world.surface.MTSurfaceBuilders;
import net.minecraft.block.Block;
import net.minecraft.block.WoodType;
import net.minecraft.item.AxeItem;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

public class MTCommonProxy {
    MTCommonProxy() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MTSounds.SOUNDS.register(eventBus);
        MTItems.ITEMS.register(eventBus);
        MTBlocks.BLOCKS.register(eventBus);
        MTBlockEntities.BLOCK_ENTITIES.register(eventBus);
        MTBiomes.BIOMES.register(eventBus);
        MTStateProviders.STATE_PROVIDERS.register(eventBus);

        eventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            AxeItem.STRIPABLES = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.STRIPABLES)
                    .put(MTBlocks.PINK_IPE_LOG.get(), MTBlocks.STRIPPED_PINK_IPE_LOG.get())
                    .put(MTBlocks.PINK_IPE_WOOD.get(), MTBlocks.STRIPPED_PINK_IPE_WOOD.get())
                    .put(MTBlocks.PURPLE_IPE_LOG.get(), MTBlocks.STRIPPED_PURPLE_IPE_LOG.get())
                    .put(MTBlocks.PURPLE_IPE_WOOD.get(), MTBlocks.STRIPPED_YELLOW_IPE_WOOD.get())
                    .put(MTBlocks.RED_IPE_LOG.get(), MTBlocks.STRIPPED_RED_IPE_LOG.get())
                    .put(MTBlocks.RED_IPE_WOOD.get(), MTBlocks.STRIPPED_RED_IPE_WOOD.get())
                    .put(MTBlocks.YELLOW_IPE_LOG.get(), MTBlocks.STRIPPED_YELLOW_IPE_LOG.get())
                    .put(MTBlocks.YELLOW_IPE_WOOD.get(), MTBlocks.STRIPPED_YELLOW_IPE_WOOD.get())
                    .put(MTBlocks.JUNIUM_LOG.get(), MTBlocks.STRIPPED_JUNIUM_LOG.get())
                    .put(MTBlocks.JUNIUM_WOOD.get(), MTBlocks.STRIPPED_JUNIUM_WOOD.get()).build();

            RegistryKey<Biome> ipeForestKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.IPE_FOREST.getId());
            RegistryKey<Biome> theWoodsKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.THE_WOODS.getId());
            RegistryKey<Biome> meadowKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.MEADOW.getId());
            RegistryKey<Biome> groveKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.GROVE.getId());
            RegistryKey<Biome> frozenPeaksKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.FROZEN_PEAKS.getId());

            if (MTConfigs.COMMON_CONFIGS.ipeForestGeneration.get()) {
                BiomeDictionary.addTypes(ipeForestKey, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
                BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(ipeForestKey, 35));
            }
            if (MTConfigs.COMMON_CONFIGS.theWoodsGeneration.get()) {
                BiomeDictionary.addTypes(theWoodsKey, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
                BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(theWoodsKey, 15));
            }
            if (MTConfigs.COMMON_CONFIGS.meadowGeneration.get()) {
                BiomeDictionary.addTypes(meadowKey, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.OVERWORLD, BiomeDictionary.Type.LUSH);
                BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(meadowKey, 20));
            }
            if (MTConfigs.COMMON_CONFIGS.groveGeneration.get()) {
                BiomeDictionary.addTypes(groveKey, BiomeDictionary.Type.HILLS, BiomeDictionary.Type.OVERWORLD, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.COLD, BiomeDictionary.Type.FOREST);
                BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(groveKey, 35));
            }
            if (MTConfigs.COMMON_CONFIGS.frozenPeaksGeneration.get()) {
                BiomeDictionary.addTypes(frozenPeaksKey, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.OVERWORLD, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.COLD);
                BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(frozenPeaksKey, 25));
            }

            MTSurfaceBuilders.init();

            WoodType.register(MTWoodTypes.PINK_IPE);
            WoodType.register(MTWoodTypes.PURPLE_IPE);
            WoodType.register(MTWoodTypes.RED_IPE);
            WoodType.register(MTWoodTypes.YELLOW_IPE);
            WoodType.register(MTWoodTypes.JUNIUM);
            WoodType.register(MTWoodTypes.CACTUS);
        });
    }
}
