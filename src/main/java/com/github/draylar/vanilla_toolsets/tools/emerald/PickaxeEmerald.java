package com.github.draylar.vanilla_toolsets.tools.emerald;

import com.github.draylar.vanilla_toolsets.VanillaToolsets;
import com.github.draylar.vanilla_toolsets.tools.base.PickaxeBase;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PickaxeEmerald extends PickaxeBase
{
    public PickaxeEmerald()
    {
        super(VanillaToolsets.toolMaterialEmerald);
    }

    @Override
    public boolean onBlockBroken(ItemStack itemStack_1, World world_1, BlockState blockState_1, BlockPos blockPos_1, LivingEntity livingEntity_1)
    {
        return super.onBlockBroken(itemStack_1, world_1, blockState_1, blockPos_1, livingEntity_1);
    }
}
