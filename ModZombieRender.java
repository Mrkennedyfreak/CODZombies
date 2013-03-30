package com.zombiesurvival.mod;

import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModZombieRender extends RenderLiving
{
 protected ModelZombie model;
 
 public ModZombieRender(ModelZombie modelTutorial, float f)
 {
  super(modelTutorial, f);
  model = ((ModelZombie)mainModel);
 }
 
 public void renderZombie(ModZombie entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
 
 public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderZombie((ModZombie)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderZombie((ModZombie)par1Entity, par2, par4, par6, par8, par9);
    }
}