package render;

import org.lwjgl.opengl.GL11;

import block.model.ModelFibreExtractor;

import tile.TileFibreExtractor;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;

public class RenderFibreExtractor extends BaseRenderer implements ISimpleBlockRenderingHandler{

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
		GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glTranslatef(-5.0F, -5.0F, -5.0F);
		TileEntityRenderer.instance.renderTileEntityAt(new TileFibreExtractor(), 0.0D, 0.0D, 0.0D, 0.0F);
		GL11.glEnable(32826);
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		
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
	

}
