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
        // Pink Ipe
        logBlock((RotatedPillarBlock) MTBlocks.PINK_IPE_LOG.get());
        simpleBlock(MTBlocks.PINK_IPE_WOOD.get(), models().cubeColumn("pink_ipe_wood", modLoc("block/pink_ipe_log"), modLoc("block/pink_ipe_log")));
        logBlock((RotatedPillarBlock) MTBlocks.STRIPPED_PINK_IPE_LOG.get());
        simpleBlock(MTBlocks.STRIPPED_PINK_IPE_WOOD.get(), models().cubeColumn("stripped_pink_ipe_wood", modLoc("block/stripped_pink_ipe_log"),
                modLoc("block/stripped_pink_ipe_log")));
        simpleBlock(MTBlocks.PINK_IPE_LEAVES.get());
        simpleBlock(MTBlocks.PINK_IPE_SAPLING.get(), models().cross("pink_ipe_sapling", modLoc("block/pink_ipe_sapling")));
        simpleBlock(MTBlocks.POTTED_PINK_IPE_SAPLING.get(), models().withExistingParent("potted_pink_ipe_sapling", mcLoc("block/flower_pot_cross"))
                .texture("plant", "block/pink_ipe_sapling"));
        simpleBlock(MTBlocks.PINK_IPE_PLANKS.get());
        stairsBlock((StairsBlock) MTBlocks.PINK_IPE_STAIRS.get(), modLoc("block/pink_ipe_planks"));
        slabBlock((SlabBlock) MTBlocks.PINK_IPE_SLAB.get(), modLoc("block/pink_ipe_planks"), modLoc("block/pink_ipe_planks"));
        fenceBlock((FenceBlock) MTBlocks.PINK_IPE_FENCE.get(), modLoc("block/pink_ipe_planks"));
        fenceGateBlock((FenceGateBlock) MTBlocks.PINK_IPE_FENCE_GATE.get(), modLoc("block/pink_ipe_planks"));

        // Purple Ipe
        logBlock((RotatedPillarBlock) MTBlocks.PURPLE_IPE_LOG.get());
        simpleBlock(MTBlocks.PURPLE_IPE_WOOD.get(), models().cubeColumn("purple_ipe_wood", modLoc("block/purple_ipe_log"), modLoc("block/purple_ipe_log")));
        logBlock((RotatedPillarBlock) MTBlocks.STRIPPED_PURPLE_IPE_LOG.get());
        simpleBlock(MTBlocks.STRIPPED_PURPLE_IPE_WOOD.get(), models().cubeColumn("stripped_purple_ipe_wood", modLoc("block/stripped_purple_ipe_log"),
                modLoc("block/stripped_purple_ipe_log")));
        simpleBlock(MTBlocks.PURPLE_IPE_LEAVES.get());
        simpleBlock(MTBlocks.PURPLE_IPE_SAPLING.get(), models().cross("purple_ipe_sapling", modLoc("block/purple_ipe_sapling")));
        simpleBlock(MTBlocks.POTTED_PURPLE_IPE_SAPLING.get(), models().withExistingParent("potted_purple_ipe_sapling", mcLoc("block/flower_pot_cross"))
                .texture("plant", "block/purple_ipe_sapling"));
        simpleBlock(MTBlocks.PURPLE_IPE_PLANKS.get());
        stairsBlock((StairsBlock) MTBlocks.PURPLE_IPE_STAIRS.get(), modLoc("block/purple_ipe_planks"));
        slabBlock((SlabBlock) MTBlocks.PURPLE_IPE_SLAB.get(), modLoc("block/purple_ipe_planks"), modLoc("block/purple_ipe_planks"));
        fenceBlock((FenceBlock) MTBlocks.PURPLE_IPE_FENCE.get(), modLoc("block/purple_ipe_planks"));
        fenceGateBlock((FenceGateBlock) MTBlocks.PURPLE_IPE_FENCE_GATE.get(), modLoc("block/purple_ipe_planks"));

        // Red Ipe
        logBlock((RotatedPillarBlock) MTBlocks.RED_IPE_LOG.get());
        simpleBlock(MTBlocks.RED_IPE_WOOD.get(), models().cubeColumn("red_ipe_wood", modLoc("block/red_ipe_log"), modLoc("block/red_ipe_log")));
        logBlock((RotatedPillarBlock) MTBlocks.STRIPPED_RED_IPE_LOG.get());
        simpleBlock(MTBlocks.STRIPPED_RED_IPE_WOOD.get(), models().cubeColumn("stripped_red_ipe_wood", modLoc("block/stripped_red_ipe_log"),
                modLoc("block/stripped_red_ipe_log")));
        simpleBlock(MTBlocks.RED_IPE_LEAVES.get());
        simpleBlock(MTBlocks.RED_IPE_SAPLING.get(), models().cross("red_ipe_sapling", modLoc("block/red_ipe_sapling")));
        simpleBlock(MTBlocks.POTTED_RED_IPE_SAPLING.get(), models().withExistingParent("potted_red_ipe_sapling", mcLoc("block/flower_pot_cross"))
                .texture("plant", "block/red_ipe_sapling"));
        simpleBlock(MTBlocks.RED_IPE_PLANKS.get());
        stairsBlock((StairsBlock) MTBlocks.RED_IPE_STAIRS.get(), modLoc("block/red_ipe_planks"));
        slabBlock((SlabBlock) MTBlocks.RED_IPE_SLAB.get(), modLoc("block/red_ipe_planks"), modLoc("block/red_ipe_planks"));
        fenceBlock((FenceBlock) MTBlocks.RED_IPE_FENCE.get(), modLoc("block/red_ipe_planks"));
        fenceGateBlock((FenceGateBlock) MTBlocks.RED_IPE_FENCE_GATE.get(), modLoc("block/red_ipe_planks"));

        // Yellow Ipe
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

        // Plants
        simpleBlock(MTBlocks.ROSE.get(), models().cross("rose", modLoc("block/rose")));
        simpleBlock(MTBlocks.CYAN_ROSE.get(), models().cross("cyan_rose", modLoc("block/cyan_rose")));
        simpleBlock(MTBlocks.PAEONIA.get(), models().cross("paeonia", modLoc("block/paeonia")));
        simpleBlock(MTBlocks.POTTED_ROSE.get(), models().withExistingParent("potted_rose", mcLoc("block/flower_pot_cross")).texture("plant", "block/rose"));
        simpleBlock(MTBlocks.POTTED_CYAN_ROSE.get(), models().withExistingParent("potted_cyan_rose", mcLoc("block/flower_pot_cross")).texture("plant", "block/cyan_rose"));
        simpleBlock(MTBlocks.POTTED_PAEONIA.get(), models().withExistingParent("potted_paeonia", mcLoc("block/flower_pot_cross")).texture("plant", "block/paeonia"));
    }
}
