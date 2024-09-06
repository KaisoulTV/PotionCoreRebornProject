package net.kai_nulled.potioncore.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.levelgen.Heightmap;

import javax.annotation.Nullable;

public class SurfaceTeleportEffect extends MobEffect {
    public SurfaceTeleportEffect(MobEffectCategory category, int color) {
        super(category, color);
    }
    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public void applyInstantenousEffect(@Nullable Entity pSource, @Nullable Entity pIndirectSource, LivingEntity pLivingEntity, int pAmplifier, double pHealth) {
        double rnx = pLivingEntity.getX();
        double rnz = pLivingEntity.getZ();
        double rny = pLivingEntity.level().getHeight(Heightmap.Types.WORLD_SURFACE,(int) rnx,(int) rnz);
        pLivingEntity.teleportTo(rnx,rny,rnz);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
