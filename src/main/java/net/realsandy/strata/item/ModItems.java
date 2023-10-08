package net.realsandy.strata.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.realsandy.strata.Strata;

public class ModItems {
    //public static final Item item = registerItem("item_id", new Item(new FabricItemSettings()));
    public static final Item AEROLITE_PLATING = registerItem("aerolite_plating", new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Strata.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Strata.LOGGER.info("Registering mod items for" + Strata.MOD_ID);
    }
}
