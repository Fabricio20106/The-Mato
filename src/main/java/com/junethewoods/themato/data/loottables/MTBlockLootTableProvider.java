package com.junethewoods.themato.data.loottables;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.MTBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Collectors;

public class MTBlockLootTableProvider extends BlockLootTables {
    public static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[] {0.05F, 0.0625F, 0.083333336F, 0.1F};

    @Override
    protected void addTables() {
        dropSelf(MTBlocks.YELLOW_IPE_LOG.get());
        dropSelf(MTBlocks.YELLOW_IPE_WOOD.get());
        dropSelf(MTBlocks.STRIPPED_YELLOW_IPE_LOG.get());
        dropSelf(MTBlocks.STRIPPED_YELLOW_IPE_WOOD.get());
        add(MTBlocks.YELLOW_IPE_LEAVES.get(), (func) -> createLeavesDrops(func, MTBlocks.YELLOW_IPE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(MTBlocks.YELLOW_IPE_SAPLING.get());
        dropPottedContents(MTBlocks.POTTED_YELLOW_IPE_SAPLING.get());
        dropSelf(MTBlocks.YELLOW_IPE_PLANKS.get());
        dropSelf(MTBlocks.YELLOW_IPE_STAIRS.get());
        add(MTBlocks.YELLOW_IPE_SLAB.get(), BlockLootTables::createSlabItemTable);
        dropSelf(MTBlocks.YELLOW_IPE_FENCE.get());
        dropSelf(MTBlocks.YELLOW_IPE_FENCE_GATE.get());
        dropSelf(MTBlocks.YELLOW_IPE_PRESSURE_PLATE.get());
        dropSelf(MTBlocks.YELLOW_IPE_BUTTON.get());
        dropSelf(MTBlocks.YELLOW_IPE_SIGN.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream().filter(block -> TheMato.MOD_ID.equals(block.getRegistryName().getNamespace())).collect(Collectors.toSet());
    }
}
