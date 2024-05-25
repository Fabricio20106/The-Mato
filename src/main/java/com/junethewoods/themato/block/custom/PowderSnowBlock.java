package com.junethewoods.themato.block.custom;

import com.junethewoods.themato.misc.MTDamageSources;
import com.junethewoods.themato.util.MTTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.EntitySelectionContext;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.GameRules;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class PowderSnowBlock extends Block {
    private static final VoxelShape FALLING_COLLISION_SHAPE = VoxelShapes.box(0, 0, 0, 1, 0.9F, 1);

    public PowderSnowBlock(Properties properties) {
        super(properties);
    }

    // TODO: Fix weird rendering when besides a non-full block.
    @Override
    public boolean skipRendering(BlockState state, BlockState state1, Direction direction) {
        return state1.is(this) ? true : super.skipRendering(state, state1, direction);
    }

    @Override
    public VoxelShape getOcclusionShape(BlockState state, IBlockReader world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    @Override
    public void entityInside(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!(entity instanceof LivingEntity) || ((LivingEntity) entity).getFeetBlockState().is(this)) {
            entity.makeStuckInBlock(state, new Vector3d(0.9F, 1.5D, 0.9F));
            if (world.isClientSide) {
                Random rand = world.getRandom();
                boolean flag = entity.xOld != entity.getX() || entity.zOld != entity.getZ();
                if (flag && rand.nextBoolean()) {
                    world.addParticle(ParticleTypes.ITEM_SNOWBALL, entity.getX(), pos.getY() + 1, entity.getZ(), (randomBetween(rand, -1, 1) * 0.083333336F), 0.05F, (randomBetween(rand, -1, 1) * 0.083333336F));
                    if (world.getGameTime() % 40 == 0 && entity instanceof LivingEntity) {
                        LivingEntity livEntity = (LivingEntity) entity;
                        if (!livEntity.getType().is(MTTags.Entities.FREEZE_IMMUNE_ENTITY_TYPES)) livEntity.hurt(MTDamageSources.FREEZING, 1);
                    }

                }
            }
        }
        if (!world.isClientSide) {
            if (entity.isOnFire() && (world.getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING) || entity instanceof PlayerEntity)) {
                world.destroyBlock(pos, false);
            }
        }
    }

    @Override
    public void fallOn(World world, BlockPos pos, Entity entity, float distance) {
        if (!(distance < 4) && entity instanceof LivingEntity) {
            entity.playSound(world.getBlockState(pos).getSoundType().getFallSound(), 1, 1);
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        if (context instanceof EntitySelectionContext) {
            EntitySelectionContext entitySelectionContext = (EntitySelectionContext) context;
            Entity entity = entitySelectionContext.getEntity();
            if (entity != null) {
                if (entity.fallDistance > 2.5F) {
                    return FALLING_COLLISION_SHAPE;
                }

                boolean isFallingBlock = entity instanceof FallingBlockEntity;
                if (isFallingBlock || canEntityWalkOnPowderSnow(entity) && context.isAbove(VoxelShapes.block(), pos, false) && !context.isDescending()) {
                    return super.getCollisionShape(state, world, pos, context);
                }
            }
        }

        return VoxelShapes.empty();
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.empty();
    }

    public static boolean canEntityWalkOnPowderSnow(Entity entity) {
        if (entity.getType().is(MTTags.Entities.POWDER_SNOW_WALKABLE_MOBS)) {
            return true;
        } else {
            return entity instanceof LivingEntity && ((LivingEntity) entity).getItemBySlot(EquipmentSlotType.FEET).getItem().is(MTTags.Items.POWDER_SNOW_PROOF_SHOES);
        }
    }

    @Override
    public boolean isPathfindable(BlockState state, IBlockReader world, BlockPos pos, PathType type) {
        return true;
    }

    public static float randomBetween(Random rand, float a, float b) {
        return rand.nextFloat() * (b - a) + a;
    }
}
