package com.nesroht.playingaround.renderers;

import com.nesroht.playingaround.PlayingAround;
import com.nesroht.playingaround.models.FurnaceModel;
import com.nesroht.playingaround.reference.Constants;
import com.nesroht.playingaround.reference.Reference;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderFurnace extends TileEntitySpecialRenderer {

    ResourceLocation texture = Constants.FURNACE_TEXTURE_LOCATION;

            private FurnaceModel model;

    public RenderFurnace(){
        this.model = new FurnaceModel();
    }


    @Override
    public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float i) {
        GL11.glPushMatrix();
            GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
            GL11.glRotatef(180, 0F, 0F, 1F);

            this.bindTexture(texture);

            GL11.glPushMatrix();
            this.model.renderModel(0.0625F);
            GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
