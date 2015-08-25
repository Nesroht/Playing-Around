package com.nesroht.playingaround.utility;

import net.minecraft.entity.player.EntityPlayerMP;

public class PlayerHelper {
    public static void updateClientServerStepHeight(EntityPlayerMP player, float value)
    {
        player.stepHeight = value;
        PacketHandler.sendTo(new StepHeightPKT(value), player);
    }
}
