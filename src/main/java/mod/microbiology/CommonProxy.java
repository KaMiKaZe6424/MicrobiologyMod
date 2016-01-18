package mod.microbiology;

import mod.microbiology.gui.ModGuiHandler;
import mod.microbiology.registry.CraftingRecipes;
import mod.microbiology.registry.ModBlocks;
import mod.microbiology.registry.ModCommands;
import mod.microbiology.registry.ModItems;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLConstructionEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy {
	
	public Configuration cfg;
	public ModItems initRegItems;
	public ModBlocks initRegBlocks;
	public ModCommands initRegCmds;
	public CraftingRecipes recipes;
	
	public void contruct(FMLConstructionEvent e) {
		cfg = new Configuration();
		initRegItems = new ModItems();
		initRegBlocks = new ModBlocks();
		initRegCmds = new ModCommands();
		recipes = new CraftingRecipes();
	}
	
	public void preInit(FMLPreInitializationEvent e) {

		// Initializing Blocks here
		initRegBlocks.initBlocks();

		// Initializing Items here
		initRegItems.initItems();
		
		// Initializing Commands here
		initRegCmds.initCmds();
	}
	
	public void init(FMLInitializationEvent e) {
		// Registering Blocks
		initRegBlocks.registerBlocks();
		
		// Registering Items
		initRegItems.registerItems();
		
		// Registering recipes 
		recipes.initRecipes();
		
		// Doing some localization
		
		// Register GUI-Handler
		NetworkRegistry.INSTANCE.registerGuiHandler(Microbiology.instance, new ModGuiHandler());

	}
	
	public void serverLoad(FMLServerStartingEvent e) {
		// Registering the commands
		initRegCmds.registerCmds(e);
	}

}
