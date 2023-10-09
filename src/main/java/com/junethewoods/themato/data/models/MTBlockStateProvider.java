package com.junethewoods.themato.data.models;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.MTBlocks;
import net.minecraft.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;

public class MTBlockStateProvider extends BlockStateProvider {
    public MTBlockStateProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, TheMato.MOD_ID, fileHelper);
    }

    @Nonnull
    @Override
    public String getName() {
        return "The Mato - Block States & Models";
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock((RotatedPillarBlock) MTBlocks.YELLOW_IPE_LOG.get());
        simpleBlock(MTBlocks.YELLOW_IPE_WOOD.get(), models().cubeColumn("yellow_ipe_wood", modLoc("block/yellow_ipe_log"), modLoc("block/yellow_ipe_log")));
        logBlock((RotatedPillarBlock) MTBlocks.STRIPPED_YELLOW_IPE_LOG.get());
        simpleBlock(MTBlocks.STRIPPED_YELLOW_IPE_WOOD.get(), models().cubeColumn("stripped_yellow_ipe_wood", modLoc("block/stripped_yellow_ipe_log"),
                modLoc("block/stripped_yellow_ipe_log")));
        simpleBlock(MTBlocks.YELLOW_IPE_LEAVES.get());
        simpleBlock(MTBlocks.YELLOW_IPE_SAPLING.get(), models().cross("yellow_ipe_sapling", modLoc("block/yellow_ipe_sapling")));
        simpleBlock(MTBlocks.POTTED_YELLOW_IPE_SAPLING.get(), models().withExistingParent("potted_yellow_ipe_sapling", mcLoc("block/flower_pot_cross"))
                .texture("plant", "block/yellow_ipe_sapling"));
        simpleBlock(MTBlocks.YELLOW_IPE_PLANKS.get());
        stairsBlock((StairsBlock) MTBlocks.YELLOW_IPE_STAIRS.get(), modLoc("block/yellow_ipe_planks"));
        slabBlock((SlabBlock) MTBlocks.YELLOW_IPE_SLAB.get(), modLoc("block/yellow_ipe_planks"), modLoc("block/yellow_ipe_planks"));
        fenceBlock((FenceBlock) MTBlocks.YELLOW_IPE_FENCE.get(), modLoc("block/yellow_ipe_planks"));
        fenceGateBlock((FenceGateBlock) MTBlocks.YELLOW_IPE_FENCE_GATE.get(), modLoc("block/yellow_ipe_planks"));
    }
}
