package mod.microbiology;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.microbiology.blocks.BlockMicroAnalyzer;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public ModBlocks() {
		
	}
	
	public static Block microanalyzer;
	
	public void initBlocks() {
		microanalyzer = new BlockMicroAnalyzer();
	}
	
	public void registerBlocks() {
		GameRegistry.registerBlock(microanalyzer, "Microanalyzer");
	}

}
