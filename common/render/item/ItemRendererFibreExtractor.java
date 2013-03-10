package render.item;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import core.Strings;

import render.RenderFibreExtractor;

public class ItemRendererFibreExtractor implements IItemRenderer{

	private RenderFibreExtractor renderFE = new RenderFibreExtractor();
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {

		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

		switch (type) {

		case ENTITY: {
			renderFE((float)-0.5F, (float)0F, (float)-0.5F);
			break;
		}
		case EQUIPPED: {
			renderFE((float)0F, (float)0.4F, (float)0F);
			break;
		}
		case INVENTORY: {
			renderFE((float)1F, (float)0.65F, (float)1F);
			break;
		}
		default:
			break;

		}
		
	}
	
	public void renderFE(double x, double y, double z){
		
		Tessellator tesselator = Tessellator.instance;
		
        //ForgeHooksClient.bindTexture(Strings.FIBRE_EXTRACTOR_TEXTURE_FILE, 0);
        
        GL11.glPushMatrix();
        
        GL11.glTranslatef((float)x, (float)y, (float)z);
        renderFE.render(x, y, z);
        
        GL11.glPopMatrix();
		
	}
	
	
}
