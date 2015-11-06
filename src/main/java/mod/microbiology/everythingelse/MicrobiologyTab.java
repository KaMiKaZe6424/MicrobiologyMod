package mod.microbiology.everythingelse;

import mod.microbiology.registry.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MicrobiologyTab extends CreativeTabs {

	public MicrobiologyTab() {
		super("mbCore");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.microanalyzer);
	}

}
