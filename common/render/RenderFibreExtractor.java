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

public class RenderFibreExtractor extends TileEntitySpecialRenderer{

	private float scale = (float) (1.0 / 16.0);
	
	private ModelFibreExtractor model = new ModelFibreExtractor(scale);
	
	@Override
	public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8) {
		
		model.render((TileFibreExtractor)var1, var2, var4, var6);
		
	}
}
