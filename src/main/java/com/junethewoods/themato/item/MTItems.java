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

    public static final RegistryObject<Item> YELLOW_IPE_SIGN = ITEMS.register("yellow_ipe_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(MTTab.TAB), MTBlocks.YELLOW_IPE_SIGN.get(), MTBlocks.YELLOW_IPE_WALL_SIGN.get()));
}
