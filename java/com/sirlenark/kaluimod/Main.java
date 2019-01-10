package com.sirlenark.kaluimod;

import com.sirlenark.kaluimod.proxy.CommonProxy;
import com.sirlenark.kaluimod.util.Reference;
import com.sirlenark.kaluimod.util.handlers.RegistryHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.client_proxy_class, serverSide = Reference.common_proxy_class)
	public static CommonProxy proxy;
	 
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		RegistryHandler.otherRegistries();		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {		
	}
		

}
