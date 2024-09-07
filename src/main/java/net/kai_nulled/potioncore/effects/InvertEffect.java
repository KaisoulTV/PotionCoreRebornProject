package net.kai_nulled.potioncore.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class InvertEffect extends MobEffect {
    public InvertEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean isInstantenous() {
        return true;
    }


    private static void invertPotion(LivingEntity entity, MobEffect mb1, MobEffect mb2) {
        if(entity==null) return;
        MobEffectInstance eff = entity.getEffect(mb1);
        MobEffectInstance eff1 = entity.getEffect(mb2);
        if(eff!=null&&eff1!=null) {
            int dur1= eff.getDuration();
            int dur2= eff1.getDuration();
            int amp1= eff.getAmplifier();
            int amp2= eff1.getAmplifier();
            entity.removeEffect(mb1); entity.removeEffect(mb2);
            if(!entity.level().isClientSide()) entity.addEffect(new MobEffectInstance(mb1,dur2,amp2));
            if(!entity.level().isClientSide()) entity.addEffect(new MobEffectInstance(mb2,dur1,amp1));
        } else {
            if(eff!=null) {
                int dur1= eff.getDuration();
                int amp1= eff.getAmplifier();
                entity.removeEffect(mb1);
                if(!entity.level().isClientSide()) entity.addEffect(new MobEffectInstance(mb2,dur1,amp1));
            } else if(eff1 != null) {
                int dur2= eff1.getDuration();
                int amp2= eff1.getAmplifier();
                entity.removeEffect(mb2);
                if(!entity.level().isClientSide()) entity.addEffect(new MobEffectInstance(mb1,dur2,amp2));
            }
        }
    }

    @Override
    public void applyInstantenousEffect(@Nullable Entity pSource, @Nullable Entity pIndirectSource, LivingEntity entity, int pAmplifier, double pHealth) {
        invertPotion(entity, MobEffects.POISON,ModEffects.ANTIDOTE.get());
        invertPotion(entity, MobEffects.WITHER,ModEffects.PURITY.get());
        invertPotion(entity, MobEffects.JUMP,ModEffects.WEIGHT.get());
        invertPotion(entity, MobEffects.DAMAGE_RESISTANCE,ModEffects.VULNERABLE.get());
        invertPotion(entity, MobEffects.WATER_BREATHING,ModEffects.DROWN.get());
        invertPotion(entity, MobEffects.FIRE_RESISTANCE,ModEffects.FIRE.get());
        invertPotion(entity, ModEffects.KLUTZ.get(),ModEffects.TRUE_SHOT.get());
        invertPotion(entity, ModEffects.MAGIC_FOCUS.get(),ModEffects.MAGIC_INHIBITION.get());
        invertPotion(entity, ModEffects.BROKEN_ARMOR.get(),ModEffects.IRON_SKIN.get());
        invertPotion(entity, ModEffects.BROKEN_MAGIC_SHIELD.get(),ModEffects.MAGIC_SHIELD.get());
        invertPotion(entity, ModEffects.CURE.get(),ModEffects.DISPEL.get());
        invertPotion(entity, ModEffects.BLESS.get(),ModEffects.CURSE.get());
        invertPotion(entity, ModEffects.REPAIR.get(),ModEffects.RUST.get());
        invertPotion(entity, MobEffects.SATURATION,MobEffects.HUNGER);
        invertPotion(entity, MobEffects.UNLUCK,MobEffects.LUCK);
        invertPotion(entity, MobEffects.DIG_SPEED,MobEffects.DIG_SLOWDOWN);
        invertPotion(entity, MobEffects.BAD_OMEN,MobEffects.HERO_OF_THE_VILLAGE);
        invertPotion(entity, MobEffects.MOVEMENT_SPEED,MobEffects.MOVEMENT_SLOWDOWN);
        invertPotion(entity, MobEffects.NIGHT_VISION,MobEffects.DARKNESS);
        invertPotion(entity, MobEffects.GLOWING,MobEffects.INVISIBILITY);
        invertPotion(entity, MobEffects.DAMAGE_BOOST,MobEffects.WEAKNESS);
        invertPotion(entity, MobEffects.SLOW_FALLING,MobEffects.LEVITATION);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
