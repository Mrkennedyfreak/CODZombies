package com.zombiesurvival.mod;

import java.util.Map;

import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = "CODZombiesv0.1", name = "CODZombies", version = "0.0.1 Beta of an Alpha")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class mod_zombiesurvival {
	protected static int i = 2;
	
	@SidedProxy(clientSide = "com.zombiesurvival.mod.ClientProxy", serverSide = "com.zombiesurvival.mod.CommonProxy")
	 public static CommonProxy proxy;
	
	@Instance("CODZombiesv0.1")
	public static mod_zombiesurvival instance;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Init
	public void init(FMLInitializationEvent event) {
		proxy.registerRenderThings();
		
		EntityRegistry.registerModEntity(ModZombie.class, "ModZombie", 1, this, 200, 3, true);
		EntityRegistry.addSpawn(ModZombie.class, 10, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.extremeHills, 
				BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, 
				BiomeGenBase.jungleHills, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland);
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {

	}
}