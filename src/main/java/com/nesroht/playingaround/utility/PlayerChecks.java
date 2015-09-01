package com.nesroht.playingaround.utility;

import com.nesroht.playingaround.init.ModItems;
import com.nesroht.playingaround.item.Armor.ItemCommonBoots;
import com.nesroht.playingaround.item.ItemCommon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public final class PlayerChecks {
    public static boolean canStepAssist(EntityPlayerMP player, ItemStack boots){
        if (boots.getItem() == ModItems.bootsNirite){
            return ItemCommonBoots.canStepAssistNirite;
        }
        else if (boots.getItem() == ModItems.bootsWhiteDiamond){
            return ItemCommonBoots.canStepAssistWhiteDiamond;
        }
        else{
            return false;
        }
    }
    public static void update(EntityPlayerMP player) {
        if (!shouldPlayerStep(player)) {
            if (player.stepHeight > 0.5F) {
                PlayerHelper.updateClientServerStepHeight(player, 0.5F);
            }
        } else {
            if (player.stepHeight < 1.0F) {
                PlayerHelper.updateClientServerStepHeight(player, 1.0F);
            }
        }
    }

    public static void onPlayerChangeDimension(EntityPlayerMP playerMP) {
        PlayerHelper.updateClientServerStepHeight(playerMP, playerMP.stepHeight);
    }


    private static boolean shouldPlayerStep(EntityPlayerMP player) {
        for (ItemStack stack : player.inventory.armorInventory) {
            if (stack != null && stack.getItem() instanceof IStepAssister && canStepAssist(player, stack)) {
                return true;
            }
        }
        return false;
    }
}
