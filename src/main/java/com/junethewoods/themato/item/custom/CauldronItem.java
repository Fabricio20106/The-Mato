package com.junethewoods.themato.item.custom;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.Map;

public class CauldronItem extends BlockItem {
    private final Block[] cauldrons;

    public CauldronItem(Block cauldron, Properties properties, Block... cauldrons) {
        super(cauldron, properties);
        this.cauldrons = cauldrons;
    }

    @Override
    public void registerBlocks(Map<Block, Item> blockToItemMap, Item self) {
        super.registerBlocks(blockToItemMap, self);
        for (Block block : this.cauldrons) blockToItemMap.put(block, self);
    }

    @Override
    public void removeFromBlockToItemMap(Map<Block, Item> blockToItemMap, Item self) {
        super.removeFromBlockToItemMap(blockToItemMap, self);
        for (Block block : this.cauldrons) blockToItemMap.remove(block);
    }
}
