package com.nesroht.playingaround.item.Armor;

import com.nesroht.playingaround.item.ItemArmorCommon;
import com.nesroht.playingaround.reference.Names;

public class ItemCommonPlate extends ItemArmorCommon {
    public ItemCommonPlate(ArmorMaterial mat, String type, String name)
    {
        super(1, mat, type);
        this.setUnlocalizedName(name);
    }
}
