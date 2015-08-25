package com.nesroht.playingaround.utility;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public final class PlayerChecks {
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
            if (stack != null && stack.getItem() instanceof IStepAssister) {
                return true;
            }
        }
        return false;
    }
}
