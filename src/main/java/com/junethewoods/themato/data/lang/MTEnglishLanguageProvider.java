package com.junethewoods.themato.data.lang;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.init.MTBlocks;
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
        addBlock(MTBlocks.YELLOW_IPE_LOG, "Yellow Ipe Log");
        addBlock(MTBlocks.YELLOW_IPE_WOOD, "Yellow Ipe Wood");
        addBlock(MTBlocks.STRIPPED_YELLOW_IPE_LOG, "Stripped Yellow Ipe Log");
        addBlock(MTBlocks.STRIPPED_YELLOW_IPE_WOOD, "Stripped Yellow Ipe Wood");
        addBlock(MTBlocks.YELLOW_IPE_LEAVES, "Yellow Ipe Leaves");
        addBlock(MTBlocks.YELLOW_IPE_SAPLING, "Yellow Ipe Sapling");
        addBlock(MTBlocks.POTTED_YELLOW_IPE_SAPLING, "Potted Yellow Ipe Sapling");
        addBlock(MTBlocks.YELLOW_IPE_PLANKS, "Yellow Ipe Planks");
        addBlock(MTBlocks.YELLOW_IPE_STAIRS, "Yellow Ipe Stairs");
        addBlock(MTBlocks.YELLOW_IPE_SLAB, "Yellow Ipe Slab");
        addBlock(MTBlocks.YELLOW_IPE_FENCE, "Yellow Ipe Fence");
        addBlock(MTBlocks.YELLOW_IPE_FENCE_GATE, "Yellow Ipe Fence Gate");
        addBlock(MTBlocks.YELLOW_IPE_PRESSURE_PLATE, "Yellow Ipe Pressure Plate");
        addBlock(MTBlocks.YELLOW_IPE_BUTTON, "Yellow Ipe Button");
        addBlock(MTBlocks.YELLOW_IPE_SIGN, "Yellow Ipe Sign");
        add("block.themato.yellow_ipe_wall_sign", "Yellow Ipe Wall Sign");

        add("itemGroup.themato_tab", "The Mato");

        add("configs.themato.absolutelyNothing", "Absolutely Nothing");
        add("configs.themato.absolutelyNothing.tooltip", "This does absolutely nothing.");
    }
}
