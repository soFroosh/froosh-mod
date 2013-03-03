package render;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;

public class BaseRenderer {

	public static void drawFaces(RenderBlocks renderBlocks, Block block, int i){
		drawFaces(renderBlocks, block, i, i, i, i, i, i);
	}
	
	public static void drawFaces(RenderBlocks renderBlocks, Block block, int i1, int i2, int i3, int i4, int i5, int i6){
		Tessellator tessellator = Tessellator.instance;
		
		GL11.glTranslatef(-5.0F, -5.0F, -5.0F);
		
		tessellator.startDrawingQuads();
		tessellator.addTranslation(0.0F, -1.0F, 0.0F);
		renderBlocks.renderBottomFace(block, 0.0D, 0.0D, 0.0D, i1);
		tessellator.draw();
		
		tessellator.startDrawingQuads();
		tessellator.addTranslation(0.0F, 1.0F, 0.0F);
		renderBlocks.renderTopFace(block, 0.0D, 0.0D, 0.0D, i1);
		tessellator.draw();
		
		tessellator.startDrawingQuads();
		tessellator.addTranslation(0.0F, 0.0F, -1.0F);
		renderBlocks.renderWestFace(block, 0.0D, 0.0D, 0.0D, i1);
		tessellator.draw();
		
		tessellator.startDrawingQuads();
		tessellator.addTranslation(0.0F, 0.0F, 1.0F);
		renderBlocks.renderEastFace(block, 0.0D, 0.0D, 0.0D, i1);
		tessellator.draw();
		
		tessellator.startDrawingQuads();
		tessellator.addTranslation(-1.0F, 0.0F, 0.0F);
		renderBlocks.renderSouthFace(block, 0.0D, 0.0D, 0.0D, i1);
		tessellator.draw();
		
		tessellator.startDrawingQuads();
		tessellator.addTranslation(1.0F, 0.0F, 0.0F);
		renderBlocks.renderNorthFace(block, 0.0D, 0.0D, 0.0D, i1);
		tessellator.draw();
		
		GL11.glTranslatef(5.0F, 5.0F, 5.0F);
		
	}
	
}
