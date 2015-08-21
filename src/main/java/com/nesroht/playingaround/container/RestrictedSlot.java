package com.nesroht.playingaround.container;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class RestrictedSlot extends Slot {
    public RestrictedSlot(IInventory inventory1, int id, int x, int y) {
        super(inventory1, id, x, y);
    }

    @Override
    public boolean isItemValid(ItemStack par1ItemStack)
    {
        return false;
    }
}
