package com.nesroht.playingaround.creativetab;

import com.nesroht.playingaround.init.ModItems;
import com.nesroht.playingaround.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCommon
{
    public static final CreativeTabs COMMON_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.swordNirite;
        }
    };
}
