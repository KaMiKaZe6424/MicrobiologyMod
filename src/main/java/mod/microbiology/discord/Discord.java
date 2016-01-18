package mod.microbiology.discord;

/**import me.itsghost.jdiscord.DiscordAPI;
import me.itsghost.jdiscord.DiscordBuilder;
import me.itsghost.jdiscord.event.EventManager;
import me.itsghost.jdiscord.exception.BadUsernamePasswordException;
import me.itsghost.jdiscord.exception.DiscordFailedToConnectException;
import me.itsghost.jdiscord.exception.NoLoginDetailsException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;**/

public class Discord {
	
	/**private DiscordAPI api;

	public void login(EntityPlayer player, String[] args) {
		player.addChatMessage(new ChatComponentTranslation(Integer.toString(args.length)));
		if (args.length == 3) {
			try {
				api = new DiscordBuilder(args[1], args[2]).build().login();
				player.addChatMessage(new ChatComponentTranslation("Login successful!"));
			} catch (NoLoginDetailsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BadUsernamePasswordException e) {
				player.addChatMessage(new ChatComponentTranslation("Invalid Username or Password"));
			} catch (DiscordFailedToConnectException e) {
				player.addChatMessage(new ChatComponentTranslation("Unable to connect to the discord API"));
			}
		} else {
			player.addChatMessage(new ChatComponentTranslation("Wrong command-usage"));
		}
		
	}
	
	public void logout() {
		api.stop();
	}
	
	public void waitForUserData() {
		EventManager manager = api.getEventManager();
		manager.registerListener(null);
	}*/
	
}
