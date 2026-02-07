package titanium_awa.test0.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import titanium_awa.test0.block.ModBlocks;
import titanium_awa.test0.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.BALL, "Ball");
        translationBuilder.add(ModItems.RAW_BALL, "Raw Ball");
        translationBuilder.add(ModItems.BALL_INGOT, "Ball Ingot");
        translationBuilder.add(ModItems.TEST_APPLE, "Test Apple");
        translationBuilder.add(ModItems.ULTIMATE_APPLE, "Ultimate Apple");

        translationBuilder.add(ModBlocks.TEST_BLOCK, "Test Block");
        translationBuilder.add(ModBlocks.TEST_ORE, "Test Ore");
        translationBuilder.add(ModBlocks.TEST_INGOT_BLOCK, "Test Ingot Block");

        translationBuilder.add("itemGroup.test0_group", "Test0 Mod Items");
    }
}
