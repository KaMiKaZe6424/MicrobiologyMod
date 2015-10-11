package mod.microbiology;

import mod.microbiology.everythingelse.MicrobiologyTab;
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
	public InitRegisterItems initRegItems;
	public InitRegisterBlocks initRegBlocks;

	@EventHandler
	public void construct(FMLConstructionEvent e) {
		cfg = new Configuration();
		initRegItems = new InitRegisterItems();
		initRegBlocks = new InitRegisterBlocks();
	}
	
	static CreativeTabs tabCore = new MicrobiologyTab();

	Block microanalyzer;
	
	Item sample;
	Item sampleApplied;

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
