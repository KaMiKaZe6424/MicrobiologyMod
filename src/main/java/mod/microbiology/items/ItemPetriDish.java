package mod.microbiology.items;

import mod.microbiology.Microbiology;
import net.minecraft.item.Item;

public class ItemPetriDish extends Item {
	
	public ItemPetriDish() {
		super();
		setMaxStackSize(16);
		setCreativeTab(Microbiology.tabCore());
		setUnlocalizedName("itemPetriDish");
		setTextureName("generic:petrydish_empty");
	}

}
