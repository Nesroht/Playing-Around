package com.nesroht.playingaround.utility;

import com.nesroht.playingaround.init.ModItems;
import com.nesroht.playingaround.item.Armor.ItemCommonBoots;
import com.nesroht.playingaround.reference.Key;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

public class KeyPressPKT implements IMessage {
    private Key key;

    public KeyPressPKT() {
    }

    public KeyPressPKT(Key key) {
        this.key = key;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        key = Key.values()[buf.readInt()];
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(key.ordinal());
    }

    public static class Handler implements IMessageHandler<KeyPressPKT, IMessage> {
        @Override
        public IMessage onMessage(final KeyPressPKT message, final MessageContext ctx) {
            EntityPlayerMP player = ctx.getServerHandler().playerEntity;
            ItemStack stack = player.getHeldItem();

            if (message.key == Key.MODE && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
                ItemStack boots = player.inventory.armorItemInSlot(0);

                if (boots != null && boots.getItem() == ModItems.bootsNirite) {
                    ((ItemCommonBoots) ModItems.bootsNirite).toggleStepAssist(boots, player);

                }
                else if (boots != null && boots.getItem() == ModItems.bootsWhiteDiamond) {
                    ((ItemCommonBoots) ModItems.bootsWhiteDiamond).toggleStepAssist(boots, player);

                }

            }
            return null;
        }

    }
}

