package com.nesroht.playingaround.client.gui;

import com.nesroht.playingaround.container.niriteFurnaceContainer;
import com.nesroht.playingaround.reference.Reference;
import com.nesroht.playingaround.tiles.niriteFurnaceTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class GuiNiriteFurnace extends GuiContainer {
    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID.toLowerCase(), "textures/gui/niritefurnace.png");
    private niriteFurnaceTile tileFurnace;

    public GuiNiriteFurnace(InventoryPlayer invPlayer, niriteFurnaceTile tile)
    {
        super(new niriteFurnaceContainer(invPlayer, tile));
        this.xSize = 209;
        this.ySize = 165;
        this.tileFurnace = tile;
    }


    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
    {
        GL11.glColor4f(1F, 1F, 1F, 1F);
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);

        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;

        this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);


        int progress;

        if (tileFurnace.isBurning())
        {
            progress = tileFurnace.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(x + 25, y + 28 + 10 - progress, 210, 10 - progress, 21, progress + 2);
        }

        progress = tileFurnace.getCookProgressScaled(24);
        this.drawTexturedModalRect(x + 113, y + 33, 210, 14, progress, 17);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int var1, int var2)
    {
        this.fontRendererObj.drawString(StatCollector.translateToLocal("Nirite Furnace"), 76, 5, 4210752);
        this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 76, ySize - 96 + 2, 4210752);
    }
}
