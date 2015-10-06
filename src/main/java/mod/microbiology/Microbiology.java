package mod.microbiology;

import mod.microbiology.blocks.BlockMicroAnalyzer;
import net.minecraft.block.Block;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLConstructionEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.FMLControlledNamespacedRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid="microbiologymod", name="Microbiology Mod", version="0.0")
public class Microbiology {
	
	public Configuration cfg;
	
	@EventHandler
	public void construct(FMLConstructionEvent e) {
		cfg = new Configuration();
	}
	
	Block microanalyzer;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent e) {
		//Initializing Blocks here
		microanalyzer = new BlockMicroAnalyzer();
		
		//Initializing Items here
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		//Registering Creativetabs
		
		//Registering Blocks
		GameRegistry.registerBlock(microanalyzer, "Microanalyzer");
	}
	
}
