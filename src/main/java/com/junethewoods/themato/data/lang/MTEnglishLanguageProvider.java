package com.junethewoods.themato.data.lang;

import com.junethewoods.themato.TheMato;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class MTEnglishLanguageProvider extends LanguageProvider {
    public MTEnglishLanguageProvider(DataGenerator generator) {
        super(generator, TheMato.MOD_ID, "en_us");
    }

    @Override
    public String getName() {
        return "The Mato - English Language Provider";
    }

    @Override
    protected void addTranslations() {
        add("configs.themato.absolutelyNothing", "Absolutely Nothing");
        add("configs.themato.absolutelyNothing.tooltip", "This does absolutely nothing.");
    }
}
