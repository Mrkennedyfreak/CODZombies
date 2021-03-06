package com.zombiesurvival.mod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelZombie extends ModelBase
{
  //fields
    ModelRenderer Left_Foot;
    ModelRenderer Right_Foot;
    ModelRenderer Body1;
    ModelRenderer Body2;
    ModelRenderer Body3;
    ModelRenderer Body4;
    ModelRenderer Body5;
    ModelRenderer Body6;
    ModelRenderer Body7;
    ModelRenderer Body8;
    ModelRenderer Body9;
    ModelRenderer Body10;
    ModelRenderer Body11;
    ModelRenderer Body12;
    ModelRenderer Left_Arm;
    ModelRenderer Right_Arm;
    ModelRenderer Right_Hand;
    ModelRenderer Right_Fingers;
    ModelRenderer Right_Thumb;
    ModelRenderer Left_Hand;
    ModelRenderer Left_Fingers;
    ModelRenderer Left_Thumb;
    ModelRenderer Head;
    ModelRenderer Shape3;
  
  public ModelZombie()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Left_Foot = new ModelRenderer(this, 0, 0);
      Left_Foot.addBox(0F, 0F, 0F, 4, 12, 4);
      Left_Foot.setRotationPoint(0F, 12F, -2F);
      Left_Foot.setTextureSize(64, 32);
      setRotation(Left_Foot, 0F, 0F, 0F);
      Left_Foot.mirror = false;
      Right_Foot = new ModelRenderer(this, 0, 0);
      Right_Foot.addBox(0F, 0F, 0F, 4, 12, 4);
      Right_Foot.setRotationPoint(-4F, 12F, -2F);
      Right_Foot.setTextureSize(64, 32);
      Right_Foot.mirror = true;
      setRotation(Right_Foot, 0F, 0F, 0F);
      Body1 = new ModelRenderer(this, 16, 11);
      Body1.addBox(0F, 0F, 0F, 8, 1, 4);
      Body1.setRotationPoint(-4F, 11F, -2F);
      Body1.setTextureSize(64, 32);
      Body1.mirror = true;
      setRotation(Body1, 0F, 0F, 0F);
      Body2 = new ModelRenderer(this, 17, 10);
      Body2.addBox(0F, 0F, 0F, 7, 1, 4);
      Body2.setRotationPoint(-3F, 10F, -2F);
      Body2.setTextureSize(64, 32);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, 0F);
      Body3 = new ModelRenderer(this, 17, 9);
      Body3.addBox(0F, 0F, 0F, 7, 1, 4);
      Body3.setRotationPoint(-3F, 9F, -2F);
      Body3.setTextureSize(64, 32);
      Body3.mirror = true;
      setRotation(Body3, 0F, 0F, 0F);
      Body4 = new ModelRenderer(this, 16, 8);
      Body4.addBox(0F, 0F, 0F, 8, 1, 4);
      Body4.setRotationPoint(-4F, 8F, -2F);
      Body4.setTextureSize(64, 32);
      Body4.mirror = true;
      setRotation(Body4, 0F, 0F, 0F);
      Body5 = new ModelRenderer(this, 17, 7);
      Body5.addBox(0F, 0F, 0F, 7, 1, 4);
      Body5.setRotationPoint(-4F, 7F, -2F);
      Body5.setTextureSize(64, 32);
      Body5.mirror = true;
      setRotation(Body5, 0F, 0F, 0F);
      Body6 = new ModelRenderer(this, 18, 6);
      Body6.addBox(0F, 0F, 0F, 6, 1, 4);
      Body6.setRotationPoint(-4F, 6F, -2F);
      Body6.setTextureSize(64, 32);
      Body6.mirror = true;
      setRotation(Body6, 0F, 0F, 0F);
      Body7 = new ModelRenderer(this, 19, 5);
      Body7.addBox(0F, 0F, 0F, 5, 1, 4);
      Body7.setRotationPoint(-3F, 5F, -2F);
      Body7.setTextureSize(64, 32);
      Body7.mirror = true;
      setRotation(Body7, 0F, 0F, 0F);
      Body8 = new ModelRenderer(this, 18, 4);
      Body8.addBox(0F, 0F, 0F, 6, 1, 4);
      Body8.setRotationPoint(-3F, 4F, -2F);
      Body8.setTextureSize(64, 32);
      Body8.mirror = true;
      setRotation(Body8, 0F, 0F, 0F);
      Body9 = new ModelRenderer(this, 16, 3);
      Body9.addBox(0F, 0F, 0F, 8, 1, 4);
      Body9.setRotationPoint(-4F, 3F, -2F);
      Body9.setTextureSize(64, 32);
      Body9.mirror = true;
      setRotation(Body9, 0F, 0F, 0F);
      Body10 = new ModelRenderer(this, 16, 2);
      Body10.addBox(0F, 0F, 0F, 8, 1, 4);
      Body10.setRotationPoint(-4F, 2F, -2F);
      Body10.setTextureSize(64, 32);
      Body10.mirror = true;
      setRotation(Body10, 0F, 0F, 0F);
      Body11 = new ModelRenderer(this, 16, 1);
      Body11.addBox(0F, 0F, 0F, 8, 1, 4);
      Body11.setRotationPoint(-4F, 1F, -2F);
      Body11.setTextureSize(64, 32);
      Body11.mirror = true;
      setRotation(Body11, 0F, 0F, 0F);
      Body12 = new ModelRenderer(this, 17, 0);
      Body12.addBox(0F, 0F, 0F, 7, 1, 4);
      Body12.setRotationPoint(-3F, 0F, -2F);
      Body12.setTextureSize(64, 32);
      Body12.mirror = true;
      setRotation(Body12, 0F, 0F, 0F);
      Left_Arm = new ModelRenderer(this, 0, 16);
      Left_Arm.addBox(0F, 0F, 0F, 4, 10, 4);
      Left_Arm.setRotationPoint(-8F, 0F, -2F);
      Left_Arm.setTextureSize(64, 32);
      Left_Arm.mirror = true;
      setRotation(Left_Arm, 0F, 0F, 0F);
      Right_Arm = new ModelRenderer(this, 40, 0);
      Right_Arm.addBox(0F, 0F, 0F, 4, 10, 4);
      Right_Arm.setRotationPoint(4F, 0F, -2F);
      Right_Arm.setTextureSize(64, 32);
      Right_Arm.mirror = true;
      setRotation(Right_Arm, 0F, 0F, 0F);
      Right_Hand = new ModelRenderer(this, 16, 16);
      Right_Hand.addBox(0F, 0F, 0F, 1, 1, 4);
      Right_Hand.setRotationPoint(7F, 10F, -2F);
      Right_Hand.setTextureSize(64, 32);
      Right_Hand.mirror = true;
      setRotation(Right_Hand, 0F, 0F, 0F);
      Right_Fingers = new ModelRenderer(this, 16, 21);
      Right_Fingers.addBox(0F, 0F, 0F, 2, 1, 4);
      Right_Fingers.setRotationPoint(6F, 11F, -2F);
      Right_Fingers.setTextureSize(64, 32);
      Right_Fingers.mirror = true;
      setRotation(Right_Fingers, 0F, 0F, 0F);
      Right_Thumb = new ModelRenderer(this, 16, 26);
      Right_Thumb.addBox(0F, 0F, 0F, 1, 2, 1);
      Right_Thumb.setRotationPoint(4F, 10F, -2F);
      Right_Thumb.setTextureSize(64, 32);
      Right_Thumb.mirror = true;
      setRotation(Right_Thumb, 0F, 0F, 0F);
      Left_Hand = new ModelRenderer(this, 16, 16);
      Left_Hand.addBox(0F, 0F, 0F, 1, 1, 4);
      Left_Hand.setRotationPoint(-8F, 10F, -2F);
      Left_Hand.setTextureSize(64, 32);
      Left_Hand.mirror = true;
      setRotation(Left_Hand, 0F, 0F, 0F);
      Left_Fingers = new ModelRenderer(this, 16, 21);
      Left_Fingers.addBox(0F, 0F, 0F, 2, 1, 4);
      Left_Fingers.setRotationPoint(-8F, 11F, -2F);
      Left_Fingers.setTextureSize(64, 32);
      Left_Fingers.mirror = true;
      setRotation(Left_Fingers, 0F, 0F, 0F);
      Left_Thumb = new ModelRenderer(this, 16, 26);
      Left_Thumb.addBox(0F, 0F, 0F, 1, 2, 1);
      Left_Thumb.setRotationPoint(-5F, 10F, -2F);
      Left_Thumb.setTextureSize(64, 32);
      Left_Thumb.mirror = true;
      setRotation(Left_Thumb, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 28, 16);
      Head.addBox(0F, 0F, 0F, 8, 8, 8);
      Head.setRotationPoint(-4F, -8F, -4F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 16, 26);
      Shape3.addBox(0F, 0F, 0F, 1, 2, 1);
      Shape3.setRotationPoint(4F, 10F, -2F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Left_Foot.render(f5);
    Right_Foot.render(f5);
    Body1.render(f5);
    Body2.render(f5);
    Body3.render(f5);
    Body4.render(f5);
    Body5.render(f5);
    Body6.render(f5);
    Body7.render(f5);
    Body8.render(f5);
    Body9.render(f5);
    Body10.render(f5);
    Body11.render(f5);
    Body12.render(f5);
    Left_Arm.render(f5);
    Right_Arm.render(f5);
    Right_Hand.render(f5);
    Right_Fingers.render(f5);
    Right_Thumb.render(f5);
    Left_Hand.render(f5);
    Left_Fingers.render(f5);
    Left_Thumb.render(f5);
    Head.render(f5);
    Shape3.render(f5);
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
