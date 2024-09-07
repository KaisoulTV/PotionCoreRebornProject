package net.kai_nulled.potioncore.effects;

import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class LoveEffect extends MobEffect {
    public LoveEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(pLivingEntity instanceof Animal animal) {
            if(animal.canFallInLove()) {
                animal.setInLove(pLivingEntity.level().getNearestPlayer(pLivingEntity, 10));
                animal.setInLoveTime(1000);
            }
        } else if (pLivingEntity instanceof Player p) {
            List<Player> nears = p.getCommandSenderWorld().getNearbyPlayers(TargetingConditions.DEFAULT,p,new AABB(p.getPosition(1).add(-8,-8,-8),p.getPosition(1).add(8,8,8)));
            Player nearestP = p;
            double distMax = 0;
            for(Player near:nears) {
                if (near != null && near!=p) {
                    double temp=distMax;
                    distMax=Mth.absMax(distMax,p.distanceToSqr(near));
                    if(distMax!=temp) nearestP=near;
                }
            }
            if (nearestP!=p) {
                p.lookAt(EntityAnchorArgument.Anchor.EYES, nearestP.position().add(0, 1, 0));
                if (pAmplifier > 0) {
                    float yaw = p.getYHeadRot();
                    float pSpeed = p.getSpeed();
                    var rx = Mth.cos(yaw) * pSpeed;
                    var ry = 0;
                    var rz = -Mth.sin(yaw) * pSpeed;

                    p.addDeltaMovement(new Vec3(rx, ry, rz));
                }
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
