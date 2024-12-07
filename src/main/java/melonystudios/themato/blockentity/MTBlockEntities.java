package melonystudios.themato.blockentity;

import melonystudios.themato.TheMato;
import melonystudios.themato.block.MTBlocks;
import melonystudios.themato.blockentity.custom.DyedWaterCauldronBlockEntity;
import melonystudios.themato.blockentity.custom.MTSignBlockEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MTBlockEntities {
    public static final DeferredRegister<TileEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, TheMato.MOD_ID);

    public static final RegistryObject<TileEntityType<MTSignBlockEntity>> MATO_SIGN = BLOCK_ENTITIES.register("mato_sign", () -> TileEntityType.Builder.of(MTSignBlockEntity::new,
            MTBlocks.PINK_IPE_SIGN.get(), MTBlocks.PINK_IPE_WALL_SIGN.get(), MTBlocks.PURPLE_IPE_SIGN.get(), MTBlocks.PURPLE_IPE_WALL_SIGN.get(), MTBlocks.RED_IPE_SIGN.get(),
            MTBlocks.RED_IPE_WALL_SIGN.get(), MTBlocks.YELLOW_IPE_SIGN.get(), MTBlocks.YELLOW_IPE_WALL_SIGN.get(), MTBlocks.JUNIUM_SIGN.get(), MTBlocks.JUNIUM_WALL_SIGN.get(), MTBlocks.CACTUS_SIGN.get(), MTBlocks.CACTUS_WALL_SIGN.get())
            .build(null));

    public static final RegistryObject<TileEntityType<DyedWaterCauldronBlockEntity>> DYED_WATER_CAULDRON = BLOCK_ENTITIES.register("dyed_water_cauldron", () -> TileEntityType.Builder.of(DyedWaterCauldronBlockEntity::new,
            MTBlocks.DYED_WATER_CAULDRON.get()).build(null));
}
