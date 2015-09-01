package com.nesroht.playingaround.client.handler;

import com.nesroht.playingaround.client.settings.Keybindings;
import com.nesroht.playingaround.item.Armor.ItemCommonBoots;
import com.nesroht.playingaround.item.ItemCommon;
import com.nesroht.playingaround.reference.Key;
import com.nesroht.playingaround.utility.KeyPressPKT;
import com.nesroht.playingaround.utility.PacketHandler;
import com.nesroht.playingaround.utility.PlayerChecks;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import ibxm.Player;

public class KeyInputEventHandler
{
    private static Key getPressedKeybinding()
    {
        if (Keybindings.mode.isPressed())
        {
            return Key.MODE;
        }
        else if (Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        if(getPressedKeybinding() == Key.MODE){
            PacketHandler.sendToServer(new KeyPressPKT(Key.MODE));
        }

    }
}