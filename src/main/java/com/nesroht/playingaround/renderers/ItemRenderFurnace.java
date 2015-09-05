package com.nesroht.playingaround.renderers;

import com.nesroht.playingaround.models.FurnaceModel;
import com.nesroht.playingaround.reference.Constants;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRenderFurnace implements IItemRenderer
{
    private final ResourceLocation texture = Constants.FURNACE_TEXTURE_LOCATION;
    private final FurnaceModel model = new FurnaceModel();

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        switch (type)
        {
            case ENTITY:
                renderFurnace(0.0F, 1.0F, 0.0F, 0);
                break;
            case EQUIPPED:
                renderFurnace(1.0F, 1.15F, 1.00F, 0);
                break;
            case EQUIPPED_FIRST_PERSON:
                renderFurnace(1.0F, 1.6F, 1.0F, 0);
                break;
            case INVENTORY:
                renderFurnace(0.0F, 1.0F, 0.0F, 0);
                break;
            default:
                break;
        }
    }

    private void renderFurnace(float x, float y, float z, int meta)
    {
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
        GL11.glPushMatrix();
        GL11.glTranslatef(x, y, z);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(-90, 0, 1, 0);
        model.render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }


}