package com.junethewoods.themato.event;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.MTBlocks;
import com.junethewoods.themato.config.MTConfigs;
import com.junethewoods.themato.sound.MTSounds;
import com.junethewoods.themato.world.MTFeatures;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.junethewoods.themato.util.MTUtils.replaceBiomeMusic;

@Mod.EventBusSubscriber(modid = TheMato.MOD_ID)
public class MTEvents {
    @SubscribeEvent
    public static void onBiomeLoading(final BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder settings = event.getGeneration();
        if (event.getCategory() == Biome.Category.PLAINS || event.getCategory() == Biome.Category.FOREST && MTConfigs.COMMON_CONFIGS.matoFlowersGeneration.get()) {
            settings.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MTFeatures.MATO_FLOWERS_MOD);
            settings.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MTFeatures.DECORATED_MATO_FLOWERS);
        }
        replaceBiomeMusic(Biomes.FOREST, MTSounds.FOREST_MUSIC.get(), event);
        replaceBiomeMusic(Biomes.WOODED_HILLS, MTSounds.FOREST_MUSIC.get(), event);
        replaceBiomeMusic(Biomes.SWAMP, MTSounds.SWAMP_MUSIC.get(), event);
        replaceBiomeMusic(Biomes.SWAMP_HILLS, MTSounds.SWAMP_MUSIC.get(), event);
    }

    @SubscribeEvent
    public static void onFogDensityEvent(final EntityViewRenderEvent.FogDensity event) {
        BlockState state = event.getRenderer().getMainCamera().getBlockAtCamera();
        if (state.is(MTBlocks.POWDER_SNOW.get())) {
            event.setCanceled(true);
            event.setDensity(2);
        }
    }

    @SubscribeEvent
    public static void onFogColoringEvent(final EntityViewRenderEvent.FogColors event) {
        BlockState state = event.getRenderer().getMainCamera().getBlockAtCamera();
        if (state.is(MTBlocks.POWDER_SNOW.get())) {
            event.setRed(0.623F);
            event.setGreen(0.734F);
            event.setBlue(0.785F);
        }
    }
}
