package mod.microbiology.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingRecipes {
	
	public CraftingRecipes() {
		
	}
	
	public void initRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.cottonBud), new Object[] {" # ", " I ", " # ", '#', Blocks.wool, 'I', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.petriDish), new Object[] {"   ", "# #","###",'#',Blocks.glass});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sample), new ItemStack(ModItems.cottonBud), new ItemStack(ModItems.petriDish));
	}

}
