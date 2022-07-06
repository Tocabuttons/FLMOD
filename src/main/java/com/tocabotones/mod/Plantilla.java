package com.tocabotones.mod;

import com.tocabotones.mod.tabs.FlechipollaTab;
import com.tocabotones.mod.util.References;
import com.tocabotones.mod.proxy.CommonProxy;
import com.tocabotones.mod.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;


@Mod(modid = References.MOD_ID, version = References.VERSION, name = References.NAME)
public class Plantilla {

    @Instance
    public static Plantilla instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs FLECHIPOLLATAB = new FlechipollaTab("flechipollamod.png");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        RegistryHandler.preInitRegistries();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        RegistryHandler.initRegistries();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        RegistryHandler.postInitRegistries();
    }

    @EventHandler
    public void serverInit(FMLServerStartingEvent event)
    {
        RegistryHandler.serverRegistries(event);
    }
}
