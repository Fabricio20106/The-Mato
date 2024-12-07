package melonystudios.themato.proxy;

import com.google.common.collect.ImmutableMap;
import melonystudios.themato.biome.MTBiomes;
import melonystudios.themato.blockentity.MTBlockEntities;
import melonystudios.themato.block.MTBlocks;
import melonystudios.themato.cauldron.CauldronInteraction;
import melonystudios.themato.config.MTConfigs;
import melonystudios.themato.effect.MTEffects;
import melonystudios.themato.item.MTItems;
import melonystudios.themato.sound.MTSounds;
import melonystudios.themato.util.MTWoodTypes;
import melonystudios.themato.world.stateprovider.MTStateProviders;
import melonystudios.themato.world.surface.MTSurfaceBuilders;
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

import static net.minecraftforge.common.BiomeDictionary.Type.*;

public class MTCommonProxy {
    MTCommonProxy() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MTSounds.SOUNDS.register(eventBus);
        MTItems.ITEMS.register(eventBus);
        MTBlocks.BLOCKS.register(eventBus);
        MTBlockEntities.BLOCK_ENTITIES.register(eventBus);
        MTBiomes.BIOMES.register(eventBus);
        MTStateProviders.STATE_PROVIDERS.register(eventBus);
        MTEffects.EFFECTS.register(eventBus);

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

            CauldronInteraction.bootstrap();

            RegistryKey<Biome> ipeForestKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.IPE_FOREST.getId());
            RegistryKey<Biome> theWoodsKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.THE_WOODS.getId());
            RegistryKey<Biome> meadowKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.MEADOW.getId());
            RegistryKey<Biome> groveKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.GROVE.getId());
            RegistryKey<Biome> frozenPeaksKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.FROZEN_PEAKS.getId());
            RegistryKey<Biome> snowySlopesKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.SNOWY_SLOPES.getId());
            RegistryKey<Biome> jaggedPeaksKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.JAGGED_PEAKS.getId());
            RegistryKey<Biome> stonyPeaksKey = RegistryKey.create(ForgeRegistries.Keys.BIOMES, MTBiomes.STONY_PEAKS.getId());

            if (MTConfigs.COMMON_CONFIGS.ipeForestGeneration.get()) {
                BiomeDictionary.addTypes(ipeForestKey, FOREST, OVERWORLD, LUSH);
                BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(ipeForestKey, 25));
            }
            if (MTConfigs.COMMON_CONFIGS.theWoodsGeneration.get()) {
                BiomeDictionary.addTypes(theWoodsKey, FOREST, OVERWORLD, DENSE);
                BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(theWoodsKey, 15));
            }
            if (MTConfigs.CAVES_AND_CLIFFS_CONFIGS.meadowGeneration.get()) {
                BiomeDictionary.addTypes(meadowKey, MOUNTAIN, OVERWORLD, LUSH);
                BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(meadowKey, 20));
            }
            if (MTConfigs.CAVES_AND_CLIFFS_CONFIGS.groveGeneration.get()) {
                BiomeDictionary.addTypes(groveKey, HILLS, OVERWORLD, SNOWY, COLD, FOREST, CONIFEROUS);
                BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(groveKey, 35));
            }
            if (MTConfigs.CAVES_AND_CLIFFS_CONFIGS.frozenPeaksGeneration.get()) {
                BiomeDictionary.addTypes(frozenPeaksKey, MOUNTAIN, OVERWORLD, SNOWY, COLD);
                BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(frozenPeaksKey, 25));
            }
            if (MTConfigs.CAVES_AND_CLIFFS_CONFIGS.snowySlopesGeneration.get()) {
                BiomeDictionary.addTypes(snowySlopesKey, OVERWORLD, MOUNTAIN, SNOWY, COLD);
                BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(snowySlopesKey, 25));
            }
            if (MTConfigs.CAVES_AND_CLIFFS_CONFIGS.jaggedPeaksGeneration.get()) {
                BiomeDictionary.addTypes(jaggedPeaksKey, OVERWORLD, MOUNTAIN, MODIFIED, SNOWY, COLD);
                BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(jaggedPeaksKey, 20));
            }
            if (MTConfigs.CAVES_AND_CLIFFS_CONFIGS.stonyPeaksGeneration.get()) {
                BiomeDictionary.addTypes(stonyPeaksKey, OVERWORLD, MOUNTAIN, MODIFIED, HOT);
                BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(stonyPeaksKey, 25));
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
