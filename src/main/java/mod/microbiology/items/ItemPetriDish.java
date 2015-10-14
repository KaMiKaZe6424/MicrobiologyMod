package mod.microbiology.items;

import mod.microbiology.Microbiology;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemPetriDish extends Item {
	
	public ItemPetriDish() {
		super();
		setMaxStackSize(16);
		setCreativeTab(Microbiology.tabCore());
		setUnlocalizedName("itemPetriDish");
	}
	
	@Override
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon("microbiologymod:petrydish_empty");
	}

}
