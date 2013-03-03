package block;

import core.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFibreExtractor extends BlockBase{

	public BlockFibreExtractor(int i){
		super(i, Material.iron);
		setTextureFile(Strings.BLOCK_TEXTURE_FILE);
	}
	
}
