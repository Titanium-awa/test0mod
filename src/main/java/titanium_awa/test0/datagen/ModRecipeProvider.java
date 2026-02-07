package titanium_awa.test0.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import titanium_awa.test0.Test0;
import titanium_awa.test0.block.ModBlocks;
import titanium_awa.test0.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> BALL = List.of(ModItems.RAW_BALL, ModBlocks.TEST_ORE);

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.BALL,
                RecipeCategory.MISC, ModBlocks.TEST_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.BALL_INGOT,
                RecipeCategory.MISC, ModBlocks.TEST_INGOT_BLOCK);

        offerSmelting(exporter, BALL, RecipeCategory.MISC, ModItems.BALL, 0.7f, 200, "ball");
        offerBlasting(exporter, BALL, RecipeCategory.MISC, ModItems.BALL, 1.4f, 100, "ball");

        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new, 600, ModItems.RAW_BALL, ModItems.BALL, 0.35f);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BALL_INGOT, 1)
                .pattern(" # ")
                .pattern("###")
                .pattern(" # ")
                .input('#', Ingredient.ofItems(ModItems.BALL))
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BALL))
                .offerTo(exporter, Identifier.of(Test0.MOD_ID, "ball_ingot_from_ball"));
    }
}
