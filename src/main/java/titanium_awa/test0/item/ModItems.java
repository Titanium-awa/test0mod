package titanium_awa.test0.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import titanium_awa.test0.Test0;

public class ModItems {
    public static final Item BALL = registerItems("ball", new Item(new Item.Settings()));

    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Test0.MOD_ID, id), item);
    }
    public static void registerModItems(){
        Test0.LOGGER.info("Registering Items");
    }
}
