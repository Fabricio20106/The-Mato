package com.junethewoods.themato;

import com.junethewoods.themato.config.MTConfigs;
import com.junethewoods.themato.proxy.MTClientProxy;
import com.junethewoods.themato.proxy.MTCommonProxy;
import com.junethewoods.themato.proxy.MTServerProxy;
import com.junethewoods.themato.util.MTUtils;
import net.minecraft.world.GameRules;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TheMato.MOD_ID)
public class TheMato {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "themato";

    public final MTCommonProxy proxy;

    public TheMato() {
        MinecraftForge.EVENT_BUS.register(this);
        proxy = DistExecutor.safeRunForDist(() -> MTClientProxy::new, () -> MTServerProxy::new);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MTConfigs.COMMON_SPEC, "jtw-mods/themato-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MTConfigs.CAVES_AND_CLIFFS_SPEC, "jtw-mods/themato-cavesandcliffs.toml");
        ForgeMod.enableMilkFluid();
        MTConfigs.init();
        MTUtils.init();
    }
}