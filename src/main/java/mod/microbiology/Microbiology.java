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
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLConstructionEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
//import me.itsghost.jdiscord.DiscordAPI;
//import me.itsghost.jdiscord.DiscordBuilder;

@Mod(modid = "microbiologymod", name = "Microbiology Mod", version = "0.0")
public class Microbiology {
	
	@Instance
	public static Microbiology instance = new Microbiology();
	
	//DiscordAPI api;
	
	@SidedProxy(clientSide="mod.microbiology.ClientProxy", serverSide="mod.microbiology.CommonProxy")
	public static CommonProxy proxy;
	
	static CreativeTabs tabCore = new MicrobiologyTab();

	@EventHandler
	public void construct(FMLConstructionEvent e) {
		proxy.contruct(e);
	}

	@EventHandler
	public void preinit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent e) {
		proxy.serverLoad(e);
	}
	
	public static CreativeTabs tabCore() {
		return tabCore;
	}

}
