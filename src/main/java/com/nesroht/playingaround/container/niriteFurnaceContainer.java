package com.nesroht.playingaround.container;

import com.nesroht.playingaround.tiles.niriteFurnaceTile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;

public class niriteFurnaceContainer extends Container
{
    private niriteFurnaceTile tile;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;
    public niriteFurnaceContainer(InventoryPlayer invPlayer,niriteFurnaceTile tile){
        this.tile = tile;

        //Fuel
        this.addSlotToContainer(new Slot(tile, 0, 65, 53));

        //Input(0)
        this.addSlotToContainer(new Slot(tile, 1, 65, 17));

        //Input storage
        for(int i=0;i<3;i++)
            for(int j=0;j<4;j++)
                this.addSlotToContainer(new Slot(tile,i*4+j+2,11+i*18,8+j*18));
        //Output(0)
        this.addSlotToContainer(new Slot(tile, 14, 125, 35));

        //Output Storage
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                this.addSlotToContainer(new Slot(tile, i * 4 + j + 15, 147 + i * 18, 8 + j * 18));

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
}
