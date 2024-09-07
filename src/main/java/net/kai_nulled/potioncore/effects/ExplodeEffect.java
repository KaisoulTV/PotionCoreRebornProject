package net.kai_nulled.potioncore.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ExplodeEffect extends MobEffect {
    public ExplodeEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public void applyInstantenousEffect(@Nullable Entity pSource, @Nullable Entity pIndirectSource, LivingEntity pLivingEntity, int pAmplifier, double pHealth) {
        pLivingEntity.level().explode(pLivingEntity,pLivingEntity.getX(),pLivingEntity.getY(),pLivingEntity.getZ(),pAmplifier+2,true, Level.ExplosionInteraction.TNT);
        pLivingEntity.kill();
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
