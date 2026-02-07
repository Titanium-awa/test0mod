package titanium_awa.test0;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import titanium_awa.test0.block.ModBlocks;
import titanium_awa.test0.datagen.*;

public class Test0DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagsProvider::new);
//        pack.addProvider(ModItemTagsProvider::new);
        pack.addProvider(ModENUSLanProvider::new);
        pack.addProvider(ModLootTable::new);
        pack.addProvider(ModModelsProvider::new);
        pack.addProvider(ModRecipeProvider::new);
    }
}
