package com.zombiesurvival.mod;
import com.zombiesurvival.mod.CommonProxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraftforge.client.MinecraftForgeClient;
public class ClientProxy extends CommonProxy {
        
	@Override
	public void registerRenderThings()
	{
		MinecraftForgeClient.preloadTexture("/mob/test1.png");
		RenderingRegistry.registerEntityRenderingHandler(ModZombie.class, new RenderLiving(new ModelZombie(), 0.3F));
	}
}