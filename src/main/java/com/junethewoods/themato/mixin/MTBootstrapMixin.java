package com.junethewoods.themato.mixin;

import com.junethewoods.themato.cauldron.CauldronInteraction;
import net.minecraft.util.registry.Bootstrap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Bootstrap.class)
public class MTBootstrapMixin {
    @Shadow
    private static boolean isBootstrapped;

//    @Inject(method = "bootStrap", at = @At("TAIL"))
//    private static void bootStrap(CallbackInfo ci) {
//        if (isBootstrapped)
//    }
}
