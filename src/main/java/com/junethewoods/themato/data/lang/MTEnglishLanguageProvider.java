package com.junethewoods.themato.data.lang;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.MTBlocks;
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
        addBlock(MTBlocks.PINK_IPE_LOG, "Pink Ipe Log");
        addBlock(MTBlocks.PINK_IPE_WOOD, "Pink Ipe Wood");
        addBlock(MTBlocks.STRIPPED_PINK_IPE_LOG, "Stripped Pink Ipe Log");
        addBlock(MTBlocks.STRIPPED_PINK_IPE_WOOD, "Stripped Pink Ipe Wood");
        addBlock(MTBlocks.PINK_IPE_LEAVES, "Pink Ipe Leaves");
        addBlock(MTBlocks.PINK_IPE_SAPLING, "Pink Ipe Sapling");
        addBlock(MTBlocks.POTTED_PINK_IPE_SAPLING, "Potted Pink Ipe Sapling");
        addBlock(MTBlocks.PINK_IPE_PLANKS, "Pink Ipe Planks");
        addBlock(MTBlocks.PINK_IPE_STAIRS, "Pink Ipe Stairs");
        addBlock(MTBlocks.PINK_IPE_SLAB, "Pink Ipe Slab");
        addBlock(MTBlocks.PINK_IPE_FENCE, "Pink Ipe Fence");
        addBlock(MTBlocks.PINK_IPE_FENCE_GATE, "Pink Ipe Fence Gate");
        addBlock(MTBlocks.PINK_IPE_PRESSURE_PLATE, "Pink Ipe Pressure Plate");
        addBlock(MTBlocks.PINK_IPE_BUTTON, "Pink Ipe Button");
        addBlock(MTBlocks.PINK_IPE_SIGN, "Pink Ipe Sign");
        add("block.themato.pink_ipe_wall_sign", "Pink Ipe Wall Sign");
        addBlock(MTBlocks.PURPLE_IPE_LOG, "Purple Ipe Log");
        addBlock(MTBlocks.PURPLE_IPE_WOOD, "Purple Ipe Wood");
        addBlock(MTBlocks.STRIPPED_PURPLE_IPE_LOG, "Stripped Purple Ipe Log");
        addBlock(MTBlocks.STRIPPED_PURPLE_IPE_WOOD, "Stripped Purple Ipe Wood");
        addBlock(MTBlocks.PURPLE_IPE_LEAVES, "Purple Ipe Leaves");
        addBlock(MTBlocks.PURPLE_IPE_SAPLING, "Purple Ipe Sapling");
        addBlock(MTBlocks.POTTED_PURPLE_IPE_SAPLING, "Potted Purple Ipe Sapling");
        addBlock(MTBlocks.PURPLE_IPE_PLANKS, "Purple Ipe Planks");
        addBlock(MTBlocks.PURPLE_IPE_STAIRS, "Purple Ipe Stairs");
        addBlock(MTBlocks.PURPLE_IPE_SLAB, "Purple Ipe Slab");
        addBlock(MTBlocks.PURPLE_IPE_FENCE, "Purple Ipe Fence");
        addBlock(MTBlocks.PURPLE_IPE_FENCE_GATE, "Purple Ipe Fence Gate");
        addBlock(MTBlocks.PURPLE_IPE_PRESSURE_PLATE, "Purple Ipe Pressure Plate");
        addBlock(MTBlocks.PURPLE_IPE_BUTTON, "Purple Ipe Button");
        addBlock(MTBlocks.PURPLE_IPE_SIGN, "Purple Ipe Sign");
        add("block.themato.purple_ipe_wall_sign", "Purple Ipe Wall Sign");
        addBlock(MTBlocks.RED_IPE_LOG, "Red Ipe Log");
        addBlock(MTBlocks.RED_IPE_WOOD, "Red Ipe Wood");
        addBlock(MTBlocks.STRIPPED_RED_IPE_LOG, "Stripped Red Ipe Log");
        addBlock(MTBlocks.STRIPPED_RED_IPE_WOOD, "Stripped Red Ipe Wood");
        addBlock(MTBlocks.RED_IPE_LEAVES, "Red Ipe Leaves");
        addBlock(MTBlocks.RED_IPE_SAPLING, "Red Ipe Sapling");
        addBlock(MTBlocks.POTTED_RED_IPE_SAPLING, "Potted Red Ipe Sapling");
        addBlock(MTBlocks.RED_IPE_PLANKS, "Red Ipe Planks");
        addBlock(MTBlocks.RED_IPE_STAIRS, "Red Ipe Stairs");
        addBlock(MTBlocks.RED_IPE_SLAB, "Red Ipe Slab");
        addBlock(MTBlocks.RED_IPE_FENCE, "Red Ipe Fence");
        addBlock(MTBlocks.RED_IPE_FENCE_GATE, "Red Ipe Fence Gate");
        addBlock(MTBlocks.RED_IPE_PRESSURE_PLATE, "Red Ipe Pressure Plate");
        addBlock(MTBlocks.RED_IPE_BUTTON, "Red Ipe Button");
        addBlock(MTBlocks.RED_IPE_SIGN, "Red Ipe Sign");
        add("block.themato.red_ipe_wall_sign", "Red Ipe Wall Sign");
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
        add("biome.themato.ipe_forest", "Ipe Forest");

        add("configs.themato.ipeForestGeneration", "Ipe Forest Generation");
        add("configs.themato.ipeForestGeneration.tooltip", "Allow Ipe Forests to generate?");
    }
}
