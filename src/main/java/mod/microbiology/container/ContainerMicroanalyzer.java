package mod.microbiology.container;

import mod.microbiology.tileentity.TileEntityMicroanalyzer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerMicroanalyzer extends Container {
	
	private TileEntityMicroanalyzer tileMicroanalyzer;

	public ContainerMicroanalyzer(InventoryPlayer invPlayer, TileEntityMicroanalyzer tile) {
		this.tileMicroanalyzer = tile;
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.tileMicroanalyzer.isUsableBy(player);
	}
	
}
