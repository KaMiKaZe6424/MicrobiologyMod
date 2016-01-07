package mod.microbiology.items;

import mod.microbiology.Microbiology;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemCottonBud extends Item {
	
	public ItemCottonBud() {
		super();
		setMaxStackSize(64);
		setCreativeTab(Microbiology.tabCore());
		setUnlocalizedName("itemCottonBud");
	}
	
	@Override
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon("microbiologymod:cotton_swab");
	}

}
