package mod.microbiology.blocks;

import mod.microbiology.everythingelse.MicrobiologyTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMicroAnalyzer extends Block {

	protected BlockMicroAnalyzer() {
		super(Material.iron);
		setCreativeTab(new MicrobiologyTab());
		this.setBlockName("Test");
	}
	
	
	
}
