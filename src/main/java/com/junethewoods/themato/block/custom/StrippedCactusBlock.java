package com.junethewoods.themato.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class StrippedCactusBlock extends Block {
   protected static final VoxelShape OUTLINE_SHAPE = Block.box(1, 0, 1, 15, 16, 15);

    public StrippedCactusBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        return OUTLINE_SHAPE;
    }

    public BlockState updateShape(BlockState state, Direction direction, BlockState state1, IWorld world, BlockPos pos, BlockPos pos1) {
        if (!state.canSurvive(world, pos)) {
            world.getBlockTicks().scheduleTick(pos, this, 1);
        }

        return super.updateShape(state, direction, state1, world, pos, pos1);
    }

    @Override
    public boolean isPathfindable(BlockState state, IBlockReader world, BlockPos pos, PathType pathType) {
        return false;
    }
}
