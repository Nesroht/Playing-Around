package com.nesroht.playingaround.container;

import com.nesroht.playingaround.tiles.niriteFurnaceTile;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;

public class niriteFurnaceContainer extends Container
{
    private niriteFurnaceTile tile;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;
    private boolean lastTickOutputLock;
    public niriteFurnaceContainer(InventoryPlayer invPlayer, niriteFurnaceTile tile){
        this.tile = tile;

        //Fuel
        this.addSlotToContainer(new Slot(tile, 0, 24, 44));

        //Input
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                this.addSlotToContainer(new Slot(tile,i*3+j+1,54+j*18,16+i*18));
        //Output(0)
        this.addSlotToContainer(new RestrictedSlot(tile, 10, 150, 34));

        //Player Inventory
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 9; j++)
                this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 24 + j * 18, 84 + i * 18));

        //Player HotBar
        for (int i = 0; i < 9; i++)
            this.addSlotToContainer(new Slot(invPlayer, i, 24 + i * 18, 142));
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return player.getDistanceSq(tile.xCoord + 0.5, tile.yCoord + 0.5, tile.zCoord + 0.5) <= 64.0;
    }
    @Override
    public void addCraftingToCrafters(ICrafting par1ICrafting)
    {
        super.addCraftingToCrafters(par1ICrafting);
        par1ICrafting.sendProgressBarUpdate(this, 0, tile.furnaceCookTime);
        par1ICrafting.sendProgressBarUpdate(this, 1, tile.furnaceBurnTime);
        par1ICrafting.sendProgressBarUpdate(this, 2, tile.currentItemBurnTime);
    }
    @Override
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();
        for (int i = 0; i < this.crafters.size(); ++i)
        {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (lastCookTime != tile.furnaceCookTime)
                icrafting.sendProgressBarUpdate(this, 0, tile.furnaceCookTime);

            if (lastBurnTime != tile.furnaceBurnTime)
                icrafting.sendProgressBarUpdate(this, 1, tile.furnaceBurnTime);

            if (lastItemBurnTime != tile.currentItemBurnTime)
                icrafting.sendProgressBarUpdate(this, 2, tile.currentItemBurnTime);
        }
        lastCookTime = tile.furnaceCookTime;
        lastBurnTime = tile.furnaceBurnTime;
        lastItemBurnTime = tile.currentItemBurnTime;

    }


    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int par1, int par2)
    {
        if (par1 == 0)
            tile.furnaceCookTime = par2;

        if (par1 == 1)
            tile.furnaceBurnTime = par2;

        if (par1 == 2)
            tile.currentItemBurnTime = par2;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex)
    {
        Slot slot = this.getSlot(slotIndex);

        if (slot == null || !slot.getHasStack())
        {
            return null;
        }

        ItemStack stack = slot.getStack();
        ItemStack newStack = stack.copy();

        if (slotIndex <= 10)
        {
            if (!this.mergeItemStack(stack, 11, 47, false))
            {
                return null;
            }
        }
        else
        {

            if (TileEntityFurnace.isItemFuel(newStack))
            {
                if (!this.mergeItemStack(stack, 0, 1, false))
                {
                    return null;
                }
            }
            else if (FurnaceRecipes.smelting().getSmeltingResult(newStack) != null || true )
            {
                if (!this.mergeItemStack(stack, 1, 9, false))
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
        }

        if (stack.stackSize == 0)
        {
            slot.putStack(null);
        }
        else
        {
            slot.onSlotChanged();
        }

        return newStack;
    }

}
