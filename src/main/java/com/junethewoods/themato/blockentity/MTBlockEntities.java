package com.junethewoods.themato.blockentity;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.init.MTBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MTBlockEntities {
    public static final DeferredRegister<TileEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, TheMato.MOD_ID);

    public static final RegistryObject<TileEntityType<MTSignBlockEntity>> MATO_SIGN = BLOCK_ENTITIES.register("mato_sign", () -> TileEntityType.Builder.of(MTSignBlockEntity::new,
            MTBlocks.YELLOW_IPE_SIGN.get(), MTBlocks.YELLOW_IPE_WALL_SIGN.get()).build(null));
}
