package net.kai_nulled.potioncore.effects;

import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class DrownEffect extends MobEffect {
    public DrownEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(pLivingEntity.isUnderWater()) {
            if (pLivingEntity.getAirSupply() < pLivingEntity.getMaxAirSupply()) {
                pLivingEntity.setAirSupply(Mth.clamp(pLivingEntity.getAirSupply() + 2 * (pAmplifier+1), 0, pLivingEntity.getMaxAirSupply() - pLivingEntity.getAirSupply()));
            }
        } else {
            pLivingEntity.setAirSupply(pLivingEntity.getAirSupply() - 5*(pAmplifier+1));
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
