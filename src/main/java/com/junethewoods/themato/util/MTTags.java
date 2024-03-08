package com.junethewoods.themato.util;

import com.junethewoods.themato.TheMato;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class MTTags {
    public static class Blocks {
        public static final ITag.INamedTag<Block> SNOWY_TREES_SPAWNABLE_ON = theMato("snowy_trees_spawnable_on");
        public static final ITag.INamedTag<Block> POWDER_SNOW_REPLACEABLES = theMato("powder_snow_replaceables");
        public static final ITag.INamedTag<Block> OVERWORLD_CARVER_REPLACEABLES = minecraft("overworld_carver_replaceables");

        public static ITag.INamedTag<Block> theMato(String name) {
            return BlockTags.bind(TheMato.resourceLoc(name).toString());
        }

        public static ITag.INamedTag<Block> minecraft(String name) {
            return BlockTags.bind(new ResourceLocation("minecraft", name).toString());
        }
    }

    public static class Items {
        public static final ITag.INamedTag<Item> POWDER_SNOW_PROOF_SHOES = theMato("powder_snow_proof_shoes");

        public static ITag.INamedTag<Item> theMato(String name) {
            return ItemTags.bind(TheMato.resourceLoc(name).toString());
        }
    }

    public static class Entities {
        public static final ITag.INamedTag<EntityType<?>> CAN_SPAWN_ON_LEAVES = melony("can_spawn_on_leaves");
        public static final ITag.INamedTag<EntityType<?>> POWDER_SNOW_WALKABLE_MOBS = theMato("powder_snow_walkable_mobs");
        public static final ITag.INamedTag<EntityType<?>> FREEZE_IMMUNE_ENTITY_TYPES = theMato("freeze_immune_entity_types");

        public static ITag.INamedTag<EntityType<?>> melony(String name) {
            return EntityTypeTags.bind(new ResourceLocation("melony", name).toString());
        }

        public static ITag.INamedTag<EntityType<?>> theMato(String name) {
            return EntityTypeTags.bind(TheMato.resourceLoc(name).toString());
        }
    }
}
