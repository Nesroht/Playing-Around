package com.nesroht.playingaround.proxy;

import com.nesroht.playingaround.client.settings.Keybindings;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.mode);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}
