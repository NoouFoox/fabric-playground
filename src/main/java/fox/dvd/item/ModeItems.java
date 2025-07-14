package fox.dvd.item;

import fox.dvd.Dvd;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModeItems {
    public static final Item DONKEY_MEAT = registerItems("donkey_meat", Item::new, new Item.Settings());

    public static Item registerItems(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Dvd.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }

    public static void initialize() {
        Dvd.LOGGER.info("Registering Mod Items for " + Dvd.MOD_ID);
    }
}
