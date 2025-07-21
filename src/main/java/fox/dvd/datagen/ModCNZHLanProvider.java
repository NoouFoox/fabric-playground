package fox.dvd.datagen;

import fox.dvd.block.ModBlocks;
import fox.dvd.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModCNZHLanProvider extends FabricLanguageProvider {
    protected ModCNZHLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

//        group
        translationBuilder.add("itemGroup.dvd.group", "过量进食");
//        Item
        translationBuilder.add(ModItems.MEN_ZI, "焖子");
        translationBuilder.add(ModBlocks.MEN_ZI_BLOCK, "驴肉焖子");
        translationBuilder.add(ModItems.DONKEY_MEAT, "驴肉");
        translationBuilder.add(ModItems.COOKED_DONKEY_MEAT, "熟驴肉");
    }
}
