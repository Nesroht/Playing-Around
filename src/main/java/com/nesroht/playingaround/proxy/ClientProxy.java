package com.nesroht.playingaround.proxy;

import com.nesroht.playingaround.client.settings.Keybindings;
import com.nesroht.playingaround.init.ModBlocks;
import com.nesroht.playingaround.renderers.ItemRenderFurnace;
import com.nesroht.playingaround.renderers.RenderFurnace;
import com.nesroht.playingaround.tiles.FurnaceTile;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.mode);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
    public void registerRenderThings(){
        TileEntitySpecialRenderer render1 = new RenderFurnace();
        ClientRegistry.bindTileEntitySpecialRenderer(FurnaceTile.class, render1);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.furnace), new ItemRenderFurnace());
    }
}
