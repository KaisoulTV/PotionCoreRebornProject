package net.kai_nulled.potioncore.effects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class SpinEffect extends MobEffect {
    public SpinEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int pAmplifier) {
        entity.setYRot(entity.getYRot() + (pAmplifier + 1) * 3);
        entity.setXRot(entity.getXRot());
        entity.setYBodyRot(entity.getYRot());
        entity.setYHeadRot(entity.getYRot());
        entity.yRotO = entity.getYRot();
        entity.xRotO = entity.getXRot();
        entity.yBodyRotO = entity.getYRot();
        entity.yHeadRotO = entity.getYRot();
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
