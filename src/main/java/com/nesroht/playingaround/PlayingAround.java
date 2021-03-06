package com.nesroht.playingaround;

import com.nesroht.playingaround.client.handler.KeyInputEventHandler;
import com.nesroht.playingaround.configuration.ConfigurationHandler;
import com.nesroht.playingaround.init.ModBlocks;
import com.nesroht.playingaround.init.ModItems;
import com.nesroht.playingaround.init.Recipes;
import com.nesroht.playingaround.init.WorldGen;
import com.nesroht.playingaround.proxy.IProxy;
import com.nesroht.playingaround.reference.Reference;
import com.nesroht.playingaround.utility.PacketHandler;
import com.nesroht.playingaround.utility.PlayerEvents;
import com.nesroht.playingaround.utility.TickEvents;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;


@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class PlayingAround
{
    @Mod.Instance(Reference.MOD_ID)
    public static PlayingAround instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

        proxy.registerKeyBindings();
        proxy.registerRenderThings();
        PlayerEvents pe = new PlayerEvents();
        MinecraftForge.EVENT_BUS.register(pe);
        FMLCommonHandler.instance().bus().register(pe);
        FMLCommonHandler.instance().bus().register(new TickEvents());
        PacketHandler.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        GameRegistry.registerWorldGenerator(new WorldGen(), 7);
        Recipes.init();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}

