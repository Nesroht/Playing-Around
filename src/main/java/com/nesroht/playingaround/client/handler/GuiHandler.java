package com.nesroht.playingaround.client.handler;

import com.nesroht.playingaround.client.gui.GuiNiriteFurnace;
import com.nesroht.playingaround.container.niriteFurnaceContainer;
import com.nesroht.playingaround.reference.Constants;
import com.nesroht.playingaround.tiles.niriteFurnaceTile;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tile = world.getTileEntity(x, y, z);

        switch (ID)
        {
            case Constants.NIRITE_FURNACE_GUI:
                if (tile != null && tile instanceof niriteFurnaceTile)
                    return new niriteFurnaceContainer(player.inventory, (niriteFurnaceTile) tile);
                    break;
            }

            return null;
        }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tile = world.getTileEntity(x, y, z);
        switch (ID) {
            case Constants.NIRITE_FURNACE_GUI:
                    if (tile != null && tile instanceof niriteFurnaceTile)
                        return new GuiNiriteFurnace(player.inventory, (niriteFurnaceTile) tile);
                    break;
            }
            return null;
        }
}
