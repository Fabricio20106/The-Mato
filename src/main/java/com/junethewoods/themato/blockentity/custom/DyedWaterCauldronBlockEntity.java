package com.junethewoods.themato.blockentity.custom;

import com.junethewoods.themato.blockentity.MTBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;

public class DyedWaterCauldronBlockEntity extends TileEntity {
    private int dyedWaterColor;

    public DyedWaterCauldronBlockEntity() {
        super(MTBlockEntities.DYED_WATER_CAULDRON.get());
    }

    public DyedWaterCauldronBlockEntity(int dyedWaterColor) {
        this();
        this.dyedWaterColor = dyedWaterColor;
    }

    @Override
    public CompoundNBT save(CompoundNBT tag) {
        super.save(tag);
        tag.putInt("dyed_water_color", getDyedWaterColor());
        return tag;
    }

    @Override
    public void load(BlockState state, CompoundNBT tag) {
        super.load(state, tag);
        this.setDyedWaterColor(tag.getInt("dyed_water_color"));
    }

    public int getDyedWaterColor() {
        return this.dyedWaterColor;
    }

    public void setDyedWaterColor(int waterColor) {
        this.dyedWaterColor = waterColor;
    }
}
