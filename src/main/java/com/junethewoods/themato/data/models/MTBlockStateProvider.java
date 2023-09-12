package com.junethewoods.themato.data.models;

import com.junethewoods.themato.TheMato;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;

public class MTBlockStateProvider extends BlockStateProvider {
    public MTBlockStateProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, TheMato.MOD_ID, fileHelper);
    }

    @Nonnull
    @Override
    public String getName() {
        return "The Mato - Block States & Models";
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
