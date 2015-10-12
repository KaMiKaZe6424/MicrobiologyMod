package mod.microbiology.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import mod.microbiology.items.ItemCottonBud;
import mod.microbiology.items.ItemPetriDish;
import mod.microbiology.items.ItemSample;
import mod.microbiology.items.ItemSampleApplied;
import net.minecraft.item.Item;

public class ModItems {
	
	public ModItems() {
		
	}
	
	public static Item sample;
	public static Item sampleApplied;
	public static Item cottonBud;
	public static Item petriDish;
	
	public void initItems() {
		sample = new ItemSample();
		sampleApplied = new ItemSampleApplied();
		cottonBud = new ItemCottonBud();
		petriDish = new ItemPetriDish();
	}
	
	public void registerItems() {
		GameRegistry.registerItem(sample, "Sample");
		GameRegistry.registerItem(sampleApplied, "Sample Applied");
		GameRegistry.registerItem(cottonBud, "Cotton Bud");
		GameRegistry.registerItem(petriDish, "Petri Dish");
	}

}
