package fox.dvd.item;

import fox.dvd.Dvd;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DVD_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Dvd.MOD_ID, "dvd_group"),
            ItemGroup.create(null, -1)
                    .displayName(Text.translatable("itemGroup.dvd.group"))
                    .icon(() -> new ItemStack(ModItems.DONKEY_MEAT))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DONKEY_MEAT);
                        entries.add(Blocks.TNT);
                        entries.add(Items.DIAMOND);
                    })
                    .build()
    );
    public static void initialize() {
        Dvd.LOGGER.info("Registering Item Groups for " + Dvd.MOD_ID);
    }
}


//    public static final RegistryKey<ItemGroup> DVD_GROUP = register("dvd_group");
//
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(Dvd.MOD_ID, id));
//    }
//
//    public static void registerItemGroups() {
//        Registry.register(
//                Registries.ITEM_GROUP, DVD_GROUP,
//                ItemGroup.create(
//                                ItemGroup.Row.TOP,
//                                7)
//                        .displayName(Text.translatable("itemGroup.dvd.group"))
//                        .icon(() -> new ItemStack(ModItems.DONKEY_MEAT))
//                        .entries((displayContext, entries) -> {
//                            entries.add(ModItems.DONKEY_MEAT);
//                        }).build());
//        Dvd.LOGGER.info("Registering Item Groups for " + Dvd.MOD_ID);
//
//    }