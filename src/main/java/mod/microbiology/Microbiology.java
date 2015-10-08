package mod.microbiology;

import mod.microbiology.blocks.BlockMicroAnalyzer;
import mod.microbiology.everythingelse.MicrobiologyTab;
import mod.microbiology.items.ItemSample;
import mod.microbiology.items.ItemSampleApplied;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLConstructionEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "microbiologymod", name = "Microbiology Mod", version = "0.0")
public class Microbiology {

	public Configuration cfg;

	@EventHandler
	public void construct(FMLConstructionEvent e) {
		cfg = new Configuration();
	}
	
	static CreativeTabs tabCore = new MicrobiologyTab();

	Block microanalyzer;
	
	Item sample;
	Item sampleApplied;

	@EventHandler
	public void preinit(FMLPreInitializationEvent e) {
		// Initializing Blocks here
		microanalyzer = new BlockMicroAnalyzer();

		// Initializing Items here
		sample = new ItemSample();
		sampleApplied = new ItemSampleApplied();
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		// Registering Blocks
		GameRegistry.registerBlock(microanalyzer, "microanalyzer");
		
		// Registering Items
		GameRegistry.registerItem(sample, "sample");
		GameRegistry.registerItem(sampleApplied, "sampleApplied");

		// Doing some localization

	}
	
	public static CreativeTabs tabCore() {
		return tabCore;
	}

}
