package com.junethewoods.themato.mixin.entity;

import com.junethewoods.themato.effect.MTEffects;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingRenderer.class)
public class MTLivingRendererMixin {
    @Inject(method = "isShaking", at = @At("HEAD"), cancellable = true)
    private void isShaking(LivingEntity livEntity, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(livEntity.hasEffect(MTEffects.FREEZING.get()));
    }
}
