package titanium_awa.test0.block;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import titanium_awa.test0.Test0;

public class ModBlocks {
    public static Block register(String id, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Test0.MOD_ID, id), block);
    }
}
