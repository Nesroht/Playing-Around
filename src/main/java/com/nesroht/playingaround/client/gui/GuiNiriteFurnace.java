package com.nesroht.playingaround.client.gui;

import com.nesroht.playingaround.entity.TileEntityCustomFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.tileentity.TileEntityFurnace;

public class GuiNiriteFurnace extends GuiContainer {
    private TileEntityFurnace tileFurnace;
    private static final String __OBFID = "CL_00000758";

    public GuiNiriteFurnace(InventoryPlayer p_i1091_1_, TileEntityFurnace p_i1091_2_)
    {
        super(new ContainerFurnace(p_i1091_1_, p_i1091_2_));
        this.tileFurnace = p_i1091_2_;
    }


    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {

    }
}
