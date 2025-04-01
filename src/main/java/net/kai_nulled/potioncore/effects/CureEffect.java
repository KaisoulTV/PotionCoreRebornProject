package net.kai_nulled.potioncore.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CureEffect extends MobEffect {
    public CureEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public void applyInstantenousEffect(@Nullable Entity pSource, @Nullable Entity pIndirectSource, LivingEntity pLivingEntity, int pAmplifier, double pHealth) {
        Collection<MobEffectInstance> effects = pLivingEntity.getActiveEffects();
        ArrayList<MobEffect> toRev = new ArrayList<MobEffect>();
	    for (MobEffectInstance eff : effects) if (!eff.getEffect().isBeneficial()) toRev.add(eff.getEffect());
        for(MobEffect i:toRev) pLivingEntity.removeEffect(i);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
