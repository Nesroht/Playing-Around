package com.nesroht.playingaround.item.Armor;

import com.nesroht.playingaround.item.ItemArmorCommon;

public class ItemCommonBoots extends ItemArmorCommon {
    public ItemCommonBoots(ArmorMaterial mat, String type, String name)
    {
        super(3, mat, type);
        this.setUnlocalizedName(name);
    }
}
