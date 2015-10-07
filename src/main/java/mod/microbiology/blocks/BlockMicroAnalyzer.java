package mod.microbiology.blocks;

import mod.microbiology.Microbiology;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMicroAnalyzer extends Block {

	public BlockMicroAnalyzer() {
		super(Material.iron);
		setCreativeTab(Microbiology.tabCore());
		this.setBlockName("microanalyzer");
	}
	
	
	
}
