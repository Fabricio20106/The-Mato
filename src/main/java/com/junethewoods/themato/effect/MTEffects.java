package com.junethewoods.themato.effect;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.effect.custom.FreezingEffect;
import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MTEffects {
    public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, TheMato.MOD_ID);

    public static final RegistryObject<Effect> FREEZING = EFFECTS.register("freezing", FreezingEffect::new);
}
