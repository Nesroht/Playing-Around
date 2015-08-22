package com.nesroht.playingaround.item.Armor;

import com.nesroht.playingaround.item.ItemArmorCommon;
import com.nesroht.playingaround.reference.Names;

public class ItemCommonLegs extends ItemArmorCommon {
    public ItemCommonLegs(ArmorMaterial mat, String type, String name)
    {
        super(2, mat, type);
        this.setUnlocalizedName(name);
    }
}
