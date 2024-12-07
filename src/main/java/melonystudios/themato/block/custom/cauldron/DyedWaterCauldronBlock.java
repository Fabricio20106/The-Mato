package melonystudios.themato.block.custom.cauldron;

import melonystudios.themato.blockentity.MTBlockEntities;
import melonystudios.themato.blockentity.custom.DyedWaterCauldronBlockEntity;
import melonystudios.themato.cauldron.CauldronInteraction;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class DyedWaterCauldronBlock extends LayeredCauldronBlock {
    private int dyedWaterColor;

    public DyedWaterCauldronBlock(int dyedWaterColor, Properties properties) {
        super(properties, RAIN, CauldronInteraction.DYED_WATER);
        this.dyedWaterColor = dyedWaterColor;
    }

    public void setDyedWaterColor(int waterColor) {
        this.dyedWaterColor = waterColor;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        DyedWaterCauldronBlockEntity dyedWaterCauldron = MTBlockEntities.DYED_WATER_CAULDRON.get().create();
        if (dyedWaterCauldron != null) dyedWaterCauldron.setWaterColor(this.dyedWaterColor);
        return dyedWaterCauldron;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }
}
