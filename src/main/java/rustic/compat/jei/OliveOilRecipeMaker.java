package rustic.compat.jei;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class OliveOilRecipeMaker {

	public static List<OliveOilRecipeWrapper> getOliveOilRecipes() {
		List<OliveOilRecipeWrapper> recipes = new ArrayList<OliveOilRecipeWrapper>();
		for (Item item : GameRegistry.findRegistry(Item.class).getValues()) {
			if (item instanceof ItemFood) {
				OliveOilRecipeWrapper recipe = new OliveOilRecipeWrapper(item);
				recipes.add(recipe);
			}
		}
		return recipes;
	}

	private OliveOilRecipeMaker() {

	}
	
}
