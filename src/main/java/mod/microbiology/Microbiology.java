package mod.microbiology;

import mod.microbiology.everythingelse.MicrobiologyTab;
import mod.microbiology.registry.CraftingRecipes;
import mod.microbiology.registry.ModBlocks;
import mod.microbiology.registry.ModCommands;
import mod.microbiology.registry.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLConstructionEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import me.itsghost.jdiscord.DiscordAPI;
import me.itsghost.jdiscord.DiscordBuilder;

@Mod(modid = "microbiologymod", name = "Microbiology Mod", version = "0.0")
public class Microbiology {
	
	DiscordAPI api;

	public Configuration cfg;
	public ModItems initRegItems;
	public ModBlocks initRegBlocks;
	public ModCommands initRegCmds;
	public CraftingRecipes recipes;
	
	static CreativeTabs tabCore = new MicrobiologyTab();

	@EventHandler
	public void construct(FMLConstructionEvent e) {
		cfg = new Configuration();
		initRegItems = new ModItems();
		initRegBlocks = new ModBlocks();
		initRegCmds = new ModCommands();
		recipes = new CraftingRecipes();
	}

	@EventHandler
	public void preinit(FMLPreInitializationEvent e) {
		
		// Initializing Blocks here
		initRegBlocks.initBlocks();

		// Initializing Items here
		initRegItems.initItems();
		
		// Initializing Commands here
		initRegCmds.initCmds();
		
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		// Registering Blocks
		initRegBlocks.registerBlocks();
		
		// Registering Items
		initRegItems.registerItems();
		
		// Registering recipes 
		recipes.initRecipes();
		
		// Doing some localization

	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent e) {
		
		// Registering the commands
		initRegCmds.registerCmds(e);
		
	}
	
	public static CreativeTabs tabCore() {
		return tabCore;
	}

}
