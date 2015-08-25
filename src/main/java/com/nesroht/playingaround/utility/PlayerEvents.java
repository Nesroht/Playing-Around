package com.nesroht.playingaround.utility;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayerMP;

public class PlayerEvents {
    @SubscribeEvent
    public void playerChangeDimension(cpw.mods.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent event)
    {
        PlayerChecks.onPlayerChangeDimension((EntityPlayerMP) event.player);
    }
}
