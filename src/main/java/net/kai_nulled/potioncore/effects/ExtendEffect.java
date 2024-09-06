package net.kai_nulled.potioncore.effects;

import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;

public class ExtendEffect extends MobEffect {
    public ExtendEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(!pLivingEntity.getActiveEffects().isEmpty()) {
            int rnd = Mth.nextInt(RandomSource.create(),0,pLivingEntity.getActiveEffects().size()-1);
            MobEffectInstance mbi=(MobEffectInstance) pLivingEntity.getActiveEffects().toArray()[rnd];
            mbi.update(new MobEffectInstance(mbi.getEffect(),mbi.getDuration()*2,mbi.getAmplifier()));
            mbi.applyEffect(pLivingEntity);
            pLivingEntity.removeEffect(ModEffects.EXTEND.get());
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
