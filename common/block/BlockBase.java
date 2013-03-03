package block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBase extends BlockContainer{
	
	public BlockBase(int par1, Material par2Material) {
		super(par1, par2Material);
	}
	
	public static Block blockFibreExtractor;

	public static void registerBlocks(){
		blockFibreExtractor = new BlockFibreExtractor(BlockID.blockFibreExtractorID);
	}

	@Override
	public TileEntity createNewTileEntity(World var1) {
		return null;
	}
	
}
