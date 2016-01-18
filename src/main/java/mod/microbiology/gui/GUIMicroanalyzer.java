package mod.microbiology.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class GUIMicroanalyzer extends GuiScreen {

	public static final int ID = 0;
	
	@Override
	public void drawScreen(int x, int y, float p_73863_3_) {
		drawDefaultBackground();
		this.drawCenteredString(Minecraft.getMinecraft().fontRenderer, "Placeholder GUI", 100, 100, 100);
		super.drawScreen(x, y, p_73863_3_);
	}
	
}
