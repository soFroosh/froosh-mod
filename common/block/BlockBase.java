package block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public abstract class BlockBase extends Block{
	
	public BlockBase(int par1, Material par2Material) {
		super(par1, par2Material);
	}
	
	public static Block blockFibreExtractor;

	public static void registerBlocks(){
		blockFibreExtractor = new BlockFibreExtractor(BlockID.blockFibreExtractorID);
	}
	
}
