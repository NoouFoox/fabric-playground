package fox.dvd.item;

import fox.dvd.Dvd;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static FoodComponent DONKEY_MEAT_EAT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final Item DONKEY_MEAT = registerItems("donkey_meat", Item::new, new Item.Settings().food(DONKEY_MEAT_EAT));

    public static Item registerItems(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Dvd.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }
    //    加到原版物品栏里
    public static void addItemToGroup(FabricItemGroupEntries entries){
        entries.add(DONKEY_MEAT);
    }
    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToGroup);
        Dvd.LOGGER.info("Registering Mod Items for " + Dvd.MOD_ID);
    }
}

