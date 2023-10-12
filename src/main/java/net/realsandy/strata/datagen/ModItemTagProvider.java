package net.realsandy.strata.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.realsandy.strata.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.AEROLITE_HELMET)
                .add(ModItems.AEROLITE_CHESTPLATE)
                .add(ModItems.AEROLITE_LEGGINGS)
                .add(ModItems.AEROLITE_BOOTS)
                .add(ModItems.TRUE_AEROLITE_HELMET)
                .add(ModItems.TRUE_AEROLITE_CHESTPLATE)
                .add(ModItems.TRUE_AEROLITE_LEGGINGS)
                .add(ModItems.TRUE_AEROLITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.AEROLITE_UPGRADE_SMITHING_TEMPLATE);
    }
}
