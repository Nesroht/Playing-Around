package com.nesroht.playingaround.item.Armor;

import com.nesroht.playingaround.item.ItemArmorCommon;

public class ItemCommonPlate extends ItemArmorCommon {
    public ItemCommonPlate(ArmorMaterial mat, String type, String name)
    {
        super(1, mat, type);
        this.setUnlocalizedName(name);
    }
}
