package net.kai_nulled.potioncore.procedures;

import net.kai_nulled.potioncore.effects.ModEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class LoveVigDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ModEffects.LOVE.get())) {
			return true;
		}
		return false;
	}
}
