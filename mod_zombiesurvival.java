package com.zombiesurvival.mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "CODZombiesv0.1", name = "CODZombies", version = "0.0.1 Beta of an Alpha")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class mod_zombiesurvival {
  
	@Instance("CODZombiesv0.1")
	public static mod_zombiesurvival instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
	}

	@Init
	public void init(FMLInitializationEvent event) {
		
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
