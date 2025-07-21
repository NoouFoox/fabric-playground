package fox.dvd.datagen;

import fox.dvd.block.ModBlocks;
import fox.dvd.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MEN_ZI_BLOCK);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DONKEY_MEAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_DONKEY_MEAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEN_ZI, Models.GENERATED);

    }
}
