package titanium_awa.test0.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import titanium_awa.test0.Test0;
import titanium_awa.test0.block.ModBlocks;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> TEST0_GROUP = register("test0_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(Test0.MOD_ID, id));
    }

    public static void registerModItemGroups() {
        Registry.register(Registries.ITEM_GROUP, TEST0_GROUP,
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(ModItems.BALL))
                        .displayName(Text.translatable("itemGroup.test0_group"))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.BALL);
                            entries.add(ModItems.RAW_BALL);
                            entries.add(ModItems.BALL_INGOT);

                            entries.add(ModBlocks.TEST_BLOCK);
                            entries.add(ModBlocks.TEST_ORE);
                            entries.add(ModBlocks.TEST_INGOT_BLOCK);
                        })
                        .build());
        Test0.LOGGER.info("Registering Item Groups");
    }
}
