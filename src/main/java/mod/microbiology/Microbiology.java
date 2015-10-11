package mod.microbiology;

import mod.microbiology.everythingelse.MicrobiologyTab;
import mod.microbiology.registry.ModBlocks;
import mod.microbiology.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLConstructionEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "microbiologymod", name = "Microbiology Mod", version = "0.0")
public class Microbiology {

	public Configuration cfg;
	public ModItems initRegItems;
	public ModBlocks initRegBlocks;

	@EventHandler
	public void construct(FMLConstructionEvent e) {
		cfg = new Configuration();
		initRegItems = new ModItems();
		initRegBlocks = new ModBlocks();
	}
	
	static CreativeTabs tabCore = new MicrobiologyTab();

	@EventHandler
	public void preinit(FMLPreInitializationEvent e) {
		
		// Initializing Blocks here
		initRegBlocks.initBlocks();

		// Initializing Items here
		initRegItems.initItems();
		
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		// Registering Blocks
		initRegBlocks.registerBlocks();
		
		// Registering Items
		initRegItems.registerItems();

		// Doing some localization

	}
	
	public static CreativeTabs tabCore() {
		return tabCore;
	}

}
