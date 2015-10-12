package mod.microbiology.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingRecipes {
	
	public CraftingRecipes() {
		
	}
	
	public void initRecipes() {
		GameRegistry.addRecipe(new ItemStack(ModItems.cottonBud), new Object[] {" # ", " I ", " # ", '#', Blocks.wool, 'I', Items.stick});
	}

}
