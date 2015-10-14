package mod.microbiology.items;

import java.util.List;

import mod.microbiology.Microbiology;
import mod.microbiology.registry.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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
	
	@Override
	public ItemStack onItemRightClick(ItemStack s, World w, EntityPlayer p) {
		
		if (p.isSneaking()) {
			if (p.inventory.hasItem(ModItems.sample)) {
				p.inventory.addItemStackToInventory(new ItemStack(ModItems.sample, 1));
				return new ItemStack(s.getItem(), s.stackSize-1);
			} else {
				return new ItemStack(ModItems.sample,1);
			}
		}
		
		return s;
		
	}
	
	@Override
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon("microbiologymod:petrydish_full");
	}
	
}
