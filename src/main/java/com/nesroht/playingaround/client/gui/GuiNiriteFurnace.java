package com.nesroht.playingaround.client.gui;

import com.nesroht.playingaround.entity.TileEntityCustomFurnace;
import com.nesroht.playingaround.reference.Reference;
import com.nesroht.playingaround.tiles.NiriteFurnaceTile;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;

public class GuiNiriteFurnace extends GuiContainer {
    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "textures/gui/niritefurnace.png")
    private NiriteFurnaceTile tileFurnace;

    public GuiNiriteFurnace(InventoryPlayer invPlayer, NiriteFurnaceTile tile)
    {
        super(new niriteFurnaceContainer(invPlayer, tile));
        this.tileFurnace = tile;
    }


    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

    }
}
