package mod.microbiology.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.microbiology.Microbiology;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

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
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining) {
		return itemIcon;
	}

}
