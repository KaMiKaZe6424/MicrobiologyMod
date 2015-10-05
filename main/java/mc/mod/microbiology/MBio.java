package mc.mod.microbiology;

import mc.mod.microbiology.life.dna.DNA;
import mc.mod.microbiology.life.dna.DNAGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="microbiology", name="Microbiology Mod", version="0.0")
public class MBio {
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent e) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		new DNA(new DNAGen()).generate();
	}
	
}
