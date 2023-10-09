package com.junethewoods.themato.blockentity.custom;

import com.junethewoods.themato.blockentity.MTBlockEntities;
import net.minecraft.tileentity.SignTileEntity;
import net.minecraft.tileentity.TileEntityType;

public class MTSignBlockEntity extends SignTileEntity {
    public MTSignBlockEntity() {
        super();
    }

    @Override
    public TileEntityType<?> getType() {
        return MTBlockEntities.MATO_SIGN.get();
    }
}
