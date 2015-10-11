package mod.microbiology.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.microbiology.everythingelse.Strings;
import mod.microbiology.tileentity.TileEntityMicroanalyzer;

public class ModTiles {
	
	public ModTiles() {
		
	}
	
	public void mainRegistry() {
		registerTiles();
	}
	
	public void registerTiles() {
		GameRegistry.registerTileEntity(TileEntityMicroanalyzer.class, Strings.MODID);
	}

}
