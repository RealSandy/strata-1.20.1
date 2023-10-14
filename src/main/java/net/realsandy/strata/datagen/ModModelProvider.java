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
        itemModelGenerator.register(ModItems.AEROLITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.AEROLITE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.AEROLITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AEROLITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AEROLITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AEROLITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AEROLITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TRUE_AEROLITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TRUE_AEROLITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TRUE_AEROLITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TRUE_AEROLITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TRUE_AEROLITE_HOE, Models.HANDHELD);

        //itemModelGenerator.register(ModItems.exampleTool, Models.HANDHELD);

        //itemModelGenerator.registerArmor((ArmorItem) ModItems.exampleArmor);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AEROLITE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AEROLITE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AEROLITE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AEROLITE_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.TRUE_AEROLITE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TRUE_AEROLITE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TRUE_AEROLITE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TRUE_AEROLITE_BOOTS);

    }
}
