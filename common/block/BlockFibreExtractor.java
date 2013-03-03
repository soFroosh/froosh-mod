package block;

import tile.TileFibreExtractor;
import core.Strings;
import core.TechnicalArcana;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockFibreExtractor extends BlockBase{

	public BlockFibreExtractor(int i){
		super(i, Material.iron);
		setTextureFile(Strings.BLOCK_TEXTURE_FILE);
		setCreativeTab(TechnicalArcana.customTab);
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new TileFibreExtractor();
	}
	
}
