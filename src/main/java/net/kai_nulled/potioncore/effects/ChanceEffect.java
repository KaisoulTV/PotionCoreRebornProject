package net.kai_nulled.potioncore.effects;

import net.kai_nulled.potioncore.procedures.ModGlobalVars;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

public class ChanceEffect extends MobEffect {
    public ChanceEffect(MobEffectCategory category, int color) {
        super(category, color);
    }
    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public void applyInstantenousEffect(@Nullable Entity pSource, @Nullable Entity pIndirectSource, LivingEntity pLivingEntity, int pAmplifier, double pHealth) {
        int rnd = Mth.nextInt(RandomSource.create(),0, ModGlobalVars.potionList.size()-1);
        pLivingEntity.addEffect(new MobEffectInstance(ModGlobalVars.potionList.get(rnd),3600*(pAmplifier+1),pAmplifier));
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
