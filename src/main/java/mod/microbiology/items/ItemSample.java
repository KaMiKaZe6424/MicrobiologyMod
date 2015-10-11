package mod.microbiology.items;

import mod.microbiology.ModItems;
import mod.microbiology.Microbiology;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSample extends Item {

	public ItemSample() {
		super();
		setMaxStackSize(16);
		setCreativeTab(Microbiology.tabCore());
		setUnlocalizedName("itemSample");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack s, World w, EntityPlayer p) {
		if (p.inventory.getFirstEmptyStack() > 0) {
		p.inventory.addItemStackToInventory(new ItemStack(ModItems.sampleApplied, 1));
		} else {
			if (s.stackSize == 1) {
				return new ItemStack(ModItems.sampleApplied, 1);
			} else {
				return new ItemStack(s.getItem(), s.stackSize);
			}
		}
		return new ItemStack(s.getItem(), s.stackSize-1);
	}
}
