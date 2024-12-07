package melonystudios.themato.data.loottables;

import melonystudios.themato.TheMato;
import melonystudios.themato.block.MTBlocks;
import melonystudios.themato.item.MTItems;
import net.minecraft.advancements.criterion.EnchantmentPredicate;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.advancements.criterion.MinMaxBounds;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.*;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.loot.conditions.MatchTool;
import net.minecraft.loot.conditions.TableBonus;
import net.minecraft.loot.functions.SetCount;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Collectors;

public class MTBlockLootTableProvider extends BlockLootTables {
    private static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[] {0.05F, 0.0625F, 0.083333336F, 0.1F};
    private static final ILootCondition.IBuilder HAS_SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.IntBound.atLeast(1))));
    private static final ILootCondition.IBuilder HAS_SHEARS = MatchTool.toolMatches(ItemPredicate.Builder.item().of(Tags.Items.SHEARS));
    private static final ILootCondition.IBuilder HAS_SHEARS_OR_SILK_TOUCH = HAS_SHEARS.or(HAS_SILK_TOUCH);
    private static final ILootCondition.IBuilder HAS_NO_SHEARS_OR_SILK_TOUCH = HAS_SHEARS_OR_SILK_TOUCH.invert();

    @Override
    protected void addTables() {
        dropSelf(MTBlocks.PINK_IPE_LOG.get());
        dropSelf(MTBlocks.PINK_IPE_WOOD.get());
        dropSelf(MTBlocks.STRIPPED_PINK_IPE_LOG.get());
        dropSelf(MTBlocks.STRIPPED_PINK_IPE_WOOD.get());
        add(MTBlocks.PINK_IPE_LEAVES.get(), (func) -> createMTLeavesDrops(func, MTBlocks.PINK_IPE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(MTBlocks.PINK_IPE_SAPLING.get());
        dropPottedContents(MTBlocks.POTTED_PINK_IPE_SAPLING.get());
        dropSelf(MTBlocks.PINK_IPE_PLANKS.get());
        dropSelf(MTBlocks.PINK_IPE_STAIRS.get());
        add(MTBlocks.PINK_IPE_SLAB.get(), BlockLootTables::createSlabItemTable);
        dropSelf(MTBlocks.PINK_IPE_FENCE.get());
        dropSelf(MTBlocks.PINK_IPE_FENCE_GATE.get());
        dropSelf(MTBlocks.PINK_IPE_PRESSURE_PLATE.get());
        dropSelf(MTBlocks.PINK_IPE_BUTTON.get());
        dropSelf(MTBlocks.PINK_IPE_SIGN.get());

        dropSelf(MTBlocks.PURPLE_IPE_LOG.get());
        dropSelf(MTBlocks.PURPLE_IPE_WOOD.get());
        dropSelf(MTBlocks.STRIPPED_PURPLE_IPE_LOG.get());
        dropSelf(MTBlocks.STRIPPED_PURPLE_IPE_WOOD.get());
        add(MTBlocks.PURPLE_IPE_LEAVES.get(), (func) -> createMTLeavesDrops(func, MTBlocks.PURPLE_IPE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(MTBlocks.PURPLE_IPE_SAPLING.get());
        dropPottedContents(MTBlocks.POTTED_PURPLE_IPE_SAPLING.get());
        dropSelf(MTBlocks.PURPLE_IPE_PLANKS.get());
        dropSelf(MTBlocks.PURPLE_IPE_STAIRS.get());
        add(MTBlocks.PURPLE_IPE_SLAB.get(), BlockLootTables::createSlabItemTable);
        dropSelf(MTBlocks.PURPLE_IPE_FENCE.get());
        dropSelf(MTBlocks.PURPLE_IPE_FENCE_GATE.get());
        dropSelf(MTBlocks.PURPLE_IPE_PRESSURE_PLATE.get());
        dropSelf(MTBlocks.PURPLE_IPE_BUTTON.get());
        dropSelf(MTBlocks.PURPLE_IPE_SIGN.get());

        dropSelf(MTBlocks.RED_IPE_LOG.get());
        dropSelf(MTBlocks.RED_IPE_WOOD.get());
        dropSelf(MTBlocks.STRIPPED_RED_IPE_LOG.get());
        dropSelf(MTBlocks.STRIPPED_RED_IPE_WOOD.get());
        add(MTBlocks.RED_IPE_LEAVES.get(), (func) -> createMTLeavesDrops(func, MTBlocks.RED_IPE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(MTBlocks.RED_IPE_SAPLING.get());
        dropPottedContents(MTBlocks.POTTED_RED_IPE_SAPLING.get());
        dropSelf(MTBlocks.RED_IPE_PLANKS.get());
        dropSelf(MTBlocks.RED_IPE_STAIRS.get());
        add(MTBlocks.RED_IPE_SLAB.get(), BlockLootTables::createSlabItemTable);
        dropSelf(MTBlocks.RED_IPE_FENCE.get());
        dropSelf(MTBlocks.RED_IPE_FENCE_GATE.get());
        dropSelf(MTBlocks.RED_IPE_PRESSURE_PLATE.get());
        dropSelf(MTBlocks.RED_IPE_BUTTON.get());
        dropSelf(MTBlocks.RED_IPE_SIGN.get());

        dropSelf(MTBlocks.YELLOW_IPE_LOG.get());
        dropSelf(MTBlocks.YELLOW_IPE_WOOD.get());
        dropSelf(MTBlocks.STRIPPED_YELLOW_IPE_LOG.get());
        dropSelf(MTBlocks.STRIPPED_YELLOW_IPE_WOOD.get());
        add(MTBlocks.YELLOW_IPE_LEAVES.get(), (func) -> createMTLeavesDrops(func, MTBlocks.YELLOW_IPE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(MTBlocks.YELLOW_IPE_SAPLING.get());
        dropPottedContents(MTBlocks.POTTED_YELLOW_IPE_SAPLING.get());
        dropSelf(MTBlocks.YELLOW_IPE_PLANKS.get());
        dropSelf(MTBlocks.YELLOW_IPE_STAIRS.get());
        add(MTBlocks.YELLOW_IPE_SLAB.get(), BlockLootTables::createSlabItemTable);
        dropSelf(MTBlocks.YELLOW_IPE_FENCE.get());
        dropSelf(MTBlocks.YELLOW_IPE_FENCE_GATE.get());
        dropSelf(MTBlocks.YELLOW_IPE_PRESSURE_PLATE.get());
        dropSelf(MTBlocks.YELLOW_IPE_BUTTON.get());
        dropSelf(MTBlocks.YELLOW_IPE_SIGN.get());

        dropSelf(MTBlocks.JUNIUM_LOG.get());
        dropSelf(MTBlocks.JUNIUM_WOOD.get());
        dropSelf(MTBlocks.STRIPPED_JUNIUM_LOG.get());
        dropSelf(MTBlocks.STRIPPED_JUNIUM_WOOD.get());
        add(MTBlocks.JUNIUM_LEAVES.get(), (func) -> createMTLeavesDrops(func, MTBlocks.JUNIUM_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(MTBlocks.JUNIUM_SAPLING.get());
        dropPottedContents(MTBlocks.POTTED_JUNIUM_SAPLING.get());
        dropSelf(MTBlocks.JUNIUM_PLANKS.get());
        dropSelf(MTBlocks.JUNIUM_STAIRS.get());
        add(MTBlocks.JUNIUM_SLAB.get(), BlockLootTables::createSlabItemTable);
        dropSelf(MTBlocks.JUNIUM_FENCE.get());
        dropSelf(MTBlocks.JUNIUM_FENCE_GATE.get());
        dropSelf(MTBlocks.JUNIUM_PRESSURE_PLATE.get());
        dropSelf(MTBlocks.JUNIUM_BUTTON.get());
        dropSelf(MTBlocks.JUNIUM_SIGN.get());

        dropSelf(MTBlocks.STRIPPED_CACTUS.get());
        dropSelf(MTBlocks.CACTUS_PLANKS.get());
        dropSelf(MTBlocks.CACTUS_STAIRS.get());
        add(MTBlocks.CACTUS_SLAB.get(), BlockLootTables::createSlabItemTable);
        dropSelf(MTBlocks.CACTUS_FENCE.get());
        dropSelf(MTBlocks.CACTUS_FENCE_GATE.get());
        dropSelf(MTBlocks.CACTUS_PRESSURE_PLATE.get());
        dropSelf(MTBlocks.CACTUS_BUTTON.get());
        dropSelf(MTBlocks.CACTUS_SIGN.get());

        dropSelf(MTBlocks.ROSE.get());
        dropSelf(MTBlocks.CYAN_ROSE.get());
        dropSelf(MTBlocks.PAEONIA.get());
        dropPottedContents(MTBlocks.POTTED_ROSE.get());
        dropPottedContents(MTBlocks.POTTED_CYAN_ROSE.get());
        dropPottedContents(MTBlocks.POTTED_PAEONIA.get());

        dropSelf(MTBlocks.CALCITE.get());
        add(MTBlocks.POWDER_SNOW.get(), noDrop());
        dropOther(MTBlocks.CAULDRON.get(), MTItems.CAULDRON.get());
        dropOther(MTBlocks.WATER_CAULDRON.get(), MTItems.CAULDRON.get());
        dropOther(MTBlocks.LAVA_CAULDRON.get(), MTItems.CAULDRON.get());
        dropOther(MTBlocks.MILK_CAULDRON.get(), MTItems.CAULDRON.get());
        dropOther(MTBlocks.DYED_WATER_CAULDRON.get(), MTItems.CAULDRON.get());
        dropOther(MTBlocks.POWDER_SNOW_CAULDRON.get(), MTItems.CAULDRON.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream().filter(block -> TheMato.MOD_ID.equals(block.getRegistryName().getNamespace())).collect(Collectors.toSet());
    }

    protected static LootTable.Builder createMTLeavesDrops(Block block, Block sapling, float... chances) {
        return createSilkTouchOrShearsDispatchTable(block, applyExplosionCondition(block, ItemLootEntry.lootTableItem(sapling)).when(TableBonus.bonusLevelFlatChance(
                Enchantments.BLOCK_FORTUNE, chances))).withPool(LootPool.lootPool().setRolls(ConstantRange.exactly(1)).when(HAS_NO_SHEARS_OR_SILK_TOUCH)
                .add(applyExplosionDecay(block, ItemLootEntry.lootTableItem(Items.STICK).apply(SetCount.setCount(RandomValueRange.between(1, 2))))
                        .when(TableBonus.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, 0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F))));
    }

    protected static LootTable.Builder createSilkTouchOrShearsDispatchTable(Block block, LootEntry.Builder<?> builder) {
        return createSelfDropDispatchTable(block, HAS_SHEARS_OR_SILK_TOUCH, builder);
    }
}
