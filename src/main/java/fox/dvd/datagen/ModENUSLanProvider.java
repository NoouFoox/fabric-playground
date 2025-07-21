package fox.dvd.datagen;

import fox.dvd.block.ModBlocks;
import fox.dvd.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    protected ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
//        group
        translationBuilder.add("itemGroup.dvd.group", "Excessive eating");
//        item
        translationBuilder.add(ModItems.MEN_ZI,"Men Zi");
        translationBuilder.add(ModBlocks.MEN_ZI_BLOCK,"Lu Rou Men Zi Block");
        translationBuilder.add(ModItems.DONKEY_MEAT,"Donkey Meat");
        translationBuilder.add(ModItems.COOKED_DONKEY_MEAT,"Cooked Donkey Meat");
    }
}
