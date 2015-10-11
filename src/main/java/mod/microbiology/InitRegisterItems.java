package mod.microbiology;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.microbiology.items.ItemSample;
import mod.microbiology.items.ItemSampleApplied;
import net.minecraft.item.Item;

public class InitRegisterItems {
	
	public InitRegisterItems() {
		
	}
	
	Item sample;
	Item sampleApplied;
	
	public void initItems() {
		sample = new ItemSample();
		sampleApplied = new ItemSampleApplied();
	}
	
	public void registerItems() {
		GameRegistry.registerItem(sample, "Sample");
		GameRegistry.registerItem(sampleApplied, "Sample Applied");
	}

}
