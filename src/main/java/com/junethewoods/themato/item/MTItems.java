package com.junethewoods.themato.item;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.MTBlocks;
import com.junethewoods.themato.util.MTTab;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MTItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheMato.MOD_ID);

    // Pink Ipe
    public static final RegistryObject<Item> PINK_IPE_LOG = ITEMS.register("pink_ipe_log", () -> new BlockItem(MTBlocks.PINK_IPE_LOG.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PINK_IPE_WOOD = ITEMS.register("pink_ipe_wood", () -> new BlockItem(MTBlocks.PINK_IPE_WOOD.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> STRIPPED_PINK_IPE_LOG = ITEMS.register("stripped_pink_ipe_log", () -> new BlockItem(MTBlocks.STRIPPED_PINK_IPE_LOG.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> STRIPPED_PINK_IPE_WOOD = ITEMS.register("stripped_pink_ipe_wood", () -> new BlockItem(MTBlocks.STRIPPED_PINK_IPE_WOOD.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PINK_IPE_LEAVES = ITEMS.register("pink_ipe_leaves", () -> new BlockItem(MTBlocks.PINK_IPE_LEAVES.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PINK_IPE_SAPLING = ITEMS.register("pink_ipe_sapling", () -> new BlockItem(MTBlocks.PINK_IPE_SAPLING.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PINK_IPE_PLANKS = ITEMS.register("pink_ipe_planks", () -> new BlockItem(MTBlocks.PINK_IPE_PLANKS.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PINK_IPE_STAIRS = ITEMS.register("pink_ipe_stairs", () -> new BlockItem(MTBlocks.PINK_IPE_STAIRS.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PINK_IPE_SLAB = ITEMS.register("pink_ipe_slab", () -> new BlockItem(MTBlocks.PINK_IPE_SLAB.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PINK_IPE_FENCE = ITEMS.register("pink_ipe_fence", () -> new BlockItem(MTBlocks.PINK_IPE_FENCE.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PINK_IPE_FENCE_GATE = ITEMS.register("pink_ipe_fence_gate", () -> new BlockItem(MTBlocks.PINK_IPE_FENCE_GATE.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PINK_IPE_PRESSURE_PLATE = ITEMS.register("pink_ipe_pressure_plate", () -> new BlockItem(MTBlocks.PINK_IPE_PRESSURE_PLATE.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PINK_IPE_BUTTON = ITEMS.register("pink_ipe_button", () -> new BlockItem(MTBlocks.PINK_IPE_BUTTON.get(), new Item.Properties().tab(MTTab.TAB)));

    // Purple Ipe
    public static final RegistryObject<Item> PURPLE_IPE_LOG = ITEMS.register("purple_ipe_log", () -> new BlockItem(MTBlocks.PURPLE_IPE_LOG.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PURPLE_IPE_WOOD = ITEMS.register("purple_ipe_wood", () -> new BlockItem(MTBlocks.PURPLE_IPE_WOOD.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> STRIPPED_PURPLE_IPE_LOG = ITEMS.register("stripped_purple_ipe_log", () -> new BlockItem(MTBlocks.STRIPPED_PURPLE_IPE_LOG.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> STRIPPED_PURPLE_IPE_WOOD = ITEMS.register("stripped_purple_ipe_wood", () -> new BlockItem(MTBlocks.STRIPPED_PURPLE_IPE_WOOD.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PURPLE_IPE_LEAVES = ITEMS.register("purple_ipe_leaves", () -> new BlockItem(MTBlocks.PURPLE_IPE_LEAVES.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PURPLE_IPE_SAPLING = ITEMS.register("purple_ipe_sapling", () -> new BlockItem(MTBlocks.PURPLE_IPE_SAPLING.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PURPLE_IPE_PLANKS = ITEMS.register("purple_ipe_planks", () -> new BlockItem(MTBlocks.PURPLE_IPE_PLANKS.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PURPLE_IPE_STAIRS = ITEMS.register("purple_ipe_stairs", () -> new BlockItem(MTBlocks.PURPLE_IPE_STAIRS.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PURPLE_IPE_SLAB = ITEMS.register("purple_ipe_slab", () -> new BlockItem(MTBlocks.PURPLE_IPE_SLAB.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PURPLE_IPE_FENCE = ITEMS.register("purple_ipe_fence", () -> new BlockItem(MTBlocks.PURPLE_IPE_FENCE.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PURPLE_IPE_FENCE_GATE = ITEMS.register("purple_ipe_fence_gate", () -> new BlockItem(MTBlocks.PURPLE_IPE_FENCE_GATE.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PURPLE_IPE_PRESSURE_PLATE = ITEMS.register("purple_ipe_pressure_plate", () -> new BlockItem(MTBlocks.PURPLE_IPE_PRESSURE_PLATE.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> PURPLE_IPE_BUTTON = ITEMS.register("purple_ipe_button", () -> new BlockItem(MTBlocks.PURPLE_IPE_BUTTON.get(), new Item.Properties().tab(MTTab.TAB)));

    // Red Ipe
    public static final RegistryObject<Item> RED_IPE_LOG = ITEMS.register("red_ipe_log", () -> new BlockItem(MTBlocks.RED_IPE_LOG.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> RED_IPE_WOOD = ITEMS.register("red_ipe_wood", () -> new BlockItem(MTBlocks.RED_IPE_WOOD.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> STRIPPED_RED_IPE_LOG = ITEMS.register("stripped_red_ipe_log", () -> new BlockItem(MTBlocks.STRIPPED_RED_IPE_LOG.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> STRIPPED_RED_IPE_WOOD = ITEMS.register("stripped_red_ipe_wood", () -> new BlockItem(MTBlocks.STRIPPED_RED_IPE_WOOD.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> RED_IPE_LEAVES = ITEMS.register("red_ipe_leaves", () -> new BlockItem(MTBlocks.RED_IPE_LEAVES.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> RED_IPE_SAPLING = ITEMS.register("red_ipe_sapling", () -> new BlockItem(MTBlocks.RED_IPE_SAPLING.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> RED_IPE_PLANKS = ITEMS.register("red_ipe_planks", () -> new BlockItem(MTBlocks.RED_IPE_PLANKS.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> RED_IPE_STAIRS = ITEMS.register("red_ipe_stairs", () -> new BlockItem(MTBlocks.RED_IPE_STAIRS.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> RED_IPE_SLAB = ITEMS.register("red_ipe_slab", () -> new BlockItem(MTBlocks.RED_IPE_SLAB.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> RED_IPE_FENCE = ITEMS.register("red_ipe_fence", () -> new BlockItem(MTBlocks.RED_IPE_FENCE.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> RED_IPE_FENCE_GATE = ITEMS.register("red_ipe_fence_gate", () -> new BlockItem(MTBlocks.RED_IPE_FENCE_GATE.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> RED_IPE_PRESSURE_PLATE = ITEMS.register("red_ipe_pressure_plate", () -> new BlockItem(MTBlocks.RED_IPE_PRESSURE_PLATE.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> RED_IPE_BUTTON = ITEMS.register("red_ipe_button", () -> new BlockItem(MTBlocks.RED_IPE_BUTTON.get(), new Item.Properties().tab(MTTab.TAB)));

    // Yellow Ipe
    public static final RegistryObject<Item> YELLOW_IPE_LOG = ITEMS.register("yellow_ipe_log", () -> new BlockItem(MTBlocks.YELLOW_IPE_LOG.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> YELLOW_IPE_WOOD = ITEMS.register("yellow_ipe_wood", () -> new BlockItem(MTBlocks.YELLOW_IPE_WOOD.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> STRIPPED_YELLOW_IPE_LOG = ITEMS.register("stripped_yellow_ipe_log", () -> new BlockItem(MTBlocks.STRIPPED_YELLOW_IPE_LOG.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> STRIPPED_YELLOW_IPE_WOOD = ITEMS.register("stripped_yellow_ipe_wood", () -> new BlockItem(MTBlocks.STRIPPED_YELLOW_IPE_WOOD.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> YELLOW_IPE_LEAVES = ITEMS.register("yellow_ipe_leaves", () -> new BlockItem(MTBlocks.YELLOW_IPE_LEAVES.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> YELLOW_IPE_SAPLING = ITEMS.register("yellow_ipe_sapling", () -> new BlockItem(MTBlocks.YELLOW_IPE_SAPLING.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> YELLOW_IPE_PLANKS = ITEMS.register("yellow_ipe_planks", () -> new BlockItem(MTBlocks.YELLOW_IPE_PLANKS.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> YELLOW_IPE_STAIRS = ITEMS.register("yellow_ipe_stairs", () -> new BlockItem(MTBlocks.YELLOW_IPE_STAIRS.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> YELLOW_IPE_SLAB = ITEMS.register("yellow_ipe_slab", () -> new BlockItem(MTBlocks.YELLOW_IPE_SLAB.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> YELLOW_IPE_FENCE = ITEMS.register("yellow_ipe_fence", () -> new BlockItem(MTBlocks.YELLOW_IPE_FENCE.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> YELLOW_IPE_FENCE_GATE = ITEMS.register("yellow_ipe_fence_gate", () -> new BlockItem(MTBlocks.YELLOW_IPE_FENCE_GATE.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> YELLOW_IPE_PRESSURE_PLATE = ITEMS.register("yellow_ipe_pressure_plate", () -> new BlockItem(MTBlocks.YELLOW_IPE_PRESSURE_PLATE.get(), new Item.Properties().tab(MTTab.TAB)));
    public static final RegistryObject<Item> YELLOW_IPE_BUTTON = ITEMS.register("yellow_ipe_button", () -> new BlockItem(MTBlocks.YELLOW_IPE_BUTTON.get(), new Item.Properties().tab(MTTab.TAB)));

    public static final RegistryObject<Item> PINK_IPE_SIGN = ITEMS.register("pink_ipe_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(MTTab.TAB), MTBlocks.PINK_IPE_SIGN.get(), MTBlocks.PINK_IPE_WALL_SIGN.get()));
    public static final RegistryObject<Item> PURPLE_IPE_SIGN = ITEMS.register("purple_ipe_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(MTTab.TAB), MTBlocks.PURPLE_IPE_SIGN.get(), MTBlocks.PURPLE_IPE_WALL_SIGN.get()));
    public static final RegistryObject<Item> RED_IPE_SIGN = ITEMS.register("red_ipe_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(MTTab.TAB), MTBlocks.RED_IPE_SIGN.get(), MTBlocks.RED_IPE_WALL_SIGN.get()));
    public static final RegistryObject<Item> YELLOW_IPE_SIGN = ITEMS.register("yellow_ipe_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(MTTab.TAB), MTBlocks.YELLOW_IPE_SIGN.get(), MTBlocks.YELLOW_IPE_WALL_SIGN.get()));
}
