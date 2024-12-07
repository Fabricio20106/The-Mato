package melonystudios.themato.dispenser;

import melonystudios.themato.item.custom.BlockBucketItem;
import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class BlockBucketDispenseBehavior extends DefaultDispenseItemBehavior {
    private final DefaultDispenseItemBehavior defaultBehavior = new DefaultDispenseItemBehavior();

    @Override
    @Nonnull
    public ItemStack execute(IBlockSource source, ItemStack stack) {
        BucketItem bucket = (BucketItem) stack.getItem();
        BlockPos pos = source.getPos().relative(source.getBlockState().getValue(DispenserBlock.FACING));
        World world = source.getLevel();
        if (((BlockBucketItem) stack.getItem()).emptyContents(null, world, pos, null)) {
            bucket.checkExtraContent(world, stack, pos);
            return new ItemStack(Items.BUCKET);
        } else {
            return this.defaultBehavior.dispense(source, stack);
        }
    }
}
