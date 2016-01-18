package mod.microbiology.blocks;

import mod.microbiology.Microbiology;
import mod.microbiology.gui.GUIMicroanalyzer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockMicroAnalyzer extends Block {
	
	public IIcon[] icons = new IIcon[6];

	public BlockMicroAnalyzer() {
		super(Material.iron);
		setCreativeTab(Microbiology.tabCore());
		setBlockName("microanalyzer");
	}
	
	@Override
	public void onBlockClicked(World w, int x, int y, int z, EntityPlayer p) {
		Minecraft.getMinecraft().displayGuiScreen(new GUIMicroanalyzer());
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		icons[0] = reg.registerIcon("microbiologymod:microanalyzer_down");
		icons[1] = reg.registerIcon("microbiologymod:microanalyzer_up");
		icons[2] = reg.registerIcon("microbiologymod:microanalyzer_side");
		icons[3] = reg.registerIcon("microbiologymod:microanalyzer_side");
		icons[4] = reg.registerIcon("microbiologymod:microanalyzer_side");
		icons[5] = reg.registerIcon("microbiologymod:microanalyzer_side");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}
	
}
