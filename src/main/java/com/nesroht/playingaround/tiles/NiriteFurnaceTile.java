package com.nesroht.playingaround.tiles;

import com.nesroht.playingaround.block.BlockNiriteFurnace;
import com.nesroht.playingaround.utility.ItemHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;

public class niriteFurnaceTile extends TileEntity implements IInventory, ISidedInventory {
    public int ticksBeforeSmelt = 40;
    public int efficiencyBonus = 1;
    public int furnaceBurnTime;
    public int currentItemBurnTime;
    public int furnaceCookTime;
    public ItemStack[] inventory = new ItemStack[11];
    public int outputSlot = 10;
    public int[] inputStorage = new int[]{1, 9};

    public niriteFurnaceTile() {
        super();
    }

    @Override
    public void updateEntity()
    {
        boolean flag = furnaceBurnTime > 0;
        boolean flag1 = false;

        if (furnaceBurnTime > 0)
        {
            --furnaceBurnTime;
        }

        if (!worldObj.isRemote)
        {
            if (furnaceBurnTime == 0 && canSmelt(1))
            {
                currentItemBurnTime = furnaceBurnTime = getItemBurnTime(inventory[0]);

                if (furnaceBurnTime > 0)
                {
                    flag1 = true;

                    if (inventory[0] != null)
                    {
                        --inventory[0].stackSize;

                        if (inventory[0].stackSize == 0)
                        {
                            inventory[0] = inventory[0].getItem().getContainerItem(inventory[0]);
                        }
                    }
                }
            }

            if (furnaceBurnTime > 0 && canSmelt(1))
            {
                ++furnaceCookTime;

                if (furnaceCookTime == ticksBeforeSmelt)
                {
                    furnaceCookTime = 0;
                    smeltItem();
                    flag1 = true;
                }
            }
            else furnaceCookTime = 0;

            if (flag != furnaceBurnTime > 0)
            {
                flag1 = true;
                Block block = worldObj.getBlock(xCoord, yCoord, zCoord);

                if (!this.worldObj.isRemote && block instanceof BlockNiriteFurnace)
                {
                    ((BlockNiriteFurnace) block).updateFurnaceBlockState(furnaceBurnTime > 0, worldObj, xCoord, yCoord, zCoord);
                }
            }
        }

        if (flag1)
        {
            markDirty();
        }
        pushSmeltStack();
    }



    public boolean isBurning() {
        return furnaceBurnTime > 0;
    }

    private void pushSmeltStack()
    {
        for (int i = inputStorage[0]+1; i <= inputStorage[1]; i++) {
            ItemStack stack = inventory[i - 1];
            ItemStack slotStack = inventory[i];
            if (canSmelt(i)) {
                if (slotStack != null && (stack == null || ItemHelper.areItemStacksEqual(slotStack, stack))) {
                    if (stack == null) {
                        inventory[i - 1] = slotStack.copy();
                        inventory[i] = null;
                        break;
                    }

                    int remain = stack.getMaxStackSize() - stack.stackSize;

                    if (remain == 0) {
                        break;
                    }
                    if (slotStack.stackSize <= remain) {
                        inventory[i] = null;
                        inventory[i - 1].stackSize += slotStack.stackSize;
                        break;
                    } else {
                        this.decrStackSize(i, remain);
                        inventory[i - 1].stackSize += remain;
                    }
                } else {
                    break;

                }
            }
        }
    }

    private void smeltItem() {
        ItemStack toSmelt = inventory[1];
        ItemStack smeltResult = FurnaceRecipes.smelting().getSmeltingResult(toSmelt).copy();
        ItemStack currentSmelted = getStackInSlot(outputSlot);

        if (ItemHelper.getOreDictionaryName(toSmelt).startsWith("ore")) {
            smeltResult.stackSize *= 2;
        }

        if (currentSmelted == null) {
            setInventorySlotContents(outputSlot, smeltResult);
        } else {
            currentSmelted.stackSize += smeltResult.stackSize;
        }

        decrStackSize(1, 1);
    }


