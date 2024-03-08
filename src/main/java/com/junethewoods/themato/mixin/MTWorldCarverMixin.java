package com.junethewoods.themato.mixin;

import com.junethewoods.themato.util.MTTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.carver.WorldCarver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Set;

@Mixin(WorldCarver.class)
public class MTWorldCarverMixin {
    @Shadow
    protected Set<Block> replaceableBlocks;

    @Inject(method = "canReplaceBlock(Lnet/minecraft/block/BlockState;)Z", at = @At("HEAD"), cancellable = true)
    protected void canReplaceBlock(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(state.is(MTTags.Blocks.OVERWORLD_CARVER_REPLACEABLES) || replaceableBlocks.contains(state.getBlock()));
    }
}
