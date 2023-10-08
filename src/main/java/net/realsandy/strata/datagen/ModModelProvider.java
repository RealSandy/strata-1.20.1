package net.realsandy.strata.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.realsandy.strata.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //BlockStateModelGenerator.BlockTexturePool examplePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.exampleBlock);

        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.exampleBlock);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.exampleItem, Models.GENERATED);
        itemModelGenerator.register(ModItems.AEROLITE_PLATING, Models.GENERATED);

        //itemModelGenerator.register(ModItems.exampleTool, Models.HANDHELD);

        //itemModelGenerator.registerArmor((ArmorItem) ModItems.exampleArmor);

    }
}
