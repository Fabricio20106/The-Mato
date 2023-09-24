package com.junethewoods.themato.data.models;

import com.junethewoods.themato.TheMato;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

public class MTItemModelProvider extends ItemModelProvider {
    public MTItemModelProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, TheMato.MOD_ID, fileHelper);
    }

    @Nonnull
    @Override
    public String getName() {
        return "The Mato - Item Models";
    }

    @Override
    protected void registerModels() {
        ModelFile generated = getExistingFile(mcLoc("item/generated"));
        ModelFile handheld = getExistingFile(mcLoc("item/handheld"));

        withExistingParent("yellow_ipe_log");
        withExistingParent("yellow_ipe_wood");
        withExistingParent("stripped_yellow_ipe_log");
        withExistingParent("stripped_yellow_ipe_wood");
        withExistingParent("yellow_ipe_leaves");
        withExistingParent("yellow_ipe_planks");
        withExistingParent("yellow_ipe_stairs");
        withExistingParent("yellow_ipe_slab");
        withExistingParent("yellow_ipe_fence", "_inventory");
        withExistingParent("yellow_ipe_fence_gate");
        withExistingParent("yellow_ipe_pressure_plate");
        withExistingParent("yellow_ipe_button", "_inventory");

        standard(generated, "yellow_ipe_sign");
        standard(generated, "yellow_ipe_boat");
        block(generated, "yellow_ipe_sapling");
    }

    public ItemModelBuilder standard(ModelFile parent, String name) {
        return getBuilder(name).parent(parent).texture("layer0", "item/" + name);
    }

    public ItemModelBuilder block(ModelFile parent, String name) {
        return getBuilder(name).parent(parent).texture("layer0", "block/" + name);
    }

    public ItemModelBuilder withExistingParent(String name) {
        return withExistingParent(name, modLoc("block/" + name));
    }

    public ItemModelBuilder withExistingParent(String name, String extras) {
        return withExistingParent(name, modLoc("block/" + name + extras));
    }
}
