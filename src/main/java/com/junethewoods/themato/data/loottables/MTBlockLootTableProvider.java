package com.junethewoods.themato.data.loottables;

import com.junethewoods.themato.TheMato;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Collectors;

public class MTBlockLootTableProvider extends BlockLootTables {
    @Override
    protected void addTables() {

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream().filter(block -> TheMato.MOD_ID.equals(block.getRegistryName().getNamespace())).collect(Collectors.toSet());
    }
}
