package mod.microbiology.commands;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;

public class MicrobiologyMainCommand implements ICommand {
	
	List aliases = new ArrayList();

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender arg0, String[] arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List getCommandAliases() {
		if(aliases.isEmpty()) {
			aliases.add("mb");
		}
		return aliases;
	}

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "microbiology";
	}

	@Override
	public String getCommandUsage(ICommandSender arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void processCommand(ICommandSender arg0, String[] arg1) {
		// TODO Auto-generated method stub
		
	}

}
