package com.junethewoods.themato.data;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.data.lang.MTEnglishLanguageProvider;
import com.junethewoods.themato.data.loottables.MTLootTableProvider;
import com.junethewoods.themato.data.models.MTBlockStateProvider;
import com.junethewoods.themato.data.models.MTItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = TheMato.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MTDataGenerators {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        generator.addProvider(new MTItemModelProvider(generator, fileHelper));
        generator.addProvider(new MTBlockStateProvider(generator, fileHelper));

        generator.addProvider(new MTLootTableProvider(generator));

        generator.addProvider(new MTEnglishLanguageProvider(generator));
    }
}
