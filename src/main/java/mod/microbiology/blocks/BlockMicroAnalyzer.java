package mod.microbiology.blocks;

import mod.microbiology.Microbiology;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockMicroAnalyzer extends Block {

	public BlockMicroAnalyzer() {
		super(Material.iron);
		setCreativeTab(Microbiology.tabCore());
		setBlockName("microanalyzer");
		setBlockTextureName("microanalyzer_side");
	}
	
	@Override
	public void onBlockClicked(World w, int x, int y, int z, EntityPlayer p) {
	}
	
	
	
}
