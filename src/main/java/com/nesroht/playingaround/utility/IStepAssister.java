package com.nesroht.playingaround.utility;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public interface IStepAssister {
    boolean canAssistStep(ItemStack stack, EntityPlayerMP player);
}
