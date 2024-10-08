package net.kai_nulled.potioncore.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class ClimbEffect extends MobEffect {
    public ClimbEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyEffectTick(@NotNull LivingEntity entity, int pAmplifier) {
        if (entity.horizontalCollision) {
            if (entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D) {
                entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.25, (entity.getDeltaMovement().z())));
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
