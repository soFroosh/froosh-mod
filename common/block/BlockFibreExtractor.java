package block;

import render.RenderID;
import tile.TileFibreExtractor;
import core.Strings;
import core.TechnicalArcana;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockFibreExtractor extends BlockBase{

	public BlockFibreExtractor(int i){
		super(i, Material.iron);
		this.setBlockName("blockFibreExtractor");
		setTextureFile(Strings.FIBRE_EXTRACTOR_TEXTURE_FILE);
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new TileFibreExtractor();
	}
	
	public int getRenderType() {
		return RenderID.blockFibreExtractorRenderID;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}
	
}
