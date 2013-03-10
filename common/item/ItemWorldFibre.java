package item;

import core.Strings;
import core.TechnicalArcana;
import net.minecraft.item.Item;

public class ItemWorldFibre extends Item{

	public ItemWorldFibre(int i){
		super(i);
		setTextureFile(Strings.ITEM_TEXTURE_FILE);
		setIconCoord(0, 0);
		setItemName("itemWorldFibre");
		setCreativeTab(TechnicalArcana.itemTab);
	}
	
}
