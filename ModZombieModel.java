package com.zombiesurvival.mod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModZombieModel extends ModelBase
{
//fields
ModelRenderer head;
ModelRenderer body;
ModelRenderer rightarm;
ModelRenderer leftarm;
ModelRenderer rightleg;
ModelRenderer leftleg;

public ModZombieModel()
{
textureWidth = 64;
textureHeight = 64;

         head = new ModelRenderer(this, 2, 46);
         head.addBox(-4F, -8F, -4F, 8, 8, 8);
         head.setRotationPoint(0F, 6F, 0F);
         head.setTextureSize(64, 64);
         head.mirror = true;
         setRotation(head, 0F, 0F, 0F);
         body = new ModelRenderer(this, 16, 30);
         body.addBox(-4F, 0F, -2F, 8, 10, 4);
         body.setRotationPoint(0F, 6F, 0F);
         body.setTextureSize(64, 64);
         body.mirror = true;
         setRotation(body, 0F, 0F, 0F);
         rightarm = new ModelRenderer(this, 43, 16);
         rightarm.addBox(-3F, -2F, -2F, 4, 10, 4);
         rightarm.setRotationPoint(-5F, 8F, 0F);
         rightarm.setTextureSize(64, 64);
         rightarm.mirror = true;
         setRotation(rightarm, 0F, 0F, 0F);
         leftarm = new ModelRenderer(this, 43, 16);
         leftarm.addBox(-1F, -2F, -2F, 4, 10, 4);
         leftarm.setRotationPoint(5F, 8F, 0F);
         leftarm.setTextureSize(64, 64);
         leftarm.mirror = true;
         setRotation(leftarm, 0F, 0F, 0F);
         rightleg = new ModelRenderer(this, 0, 16);
         rightleg.addBox(-2F, 0F, -2F, 4, 8, 4);
         rightleg.setRotationPoint(-2F, 16F, 0F);
         rightleg.setTextureSize(64, 64);
         rightleg.mirror = true;
         setRotation(rightleg, 0F, 0F, 0F);
         leftleg = new ModelRenderer(this, 0, 16);
         leftleg.addBox(-2F, 0F, -2F, 4, 8, 4);
         leftleg.setRotationPoint(2F, 16F, 0F);
         leftleg.setTextureSize(64, 64);
         leftleg.mirror = true;
         setRotation(leftleg, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}
}