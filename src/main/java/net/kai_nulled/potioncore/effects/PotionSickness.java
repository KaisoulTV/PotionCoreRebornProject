package net.kai_nulled.potioncore.effects;

import net.kai_nulled.potioncore.procedures.ModGlobalVars;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;

public class PotionSickness extends MobEffect {
    public PotionSickness(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        int rnd= Mth.nextInt(RandomSource.create(),0, ModGlobalVars.bpotionList.size()-1);
        pLivingEntity.addEffect(new MobEffectInstance(ModGlobalVars.bpotionList.get(rnd),Mth.nextInt(RandomSource.create(),360,3600),pAmplifier));
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return pDuration%360==0;
    }
}
