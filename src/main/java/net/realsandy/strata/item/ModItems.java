package net.realsandy.strata.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.realsandy.strata.Strata;
import net.realsandy.strata.item.custom.ModArmorItem;

import java.util.List;

public class ModItems {
    //public static final Item item = registerItem("item_id", new Item(new FabricItemSettings()));
    public static final Item AEROLITE_INGOT = registerItem("aerolite_ingot", new Item(new FabricItemSettings()));

    public static final Item AEROLITE_UPGRADE_SMITHING_TEMPLATE = registerItem("aerolite_upgrade_smithing_template",
            createAeroliteUpgrade());

    public static final Item AEROLITE_SWORD = registerItem("aerolite_sword",
            new SwordItem(ModToolMaterial.AEROLITE, 2, 2f, new FabricItemSettings()));
    public static final Item AEROLITE_PICKAXE = registerItem("aerolite_pickaxe",
            new PickaxeItem(ModToolMaterial.AEROLITE, 8, 2f, new FabricItemSettings()));
    public static final Item AEROLITE_AXE = registerItem("aerolite_axe",
            new AxeItem(ModToolMaterial.AEROLITE, 10, 1f, new FabricItemSettings()));
    public static final Item AEROLITE_SHOVEL = registerItem("aerolite_shovel",
            new ShovelItem(ModToolMaterial.AEROLITE, 2, 2f, new FabricItemSettings()));
    public static final Item AEROLITE_HOE = registerItem("aerolite_hoe",
            new HoeItem(ModToolMaterial.AEROLITE, 0, 0f, new FabricItemSettings()));

    public static final Item TRUE_AEROLITE_SWORD = registerItem("true_aerolite_sword",
            new SwordItem(ModToolMaterial.TRUE_AEROLITE, 2, 2f, new FabricItemSettings()));
    public static final Item TRUE_AEROLITE_PICKAXE = registerItem("true_aerolite_pickaxe",
            new PickaxeItem(ModToolMaterial.TRUE_AEROLITE, 10, 2f, new FabricItemSettings()));
    public static final Item TRUE_AEROLITE_AXE = registerItem("true_aerolite_axe",
            new AxeItem(ModToolMaterial.TRUE_AEROLITE, 12, 1f, new FabricItemSettings()));
    public static final Item TRUE_AEROLITE_SHOVEL = registerItem("true_aerolite_shovel",
            new ShovelItem(ModToolMaterial.TRUE_AEROLITE, 2, 2f, new FabricItemSettings()));
    public static final Item TRUE_AEROLITE_HOE = registerItem("true_aerolite_hoe",
            new HoeItem(ModToolMaterial.TRUE_AEROLITE, 0, 0f, new FabricItemSettings()));

    public static final Item AEROLITE_HELMET = registerItem("aerolite_helmet",
            new ModArmorItem(ModArmorMaterials.AEROLITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AEROLITE_CHESTPLATE = registerItem("aerolite_chestplate",
            new ModArmorItem(ModArmorMaterials.AEROLITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AEROLITE_LEGGINGS = registerItem("aerolite_leggings",
            new ModArmorItem(ModArmorMaterials.AEROLITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AEROLITE_BOOTS = registerItem("aerolite_boots",
            new ModArmorItem(ModArmorMaterials.AEROLITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item TRUE_AEROLITE_HELMET = registerItem("true_aerolite_helmet",
            new ModArmorItem(ModArmorMaterials.TRUE_AEROLITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TRUE_AEROLITE_CHESTPLATE = registerItem("true_aerolite_chestplate",
            new ModArmorItem(ModArmorMaterials.TRUE_AEROLITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TRUE_AEROLITE_LEGGINGS = registerItem("true_aerolite_leggings",
            new ModArmorItem(ModArmorMaterials.TRUE_AEROLITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TRUE_AEROLITE_BOOTS = registerItem("true_aerolite_boots",
            new ModArmorItem(ModArmorMaterials.TRUE_AEROLITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Strata.MOD_ID, name), item);
    }

    private static Item createAeroliteUpgrade() {
        return new SmithingTemplateItem(
                Text.translatable("upgrade.strata.aerolite.applies_to").formatted(Formatting.BLUE),
                Text.translatable("upgrade.strata.aerolite.ingredients").formatted(Formatting.BLUE),
                Text.translatable("upgrade.strata.aerolite").formatted(Formatting.GRAY),
                Text.translatable("upgrade.strata.aerolite.base_slot_text"),
                Text.translatable("upgrade.strata.aerolite.additions_slot_text"),
                getAeroliteUpgradeEmptyBaseSlotTextures(),
                getAeroliteUpgradeEmptyAdditionsSlotTextures()
        );
    }

    private static List<Identifier> getAeroliteUpgradeEmptyBaseSlotTextures() {
        return List.of(
                new Identifier("minecraft", "item/empty_armor_slot_helmet"),
                new Identifier("minecraft", "item/empty_armor_slot_chestplate"),
                new Identifier("minecraft", "item/empty_armor_slot_leggings"),
                new Identifier("minecraft", "item/empty_armor_slot_boots"),
                new Identifier("minecraft", "item/empty_slot_sword"),
                new Identifier("minecraft", "item/empty_slot_axe"),
                new Identifier("minecraft", "item/empty_slot_pickaxe"),
                new Identifier("minecraft", "item/empty_slot_shovel"),
                new Identifier("minecraft", "item/empty_slot_hoe")
        );
    }

    private static List<Identifier> getAeroliteUpgradeEmptyAdditionsSlotTextures() {
        return List.of(
                new Identifier("minecraft", "item/empty_slot_ingot")
        );
    }

    public static void registerModItems() {
        Strata.LOGGER.info("Registering mod items for" + Strata.MOD_ID);
    }
}
