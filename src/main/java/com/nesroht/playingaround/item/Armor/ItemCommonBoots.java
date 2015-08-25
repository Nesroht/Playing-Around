package com.nesroht.playingaround.item.Armor;

import com.nesroht.playingaround.item.ItemArmorCommon;
import com.nesroht.playingaround.utility.IStepAssister;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class ItemCommonBoots extends ItemArmorCommon implements IStepAssister {
    public ItemCommonBoots(ArmorMaterial mat, String type, String name)
    {
        super(3, mat, type);
        this.setUnlocalizedName(name);
    }
    @Override
    public boolean canAssistStep(ItemStack stack, EntityPlayerMP player) {
        return player.getCurrentArmor(0) == stack;
    }
}
