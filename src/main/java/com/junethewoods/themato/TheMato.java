package com.junethewoods.themato;

import com.junethewoods.themato.config.MTConfigs;
import com.junethewoods.themato.init.MTBlocks;
import com.junethewoods.themato.init.MTItems;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
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

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MTConfigs.COMMON_SPEC, "jtw-mods/themato-common.toml");
        MTConfigs.init();
    }

    public static ResourceLocation resourceLoc(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    private void clientSetup(final FMLClientSetupEvent event) {}

    @SubscribeEvent
    public void serverStarting(FMLServerStartingEvent event) {}
}