    private boolean canSmelt(int int1) {
        ItemStack toSmelt = inventory[int1];

        if (toSmelt == null) {
            return false;
        }

        ItemStack smeltResult = FurnaceRecipes.smelting().getSmeltingResult(toSmelt);
        if (smeltResult == null) {
            return false;
        }

        ItemStack currentSmelted = getStackInSlot(outputSlot);

        if (currentSmelted == null) {
            return true;
        }
        if (!smeltResult.isItemEqual(currentSmelted)) {
            return false;
        }

        int result = currentSmelted.stackSize + smeltResult.stackSize;
        return result <= currentSmelted.getMaxStackSize();
    }

    private int getItemBurnTime(ItemStack stack) {
        int val = TileEntityFurnace.getItemBurnTime(stack);
        return (val * ticksBeforeSmelt) / 200 * efficiencyBonus;
    }

    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int value) {
        return (furnaceCookTime + (isBurning() && canSmelt(1) ? 1 : 0)) * value / ticksBeforeSmelt;
    }

    @SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int value) {
        if (this.currentItemBurnTime == 0)
            this.currentItemBurnTime = ticksBeforeSmelt;

        return furnaceBurnTime * value / currentItemBurnTime;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        furnaceBurnTime = nbt.getShort("BurnTime");
        furnaceCookTime = nbt.getShort("CookTime");
        currentItemBurnTime = getItemBurnTime(inventory[0]);

        NBTTagList list = nbt.getTagList("Items", 10);
        inventory = new ItemStack[getSizeInventory()];
        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound subNBT = list.getCompoundTagAt(i);
            byte slot = subNBT.getByte("Slot");
            if (slot >= 0 && slot < getSizeInventory())
                inventory[slot] = ItemStack.loadItemStackFromNBT(subNBT);
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setShort("BurnTime", (short) furnaceBurnTime);
        nbt.setShort("CookTime", (short) furnaceCookTime);

        NBTTagList list = new NBTTagList();
        for (int i = 0; i < getSizeInventory(); i++) {
            if (inventory[i] == null) continue;
            NBTTagCompound subNBT = new NBTTagCompound();
            subNBT.setByte("Slot", (byte) i);
            inventory[i].writeToNBT(subNBT);
            list.appendTag(subNBT);
        }
        nbt.setTag("Items", list);
    }

    @Override
    public int getSizeInventory() {
        return 11;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return inventory[slot];
    }

    @Override
    public ItemStack decrStackSize(int slot, int qty) {
        ItemStack stack = inventory[slot];

        if (stack != null) {
            if (stack.stackSize <= qty) {
                inventory[slot] = null;
            } else {
                stack = stack.splitStack(qty);

                if (stack.stackSize == 0) {
                    inventory[slot] = null;
                }
            }
        }
        return stack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        if (inventory[slot] != null) {
            ItemStack stack = inventory[slot];
            inventory[slot] = null;
            return stack;
        }
        return null;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        inventory[slot] = stack;
        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
            stack.stackSize = this.getInventoryStackLimit();
        this.markDirty();
    }

    @Override
    public String getInventoryName() {
        return "Nirite Furnace";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer var1) {
        return true;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        if (stack == null) {
            return false;
        }

        if (slot == 0) {
            return TileEntityFurnace.isItemFuel(stack);
        } else if (slot >= 1 && slot <= 9) {
            return true;
        }

        return false;
    }

    @Override
    public int[] getAccessibleSlotsFromSide(int side) {
        switch (side) {
            case 0:
                return new int[]{10}; // Outputs accessible from bottom
            case 1:
                return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; // Inputs accessible from top
            case 2: // Fall through
            case 3:
            case 4:
            case 5:
                return new int[]{0, 10}; // Fuel and output accessible from all sides
            default:
                return new int[]{};
        }
    }

    @Override
    public boolean canInsertItem(int slot, ItemStack stack, int side) {
        if (side == 0) {
            return false;
        }

        if (side == 1) {
            return slot <= inputStorage[1] && slot >= inputStorage[0];
        } else {
            return slot == 0;
        }
    }

    @Override
    public boolean canExtractItem(int slot, ItemStack stack, int side) {
        return slot == outputSlot;
    }
}
