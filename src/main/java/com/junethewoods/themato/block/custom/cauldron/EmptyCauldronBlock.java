package com.junethewoods.themato.block.custom.cauldron;

import com.junethewoods.themato.block.MTBlocks;
import com.junethewoods.themato.cauldron.CauldronInteraction;
import com.junethewoods.themato.config.MTConfigs;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class EmptyCauldronBlock extends AbstractCauldronBlock {
    public EmptyCauldronBlock(Properties properties) {
        super(properties, CauldronInteraction.EMPTY);
    }

    @Override
    public boolean isFull(BlockState state) {
        return false;
    }

    protected static boolean shouldHandlePrecipitation(World world, Biome.RainType precipitation) {
        if (precipitation == Biome.RainType.RAIN) {
            return world.random.nextFloat() < MTConfigs.CAVES_AND_CLIFFS_CONFIGS.waterCauldronFillChance.get();
        } else if (precipitation == Biome.RainType.SNOW) {
            return world.random.nextFloat() < MTConfigs.CAVES_AND_CLIFFS_CONFIGS.powderSnowCauldronFillChance.get();
        } else {
            return false;
        }
    }

    @Override
    public void handleRain(World world, BlockPos pos) {
        Biome.RainType precipitation = world.getBiome(pos).getPrecipitation();
        if (shouldHandlePrecipitation(world, precipitation)) {
            if (precipitation == Biome.RainType.RAIN) {
                world.setBlockAndUpdate(pos, MTBlocks.WATER_CAULDRON.get().defaultBlockState());
            } else if (precipitation == Biome.RainType.SNOW) {
                world.setBlockAndUpdate(pos, MTBlocks.POWDER_SNOW_CAULDRON.get().defaultBlockState());
            }
        }
    }
}
