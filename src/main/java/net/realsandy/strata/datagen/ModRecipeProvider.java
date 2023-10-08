package net.realsandy.strata.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE, 1)
        //        .pattern("   ")
        //        .pattern("   ")
        //        .pattern("   ")
        //        .input('', ModItems.moddedItem)
        //        .input('', Items.vanillaItem)
        //        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
        //        .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
        //        .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_PICKAXE)));
    }
}
