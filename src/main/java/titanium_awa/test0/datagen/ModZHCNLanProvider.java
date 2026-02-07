package titanium_awa.test0.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import titanium_awa.test0.block.ModBlocks;
import titanium_awa.test0.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider {
    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.BALL, "球");
        translationBuilder.add(ModItems.RAW_BALL, "原始球");
        translationBuilder.add(ModItems.BALL_INGOT, "球锭");
        translationBuilder.add(ModItems.TEST_APPLE, "测试苹果");
        translationBuilder.add(ModItems.ULTIMATE_APPLE, "终级苹果");

        translationBuilder.add(ModBlocks.TEST_BLOCK, "测试方块");
        translationBuilder.add(ModBlocks.TEST_ORE, "测试矿石");
        translationBuilder.add(ModBlocks.TEST_INGOT_BLOCK, "测试锭块");

        translationBuilder.add("itemGroup.test0_group", "Test0 模组物品");
    }
}
