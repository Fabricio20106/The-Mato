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

        withExistingParent("pink_ipe_log");
        withExistingParent("pink_ipe_wood");
        withExistingParent("stripped_pink_ipe_log");
        withExistingParent("stripped_pink_ipe_wood");
        withExistingParent("pink_ipe_leaves");
        withExistingParent("pink_ipe_planks");
        withExistingParent("pink_ipe_stairs");
        withExistingParent("pink_ipe_slab");
        withExistingParent("pink_ipe_fence", "_inventory");
        withExistingParent("pink_ipe_fence_gate");
        withExistingParent("pink_ipe_pressure_plate");
        withExistingParent("pink_ipe_button", "_inventory");

        withExistingParent("purple_ipe_log");
        withExistingParent("purple_ipe_wood");
        withExistingParent("stripped_purple_ipe_log");
        withExistingParent("stripped_purple_ipe_wood");
        withExistingParent("purple_ipe_leaves");
        withExistingParent("purple_ipe_planks");
        withExistingParent("purple_ipe_stairs");
        withExistingParent("purple_ipe_slab");
        withExistingParent("purple_ipe_fence", "_inventory");
        withExistingParent("purple_ipe_fence_gate");
        withExistingParent("purple_ipe_pressure_plate");
        withExistingParent("purple_ipe_button", "_inventory");

        withExistingParent("red_ipe_log");
        withExistingParent("red_ipe_wood");
        withExistingParent("stripped_red_ipe_log");
        withExistingParent("stripped_red_ipe_wood");
        withExistingParent("red_ipe_leaves");
        withExistingParent("red_ipe_planks");
        withExistingParent("red_ipe_stairs");
        withExistingParent("red_ipe_slab");
        withExistingParent("red_ipe_fence", "_inventory");
        withExistingParent("red_ipe_fence_gate");
        withExistingParent("red_ipe_pressure_plate");
        withExistingParent("red_ipe_button", "_inventory");

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

        withExistingParent("junium_log");
        withExistingParent("junium_wood");
        withExistingParent("stripped_junium_log");
        withExistingParent("stripped_junium_wood");
        withExistingParent("junium_leaves");
        withExistingParent("junium_planks");
        withExistingParent("junium_stairs");
        withExistingParent("junium_slab");
        withExistingParent("junium_fence", "_inventory");
        withExistingParent("junium_fence_gate");
        withExistingParent("junium_pressure_plate");
        withExistingParent("junium_button", "_inventory");

        withExistingParent("stripped_cactus");
        withExistingParent("cactus_planks");
        withExistingParent("cactus_stairs");
        withExistingParent("cactus_slab");
        withExistingParent("cactus_fence", "_inventory");
        withExistingParent("cactus_fence_gate");
        withExistingParent("cactus_pressure_plate");
        withExistingParent("cactus_button", "_inventory");

        standard(generated, "pink_ipe_sign");
        standard(generated, "purple_ipe_sign");
        standard(generated, "red_ipe_sign");
        standard(generated, "yellow_ipe_sign");
        standard(generated, "junium_sign");
        standard(generated, "cactus_sign");
        standard(generated, "yellow_ipe_boat");
        standard(generated, "powder_snow_bucket");
        standard(generated, "liquid_cactus_bucket");
        standard(generated, "cactus_candy");

        block(generated, "pink_ipe_sapling");
        block(generated, "purple_ipe_sapling");
        block(generated, "red_ipe_sapling");
        block(generated, "yellow_ipe_sapling");
        block(generated, "junium_sapling");
        block(generated, "rose");
        block(generated, "cyan_rose");
        block(generated, "paeonia");
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
