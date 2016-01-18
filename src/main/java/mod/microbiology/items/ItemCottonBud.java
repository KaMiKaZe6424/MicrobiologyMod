package mod.microbiology.items;

import mod.microbiology.Microbiology;
import mod.microbiology.gui.GUIMicroanalyzer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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
