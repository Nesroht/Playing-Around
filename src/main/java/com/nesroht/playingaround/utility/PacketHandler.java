package com.nesroht.playingaround.utility;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.Packet;
import net.minecraftforge.common.util.FakePlayer;

public class PacketHandler {
    private static final SimpleNetworkWrapper HANDLER = NetworkRegistry.INSTANCE.newSimpleChannel("playingaround");
    public static void register() {
        HANDLER.registerMessage(StepHeightPKT.Handler.class, StepHeightPKT.class, 0, Side.CLIENT);
    }

    public static Packet getMCPacket(IMessage message)
    {
        return HANDLER.getPacketFrom(message);
    }
    public static void sendTo(IMessage msg, EntityPlayerMP player)
    {
        if (!(player instanceof FakePlayer))
        {
            HANDLER.sendTo(msg, player);
        }
    }
}
