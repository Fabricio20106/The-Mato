package com.junethewoods.themato.block;

import com.junethewoods.themato.TheMato;
import com.junethewoods.themato.block.custom.MTStandingSignBlock;
import com.junethewoods.themato.block.custom.MTWallSignBlock;
import com.junethewoods.themato.block.custom.PowderSnowBlock;
import com.junethewoods.themato.block.custom.StrippedCactusBlock;
import com.junethewoods.themato.block.custom.cauldron.*;
import com.junethewoods.themato.block.material.MTMaterialColors;
import com.junethewoods.themato.block.material.MTMaterials;
import com.junethewoods.themato.cauldron.CauldronInteraction;
import com.junethewoods.themato.sound.MTSoundTypes;
import com.junethewoods.themato.util.MTTags;
import com.junethewoods.themato.util.MTWoodTypes;
import com.junethewoods.themato.world.tree.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.block.PressurePlateBlock.Sensitivity.EVERYTHING;

public class MTBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TheMato.MOD_ID);

    // Pink Ipe
    public static final RegistryObject<Block> PINK_IPE_LOG = BLOCKS.register("pink_ipe_log", () -> log(MaterialColor.COLOR_PINK, MaterialColor.WARPED_HYPHAE));
    public static final RegistryObject<Block> PINK_IPE_WOOD = BLOCKS.register("pink_ipe_wood", () -> log(MaterialColor.WARPED_HYPHAE, MaterialColor.WARPED_HYPHAE));
    public static final RegistryObject<Block> STRIPPED_PINK_IPE_LOG = BLOCKS.register("stripped_pink_ipe_log", () -> log(MaterialColor.COLOR_PINK, MaterialColor.COLOR_PINK));
    public static final RegistryObject<Block> STRIPPED_PINK_IPE_WOOD = BLOCKS.register("stripped_pink_ipe_wood", () -> log(MaterialColor.COLOR_PINK, MaterialColor.COLOR_PINK));
    public static final RegistryObject<Block> PINK_IPE_LEAVES = BLOCKS.register("pink_ipe_leaves", () -> leaves(MaterialColor.COLOR_PINK));
    public static final RegistryObject<Block> PINK_IPE_SAPLING = BLOCKS.register("pink_ipe_sapling", () -> new SaplingBlock(new PinkIpeTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_PINK_IPE_SAPLING = BLOCKS.register("potted_pink_ipe_sapling", () -> new FlowerPotBlock(MTBlocks.PINK_IPE_SAPLING.get(), AbstractBlock.Properties.copy(Blocks.POTTED_OAK_SAPLING)));
    public static final RegistryObject<Block> PINK_IPE_PLANKS = BLOCKS.register("pink_ipe_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(2, 3).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_IPE_STAIRS = BLOCKS.register("pink_ipe_stairs", () -> new StairsBlock(() -> PINK_IPE_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(PINK_IPE_PLANKS.get())));
    public static final RegistryObject<Block> PINK_IPE_SLAB = BLOCKS.register("pink_ipe_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(PINK_IPE_PLANKS.get())));
    public static final RegistryObject<Block> PINK_IPE_FENCE = BLOCKS.register("pink_ipe_fence", () -> new FenceBlock(AbstractBlock.Properties.copy(PINK_IPE_PLANKS.get())));
    public static final RegistryObject<Block> PINK_IPE_FENCE_GATE = BLOCKS.register("pink_ipe_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.copy(PINK_IPE_PLANKS.get())));
    public static final RegistryObject<Block> PINK_IPE_PRESSURE_PLATE = BLOCKS.register("pink_ipe_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, AbstractBlock.Properties.copy(PINK_IPE_PLANKS.get()).noCollission().strength(0.5F)));
    public static final RegistryObject<Block> PINK_IPE_BUTTON = BLOCKS.register("pink_ipe_button", () -> new WoodButtonBlock(AbstractBlock.Properties.copy(PINK_IPE_PLANKS.get()).noCollission().strength(0.5F)));
    public static final RegistryObject<Block> PINK_IPE_SIGN = BLOCKS.register("pink_ipe_sign", () -> new MTStandingSignBlock(AbstractBlock.Properties.copy(PINK_IPE_PLANKS.get()).noCollission().strength(1), MTWoodTypes.PINK_IPE));
    public static final RegistryObject<Block> PINK_IPE_WALL_SIGN = BLOCKS.register("pink_ipe_wall_sign", () -> new MTWallSignBlock(AbstractBlock.Properties.copy(PINK_IPE_PLANKS.get()).noCollission().strength(1).lootFrom(MTBlocks.PINK_IPE_SIGN), MTWoodTypes.PINK_IPE));

    // Purple Ipe
    public static final RegistryObject<Block> PURPLE_IPE_LOG = BLOCKS.register("purple_ipe_log", () -> log(MaterialColor.COLOR_PURPLE, MaterialColor.WARPED_HYPHAE));
    public static final RegistryObject<Block> PURPLE_IPE_WOOD = BLOCKS.register("purple_ipe_wood", () -> log(MaterialColor.WARPED_HYPHAE, MaterialColor.WARPED_HYPHAE));
    public static final RegistryObject<Block> STRIPPED_PURPLE_IPE_LOG = BLOCKS.register("stripped_purple_ipe_log", () -> log(MaterialColor.COLOR_PURPLE, MaterialColor.COLOR_PURPLE));
    public static final RegistryObject<Block> STRIPPED_PURPLE_IPE_WOOD = BLOCKS.register("stripped_purple_ipe_wood", () -> log(MaterialColor.COLOR_PURPLE, MaterialColor.COLOR_PURPLE));
    public static final RegistryObject<Block> PURPLE_IPE_LEAVES = BLOCKS.register("purple_ipe_leaves", () -> leaves(MaterialColor.COLOR_PURPLE));
    public static final RegistryObject<Block> PURPLE_IPE_SAPLING = BLOCKS.register("purple_ipe_sapling", () -> new SaplingBlock(new PurpleIpeTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_PURPLE_IPE_SAPLING = BLOCKS.register("potted_purple_ipe_sapling", () -> new FlowerPotBlock(MTBlocks.PURPLE_IPE_SAPLING.get(), AbstractBlock.Properties.copy(Blocks.POTTED_OAK_SAPLING)));
    public static final RegistryObject<Block> PURPLE_IPE_PLANKS = BLOCKS.register("purple_ipe_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE).strength(2, 3).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_IPE_STAIRS = BLOCKS.register("purple_ipe_stairs", () -> new StairsBlock(() -> PURPLE_IPE_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(PURPLE_IPE_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_IPE_SLAB = BLOCKS.register("purple_ipe_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(PURPLE_IPE_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_IPE_FENCE = BLOCKS.register("purple_ipe_fence", () -> new FenceBlock(AbstractBlock.Properties.copy(PURPLE_IPE_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_IPE_FENCE_GATE = BLOCKS.register("purple_ipe_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.copy(PURPLE_IPE_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_IPE_PRESSURE_PLATE = BLOCKS.register("purple_ipe_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, AbstractBlock.Properties.copy(PURPLE_IPE_PLANKS.get()).noCollission().strength(0.5F)));
    public static final RegistryObject<Block> PURPLE_IPE_BUTTON = BLOCKS.register("purple_ipe_button", () -> new WoodButtonBlock(AbstractBlock.Properties.copy(PURPLE_IPE_PLANKS.get()).noCollission().strength(0.5F)));
    public static final RegistryObject<Block> PURPLE_IPE_SIGN = BLOCKS.register("purple_ipe_sign", () -> new MTStandingSignBlock(AbstractBlock.Properties.copy(PURPLE_IPE_PLANKS.get()).noCollission().strength(1), MTWoodTypes.PURPLE_IPE));
    public static final RegistryObject<Block> PURPLE_IPE_WALL_SIGN = BLOCKS.register("purple_ipe_wall_sign", () -> new MTWallSignBlock(AbstractBlock.Properties.copy(PURPLE_IPE_PLANKS.get()).noCollission().strength(1).lootFrom(MTBlocks.PURPLE_IPE_SIGN), MTWoodTypes.PURPLE_IPE));

    // Red Ipe
    public static final RegistryObject<Block> RED_IPE_LOG = BLOCKS.register("red_ipe_log", () -> log(MaterialColor.CRIMSON_NYLIUM, MaterialColor.WARPED_HYPHAE));
    public static final RegistryObject<Block> RED_IPE_WOOD = BLOCKS.register("red_ipe_wood", () -> log(MaterialColor.WARPED_HYPHAE, MaterialColor.WARPED_HYPHAE));
    public static final RegistryObject<Block> STRIPPED_RED_IPE_LOG = BLOCKS.register("stripped_red_ipe_log", () -> log(MaterialColor.CRIMSON_NYLIUM, MaterialColor.CRIMSON_NYLIUM));
    public static final RegistryObject<Block> STRIPPED_RED_IPE_WOOD = BLOCKS.register("stripped_red_ipe_wood", () -> log(MaterialColor.CRIMSON_NYLIUM, MaterialColor.CRIMSON_NYLIUM));
    public static final RegistryObject<Block> RED_IPE_LEAVES = BLOCKS.register("red_ipe_leaves", () -> leaves(MaterialColor.CRIMSON_NYLIUM));
    public static final RegistryObject<Block> RED_IPE_SAPLING = BLOCKS.register("red_ipe_sapling", () -> new SaplingBlock(new RedIpeTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_RED_IPE_SAPLING = BLOCKS.register("potted_red_ipe_sapling", () -> new FlowerPotBlock(MTBlocks.RED_IPE_SAPLING.get(), AbstractBlock.Properties.copy(Blocks.POTTED_OAK_SAPLING)));
    public static final RegistryObject<Block> RED_IPE_PLANKS = BLOCKS.register("red_ipe_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.CRIMSON_NYLIUM).strength(2, 3).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_IPE_STAIRS = BLOCKS.register("red_ipe_stairs", () -> new StairsBlock(() -> RED_IPE_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(RED_IPE_PLANKS.get())));
    public static final RegistryObject<Block> RED_IPE_SLAB = BLOCKS.register("red_ipe_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(RED_IPE_PLANKS.get())));
    public static final RegistryObject<Block> RED_IPE_FENCE = BLOCKS.register("red_ipe_fence", () -> new FenceBlock(AbstractBlock.Properties.copy(RED_IPE_PLANKS.get())));
    public static final RegistryObject<Block> RED_IPE_FENCE_GATE = BLOCKS.register("red_ipe_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.copy(RED_IPE_PLANKS.get())));
    public static final RegistryObject<Block> RED_IPE_PRESSURE_PLATE = BLOCKS.register("red_ipe_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, AbstractBlock.Properties.copy(RED_IPE_PLANKS.get()).noCollission().strength(0.5F)));
    public static final RegistryObject<Block> RED_IPE_BUTTON = BLOCKS.register("red_ipe_button", () -> new WoodButtonBlock(AbstractBlock.Properties.copy(RED_IPE_PLANKS.get()).noCollission().strength(0.5F)));
    public static final RegistryObject<Block> RED_IPE_SIGN = BLOCKS.register("red_ipe_sign", () -> new MTStandingSignBlock(AbstractBlock.Properties.copy(RED_IPE_PLANKS.get()).noCollission().strength(1), MTWoodTypes.RED_IPE));
    public static final RegistryObject<Block> RED_IPE_WALL_SIGN = BLOCKS.register("red_ipe_wall_sign", () -> new MTWallSignBlock(AbstractBlock.Properties.copy(RED_IPE_PLANKS.get()).noCollission().strength(1).lootFrom(MTBlocks.RED_IPE_SIGN), MTWoodTypes.RED_IPE));

    // Yellow Ipe
    public static final RegistryObject<Block> YELLOW_IPE_LOG = BLOCKS.register("yellow_ipe_log", () -> log(MTMaterialColors.YELLOW_IPE, MaterialColor.TERRACOTTA_GRAY));
    public static final RegistryObject<Block> YELLOW_IPE_WOOD = BLOCKS.register("yellow_ipe_wood", () -> log(MaterialColor.TERRACOTTA_GRAY, MaterialColor.TERRACOTTA_GRAY));
    public static final RegistryObject<Block> STRIPPED_YELLOW_IPE_LOG = BLOCKS.register("stripped_yellow_ipe_log", () -> log(MTMaterialColors.YELLOW_IPE, MTMaterialColors.YELLOW_IPE));
    public static final RegistryObject<Block> STRIPPED_YELLOW_IPE_WOOD = BLOCKS.register("stripped_yellow_ipe_wood", () -> log(MTMaterialColors.YELLOW_IPE, MTMaterialColors.YELLOW_IPE));
    public static final RegistryObject<Block> YELLOW_IPE_LEAVES = BLOCKS.register("yellow_ipe_leaves", () -> leaves(MTMaterialColors.YELLOW_IPE));
    public static final RegistryObject<Block> YELLOW_IPE_SAPLING = BLOCKS.register("yellow_ipe_sapling", () -> new SaplingBlock(new YellowIpeTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_YELLOW_IPE_SAPLING = BLOCKS.register("potted_yellow_ipe_sapling", () -> new FlowerPotBlock(MTBlocks.YELLOW_IPE_SAPLING.get(), AbstractBlock.Properties.copy(Blocks.POTTED_OAK_SAPLING)));
    public static final RegistryObject<Block> YELLOW_IPE_PLANKS = BLOCKS.register("yellow_ipe_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD, MTMaterialColors.YELLOW_IPE).strength(2, 3).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_IPE_STAIRS = BLOCKS.register("yellow_ipe_stairs", () -> new StairsBlock(() -> YELLOW_IPE_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(YELLOW_IPE_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_IPE_SLAB = BLOCKS.register("yellow_ipe_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(YELLOW_IPE_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_IPE_FENCE = BLOCKS.register("yellow_ipe_fence", () -> new FenceBlock(AbstractBlock.Properties.copy(YELLOW_IPE_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_IPE_FENCE_GATE = BLOCKS.register("yellow_ipe_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.copy(YELLOW_IPE_PLANKS.get())));
    public static final RegistryObject<Block> YELLOW_IPE_PRESSURE_PLATE = BLOCKS.register("yellow_ipe_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, AbstractBlock.Properties.copy(YELLOW_IPE_PLANKS.get()).noCollission().strength(0.5F)));
    public static final RegistryObject<Block> YELLOW_IPE_BUTTON = BLOCKS.register("yellow_ipe_button", () -> new WoodButtonBlock(AbstractBlock.Properties.copy(YELLOW_IPE_PLANKS.get()).noCollission().strength(0.5F)));
    public static final RegistryObject<Block> YELLOW_IPE_SIGN = BLOCKS.register("yellow_ipe_sign", () -> new MTStandingSignBlock(AbstractBlock.Properties.copy(YELLOW_IPE_PLANKS.get()).noCollission().strength(1), MTWoodTypes.YELLOW_IPE));
    public static final RegistryObject<Block> YELLOW_IPE_WALL_SIGN = BLOCKS.register("yellow_ipe_wall_sign", () -> new MTWallSignBlock(AbstractBlock.Properties.copy(YELLOW_IPE_PLANKS.get()).noCollission().strength(1).lootFrom(MTBlocks.YELLOW_IPE_SIGN), MTWoodTypes.YELLOW_IPE));

    // Junium
    public static final RegistryObject<Block> JUNIUM_LOG = BLOCKS.register("junium_log", () -> log(MTMaterialColors.JUNIUM, MaterialColor.COLOR_BLACK));
    public static final RegistryObject<Block> JUNIUM_WOOD = BLOCKS.register("junium_wood", () -> log(MaterialColor.COLOR_BLACK, MaterialColor.COLOR_BLACK));
    public static final RegistryObject<Block> STRIPPED_JUNIUM_LOG = BLOCKS.register("stripped_junium_log", () -> log(MTMaterialColors.JUNIUM, MTMaterialColors.JUNIUM));
    public static final RegistryObject<Block> STRIPPED_JUNIUM_WOOD = BLOCKS.register("stripped_junium_wood", () -> log(MTMaterialColors.JUNIUM, MTMaterialColors.JUNIUM));
    public static final RegistryObject<Block> JUNIUM_LEAVES = BLOCKS.register("junium_leaves", () -> leaves(MTMaterialColors.JUNIUM));
    public static final RegistryObject<Block> JUNIUM_SAPLING = BLOCKS.register("junium_sapling", () -> new SaplingBlock(new JuniumTree(), AbstractBlock.Properties.copy(Blocks.DARK_OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_JUNIUM_SAPLING = BLOCKS.register("potted_junium_sapling", () -> new FlowerPotBlock(MTBlocks.JUNIUM_SAPLING.get(), AbstractBlock.Properties.copy(Blocks.POTTED_DARK_OAK_SAPLING)));
    public static final RegistryObject<Block> JUNIUM_PLANKS = BLOCKS.register("junium_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD, MTMaterialColors.JUNIUM).strength(2, 3).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNIUM_STAIRS = BLOCKS.register("junium_stairs", () -> new StairsBlock(() -> JUNIUM_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(JUNIUM_PLANKS.get())));
    public static final RegistryObject<Block> JUNIUM_SLAB = BLOCKS.register("junium_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(JUNIUM_PLANKS.get())));
    public static final RegistryObject<Block> JUNIUM_FENCE = BLOCKS.register("junium_fence", () -> new FenceBlock(AbstractBlock.Properties.copy(JUNIUM_PLANKS.get())));
    public static final RegistryObject<Block> JUNIUM_FENCE_GATE = BLOCKS.register("junium_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.copy(JUNIUM_PLANKS.get())));
    public static final RegistryObject<Block> JUNIUM_PRESSURE_PLATE = BLOCKS.register("junium_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, AbstractBlock.Properties.copy(JUNIUM_PLANKS.get()).noCollission().strength(0.5F)));
    public static final RegistryObject<Block> JUNIUM_BUTTON = BLOCKS.register("junium_button", () -> new WoodButtonBlock(AbstractBlock.Properties.copy(JUNIUM_PLANKS.get()).noCollission().strength(0.5F)));
    public static final RegistryObject<Block> JUNIUM_SIGN = BLOCKS.register("junium_sign", () -> new MTStandingSignBlock(AbstractBlock.Properties.copy(JUNIUM_PLANKS.get()).noCollission().strength(1), MTWoodTypes.JUNIUM));
    public static final RegistryObject<Block> JUNIUM_WALL_SIGN = BLOCKS.register("junium_wall_sign", () -> new MTWallSignBlock(AbstractBlock.Properties.copy(JUNIUM_PLANKS.get()).noCollission().strength(1).lootFrom(MTBlocks.JUNIUM_SIGN), MTWoodTypes.JUNIUM));

    // Cactus Wood
    public static final RegistryObject<Block> STRIPPED_CACTUS = BLOCKS.register("stripped_cactus", () -> new StrippedCactusBlock(AbstractBlock.Properties.of(Material.CACTUS, MaterialColor.GRASS).harvestTool(ToolType.AXE).strength(0.4F).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> CACTUS_PLANKS = BLOCKS.register("cactus_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.GRASS).strength(2, 3).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CACTUS_STAIRS = BLOCKS.register("cactus_stairs", () -> new StairsBlock(() -> CACTUS_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(CACTUS_PLANKS.get())));
    public static final RegistryObject<Block> CACTUS_SLAB = BLOCKS.register("cactus_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(CACTUS_PLANKS.get())));
    public static final RegistryObject<Block> CACTUS_FENCE = BLOCKS.register("cactus_fence", () -> new FenceBlock(AbstractBlock.Properties.copy(CACTUS_PLANKS.get())));
    public static final RegistryObject<Block> CACTUS_FENCE_GATE = BLOCKS.register("cactus_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.copy(CACTUS_PLANKS.get())));
    public static final RegistryObject<Block> CACTUS_PRESSURE_PLATE = BLOCKS.register("cactus_pressure_plate", () -> new PressurePlateBlock(EVERYTHING, AbstractBlock.Properties.copy(CACTUS_PLANKS.get()).noCollission().strength(0.5F)));
    public static final RegistryObject<Block> CACTUS_BUTTON = BLOCKS.register("cactus_button", () -> new WoodButtonBlock(AbstractBlock.Properties.copy(CACTUS_PLANKS.get()).noCollission().strength(0.5F)));
    public static final RegistryObject<Block> CACTUS_SIGN = BLOCKS.register("cactus_sign", () -> new MTStandingSignBlock(AbstractBlock.Properties.copy(CACTUS_PLANKS.get()).noCollission().strength(1), MTWoodTypes.CACTUS));
    public static final RegistryObject<Block> CACTUS_WALL_SIGN = BLOCKS.register("cactus_wall_sign", () -> new MTWallSignBlock(AbstractBlock.Properties.copy(CACTUS_PLANKS.get()).noCollission().strength(1).lootFrom(MTBlocks.CACTUS_SIGN), MTWoodTypes.CACTUS));

    // Miscellaneous from 1.18
    public static final RegistryObject<Block> CALCITE = BLOCKS.register("calcite", () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).strength(0.75F).sound(MTSoundTypes.CALCITE)));
    public static final RegistryObject<Block> POWDER_SNOW = BLOCKS.register("powder_snow", () -> new PowderSnowBlock(AbstractBlock.Properties.of(MTMaterials.POWDER_SNOW).dynamicShape().requiresCorrectToolForDrops().strength(0.25F).sound(MTSoundTypes.POWDER_SNOW)));
    public static final RegistryObject<Block> CAULDRON = BLOCKS.register("cauldron", () -> new EmptyCauldronBlock(AbstractBlock.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> WATER_CAULDRON = BLOCKS.register("water_cauldron", () -> new LayeredCauldronBlock(AbstractBlock.Properties.copy(Blocks.CAULDRON), LayeredCauldronBlock.RAIN, CauldronInteraction.WATER));
    public static final RegistryObject<Block> DYED_WATER_CAULDRON = BLOCKS.register("dyed_water_cauldron", () -> new DyedWaterCauldronBlock(0x3F76E4, AbstractBlock.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> LAVA_CAULDRON = BLOCKS.register("lava_cauldron", () -> new LavaCauldronBlock(AbstractBlock.Properties.copy(Blocks.CAULDRON).lightLevel(light -> 15)));
    public static final RegistryObject<Block> POWDER_SNOW_CAULDRON = BLOCKS.register("powder_snow_cauldron", () -> new PowderSnowCauldronBlock(AbstractBlock.Properties.copy(Blocks.CAULDRON), LayeredCauldronBlock.SNOW, CauldronInteraction.POWDER_SNOW));
    public static final RegistryObject<Block> MILK_CAULDRON = BLOCKS.register("milk_cauldron", () -> new LayeredCauldronBlock(AbstractBlock.Properties.copy(Blocks.CAULDRON), LayeredCauldronBlock.RAIN, CauldronInteraction.MILK));

    // Plants
    public static final RegistryObject<Block> ROSE = BLOCKS.register("rose", () -> new FlowerBlock(Effects.REGENERATION, 10, AbstractBlock.Properties.copy(Blocks.POPPY).sound(SoundType.CROP)));
    public static final RegistryObject<Block> CYAN_ROSE = BLOCKS.register("cyan_rose", () -> new FlowerBlock(Effects.ABSORPTION, 6, AbstractBlock.Properties.copy(Blocks.POPPY).sound(SoundType.CROP)));
    public static final RegistryObject<Block> PAEONIA = BLOCKS.register("paeonia", () -> new FlowerBlock(Effects.DIG_SPEED, 8, AbstractBlock.Properties.copy(Blocks.POPPY).sound(SoundType.CROP)));
    public static final RegistryObject<Block> POTTED_ROSE = BLOCKS.register("potted_rose", () -> new FlowerPotBlock(MTBlocks.ROSE.get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_CYAN_ROSE = BLOCKS.register("potted_cyan_rose", () -> new FlowerPotBlock(MTBlocks.CYAN_ROSE.get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY)));
    public static final RegistryObject<Block> POTTED_PAEONIA = BLOCKS.register("potted_paeonia", () -> new FlowerPotBlock(MTBlocks.PAEONIA.get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY)));

    private static RotatedPillarBlock log(MaterialColor top, MaterialColor side) {
        return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, (state) -> state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? top : side).strength(2).sound(SoundType.WOOD));
    }

    private static LeavesBlock leaves(MaterialColor color) {
        return new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES, color).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(MTBlocks::ocelotOrParrot).isSuffocating(MTBlocks::never).isViewBlocking(MTBlocks::never));
    }

    private static boolean never(BlockState state, IBlockReader world, BlockPos pos) {
        return false;
    }

    private static Boolean ocelotOrParrot(BlockState state, IBlockReader world, BlockPos pos, EntityType<?> entity) {
        return entity.is(MTTags.Entities.CAN_SPAWN_ON_LEAVES);
    }
}
