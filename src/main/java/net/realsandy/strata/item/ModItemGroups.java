package net.realsandy.strata.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.realsandy.strata.Strata;

public class ModItemGroups {
    //public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
    //        new Identifier(Strata.MOD_ID, "id"),
    //        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.id"))
    //                .icon(() -> new ItemStack(ModItems.item)).entries((displayContext, entries) -> {
    //                    entries.add(ModItems.item);
    //
    //                }).build());
    public static final ItemGroup STRATA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Strata.MOD_ID, "strata_group"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.strata_group"))
                   .icon(() -> new ItemStack(ModItems.AEROLITE_INGOT)).entries((displayContext, entries) -> {
                       entries.add(ModItems.AEROLITE_INGOT);
                       entries.add(ModItems.AEROLITE_UPGRADE_SMITHING_TEMPLATE);
                       entries.add(ModItems.AEROLITE_HELMET);
                       entries.add(ModItems.AEROLITE_CHESTPLATE);
                       entries.add(ModItems.AEROLITE_LEGGINGS);
                       entries.add(ModItems.AEROLITE_BOOTS);
                       entries.add(ModItems.TRUE_AEROLITE_HELMET);
                       entries.add(ModItems.TRUE_AEROLITE_CHESTPLATE);
                       entries.add(ModItems.TRUE_AEROLITE_LEGGINGS);
                       entries.add(ModItems.TRUE_AEROLITE_BOOTS);
                       entries.add(ModItems.AEROLITE_SWORD);
                       entries.add(ModItems.AEROLITE_PICKAXE);
                       entries.add(ModItems.AEROLITE_AXE);
                       entries.add(ModItems.AEROLITE_SHOVEL);
                       entries.add(ModItems.AEROLITE_HOE);
                       entries.add(ModItems.TRUE_AEROLITE_SWORD);
                       entries.add(ModItems.TRUE_AEROLITE_PICKAXE);
                       entries.add(ModItems.TRUE_AEROLITE_AXE);
                       entries.add(ModItems.TRUE_AEROLITE_SHOVEL);
                       entries.add(ModItems.TRUE_AEROLITE_HOE);


                    }).build());

    public static void registerItemGroups() {
        Strata.LOGGER.info("Registering item groups for " + Strata.MOD_ID);
    }
}
