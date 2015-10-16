package mod.microbiology.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mod.microbiology.life.dna.DNA;
import mod.microbiology.life.dna.IDNA;
import mod.microbiology.registry.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSampleApplied extends Item implements IItemSampleApplied {
	
	private List<IDNA> dnas;
	
	private Thread t;
	
	public ItemSampleApplied() {
		super();
		setMaxStackSize(1);
		setUnlocalizedName("itemSampleApplied");
		dnas = new ArrayList<IDNA>();
		t = new Thread(new Runnable() {
			@Override
			public void run() {
				generateDNA();
				t.interrupt();
			}
			
		});
	}

	@Override
	public List<IDNA> getDNA() {
		return dnas;
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
	
	private void generateDNA() {
		dnas.clear();
		Random r = new Random();
		int i = 10 + r.nextInt(5);
		for (int j = 0; j <= i; j++) {
			dnas.add(new DNA());
		}
	}
	
	public boolean isFinished() {
		return t.isInterrupted();
	}
	
}
