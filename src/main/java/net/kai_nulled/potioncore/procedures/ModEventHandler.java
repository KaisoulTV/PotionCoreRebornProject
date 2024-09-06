package net.kai_nulled.potioncore.procedures;

import net.kai_nulled.potioncore.Config;
import net.kai_nulled.potioncore.PotionCore;
import net.kai_nulled.potioncore.attributes.ModAttributes;
import net.kai_nulled.potioncore.effects.ModEffects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.Input;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.client.event.MovementInputUpdateEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PotionCore.MODID)
public class ModEventHandler {

    @SubscribeEvent
    public static void PMovementEvent(MovementInputUpdateEvent e) {
        Input input = e.getInput();
        Minecraft MC = Minecraft.getInstance();
        if(e.getEntity().hasEffect(ModEffects.PERPLEXITY.get())) {
            input.forwardImpulse*=-1;
            input.leftImpulse*=-1;
            input.jumping=MC.options.keyShift.isDown();
            input.shiftKeyDown=MC.options.keyJump.isDown();
        }
    }
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void eHurt(LivingHurtEvent event) {
        DamageSource damageSource = event.getSource();
        double amount = event.getAmount();
        LivingEntity entity = event.getEntity();
        Entity sourceEntity = damageSource.getEntity();
        Entity directEntity = damageSource.getDirectEntity();
        float projectileDamageBonus = (float) amount;
        float magicDamageBonus = (float) amount;
        if(sourceEntity instanceof LivingEntity lse) {
            projectileDamageBonus = (float) (amount*lse.getAttributeValue(ModAttributes.PROJECTILE_DAMAGE.get()));
            magicDamageBonus = (float) (amount*lse.getAttributeValue(ModAttributes.MAGIC_DAMAGE.get()));
        }
        if(damageSource.is(DamageTypes.ARROW)) {
            event.setAmount(projectileDamageBonus);
        }
        if(damageSource.is(DamageTypes.MAGIC) || damageSource.is(DamageTypes.INDIRECT_MAGIC)) {
            event.setAmount((float) (magicDamageBonus-entity.getAttributeValue(ModAttributes.MAGIC_SHIELD.get())));
        }
        if(entity.hasEffect(ModEffects.RECOIL.get())) {
            sourceEntity.hurt(damageSource, (float) (amount*(0.2*(entity.getEffect(ModEffects.RECOIL.get()).getAmplifier()+1))));
        }
    }
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void eHurtLast(LivingHurtEvent event) {
        double amount = event.getAmount();
        LivingEntity entity = event.getEntity();
        event.setAmount((float) (amount - amount * entity.getAttributeValue(ModAttributes.DAMAGE_RESISTANCE.get())));
        if (entity.hasEffect(ModEffects.REVIVAL.get()) && amount >= entity.getHealth()) {
            event.setCanceled(true);
            entity.setHealth(2 * (entity.getEffect(ModEffects.REVIVAL.get()).getAmplifier() + 1));
            entity.removeEffect(ModEffects.REVIVAL.get());
        }
    }

    @SubscribeEvent
    public static void eJump(LivingEvent.LivingJumpEvent event) {
        LivingEntity e = event.getEntity();
        e.addDeltaMovement(new Vec3(0,e.getAttributeValue(ModAttributes.JUMP_HEIGHT.get()),0));
    }

    @SubscribeEvent
    public static void eDig(PlayerEvent.BreakSpeed event) {
        event.setNewSpeed((float) (event.getOriginalSpeed()*event.getEntity().getAttributeValue(ModAttributes.DIG_SPEED.get())));
    }

    @SubscribeEvent
    public static void eTick(LivingEvent.LivingTickEvent event) {
        LivingEntity entity = event.getEntity();
        if(Config.potionSicknessReq>0) {
            int count = 0;
            for (MobEffectInstance i : entity.getActiveEffects()) {
                MobEffect smt = i.getEffect();
                if (smt.isBeneficial()) count++;
            }
            if (count >= Config.potionSicknessReq && entity.hasEffect(ModEffects.POTION_SICKNESS.get()))
                entity.addEffect(new MobEffectInstance(
                        ModEffects.POTION_SICKNESS.get(), 3600, 0));
        }
    }
}
