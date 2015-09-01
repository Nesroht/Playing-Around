package com.nesroht.playingaround.client.settings;

import com.nesroht.playingaround.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class Keybindings
{
    public static KeyBinding mode = new KeyBinding(Names.Keys.MODE, Keyboard.KEY_M, Names.Keys.CATEGORY);
    public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE, Keyboard.KEY_R, Names.Keys.CATEGORY);
}
