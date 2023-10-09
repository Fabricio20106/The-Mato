package com.junethewoods.themato.proxy;

import com.junethewoods.themato.blockentity.MTBlockEntities;
import com.junethewoods.themato.block.MTBlocks;
import com.junethewoods.themato.util.MTWoodTypes;
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
            RenderTypeLookup.setRenderLayer(MTBlocks.YELLOW_IPE_LEAVES.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.YELLOW_IPE_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(MTBlocks.POTTED_YELLOW_IPE_SAPLING.get(), RenderType.cutout());

            ClientRegistry.bindTileEntityRenderer(MTBlockEntities.MATO_SIGN.get(), SignTileEntityRenderer::new);

            Atlases.addWoodType(MTWoodTypes.YELLOW_IPE);
        });
    }
}
