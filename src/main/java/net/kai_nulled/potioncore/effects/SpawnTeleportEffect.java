package net.kai_nulled.potioncore.effects;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

public class SpawnTeleportEffect extends MobEffect {
    public SpawnTeleportEffect(MobEffectCategory category, int color) {
        super(category, color);
    }
    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public void applyInstantenousEffect(@Nullable Entity pSource, @Nullable Entity pIndirectSource, LivingEntity pLivingEntity, int pAmplifier, double pHealth) {
        if(pLivingEntity instanceof ServerPlayer p) {
            if(p.getRespawnDimension().equals(p.level().dimension()) && p.getRespawnPosition()!=null) p.teleportTo(p.getRespawnPosition().getX(),p.getRespawnPosition().getY(),p.getRespawnPosition().getZ());
            else p.teleportTo(p.level().getLevelData().getXSpawn(),p.level().getLevelData().getYSpawn(),p.level().getLevelData().getZSpawn());
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
