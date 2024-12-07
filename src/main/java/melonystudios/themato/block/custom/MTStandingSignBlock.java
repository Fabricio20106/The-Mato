package melonystudios.themato.block.custom;

import melonystudios.themato.blockentity.custom.MTSignBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.StandingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class MTStandingSignBlock extends StandingSignBlock {
    public MTStandingSignBlock(Properties properties, WoodType type) {
        super(properties, type);
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new MTSignBlockEntity();
    }
}
