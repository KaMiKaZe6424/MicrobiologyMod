package mod.microbiology;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import mod.microbiology.everythingelse.Strings;
import mod.microbiology.tileentity.TileEntityMicroanalyzer;

public class ServerProxy {

	public void registerRenderThings() {

	}

	public int addArmor(String armor) {
		return 0;
	}
	
	public void registerNetworkStuff(){
		//NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.modInstance, new TMGuiHandler());
	}

	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityMicroanalyzer.class, Strings.MODID + "TileEntityMicroanalyzer");
	}
	
}
