package net.kai_nulled.potioncore.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class BurstEffect extends MobEffect {
    public BurstEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public void applyInstantenousEffect(@Nullable Entity pSource, @Nullable Entity pIndirectSource, LivingEntity pLivingEntity, int pAmplifier, double pHealth) {
        boolean kkk = pLivingEntity.isInvulnerable();
        pLivingEntity.setInvulnerable(true);
        pLivingEntity.level().explode(pLivingEntity,pLivingEntity.getX(),pLivingEntity.getY(),pLivingEntity.getZ(),pAmplifier+3,true, Level.ExplosionInteraction.NONE);
        pLivingEntity.setInvulnerable(kkk);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
