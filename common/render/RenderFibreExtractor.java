package render;

import org.lwjgl.opengl.GL11;

import block.model.ModelFibreExtractor;

import core.Strings;
import core.TechnicalArcana;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.ForgeHooksClient;
import tile.TileFibreExtractor;

public class RenderFibreExtractor implements ISimpleBlockRenderingHandler{

	public RenderBlocks blockRenderer = new RenderBlocks();
	private ModelFibreExtractor model;
	
	
	public RenderFibreExtractor(){
		model = new ModelFibreExtractor();
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		
		TileFibreExtractor tileEntity = new TileFibreExtractor();
		
		if(tileEntity.worldObj != null){
		
		ForgeHooksClient.bindTexture(Strings.FIBRE_EXTRACTOR_TEXTURE_FILE, 0);
		//bindTextureByName(Strings.FIBRE_EXTRACTOR_TEXTURE_FILE);
		
		GL11.glPushMatrix();
		GL11.glTranslated((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(0, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		model.renderModel(0.0625F);
		GL11.glPopMatrix();
		
		}

		return false;
	}

	@Override
	public boolean shouldRender3DInInventory() {

		return false;
	}

	@Override
	public int getRenderId() {

		return RenderID.blockFibreExtractorRenderID;
	}


	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {

		if (block == TechnicalArcana.blockFibreExtractor) {
			TileEntityRenderer.instance.renderTileEntityAt( new TileFibreExtractor(), 0.0D, 0.0D, 0.0D, 0.0F);
		}

	}
	
	
	
}
