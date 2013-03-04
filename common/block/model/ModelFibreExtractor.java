package block.model;

import org.lwjgl.opengl.GL11;

import core.Strings;

import tile.TileFibreExtractor;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.ForgeHooksClient;

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
    
    private float scale;
  
	public ModelFibreExtractor(float scale) {
		this.scale = scale;
		
		textureWidth = 64;
		textureHeight = 64;

		BaseBig = new ModelRenderer(this, 0, 0);
		BaseBig.addBox(0F, 0F, 0F, 16, 1, 16, scale);
		BaseBig.setRotationPoint(-8F, 23F, -8F);

		BaseSmall = new ModelRenderer(this, 0, 17);
		BaseSmall.addBox(0F, 0F, 0F, 14, 1, 14, scale);
		BaseSmall.setRotationPoint(-7F, 22F, -7F);

		Circle1 = new ModelRenderer(this, 0, 32);
		Circle1.addBox(0F, 0F, 0F, 6, 1, 1, scale);
		Circle1.setRotationPoint(-3F, 21F, 0F);

		Circle2 = new ModelRenderer(this, 0, 32);
		Circle2.addBox(0F, 0F, 0F, 1, 1, 1, scale);
		Circle2.setRotationPoint(3F, 20F, 0F);

		Circle3 = new ModelRenderer(this, 0, 32);
		Circle3.addBox(0F, 0F, 0F, 1, 1, 1, scale);
		Circle3.setRotationPoint(4F, 19F, 0F);

		Circle4 = new ModelRenderer(this, 0, 32);
		Circle4.addBox(0F, 0F, 0F, 6, 1, 1, scale);
		Circle4.setRotationPoint(6F, 13F, 0F);

		Circle5 = new ModelRenderer(this, 0, 32);
		Circle5.addBox(0F, 0F, 0F, 6, 1, 1, scale);
		Circle5.setRotationPoint(-5F, 13F, 0F);

		Circle6 = new ModelRenderer(this, 0, 32);
		Circle6.addBox(0F, 0F, 0F, 1, 1, 1, scale);
		Circle6.setRotationPoint(-4F, 20F, 0F);

		Circle7 = new ModelRenderer(this, 0, 32);
		Circle7.addBox(0F, 0F, 0F, 1, 1, 1, scale);
		Circle7.setRotationPoint(-5F, 19F, 0F);

		Circle8 = new ModelRenderer(this, 0, 32);
		Circle8.addBox(0F, 0F, 0F, 1, 1, 1, scale);
		Circle8.setRotationPoint(-5F, 12F, 0F);

		Circle9 = new ModelRenderer(this, 0, 32);
		Circle9.addBox(0F, 0F, 0F, 1, 1, 1, scale);
		Circle9.setRotationPoint(-4F, 11F, 0F);

		Circle10 = new ModelRenderer(this, 0, 32);
		Circle10.addBox(0F, 0F, 0F, 1, 1, 1, scale);
		Circle10.setRotationPoint(4F, 12F, 0F);

		Circle11 = new ModelRenderer(this, 0, 32);
		Circle11.addBox(0F, 0F, 0F, 1, 1, 1, scale);
		Circle11.setRotationPoint(3F, 11F, 0F);

		Circle12 = new ModelRenderer(this, 0, 32);
		Circle12.addBox(0F, 0F, 0F, 6, 1, 1, scale);
		Circle12.setRotationPoint(-3F, 10F, 0F);

	}
  
	public void render(float f5) {

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
	
	public void render(TileFibreExtractor tile, double x, double y, double z) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glTranslated(x, y, z);
		ForgeHooksClient.bindTexture(Strings.FIBRE_EXTRACTOR_TEXTURE_FILE, 0);
		this.render(scale);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();

	}
  
  
}
