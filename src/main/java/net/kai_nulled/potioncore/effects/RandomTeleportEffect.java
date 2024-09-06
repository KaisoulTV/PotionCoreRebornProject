package net.kai_nulled.potioncore.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

public class RandomTeleportEffect extends MobEffect {
    public RandomTeleportEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public void applyInstantenousEffect(@Nullable Entity pSource, @Nullable Entity pIndirectSource, LivingEntity pLivingEntity, int pAmplifier, double pHealth) {
        double rnx = pLivingEntity.getRandomX(10*pAmplifier);
        double rnz = pLivingEntity.getRandomZ(10*pAmplifier);
        double rny = pLivingEntity.getRandomY();
        pLivingEntity.teleportTo(rnx,rny,rnz);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
