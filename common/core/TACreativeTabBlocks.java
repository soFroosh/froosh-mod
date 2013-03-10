package core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TACreativeTabBlocks extends CreativeTabs{

	public TACreativeTabBlocks(String par2Str) {
		super(par2Str);

	}
	
	@SideOnly(Side.CLIENT)
    public String getTabLabel()
    {
        return "blockTab";
    }
	
	@Override
	public ItemStack getIconItemStack() {
	    return new ItemStack(Item.eyeOfEnder);
	}

}
