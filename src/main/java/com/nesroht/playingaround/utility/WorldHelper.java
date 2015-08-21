package com.nesroht.playingaround.utility;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public final class WorldHelper
{
    public static void spawnEntityItem(World world, ItemStack stack, double x, double y, double z)
    {
        float f = world.rand.nextFloat() * 0.8F + 0.1F;
        float f1 = world.rand.nextFloat() * 0.8F + 0.1F;
        EntityItem entityitem;

        for (float f2 = world.rand.nextFloat() * 0.8F + 0.1F; stack.stackSize > 0; world.spawnEntityInWorld(entityitem))
        {
            int j1 = world.rand.nextInt(21) + 10;

            if (j1 > stack.stackSize)
                j1 = stack.stackSize;

            stack.stackSize -= j1;
            entityitem = new EntityItem(world, (double)((float) x + f), (double)((float) y + f1), (double)((float) z + f2), new ItemStack(stack.getItem(), j1, stack.getItemDamage()));
            float f3 = 0.05F;
            entityitem.motionX = (double)((float) world.rand.nextGaussian() * f3);
            entityitem.motionY = (double)((float) world.rand.nextGaussian() * f3 + 0.2F);
            entityitem.motionZ = (double)((float) world.rand.nextGaussian() * f3);

            if (stack.hasTagCompound())
            {
                entityitem.getEntityItem().setTagCompound((NBTTagCompound)stack.getTagCompound().copy());
            }
        }

    }
}
