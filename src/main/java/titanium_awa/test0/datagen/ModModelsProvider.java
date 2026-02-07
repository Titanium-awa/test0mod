package titanium_awa.test0.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import titanium_awa.test0.block.ModBlocks;
import titanium_awa.test0.item.ModItems;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_INGOT_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BALL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BALL, Models.GENERATED);
    }
}
