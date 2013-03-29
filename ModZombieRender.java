package com.zombiesurvival.mod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModZombieRender extends RenderLiving
{
public ModZombieRender(ModelBase modelbase, float f)
{
         super(modelbase, f);
}
public void func_177_a(ModZombie EntityDwarf, double d, double d1, double d2,
                 float f, float f1)
{
         super.doRenderLiving(EntityDwarf, d, d1, d2, f, f1);
}
public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2,
                 float f, float f1)
{
         func_177_a((ModZombie)entityliving, d, d1, d2, f, f1);
}
public void doRender(Entity entity, double d, double d1, double d2,
                 float f, float f1)
{
         func_177_a((ModZombie)entity, d, d1, d2, f, f1);
}
}