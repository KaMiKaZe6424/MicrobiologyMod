package mod.microbiology.items;

import mod.microbiology.Microbiology;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSample extends Item {

	public ItemSample() {
		super();
		setMaxStackSize(1);
		setCreativeTab(Microbiology.tabCore());
		setUnlocalizedName("itemSample");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack s, World w, EntityPlayer p) {
		return new ItemStack(new ItemSampleApplied());
	}
}
