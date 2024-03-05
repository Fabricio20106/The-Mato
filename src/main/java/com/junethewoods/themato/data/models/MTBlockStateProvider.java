package com.junethewoods.themato.data.models;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.MTBlocks;
import net.minecraft.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
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
        axisBlock((RotatedPillarBlock) MTBlocks.PINK_IPE_WOOD.get(), modLoc("block/pink_ipe_log"), modLoc("block/pink_ipe_log"));
        logBlock((RotatedPillarBlock) MTBlocks.STRIPPED_PINK_IPE_LOG.get());
        axisBlock((RotatedPillarBlock) MTBlocks.STRIPPED_PINK_IPE_WOOD.get(), modLoc("block/stripped_pink_ipe_log"), modLoc("block/stripped_pink_ipe_log"));
        simpleBlock(MTBlocks.PINK_IPE_LEAVES.get());
        simpleBlock(MTBlocks.PINK_IPE_SAPLING.get(), models().cross("pink_ipe_sapling", modLoc("block/pink_ipe_sapling")));
        simpleBlock(MTBlocks.POTTED_PINK_IPE_SAPLING.get(), models().withExistingParent("potted_pink_ipe_sapling", mcLoc("block/flower_pot_cross")).texture("plant", "block/pink_ipe_sapling"));
        simpleBlock(MTBlocks.PINK_IPE_PLANKS.get());
        stairsBlock((StairsBlock) MTBlocks.PINK_IPE_STAIRS.get(), modLoc("block/pink_ipe_planks"));
        slabBlock((SlabBlock) MTBlocks.PINK_IPE_SLAB.get(), modLoc("block/pink_ipe_planks"), modLoc("block/pink_ipe_planks"));
        fenceBlock((FenceBlock) MTBlocks.PINK_IPE_FENCE.get(), modLoc("block/pink_ipe_planks"));
        fenceGateBlock((FenceGateBlock) MTBlocks.PINK_IPE_FENCE_GATE.get(), modLoc("block/pink_ipe_planks"));

        // Purple Ipe
        logBlock((RotatedPillarBlock) MTBlocks.PURPLE_IPE_LOG.get());
        axisBlock((RotatedPillarBlock) MTBlocks.PURPLE_IPE_WOOD.get(), modLoc("block/purple_ipe_log"), modLoc("block/purple_ipe_log"));
        logBlock((RotatedPillarBlock) MTBlocks.STRIPPED_PURPLE_IPE_LOG.get());
        axisBlock((RotatedPillarBlock) MTBlocks.STRIPPED_PURPLE_IPE_WOOD.get(), modLoc("block/stripped_purple_ipe_log"), modLoc("block/stripped_purple_ipe_log"));
        simpleBlock(MTBlocks.PURPLE_IPE_LEAVES.get());
        simpleBlock(MTBlocks.PURPLE_IPE_SAPLING.get(), models().cross("purple_ipe_sapling", modLoc("block/purple_ipe_sapling")));
        simpleBlock(MTBlocks.POTTED_PURPLE_IPE_SAPLING.get(), models().withExistingParent("potted_purple_ipe_sapling", mcLoc("block/flower_pot_cross")).texture("plant", "block/purple_ipe_sapling"));
        simpleBlock(MTBlocks.PURPLE_IPE_PLANKS.get());
        stairsBlock((StairsBlock) MTBlocks.PURPLE_IPE_STAIRS.get(), modLoc("block/purple_ipe_planks"));
        slabBlock((SlabBlock) MTBlocks.PURPLE_IPE_SLAB.get(), modLoc("block/purple_ipe_planks"), modLoc("block/purple_ipe_planks"));
        fenceBlock((FenceBlock) MTBlocks.PURPLE_IPE_FENCE.get(), modLoc("block/purple_ipe_planks"));
        fenceGateBlock((FenceGateBlock) MTBlocks.PURPLE_IPE_FENCE_GATE.get(), modLoc("block/purple_ipe_planks"));

        // Red Ipe
        logBlock((RotatedPillarBlock) MTBlocks.RED_IPE_LOG.get());
        axisBlock((RotatedPillarBlock) MTBlocks.RED_IPE_WOOD.get(), modLoc("block/red_ipe_log"), modLoc("block/red_ipe_log"));
        logBlock((RotatedPillarBlock) MTBlocks.STRIPPED_RED_IPE_LOG.get());
        axisBlock((RotatedPillarBlock) MTBlocks.STRIPPED_RED_IPE_WOOD.get(), modLoc("block/stripped_red_ipe_log"), modLoc("block/stripped_red_ipe_log"));
        simpleBlock(MTBlocks.RED_IPE_LEAVES.get());
        simpleBlock(MTBlocks.RED_IPE_SAPLING.get(), models().cross("red_ipe_sapling", modLoc("block/red_ipe_sapling")));
        simpleBlock(MTBlocks.POTTED_RED_IPE_SAPLING.get(), models().withExistingParent("potted_red_ipe_sapling", mcLoc("block/flower_pot_cross")).texture("plant", "block/red_ipe_sapling"));
        simpleBlock(MTBlocks.RED_IPE_PLANKS.get());
        stairsBlock((StairsBlock) MTBlocks.RED_IPE_STAIRS.get(), modLoc("block/red_ipe_planks"));
        slabBlock((SlabBlock) MTBlocks.RED_IPE_SLAB.get(), modLoc("block/red_ipe_planks"), modLoc("block/red_ipe_planks"));
        fenceBlock((FenceBlock) MTBlocks.RED_IPE_FENCE.get(), modLoc("block/red_ipe_planks"));
        fenceGateBlock((FenceGateBlock) MTBlocks.RED_IPE_FENCE_GATE.get(), modLoc("block/red_ipe_planks"));

        // Yellow Ipe
        logBlock((RotatedPillarBlock) MTBlocks.YELLOW_IPE_LOG.get());
        axisBlock((RotatedPillarBlock) MTBlocks.YELLOW_IPE_WOOD.get(), modLoc("block/yellow_ipe_log"), modLoc("block/yellow_ipe_log"));
        logBlock((RotatedPillarBlock) MTBlocks.STRIPPED_YELLOW_IPE_LOG.get());
        axisBlock((RotatedPillarBlock) MTBlocks.STRIPPED_YELLOW_IPE_WOOD.get(), modLoc("block/stripped_yellow_ipe_log"), modLoc("block/stripped_yellow_ipe_log"));
        simpleBlock(MTBlocks.YELLOW_IPE_LEAVES.get());
        simpleBlock(MTBlocks.YELLOW_IPE_SAPLING.get(), models().cross("yellow_ipe_sapling", modLoc("block/yellow_ipe_sapling")));
        simpleBlock(MTBlocks.POTTED_YELLOW_IPE_SAPLING.get(), models().withExistingParent("potted_yellow_ipe_sapling", mcLoc("block/flower_pot_cross")).texture("plant", "block/yellow_ipe_sapling"));
        simpleBlock(MTBlocks.YELLOW_IPE_PLANKS.get());
        stairsBlock((StairsBlock) MTBlocks.YELLOW_IPE_STAIRS.get(), modLoc("block/yellow_ipe_planks"));
        slabBlock((SlabBlock) MTBlocks.YELLOW_IPE_SLAB.get(), modLoc("block/yellow_ipe_planks"), modLoc("block/yellow_ipe_planks"));
        fenceBlock((FenceBlock) MTBlocks.YELLOW_IPE_FENCE.get(), modLoc("block/yellow_ipe_planks"));
        fenceGateBlock((FenceGateBlock) MTBlocks.YELLOW_IPE_FENCE_GATE.get(), modLoc("block/yellow_ipe_planks"));

        // Junium
        logBlock((RotatedPillarBlock) MTBlocks.JUNIUM_LOG.get());
        axisBlock((RotatedPillarBlock) MTBlocks.JUNIUM_WOOD.get(), modLoc("block/junium_log"), modLoc("block/junium_log"));
        logBlock((RotatedPillarBlock) MTBlocks.STRIPPED_JUNIUM_LOG.get());
        axisBlock((RotatedPillarBlock) MTBlocks.STRIPPED_JUNIUM_WOOD.get(), modLoc("block/stripped_junium_log"), modLoc("block/stripped_junium_log"));
        simpleBlock(MTBlocks.JUNIUM_LEAVES.get());
        simpleBlock(MTBlocks.JUNIUM_SAPLING.get(), models().cross("junium_sapling", modLoc("block/junium_sapling")));
        simpleBlock(MTBlocks.POTTED_JUNIUM_SAPLING.get(), models().withExistingParent("potted_junium_sapling", mcLoc("block/flower_pot_cross")).texture("plant", "block/junium_sapling"));
        simpleBlock(MTBlocks.JUNIUM_PLANKS.get());
        stairsBlock((StairsBlock) MTBlocks.JUNIUM_STAIRS.get(), modLoc("block/junium_planks"));
        slabBlock((SlabBlock) MTBlocks.JUNIUM_SLAB.get(), modLoc("block/junium_planks"), modLoc("block/junium_planks"));
        fenceBlock((FenceBlock) MTBlocks.JUNIUM_FENCE.get(), modLoc("block/junium_planks"));
        fenceGateBlock((FenceGateBlock) MTBlocks.JUNIUM_FENCE_GATE.get(), modLoc("block/junium_planks"));
        pressurePlate(MTBlocks.JUNIUM_PRESSURE_PLATE.get(), modLoc("block/junium_planks"));
        buttonBlock((AbstractButtonBlock) MTBlocks.JUNIUM_BUTTON.get(), modLoc("block/junium_planks"));
        simpleBlock(MTBlocks.JUNIUM_SIGN.get(), models().getBuilder("junium_sign").texture("particle", modLoc("block/junium_planks")));
        simpleBlock(MTBlocks.JUNIUM_WALL_SIGN.get(), models().getBuilder("junium_wall_sign").texture("particle", modLoc("block/junium_planks")));

        // Cactus
        simpleBlock(MTBlocks.STRIPPED_CACTUS.get(), models().getBuilder("stripped_cactus").parent(models().getExistingFile(modLoc("block/template_cactus"))).texture("bottom", modLoc("block/stripped_cactus_bottom")).texture("side", modLoc(
                "block/stripped_cactus_side")).texture("top", modLoc("block/stripped_cactus_top")));
        simpleBlock(MTBlocks.CACTUS_PLANKS.get());
        stairsBlock((StairsBlock) MTBlocks.CACTUS_STAIRS.get(), modLoc("block/cactus_planks"));
        slabBlock((SlabBlock) MTBlocks.CACTUS_SLAB.get(), modLoc("block/cactus_planks"), modLoc("block/cactus_planks"));
        fenceBlock((FenceBlock) MTBlocks.CACTUS_FENCE.get(), modLoc("block/cactus_planks"));
        fenceGateBlock((FenceGateBlock) MTBlocks.CACTUS_FENCE_GATE.get(), modLoc("block/cactus_planks"));
        simpleBlock(MTBlocks.CACTUS_SIGN.get(), models().getBuilder("cactus_sign").texture("particle", modLoc("block/cactus_planks")));
        simpleBlock(MTBlocks.CACTUS_WALL_SIGN.get(), models().getBuilder("cactus_wall_sign").texture("particle", modLoc("block/cactus_planks")));
        pressurePlate(MTBlocks.CACTUS_PRESSURE_PLATE.get(), modLoc("block/cactus_planks"));
        buttonBlock((AbstractButtonBlock) MTBlocks.CACTUS_BUTTON.get(), modLoc("block/cactus_planks"));

        // Plants
        simpleBlock(MTBlocks.ROSE.get(), models().cross("rose", modLoc("block/rose")));
        simpleBlock(MTBlocks.CYAN_ROSE.get(), models().cross("cyan_rose", modLoc("block/cyan_rose")));
        simpleBlock(MTBlocks.PAEONIA.get(), models().cross("paeonia", modLoc("block/paeonia")));
        simpleBlock(MTBlocks.POTTED_ROSE.get(), models().withExistingParent("potted_rose", mcLoc("block/flower_pot_cross")).texture("plant", "block/rose"));
        simpleBlock(MTBlocks.POTTED_CYAN_ROSE.get(), models().withExistingParent("potted_cyan_rose", mcLoc("block/flower_pot_cross")).texture("plant", "block/cyan_rose"));
        simpleBlock(MTBlocks.POTTED_PAEONIA.get(), models().withExistingParent("potted_paeonia", mcLoc("block/flower_pot_cross")).texture("plant", "block/paeonia"));

        // Miscellaneous
        simpleBlock(MTBlocks.POWDER_SNOW.get());
    }

    public void pressurePlate(Block pressurePlate, ResourceLocation planks) {
        getVariantBuilder(pressurePlate).forAllStates(state -> {
            boolean isPowered = state.getValue(BlockStateProperties.POWERED);
            return ConfiguredModel.builder().modelFile(models().getBuilder(pressurePlate.getRegistryName().getPath() + (isPowered ? "_powered" : ""))
                    .parent(models().getExistingFile(mcLoc("block/pressure_plate_" + (isPowered ? "down" : "up")))).texture("texture", planks)).build();
        });
    }

    public void buttonBlock(AbstractButtonBlock block, ResourceLocation texture) {
        ModelFile button = button(block.getRegistryName().getPath(), texture);
        ModelFile buttonPressed = buttonPressed(block.getRegistryName().getPath() + "_pressed", texture);
        this.buttonBlock(block, button, buttonPressed);
    }

    public void buttonBlock(AbstractButtonBlock block, ModelFile button, ModelFile buttonPressed) {
        this.getVariantBuilder(block).forAllStates((state) -> {
            Direction facing = state.getValue(AbstractButtonBlock.FACING);
            AttachFace face = state.getValue(AbstractButtonBlock.FACE);
            boolean powered = state.getValue(AbstractButtonBlock.POWERED);
            return ConfiguredModel.builder().modelFile(powered ? buttonPressed : button).rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180)).rotationY((int)(face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot()).uvLock(face == AttachFace.WALL).build();
        });
    }

    public ModelFile button(String name, ResourceLocation texture) {
        return models().singleTexture(name, mcLoc("block/button"), texture);
    }

    public ModelFile buttonPressed(String name, ResourceLocation texture) {
        return models().singleTexture(name, mcLoc("block/button_pressed"), texture);
    }
}
