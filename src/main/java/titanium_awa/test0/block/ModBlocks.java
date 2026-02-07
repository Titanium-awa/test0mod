package titanium_awa.test0.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import titanium_awa.test0.Test0;


public class ModBlocks {
    public static final Block TEST_BLOCK = new Block(AbstractBlock.Settings.create().strength(2.5f, 2.5f));
    public static final Block TEST_ORE = new Block(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 3.0f));

    public static void registerModBlocks() {
        Test0.LOGGER.info("Registering ModBlocks for " + Test0.MOD_ID);

        // 先注册方块
        Registry.register(Registries.BLOCK, Identifier.of(Test0.MOD_ID, "test_block"), TEST_BLOCK);
        Registry.register(Registries.BLOCK, Identifier.of(Test0.MOD_ID, "test_ore"), TEST_ORE);

        // 然后注册对应的物品
        Registry.register(Registries.ITEM, Identifier.of(Test0.MOD_ID, "test_block"),
                new BlockItem(TEST_BLOCK, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.of(Test0.MOD_ID, "test_ore"),
                new BlockItem(TEST_ORE, new Item.Settings()));
    }
}