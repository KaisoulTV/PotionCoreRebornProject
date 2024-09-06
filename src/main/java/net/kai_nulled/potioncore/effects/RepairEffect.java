package net.kai_nulled.potioncore.effects;

import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class RepairEffect extends MobEffect {
    public RepairEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyEffectTick(@NotNull LivingEntity pLivingEntity, int pAmplifier) {
        ItemStack hand = pLivingEntity.getMainHandItem();
        ItemStack head = pLivingEntity.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack body = pLivingEntity.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack leg = pLivingEntity.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack foot = pLivingEntity.getItemBySlot(EquipmentSlot.FEET);
        if(hand.isDamaged()) hand.setDamageValue(hand.getDamageValue()-Mth.clamp(pAmplifier-20,1,256));
        if(body.isDamaged()) body.setDamageValue(body.getDamageValue()-Mth.clamp(pAmplifier-20,1,256));
        if(leg.isDamaged()) leg.setDamageValue(leg.getDamageValue()-Mth.clamp(pAmplifier-20,1,256));
        if(foot.isDamaged()) foot.setDamageValue(foot.getDamageValue()-Mth.clamp(pAmplifier-20,1,256));
        if(head.isDamaged()) head.setDamageValue(head.getDamageValue()-Mth.clamp(pAmplifier-20,1,256));
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return pDuration % Mth.clamp(40 / (pAmplifier + 1), 1, 40) == 0;
    }
}
