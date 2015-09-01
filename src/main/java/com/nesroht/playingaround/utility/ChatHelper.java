package com.nesroht.playingaround.utility;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

public final class ChatHelper {
    public static IChatComponent modifyColor(IChatComponent chat, EnumChatFormatting format) {
        if (format.isColor()) {
            chat.getChatStyle().setColor(format);
        }
        return chat;
    }
}
