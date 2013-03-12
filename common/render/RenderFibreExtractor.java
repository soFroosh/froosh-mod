package render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.ForgeHooksClient;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import core.Strings;

public class RenderFibreExtractor extends TileEntitySpecialRenderer{

	private float scale = (float) (1.0 / 16.0);
	
	private ModelBase model = new ModelBase(){};
	
	private Minecraft mc;
	
	private EntityItem entityItem;
	
	private Item item;;

	private final ModelRenderer base;
	private final ModelRenderer top;
	
	private final ModelRenderer pole1;
	private final ModelRenderer pole2;
	private final ModelRenderer pole3;
	private final ModelRenderer pole4;
	
	private final ModelRenderer extractor;
	
	private final ModelRenderer window1;
	
	//private final ModelRenderer window1;
	
	public RenderFibreExtractor(){
		
		base = new ModelRenderer(model, 0, 0);
		base.addBox(0F, 0F, 0F, 16, 3, 16);
		base.rotationPointX = 0F;
		base.rotationPointY = 0F;
		base.rotationPointZ = 0F;
		
		top = new ModelRenderer(model, 0, 0);
		top.addBox(0F, 13F, 0F, 16, 3, 16);
		top.rotationPointX = 0F;
		top.rotateAngleY = 0F;
		top.rotationPointZ = 0F;
		
		pole1 = new ModelRenderer(model, 0, 19);
		pole1.addBox(0F, 3F, 0F, 3, 10, 3);
		pole1.rotationPointX = 0F;
		pole1.rotationPointY = 0F;
		pole1.rotationPointZ = 0F;
		
		pole2 = new ModelRenderer(model, 0, 19);
		pole2.addBox(0F, 3F, 13F, 3, 10, 3);
		pole2.rotationPointX = 0F;
		pole2.rotationPointY = 0F;
		pole2.rotationPointZ = 0F;
		
		pole3 = new ModelRenderer(model, 0, 19);
		pole3.addBox(13F, 3F, 0F, 3, 10, 3);
		pole3.rotationPointX = 0F;
		pole3.rotationPointY = 0F;
		pole3.rotationPointZ = 0F;
		
		pole4 = new ModelRenderer(model, 0, 19);
		pole4.addBox(13F, 3F, 13F, 3, 10, 3);
		pole4.rotationPointX = 0F;
		pole4.rotationPointY = 0F;
		pole4.rotationPointZ = 0F;	
		
		extractor = new ModelRenderer(model, 13, 22);
		extractor.addBox(6F, 3F, 6F, 4, 3, 4);
		extractor.rotationPointX = 0F;
		extractor.rotationPointY = 0F;
		extractor.rotationPointZ = 0F;
		
		window1 = new ModelRenderer(model, 13, 22);
		window1.addBox(3F, 3F, 0F, 10, 10, 3);
		window1.rotationPointX = 0F;
		window1.rotationPointY = 0F;
		window1.rotationPointZ = 0F;
		
	}
	
	public void render(double x, double y, double z){
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);

		GL11.glTranslated(x, y, z);
		
		ForgeHooksClient.bindTexture(Strings.FIBRE_EXTRACTOR_TEXTURE_FILE, 0);
		//FMLClientHandler.instance().getClient().renderEngine.getTexture(Strings.FIBRE_EXTRACTOR_TEXTURE_FILE);
		base.render(scale);
		top.render(scale);
		pole1.render(scale);
		pole2.render(scale);
		pole3.render(scale);
		pole4.render(scale);
		extractor.render(scale);
		//window1.render(scale);
		
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
