package block.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFibreExtractor extends ModelBase
{
	
	public static ModelFibreExtractor instance;
	
    ModelRenderer BaseBig;
    ModelRenderer BaseSmall;
    ModelRenderer Circle1;
    ModelRenderer Circle2;
    ModelRenderer Circle3;
    ModelRenderer Circle4;
    ModelRenderer Circle5;
    ModelRenderer Circle6;
    ModelRenderer Circle7;
    ModelRenderer Circle8;
    ModelRenderer Circle9;
    ModelRenderer Circle10;
    ModelRenderer Circle11;
    ModelRenderer Circle12;
  
  public ModelFibreExtractor()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      BaseBig = new ModelRenderer(this, 0, 0);
      BaseBig.addBox(0F, 0F, 0F, 16, 1, 16);
      BaseBig.setRotationPoint(-8F, 23F, -8F);
      BaseBig.setTextureSize(64, 64);
      BaseBig.mirror = true;
      setRotation(BaseBig, 0F, 0F, 0F);
      BaseSmall = new ModelRenderer(this, 0, 17);
      BaseSmall.addBox(0F, 0F, 0F, 14, 1, 14);
      BaseSmall.setRotationPoint(-7F, 22F, -7F);
      BaseSmall.setTextureSize(64, 64);
      BaseSmall.mirror = true;
      setRotation(BaseSmall, 0F, 0F, 0F);
      Circle1 = new ModelRenderer(this, 0, 32);
      Circle1.addBox(0F, 0F, 0F, 6, 1, 1);
      Circle1.setRotationPoint(-3F, 21F, 0F);
      Circle1.setTextureSize(64, 64);
      Circle1.mirror = true;
      setRotation(Circle1, 0F, 0F, 0F);
      Circle2 = new ModelRenderer(this, 0, 32);
      Circle2.addBox(0F, 0F, 0F, 1, 1, 1);
      Circle2.setRotationPoint(3F, 20F, 0F);
      Circle2.setTextureSize(64, 64);
      Circle2.mirror = true;
      setRotation(Circle2, 0F, 0F, 0F);
      Circle3 = new ModelRenderer(this, 0, 32);
      Circle3.addBox(0F, 0F, 0F, 1, 1, 1);
      Circle3.setRotationPoint(4F, 19F, 0F);
      Circle3.setTextureSize(64, 64);
      Circle3.mirror = true;
      setRotation(Circle3, 0F, 0F, 0F);
      Circle4 = new ModelRenderer(this, 0, 32);
      Circle4.addBox(0F, 0F, 0F, 6, 1, 1);
      Circle4.setRotationPoint(6F, 13F, 0F);
      Circle4.setTextureSize(64, 64);
      Circle4.mirror = true;
      setRotation(Circle4, 0F, 0F, 1.570796F);
      Circle5 = new ModelRenderer(this, 0, 32);
      Circle5.addBox(0F, 0F, 0F, 6, 1, 1);
      Circle5.setRotationPoint(-5F, 13F, 0F);
      Circle5.setTextureSize(64, 64);
      Circle5.mirror = true;
      setRotation(Circle5, 0F, 0F, 1.570796F);
      Circle6 = new ModelRenderer(this, 0, 32);
      Circle6.addBox(0F, 0F, 0F, 1, 1, 1);
      Circle6.setRotationPoint(-4F, 20F, 0F);
      Circle6.setTextureSize(64, 64);
      Circle6.mirror = true;
      setRotation(Circle6, 0F, 0F, 0F);
      Circle7 = new ModelRenderer(this, 0, 32);
      Circle7.addBox(0F, 0F, 0F, 1, 1, 1);
      Circle7.setRotationPoint(-5F, 19F, 0F);
      Circle7.setTextureSize(64, 64);
      Circle7.mirror = true;
      setRotation(Circle7, 0F, 0F, 0F);
      Circle8 = new ModelRenderer(this, 0, 32);
      Circle8.addBox(0F, 0F, 0F, 1, 1, 1);
      Circle8.setRotationPoint(-5F, 12F, 0F);
      Circle8.setTextureSize(64, 64);
      Circle8.mirror = true;
      setRotation(Circle8, 0F, 0F, 0F);
      Circle9 = new ModelRenderer(this, 0, 32);
      Circle9.addBox(0F, 0F, 0F, 1, 1, 1);
      Circle9.setRotationPoint(-4F, 11F, 0F);
      Circle9.setTextureSize(64, 64);
      Circle9.mirror = true;
      setRotation(Circle9, 0F, 0F, 0F);
      Circle10 = new ModelRenderer(this, 0, 32);
      Circle10.addBox(0F, 0F, 0F, 1, 1, 1);
      Circle10.setRotationPoint(4F, 12F, 0F);
      Circle10.setTextureSize(64, 64);
      Circle10.mirror = true;
      setRotation(Circle10, 0F, 0F, 0F);
      Circle11 = new ModelRenderer(this, 0, 32);
      Circle11.addBox(0F, 0F, 0F, 1, 1, 1);
      Circle11.setRotationPoint(3F, 11F, 0F);
      Circle11.setTextureSize(64, 64);
      Circle11.mirror = true;
      setRotation(Circle11, 0F, 0F, 0F);
      Circle12 = new ModelRenderer(this, 0, 32);
      Circle12.addBox(0F, 0F, 0F, 6, 1, 1);
      Circle12.setRotationPoint(-3F, 10F, 0F);
      Circle12.setTextureSize(64, 64);
      Circle12.mirror = true;
      setRotation(Circle12, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    BaseBig.render(f5);
    BaseSmall.render(f5);
    Circle1.render(f5);
    Circle2.render(f5);
    Circle3.render(f5);
    Circle4.render(f5);
    Circle5.render(f5);
    Circle6.render(f5);
    Circle7.render(f5);
    Circle8.render(f5);
    Circle9.render(f5);
    Circle10.render(f5);
    Circle11.render(f5);
    Circle12.render(f5);
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
