package com.nesroht.playingaround.item.Armor;

import com.nesroht.playingaround.item.ItemArmorCommon;
import com.nesroht.playingaround.reference.Names;
import net.minecraft.item.ItemArmor;

public class ItemCommonHelmet extends ItemArmorCommon {
    public ItemCommonHelmet(ArmorMaterial mat, String type, String name)
    {
        super(0, mat, type);
        this.setUnlocalizedName(name);
    }
}
