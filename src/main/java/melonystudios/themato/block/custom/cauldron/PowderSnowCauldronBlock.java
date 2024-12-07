package melonystudios.themato.block.custom.cauldron;

import melonystudios.themato.cauldron.CauldronInteraction;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import java.util.Map;
import java.util.function.Predicate;

public class PowderSnowCauldronBlock extends LayeredCauldronBlock {
    public PowderSnowCauldronBlock(Properties properties, Predicate<Biome.RainType> fillPredicate, Map<Item, CauldronInteraction> interactionMap) {
        super(properties, fillPredicate, interactionMap);
    }

    @Override
    protected void handleBurningEntityInside(BlockState state, World world, BlockPos pos) {
        lowerFillLevel(Blocks.CAULDRON.defaultBlockState().setValue(LEVEL, state.getValue(LEVEL)), world, pos);
    }
}
