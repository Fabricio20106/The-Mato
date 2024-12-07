package melonystudios.themato.world.stateprovider.custom;

import melonystudios.themato.block.MTBlocks;
import melonystudios.themato.world.stateprovider.MTStateProviders;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.blockstateprovider.BlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.BlockStateProviderType;

import java.util.Random;

public class MatoFlowerBlockStateProvider extends BlockStateProvider {
    public static final Codec<MatoFlowerBlockStateProvider> CODEC;
    public static final MatoFlowerBlockStateProvider INSTANCE = new MatoFlowerBlockStateProvider();
    private static final BlockState[] LOW_NOISE_FLOWERS = new BlockState[] {MTBlocks.PAEONIA.get().defaultBlockState()};
    private static final BlockState[] HIGH_NOISE_FLOWERS = new BlockState[] {MTBlocks.ROSE.get().defaultBlockState(), MTBlocks.CYAN_ROSE.get().defaultBlockState()};

    @Override
    protected BlockStateProviderType<?> type() {
        return MTStateProviders.MATO_FLOWER_PROVIDER.get();
    }

    @Override
    public BlockState getState(Random rand, BlockPos pos) {
        double biomeNoise = Biome.BIOME_INFO_NOISE.getValue((double) pos.getX() / 200, (double) pos.getZ() / 200, false);
        if (biomeNoise < -0.8D) {
            return Util.getRandom(LOW_NOISE_FLOWERS, rand);
        } else {
            return rand.nextInt(3) > 0 ? Util.getRandom(HIGH_NOISE_FLOWERS, rand) : MTBlocks.ROSE.get().defaultBlockState();
        }
    }

    static {
        CODEC = Codec.unit(() -> INSTANCE);
    }
}
