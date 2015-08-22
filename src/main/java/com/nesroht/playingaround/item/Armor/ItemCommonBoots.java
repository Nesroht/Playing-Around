package com.nesroht.playingaround.item.Armor;

import com.nesroht.playingaround.item.ItemArmorCommon;
import com.nesroht.playingaround.reference.Names;
import net.minecraft.item.ItemArmor;

public class ItemCommonBoots extends ItemArmorCommon {
    public ItemCommonBoots(ArmorMaterial mat, String type, String name)
    {
        super(3, mat, type);
        this.setUnlocalizedName(name);
    }
}
