package com.junethewoods.themato.block;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.custom.MTStandingSignBlock;
import com.junethewoods.themato.block.custom.MTWallSignBlock;
import com.junethewoods.themato.block.custom.StrippedCactusBlock;
import com.junethewoods.themato.util.MTWoodTypes;
import com.junethewoods.themato.world.tree.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MTBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TheMato.MOD_ID);

    // Pink Ipe
    public static final RegistryObject<Block> PINK_IPE_LOG = BLOCKS.register("pink_ipe_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> PINK_IPE_WOOD = BLOCKS.register("pink_ipe_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_PINK_IPE_LOG = BLOCKS.register("stripped_pink_ipe_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_PINK_IPE_WOOD = BLOCKS.register("stripped_pink_ipe_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> PINK_IPE_LEAVES = BLOCKS.register("pink_ipe_leaves", () -> new LeavesBlock(AbstractBlock.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> PINK_IPE_SAPLING = BLOCKS.register("pink_ipe_sapling", () -> new SaplingBlock(new PinkIpeTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_PINK_IPE_SAPLING = BLOCKS.register("potted_pink_ipe_sapling", () -> new FlowerPotBlock(MTBlocks.PINK_IPE_SAPLING.get(), AbstractBlock.Properties.copy(Blocks.POTTED_OAK_SAPLING)));
    public static final RegistryObject<Block> PINK_IPE_PLANKS = BLOCKS.register("pink_ipe_planks", () -> new Block(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PINK_IPE_STAIRS = BLOCKS.register("pink_ipe_stairs", () -> new StairsBlock(() -> MTBlocks.PINK_IPE_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> PINK_IPE_SLAB = BLOCKS.register("pink_ipe_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> PINK_IPE_FENCE = BLOCKS.register("pink_ipe_fence", () -> new FenceBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> PINK_IPE_FENCE_GATE = BLOCKS.register("pink_ipe_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> PINK_IPE_PRESSURE_PLATE = BLOCKS.register("pink_ipe_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> PINK_IPE_BUTTON = BLOCKS.register("pink_ipe_button", () -> new WoodButtonBlock(AbstractBlock.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> PINK_IPE_SIGN = BLOCKS.register("pink_ipe_sign", () -> new MTStandingSignBlock(AbstractBlock.Properties.copy(Blocks.OAK_SIGN), MTWoodTypes.PINK_IPE));
    public static final RegistryObject<Block> PINK_IPE_WALL_SIGN = BLOCKS.register("pink_ipe_wall_sign", () -> new MTWallSignBlock(AbstractBlock.Properties.copy(Blocks.OAK_WALL_SIGN).lootFrom(MTBlocks.PINK_IPE_SIGN), MTWoodTypes.PINK_IPE));

    // Purple Ipe
    public static final RegistryObject<Block> PURPLE_IPE_LOG = BLOCKS.register("purple_ipe_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> PURPLE_IPE_WOOD = BLOCKS.register("purple_ipe_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_PURPLE_IPE_LOG = BLOCKS.register("stripped_purple_ipe_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_PURPLE_IPE_WOOD = BLOCKS.register("stripped_purple_ipe_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> PURPLE_IPE_LEAVES = BLOCKS.register("purple_ipe_leaves", () -> new LeavesBlock(AbstractBlock.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> PURPLE_IPE_SAPLING = BLOCKS.register("purple_ipe_sapling", () -> new SaplingBlock(new PurpleIpeTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_PURPLE_IPE_SAPLING = BLOCKS.register("potted_purple_ipe_sapling", () -> new FlowerPotBlock(MTBlocks.PURPLE_IPE_SAPLING.get(), AbstractBlock.Properties.copy(Blocks.POTTED_OAK_SAPLING)));
    public static final RegistryObject<Block> PURPLE_IPE_PLANKS = BLOCKS.register("purple_ipe_planks", () -> new Block(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PURPLE_IPE_STAIRS = BLOCKS.register("purple_ipe_stairs", () -> new StairsBlock(() -> MTBlocks.PURPLE_IPE_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> PURPLE_IPE_SLAB = BLOCKS.register("purple_ipe_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> PURPLE_IPE_FENCE = BLOCKS.register("purple_ipe_fence", () -> new FenceBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> PURPLE_IPE_FENCE_GATE = BLOCKS.register("purple_ipe_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> PURPLE_IPE_PRESSURE_PLATE = BLOCKS.register("purple_ipe_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> PURPLE_IPE_BUTTON = BLOCKS.register("purple_ipe_button", () -> new WoodButtonBlock(AbstractBlock.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> PURPLE_IPE_SIGN = BLOCKS.register("purple_ipe_sign", () -> new MTStandingSignBlock(AbstractBlock.Properties.copy(Blocks.OAK_SIGN), MTWoodTypes.PURPLE_IPE));
    public static final RegistryObject<Block> PURPLE_IPE_WALL_SIGN = BLOCKS.register("purple_ipe_wall_sign", () -> new MTWallSignBlock(AbstractBlock.Properties.copy(Blocks.OAK_WALL_SIGN).lootFrom(MTBlocks.PURPLE_IPE_SIGN), MTWoodTypes.PURPLE_IPE));

    // Red Ipe
    public static final RegistryObject<Block> RED_IPE_LOG = BLOCKS.register("red_ipe_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> RED_IPE_WOOD = BLOCKS.register("red_ipe_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_RED_IPE_LOG = BLOCKS.register("stripped_red_ipe_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_RED_IPE_WOOD = BLOCKS.register("stripped_red_ipe_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> RED_IPE_LEAVES = BLOCKS.register("red_ipe_leaves", () -> new LeavesBlock(AbstractBlock.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> RED_IPE_SAPLING = BLOCKS.register("red_ipe_sapling", () -> new SaplingBlock(new RedIpeTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_RED_IPE_SAPLING = BLOCKS.register("potted_red_ipe_sapling", () -> new FlowerPotBlock(MTBlocks.RED_IPE_SAPLING.get(), AbstractBlock.Properties.copy(Blocks.POTTED_OAK_SAPLING)));
    public static final RegistryObject<Block> RED_IPE_PLANKS = BLOCKS.register("red_ipe_planks", () -> new Block(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> RED_IPE_STAIRS = BLOCKS.register("red_ipe_stairs", () -> new StairsBlock(() -> MTBlocks.RED_IPE_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> RED_IPE_SLAB = BLOCKS.register("red_ipe_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> RED_IPE_FENCE = BLOCKS.register("red_ipe_fence", () -> new FenceBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> RED_IPE_FENCE_GATE = BLOCKS.register("red_ipe_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> RED_IPE_PRESSURE_PLATE = BLOCKS.register("red_ipe_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> RED_IPE_BUTTON = BLOCKS.register("red_ipe_button", () -> new WoodButtonBlock(AbstractBlock.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> RED_IPE_SIGN = BLOCKS.register("red_ipe_sign", () -> new MTStandingSignBlock(AbstractBlock.Properties.copy(Blocks.OAK_SIGN), MTWoodTypes.RED_IPE));
    public static final RegistryObject<Block> RED_IPE_WALL_SIGN = BLOCKS.register("red_ipe_wall_sign", () -> new MTWallSignBlock(AbstractBlock.Properties.copy(Blocks.OAK_WALL_SIGN).lootFrom(MTBlocks.RED_IPE_SIGN), MTWoodTypes.RED_IPE));

    // Yellow Ipe
    public static final RegistryObject<Block> YELLOW_IPE_LOG = BLOCKS.register("yellow_ipe_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> YELLOW_IPE_WOOD = BLOCKS.register("yellow_ipe_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_YELLOW_IPE_LOG = BLOCKS.register("stripped_yellow_ipe_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_YELLOW_IPE_WOOD = BLOCKS.register("stripped_yellow_ipe_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> YELLOW_IPE_LEAVES = BLOCKS.register("yellow_ipe_leaves", () -> new LeavesBlock(AbstractBlock.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> YELLOW_IPE_SAPLING = BLOCKS.register("yellow_ipe_sapling", () -> new SaplingBlock(new YellowIpeTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING)));
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

    // Junium
    public static final RegistryObject<Block> JUNIUM_LOG = BLOCKS.register("junium_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.DARK_OAK_LOG)));
    public static final RegistryObject<Block> JUNIUM_WOOD = BLOCKS.register("junium_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.DARK_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_JUNIUM_LOG = BLOCKS.register("stripped_junium_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_JUNIUM_WOOD = BLOCKS.register("stripped_junium_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final RegistryObject<Block> JUNIUM_LEAVES = BLOCKS.register("junium_leaves", () -> new LeavesBlock(AbstractBlock.Properties.copy(Blocks.DARK_OAK_LEAVES)));
    public static final RegistryObject<Block> JUNIUM_SAPLING = BLOCKS.register("junium_sapling", () -> new SaplingBlock(new JuniumTree(), AbstractBlock.Properties.copy(Blocks.DARK_OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_JUNIUM_SAPLING = BLOCKS.register("potted_junium_sapling", () -> new FlowerPotBlock(MTBlocks.JUNIUM_SAPLING.get(), AbstractBlock.Properties.copy(Blocks.POTTED_DARK_OAK_SAPLING)));
    public static final RegistryObject<Block> JUNIUM_PLANKS = BLOCKS.register("junium_planks", () -> new Block(AbstractBlock.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> JUNIUM_STAIRS = BLOCKS.register("junium_stairs", () -> new StairsBlock(() -> MTBlocks.JUNIUM_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(Blocks.DARK_OAK_STAIRS)));
    public static final RegistryObject<Block> JUNIUM_SLAB = BLOCKS.register("junium_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.DARK_OAK_SLAB)));
    public static final RegistryObject<Block> JUNIUM_FENCE = BLOCKS.register("junium_fence", () -> new FenceBlock(AbstractBlock.Properties.copy(Blocks.DARK_OAK_FENCE)));
    public static final RegistryObject<Block> JUNIUM_FENCE_GATE = BLOCKS.register("junium_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.copy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final RegistryObject<Block> JUNIUM_PRESSURE_PLATE = BLOCKS.register("junium_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.copy(Blocks.DARK_OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> JUNIUM_BUTTON = BLOCKS.register("junium_button", () -> new WoodButtonBlock(AbstractBlock.Properties.copy(Blocks.DARK_OAK_BUTTON)));
    public static final RegistryObject<Block> JUNIUM_SIGN = BLOCKS.register("junium_sign", () -> new MTStandingSignBlock(AbstractBlock.Properties.copy(Blocks.DARK_OAK_SIGN), MTWoodTypes.JUNIUM));
    public static final RegistryObject<Block> JUNIUM_WALL_SIGN = BLOCKS.register("junium_wall_sign", () -> new MTWallSignBlock(AbstractBlock.Properties.copy(Blocks.DARK_OAK_WALL_SIGN).lootFrom(MTBlocks.JUNIUM_SIGN), MTWoodTypes.JUNIUM));

    // Cactus Wood
    public static final RegistryObject<Block> STRIPPED_CACTUS = BLOCKS.register("stripped_cactus", () -> new StrippedCactusBlock(AbstractBlock.Properties.of(Material.CACTUS).strength(0.4F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> CACTUS_PLANKS = BLOCKS.register("cactus_planks", () -> new Block(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CACTUS_STAIRS = BLOCKS.register("cactus_stairs", () -> new StairsBlock(() -> MTBlocks.CACTUS_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> CACTUS_SLAB = BLOCKS.register("cactus_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> CACTUS_FENCE = BLOCKS.register("cactus_fence", () -> new FenceBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CACTUS_FENCE_GATE = BLOCKS.register("cactus_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> CACTUS_PRESSURE_PLATE = BLOCKS.register("cactus_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> CACTUS_BUTTON = BLOCKS.register("cactus_button", () -> new WoodButtonBlock(AbstractBlock.Properties.copy(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> CACTUS_SIGN = BLOCKS.register("cactus_sign", () -> new MTStandingSignBlock(AbstractBlock.Properties.copy(Blocks.OAK_SIGN), MTWoodTypes.CACTUS));
    public static final RegistryObject<Block> CACTUS_WALL_SIGN = BLOCKS.register("cactus_wall_sign", () -> new MTWallSignBlock(AbstractBlock.Properties.copy(Blocks.OAK_WALL_SIGN).lootFrom(MTBlocks.CACTUS_SIGN), MTWoodTypes.CACTUS));

    // Plants
    public static final RegistryObject<Block> ROSE = BLOCKS.register("rose", () -> new FlowerBlock(Effects.REGENERATION, 10, AbstractBlock.Properties.copy(Blocks.POPPY).sound(SoundType.CROP)));
    public static final RegistryObject<Block> CYAN_ROSE = BLOCKS.register("cyan_rose", () -> new FlowerBlock(Effects.ABSORPTION, 6, AbstractBlock.Properties.copy(Blocks.POPPY).sound(SoundType.CROP)));
    public static final RegistryObject<Block> PAEONIA = BLOCKS.register("paeonia", () -> new FlowerBlock(Effects.DIG_SPEED, 8, AbstractBlock.Properties.copy(Blocks.POPPY).sound(SoundType.CROP)));
    public static final RegistryObject<Block> POTTED_ROSE = BLOCKS.register("potted_rose", () -> new FlowerPotBlock(MTBlocks.ROSE.get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_CYAN_ROSE = BLOCKS.register("potted_cyan_rose", () -> new FlowerPotBlock(MTBlocks.CYAN_ROSE.get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_PAEONIA = BLOCKS.register("potted_paeonia", () -> new FlowerPotBlock(MTBlocks.PAEONIA.get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY)));
}
