package mod.microbiology.items;

import java.util.List;

import mod.microbiology.Microbiology;
import net.minecraft.item.Item;

public class ItemSampleApplied extends Item implements IItemSampleApplied {
	
	public ItemSampleApplied() {
		super();
		setMaxStackSize(1);
		setCreativeTab(Microbiology.tabCore());
		setUnlocalizedName("itemSampleApplied");
	}

	@Override
	public List<char[]> getDNACodes() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
