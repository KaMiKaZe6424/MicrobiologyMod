package mod.microbiology.items;

import mod.microbiology.Microbiology;
import net.minecraft.item.Item;

public class ItemSampleApplied extends Item {
	
	public ItemSampleApplied() {
		super();
		setMaxStackSize(1);
		setCreativeTab(Microbiology.tabCore());
		setUnlocalizedName("itemSampleApplied");
	}
	
}
