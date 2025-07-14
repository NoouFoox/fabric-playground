package fox.dvd.item;

import fox.dvd.Dvd;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModeItems {
    public static final Item DONKEY_MEAT = registerItems("donkey_meat", new Item(new Item.Settings()));

    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Dvd.MOD_ID, id), item);
    }
    public static void registerModItems() {
        Dvd.LOGGER.info("Registering Mod Items for " + Dvd.MOD_ID);
    }

}
