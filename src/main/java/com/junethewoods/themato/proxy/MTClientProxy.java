package com.junethewoods.themato.proxy;

import com.junethewoods.themato.blockentity.MTBlockEntities;
import com.junethewoods.themato.block.MTBlocks;
import com.junethewoods.themato.util.MTWoodTypes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;
import net.minecraft.client.renderer.Atlases;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.tileentity.SignTileEntityRenderer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class MTClientProxy extends MTCommonProxy {
    public MTClientProxy() {
        super();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(MTBlocks.PINK_IPE_LEAVES.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.PINK_IPE_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.POTTED_PINK_IPE_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.PURPLE_IPE_LEAVES.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.PURPLE_IPE_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.POTTED_PURPLE_IPE_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.RED_IPE_LEAVES.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.RED_IPE_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.POTTED_RED_IPE_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.YELLOW_IPE_LEAVES.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.YELLOW_IPE_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.POTTED_YELLOW_IPE_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.JUNIUM_LEAVES.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.JUNIUM_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.POTTED_JUNIUM_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.STRIPPED_CACTUS.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.ROSE.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.CYAN_ROSE.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.PAEONIA.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.POTTED_ROSE.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.POTTED_CYAN_ROSE.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.POTTED_PAEONIA.get(), RenderType.cutout());

            flammable(MTBlocks.PINK_IPE_LOG.get(), 5, 5);
            flammable(MTBlocks.PINK_IPE_WOOD.get(), 5, 5);
            flammable(MTBlocks.STRIPPED_PINK_IPE_LOG.get(), 5, 5);
            flammable(MTBlocks.STRIPPED_PINK_IPE_WOOD.get(), 5, 5);
            flammable(MTBlocks.PINK_IPE_PLANKS.get(), 5, 20);
            flammable(MTBlocks.PINK_IPE_STAIRS.get(), 5, 20);
            flammable(MTBlocks.PINK_IPE_SLAB.get(), 5, 20);
            flammable(MTBlocks.PINK_IPE_FENCE.get(), 5, 20);
            flammable(MTBlocks.PINK_IPE_FENCE_GATE.get(), 5, 20);
            flammable(MTBlocks.PINK_IPE_SIGN.get(), 5, 20);
            flammable(MTBlocks.PINK_IPE_WALL_SIGN.get(), 5, 20);
            flammable(MTBlocks.PINK_IPE_LEAVES.get(), 30, 60);
            flammable(MTBlocks.PINK_IPE_SAPLING.get(), 60, 100);

            flammable(MTBlocks.PURPLE_IPE_LOG.get(), 5, 5);
            flammable(MTBlocks.PURPLE_IPE_WOOD.get(), 5, 5);
            flammable(MTBlocks.STRIPPED_PURPLE_IPE_LOG.get(), 5, 5);
            flammable(MTBlocks.STRIPPED_PURPLE_IPE_WOOD.get(), 5, 5);
            flammable(MTBlocks.PURPLE_IPE_PLANKS.get(), 5, 20);
            flammable(MTBlocks.PURPLE_IPE_STAIRS.get(), 5, 20);
            flammable(MTBlocks.PURPLE_IPE_SLAB.get(), 5, 20);
            flammable(MTBlocks.PURPLE_IPE_FENCE.get(), 5, 20);
            flammable(MTBlocks.PURPLE_IPE_FENCE_GATE.get(), 5, 20);
            flammable(MTBlocks.PURPLE_IPE_SIGN.get(), 5, 20);
            flammable(MTBlocks.PURPLE_IPE_WALL_SIGN.get(), 5, 20);
            flammable(MTBlocks.PURPLE_IPE_LEAVES.get(), 30, 60);
            flammable(MTBlocks.PURPLE_IPE_SAPLING.get(), 60, 100);

            flammable(MTBlocks.RED_IPE_LOG.get(), 5, 5);
            flammable(MTBlocks.RED_IPE_WOOD.get(), 5, 5);
            flammable(MTBlocks.STRIPPED_RED_IPE_LOG.get(), 5, 5);
            flammable(MTBlocks.STRIPPED_RED_IPE_WOOD.get(), 5, 5);
            flammable(MTBlocks.RED_IPE_PLANKS.get(), 5, 20);
            flammable(MTBlocks.RED_IPE_STAIRS.get(), 5, 20);
            flammable(MTBlocks.RED_IPE_SLAB.get(), 5, 20);
            flammable(MTBlocks.RED_IPE_FENCE.get(), 5, 20);
            flammable(MTBlocks.RED_IPE_FENCE_GATE.get(), 5, 20);
            flammable(MTBlocks.RED_IPE_SIGN.get(), 5, 20);
            flammable(MTBlocks.RED_IPE_WALL_SIGN.get(), 5, 20);
            flammable(MTBlocks.RED_IPE_LEAVES.get(), 30, 60);
            flammable(MTBlocks.RED_IPE_SAPLING.get(), 60, 100);

            flammable(MTBlocks.YELLOW_IPE_LOG.get(), 5, 5);
            flammable(MTBlocks.YELLOW_IPE_WOOD.get(), 5, 5);
            flammable(MTBlocks.STRIPPED_YELLOW_IPE_LOG.get(), 5, 5);
            flammable(MTBlocks.STRIPPED_YELLOW_IPE_WOOD.get(), 5, 5);
            flammable(MTBlocks.YELLOW_IPE_PLANKS.get(), 5, 20);
            flammable(MTBlocks.YELLOW_IPE_STAIRS.get(), 5, 20);
            flammable(MTBlocks.YELLOW_IPE_SLAB.get(), 5, 20);
            flammable(MTBlocks.YELLOW_IPE_FENCE.get(), 5, 20);
            flammable(MTBlocks.YELLOW_IPE_FENCE_GATE.get(), 5, 20);
            flammable(MTBlocks.YELLOW_IPE_SIGN.get(), 5, 20);
            flammable(MTBlocks.YELLOW_IPE_WALL_SIGN.get(), 5, 20);
            flammable(MTBlocks.YELLOW_IPE_LEAVES.get(), 30, 60);
            flammable(MTBlocks.YELLOW_IPE_SAPLING.get(), 60, 100);

            flammable(MTBlocks.JUNIUM_LOG.get(), 5, 5);
            flammable(MTBlocks.JUNIUM_WOOD.get(), 5, 5);
            flammable(MTBlocks.STRIPPED_JUNIUM_LOG.get(), 5, 5);
            flammable(MTBlocks.STRIPPED_JUNIUM_WOOD.get(), 5, 5);
            flammable(MTBlocks.JUNIUM_PLANKS.get(), 5, 20);
            flammable(MTBlocks.JUNIUM_STAIRS.get(), 5, 20);
            flammable(MTBlocks.JUNIUM_SLAB.get(), 5, 20);
            flammable(MTBlocks.JUNIUM_FENCE.get(), 5, 20);
            flammable(MTBlocks.JUNIUM_FENCE_GATE.get(), 5, 20);
            flammable(MTBlocks.JUNIUM_SIGN.get(), 5, 20);
            flammable(MTBlocks.JUNIUM_WALL_SIGN.get(), 5, 20);
            flammable(MTBlocks.JUNIUM_LEAVES.get(), 30, 60);
            flammable(MTBlocks.JUNIUM_SAPLING.get(), 60, 100);

            flammable(Blocks.CACTUS, 5, 20);
            flammable(MTBlocks.STRIPPED_CACTUS.get(), 5, 20);
            flammable(MTBlocks.CACTUS_PLANKS.get(), 5, 20);
            flammable(MTBlocks.CACTUS_STAIRS.get(), 5, 20);
            flammable(MTBlocks.CACTUS_SLAB.get(), 5, 20);
            flammable(MTBlocks.CACTUS_FENCE.get(), 5, 20);
            flammable(MTBlocks.CACTUS_FENCE_GATE.get(), 5, 20);
            flammable(MTBlocks.CACTUS_SIGN.get(), 5, 20);
            flammable(MTBlocks.CACTUS_WALL_SIGN.get(), 5, 20);

            flammable(MTBlocks.ROSE.get(), 60, 100);
            flammable(MTBlocks.CYAN_ROSE.get(), 60, 100);
            flammable(MTBlocks.PAEONIA.get(), 60, 100);

            ClientRegistry.bindTileEntityRenderer(MTBlockEntities.MATO_SIGN.get(), SignTileEntityRenderer::new);

            Atlases.addWoodType(MTWoodTypes.PINK_IPE);
            Atlases.addWoodType(MTWoodTypes.PURPLE_IPE);
            Atlases.addWoodType(MTWoodTypes.RED_IPE);
            Atlases.addWoodType(MTWoodTypes.YELLOW_IPE);
            Atlases.addWoodType(MTWoodTypes.JUNIUM);
            Atlases.addWoodType(MTWoodTypes.CACTUS);
        });
    }

    public static void flammable(Block block, int encouragement, int flammability) {
        FireBlock fireBlock = (FireBlock) Blocks.FIRE;
        fireBlock.setFlammable(block, encouragement, flammability);
    }
}
