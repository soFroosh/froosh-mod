package render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.ForgeHooksClient;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import core.Strings;

public class RenderFibreExtractor extends TileEntitySpecialRenderer{

	private float scale = (float) (1.0 / 16.0);
	
	private ModelBase model = new ModelBase(){};
	
	private EntityItem entityItem;
	
	private Item item;;

	private final ModelRenderer BaseBig;
	private final ModelRenderer BaseSmall;
	
	private final ModelRenderer Circle1;
	private final ModelRenderer Circle2;
	private final ModelRenderer Circle3;
	private final ModelRenderer Circle4; 
	private final ModelRenderer Circle5;
	private final ModelRenderer Circle6;
	private final ModelRenderer Circle7;
	private final ModelRenderer Circle8;
	private final ModelRenderer Circle9;
	private final ModelRenderer Circle10;
	private final ModelRenderer Circle11;
	private final ModelRenderer Circle12;
	
	public RenderFibreExtractor(){
		
		BaseBig = new ModelRenderer(model, 0, 0);
		BaseBig.addBox(0F, 0F, 0F, 16, 1, 16);
		BaseBig.rotationPointX = 0F;
		BaseBig.rotationPointY = 0F;
		BaseBig.rotationPointZ = 0F;
		
		
		BaseSmall = new ModelRenderer(model, 0, 18);
		BaseSmall.addBox(0F, 1F, 0F, 14, 1, 14);
		BaseSmall.rotationPointX = 1F;
		BaseSmall.rotationPointY = 0F;
		BaseSmall.rotationPointZ = 1F;
		
		Circle1 = new ModelRenderer(model, 0, 0);
		Circle1.addBox(0F, 2F, 0F, 6, 1, 1);
		Circle1.rotationPointX = 5F;
		Circle1.rotationPointY = 0F;
		Circle1.rotationPointZ = 8F;
		
		Circle2 = new ModelRenderer(model, 0, 0);
		Circle2.addBox(0F, 3F, 0F, 1, 1, 1);
		Circle2.rotationPointX = 4F;
		Circle2.rotationPointY = 0F;
		Circle2.rotationPointZ = 8F;
		
		Circle3 = new ModelRenderer(model, 0, 0);
		Circle3.addBox(0F, 3F, 0F, 1, 1, 1);
		Circle3.rotationPointX = 11F;
		Circle3.rotationPointY = 0F;
		Circle3.rotationPointZ = 8F;
		
		Circle4 = new ModelRenderer(model, 0, 0);
		Circle4.addBox(0F, 4F, 0F, 1, 1, 1);
		Circle4.rotationPointX = 12F;
		Circle4.rotationPointY = 0F;
		Circle4.rotationPointZ= 8F;
		
		Circle5 = new ModelRenderer(model, 0, 0);
		Circle5.addBox(0F, 4F, 0F, 1, 1, 1);
		Circle5.rotationPointX = 3F;
		Circle5.rotationPointY = 0F;
		Circle5.rotationPointZ = 8F;
		
		Circle6 = new ModelRenderer(model, 0, 0);
		Circle6.addBox(0F, 5F, 0F, 1, 6, 1);
		Circle6.rotationPointX = 13F;
		Circle6.rotationPointY = 0F;
		Circle6.rotationPointZ = 8F;
		
		Circle7 = new ModelRenderer(model, 0, 0);
		Circle7.addBox(0F, 5F, 0F, 1, 6, 1);
		Circle7.rotationPointX = 2F;
		Circle7.rotationPointY = 0F;
		Circle7.rotationPointZ = 8F;
		
		Circle8 = new ModelRenderer(model, 0, 0);
		Circle8.addBox(0F, 6F, 0F, 1, 1, 1);
		Circle8.rotationPointX = 3F;
		Circle8.rotationPointY = 5F;
		Circle8.rotationPointZ = 8F;
		
		Circle9 = new ModelRenderer(model, 0, 0);
		Circle9.addBox(0F, 6F, 0F, 1, 1, 1);
		Circle9.rotationPointX = 12F;
		Circle9.rotationPointY = 5F;
		Circle9.rotationPointZ = 8F;
		
		Circle10 = new ModelRenderer(model, 0, 0);
		Circle10.addBox(0F, 7F, 0F, 1, 1, 1);
		Circle10.rotationPointX = 4F;
		Circle10.rotationPointY = 5F;
		Circle10.rotationPointZ = 8F;
		
		Circle11 = new ModelRenderer(model, 0, 0);
		Circle11.addBox(0F, 7F, 0F, 1, 1, 1);
		Circle11.rotationPointX = 11F;
		Circle11.rotationPointY = 5F;
		Circle11.rotationPointZ = 8F;
		
		Circle12 = new ModelRenderer(model, 0, 0);
		Circle12.addBox(0F, 8F, 0F, 6, 1, 1);
		Circle12.rotationPointX = 5F;
		Circle12.rotationPointY = 5F;
		Circle12.rotationPointZ = 8F;
		
		
	}
	
	public void render(double x, double y, double z){
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);

		GL11.glTranslated(x, y, z);
		
		ForgeHooksClient.bindTexture(Strings.BLOCK_TEXTURE_FILE, 0);
		BaseBig.render(scale);
		BaseSmall.render(scale);
		Circle1.render(scale);
		Circle2.render(scale);
		Circle3.render(scale);
		Circle4.render(scale);
		Circle5.render(scale);
		Circle6.render(scale);
		Circle7.render(scale);
		Circle8.render(scale);
		Circle9.render(scale);
		Circle10.render(scale);
		Circle11.render(scale);
		Circle12.render(scale);
		
		//renderEnderPearl(x, y, z);
		
		
		
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
	
	public void renderEnderPearl(double x, double y, double z){
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);
		
		ForgeHooksClient.bindTexture("/gui/items.png", 120);
		
		Tessellator tess = Tessellator.instance;
		tess.startDrawingQuads();
		tess.setNormal(0.0F, 1.0F, 0.0F);
		tess.draw();
		
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		
		GL11.glPopMatrix();
		
		
	}
	
	@Override
	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float var8) {
		
		render(x, y, z);
		
	}
	
}
