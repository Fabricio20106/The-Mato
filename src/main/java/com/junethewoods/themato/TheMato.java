package com.junethewoods.themato;

import com.google.common.collect.ImmutableMap;
import com.junethewoods.themato.blockentity.MTBlockEntities;
import com.junethewoods.themato.config.MTConfigs;
import com.junethewoods.themato.init.MTBlocks;
import com.junethewoods.themato.init.MTItems;
import com.junethewoods.themato.util.MTWoodTypes;
import net.minecraft.block.Block;
import net.minecraft.block.WoodType;
import net.minecraft.client.renderer.Atlases;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.tileentity.SignTileEntityRenderer;
import net.minecraft.item.AxeItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TheMato.MOD_ID)
public class TheMato {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "themato";

    public TheMato() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);

        MTItems.ITEMS.register(eventBus);
        MTBlocks.BLOCKS.register(eventBus);
        MTBlockEntities.BLOCK_ENTITIES.register(eventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MTConfigs.COMMON_SPEC, "jtw-mods/themato-common.toml");
        MTConfigs.init();
    }

    public static ResourceLocation resourceLoc(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            AxeItem.STRIPABLES = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.STRIPABLES)
                    .put(MTBlocks.YELLOW_IPE_LOG.get(), MTBlocks.STRIPPED_YELLOW_IPE_LOG.get())
                    .put(MTBlocks.YELLOW_IPE_WOOD.get(), MTBlocks.STRIPPED_YELLOW_IPE_WOOD.get()).build();

            WoodType.register(MTWoodTypes.YELLOW_IPE);
        });
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(MTBlocks.YELLOW_IPE_LEAVES.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.YELLOW_IPE_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.POTTED_YELLOW_IPE_SAPLING.get(), RenderType.cutout());

            ClientRegistry.bindTileEntityRenderer(MTBlockEntities.MATO_SIGN.get(), SignTileEntityRenderer::new);

            Atlases.addWoodType(MTWoodTypes.YELLOW_IPE);
        });
    }

    @SubscribeEvent
    public void serverStarting(FMLServerStartingEvent event) {}
}