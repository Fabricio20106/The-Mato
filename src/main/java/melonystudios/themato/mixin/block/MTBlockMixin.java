package melonystudios.themato.mixin.block;

import melonystudios.themato.util.MTTags;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// Copied from Caves & Cliffs Backports (by blackgear27)
@Mixin(Block.class)
public abstract class MTBlockMixin extends AbstractBlock {
    @Shadow
    @Final
    private static ThreadLocal<Object2ByteLinkedOpenHashMap<Block.RenderSideCacheKey>> OCCLUSION_CACHE;

    public MTBlockMixin(Properties properties) {
        super(properties);
    }

    @Inject(method = "shouldRenderFace", at = @At("HEAD"), cancellable = true)
    private static void shouldSideBeRendered(BlockState state, IBlockReader readerIn, BlockPos pos, Direction side, CallbackInfoReturnable<Boolean> cir) {
        if (readerIn.getBlockState(pos).getBlock().is(MTTags.Blocks.USES_POST_CAC_CULLING)) {
            BlockPos adjacentPos = pos.relative(side);
            BlockState adjacentState = readerIn.getBlockState(adjacentPos);
            if (state.skipRendering(adjacentState, side)) {
                cir.setReturnValue(false);
            } else if (adjacentState.canOcclude()) {
                Block.RenderSideCacheKey cache = new Block.RenderSideCacheKey(state, adjacentState, side);
                Object2ByteLinkedOpenHashMap<Block.RenderSideCacheKey> map = OCCLUSION_CACHE.get();
                byte id = map.getAndMoveToFirst(cache);

                if (id != 127) {
                    cir.setReturnValue(id != 0);
                } else {
                    VoxelShape occlusionShape = state.getFaceOcclusionShape(readerIn, pos, side);
                    if (occlusionShape.isEmpty()) {
                        cir.setReturnValue(true);
                    } else {
                        VoxelShape adjacentOcclusionShape = adjacentState.getFaceOcclusionShape(readerIn, adjacentPos, side.getOpposite());
                        boolean canCompare = VoxelShapes.joinIsNotEmpty(occlusionShape, adjacentOcclusionShape, IBooleanFunction.ONLY_FIRST);
                        if (map.size() == 2048) map.removeLastByte();

                        map.putAndMoveToFirst(cache, (byte) (canCompare ? 1 : 0));
                        cir.setReturnValue(canCompare);
                    }
                }
            } else {
                cir.setReturnValue(true);
            }
        }
    }
}
