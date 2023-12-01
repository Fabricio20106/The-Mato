package com.junethewoods.themato.world.stateprovider;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.world.stateprovider.custom.MatoFlowerBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.BlockStateProviderType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MTStateProviders {
    public static final DeferredRegister<BlockStateProviderType<?>> STATE_PROVIDERS = DeferredRegister.create(ForgeRegistries.BLOCK_STATE_PROVIDER_TYPES, TheMato.MOD_ID);

    public static final RegistryObject<BlockStateProviderType<MatoFlowerBlockStateProvider>> MATO_FLOWER_PROVIDER = STATE_PROVIDERS.register("mato_flower_provider", () -> new BlockStateProviderType<>(MatoFlowerBlockStateProvider.CODEC));
}
