package com.nesroht.playingaround.utility;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ItemHelper
{
    public static boolean isOre(Block block, int meta)
    {
        String oreDictName = getOreDictionaryName(new ItemStack(block, 1, meta));
        return oreDictName.startsWith("ore") || oreDictName.startsWith("denseore");
    }

    public static String getOreDictionaryName(ItemStack stack) {
        int[] oreIds = OreDictionary.getOreIDs(stack);

        if (oreIds.length == 0)
        {
            return "Unknown";
        }

        return OreDictionary.getOreName(oreIds[0]);
    }

    public static boolean areItemStacksEqual(ItemStack stack1, ItemStack stack2)
    {
        return ItemStack.areItemStacksEqual(getNormalizedStack(stack1), getNormalizedStack(stack2));
    }

    public static ItemStack getNormalizedStack(ItemStack stack)
    {
        ItemStack result = stack.copy();
        result.stackSize = 1;
        return result;
    }
}
