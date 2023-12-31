package net.realsandy.strata.item.custom;

import com.google.common.collect.ImmutableMap;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.realsandy.strata.item.ModArmorMaterials;
import org.jetbrains.annotations.Nullable;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>())
                    .put(ModArmorMaterials.AEROLITE, new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1, 0,
                            false, false, false))
                    .put(ModArmorMaterials.TRUE_AEROLITE, new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1, 0,
                            false, false, false)).build();

    public ModArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

        if(!world.isClient()) {
            if(entity instanceof PlayerEntity player && hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            StatusEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                if (mapArmorMaterial == ModArmorMaterials.AEROLITE || mapArmorMaterial == ModArmorMaterials.TRUE_AEROLITE) {
                    if (!player.isSneaking()) {
                        addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
                    } else {
                        break;
                    }
                }

                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, ArmorMaterial mapArmorMaterial, StatusEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasStatusEffect(mapStatusEffect.getEffectType());

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addStatusEffect(new StatusEffectInstance(mapStatusEffect));
        }
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack breastplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, PlayerEntity player) {
        for (ItemStack armorStack: player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmorStack(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmorStack(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(material == ModArmorMaterials.AEROLITE || material == ModArmorMaterials.TRUE_AEROLITE) {

            tooltip.add(Text.translatable("tooltip.strata.aerolite_armor.tooltip_quote_line_1").formatted(Formatting.ITALIC, Formatting.YELLOW));
            tooltip.add(Text.translatable("tooltip.strata.aerolite_armor.tooltip_quote_line_2").formatted(Formatting.ITALIC, Formatting.YELLOW));
            tooltip.add(Text.translatable("tooltip.strata.blank_line"));

            tooltip.add(Text.translatable("tooltip.strata.aerolite_armor.tooltip_explanation_line_1").formatted(Formatting.GOLD));
            tooltip.add(Text.translatable("tooltip.strata.aerolite_armor.tooltip_explanation_line_2").formatted(Formatting.GOLD));
            tooltip.add(Text.translatable("tooltip.strata.aerolite_armor.tooltip_total_equipped"));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}

