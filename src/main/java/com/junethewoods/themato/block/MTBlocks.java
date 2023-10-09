package com.junethewoods.themato.block;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.custom.MTStandingSignBlock;
import com.junethewoods.themato.block.custom.MTWallSignBlock;
import com.junethewoods.themato.util.MTWoodTypes;
import net.minecraft.block.*;
import net.minecraft.block.trees.OakTree;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MTBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TheMato.MOD_ID);

    public static final RegistryObject<Block> YELLOW_IPE_LOG = BLOCKS.register("yellow_ipe_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> YELLOW_IPE_WOOD = BLOCKS.register("yellow_ipe_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_YELLOW_IPE_LOG = BLOCKS.register("stripped_yellow_ipe_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_YELLOW_IPE_WOOD = BLOCKS.register("stripped_yellow_ipe_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> YELLOW_IPE_LEAVES = BLOCKS.register("yellow_ipe_leaves", () -> new LeavesBlock(AbstractBlock.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> YELLOW_IPE_SAPLING = BLOCKS.register("yellow_ipe_sapling", () -> new SaplingBlock(new OakTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_YELLOW_IPE_SAPLING = BLOCKS.register("potted_yellow_ipe_sapling", () -> new FlowerPotBlock(MTBlocks.YELLOW_IPE_SAPLING.get(), AbstractBlock.Properties.copy(Blocks.POTTED_OAK_SAPLING)));
    public static final RegistryObject<Block> YELLOW_IPE_PLANKS = BLOCKS.register("yellow_ipe_planks", () -> new Block(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> YELLOW_IPE_STAIRS = BLOCKS.register("yellow_ipe_stairs", () -> new StairsBlock(() -> MTBlocks.YELLOW_IPE_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> YELLOW_IPE_SLAB = BLOCKS.register("yellow_ipe_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> YELLOW_IPE_FENCE = BLOCKS.register("yellow_ipe_fence", () -> new FenceBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> YELLOW_IPE_FENCE_GATE = BLOCKS.register("yellow_ipe_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> YELLOW_IPE_PRESSURE_PLATE = BLOCKS.register("yellow_ipe_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> YELLOW_IPE_BUTTON = BLOCKS.register("yellow_ipe_button", () -> new WoodButtonBlock(AbstractBlock.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> YELLOW_IPE_SIGN = BLOCKS.register("yellow_ipe_sign", () -> new MTStandingSignBlock(AbstractBlock.Properties.copy(Blocks.OAK_SIGN), MTWoodTypes.YELLOW_IPE));
    public static final RegistryObject<Block> YELLOW_IPE_WALL_SIGN = BLOCKS.register("yellow_ipe_wall_sign", () -> new MTWallSignBlock(AbstractBlock.Properties.copy(Blocks.OAK_WALL_SIGN).lootFrom(MTBlocks.YELLOW_IPE_SIGN), MTWoodTypes.YELLOW_IPE));
}
