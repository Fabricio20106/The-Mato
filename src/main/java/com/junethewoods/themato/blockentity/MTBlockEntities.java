package com.junethewoods.themato.blockentity;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.MTBlocks;
import com.junethewoods.themato.blockentity.custom.MTSignBlockEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MTBlockEntities {
    public static final DeferredRegister<TileEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, TheMato.MOD_ID);

    public static final RegistryObject<TileEntityType<MTSignBlockEntity>> MATO_SIGN = BLOCK_ENTITIES.register("mato_sign", () -> TileEntityType.Builder.of(MTSignBlockEntity::new,
            MTBlocks.PINK_IPE_SIGN.get(), MTBlocks.PINK_IPE_WALL_SIGN.get(), MTBlocks.PURPLE_IPE_SIGN.get(), MTBlocks.PURPLE_IPE_WALL_SIGN.get(), MTBlocks.RED_IPE_SIGN.get(),
            MTBlocks.RED_IPE_WALL_SIGN.get(), MTBlocks.YELLOW_IPE_SIGN.get(), MTBlocks.YELLOW_IPE_WALL_SIGN.get()).build(null));
}
