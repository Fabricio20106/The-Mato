package melonystudios.themato.blockentity.custom;

import melonystudios.themato.blockentity.MTBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;

import javax.annotation.Nonnull;

public class DyedWaterCauldronBlockEntity extends TileEntity {
    private int dyedWaterColor;

    public DyedWaterCauldronBlockEntity() {
        super(MTBlockEntities.DYED_WATER_CAULDRON.get());
    }

    @Override
    @Nonnull
    public CompoundNBT save(CompoundNBT tag) {
        super.save(tag);
        CompoundNBT forgeData = new CompoundNBT();
        forgeData.putInt("dyed_water_color", this.dyedWaterColor);
        tag.put("ForgeData", forgeData);
        return tag;
    }

    @Override
    public void load(BlockState state, CompoundNBT tag) {
        super.load(state, tag);
        CompoundNBT forgeData = tag.getCompound("ForgeData");
        this.dyedWaterColor = forgeData.getInt("dyed_water_color");
    }

    public int getWaterColor() {
        return this.dyedWaterColor;
    }

    public void setWaterColor(int waterColor) {
        this.dyedWaterColor = waterColor;
    }
}
