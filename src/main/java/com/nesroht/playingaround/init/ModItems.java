package com.nesroht.playingaround.init;

import com.nesroht.playingaround.item.ItemCommon;
import com.nesroht.playingaround.item.ItemTemporary;
import com.nesroht.playingaround.reference.Names;
import com.nesroht.playingaround.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemCommon temporary = new ItemTemporary();

    public static void init()
    {
        GameRegistry.registerItem(temporary, Names.Items.TEMPORARY);
    }
}
