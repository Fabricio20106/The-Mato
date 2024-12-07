package melonystudios.themato.mixin.world.layer;

import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.LazyAreaLayerContext;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.area.LazyArea;
import net.minecraft.world.gen.layer.Layer;
import net.minecraft.world.gen.layer.LayerUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.LongFunction;

@Mixin(LayerUtil.class)
public abstract class MTLayerUtilMixin {
    @Shadow
    private static <T extends IArea, C extends IExtendedNoiseRandom<T>> IAreaFactory<T> getDefaultLayer(boolean old, int biomeSize, int riverSize, LongFunction<C> contextProvider) {
        return null;
    }

    @Inject(method = "getDefaultLayer(JZII)Lnet/minecraft/world/gen/layer/Layer;", at = @At("HEAD"), cancellable = true)
    private static void getDefaultLayerB(long seed, boolean old, int biomeSize, int riverSize, CallbackInfoReturnable<Layer> cir) {
        IAreaFactory<LazyArea> areaFactory = getDefaultLayer(true, biomeSize, 2, context -> new LazyAreaLayerContext(25, seed, context));
        cir.setReturnValue(new Layer(areaFactory));
    }
}
