package mod.microbiology.registry;

import cpw.mods.fml.common.event.FMLServerStartingEvent;
import mod.microbiology.commands.DiscordCmd;
import net.minecraft.command.ICommand;

public class ModCommands {
	
	public ModCommands() {
		
	}
	
	public static ICommand discord; 
	
	public void initCmds() {
		discord = new DiscordCmd();
	}
	
	public void registerCmds(FMLServerStartingEvent e) {
		e.registerServerCommand(discord);
	}

}
