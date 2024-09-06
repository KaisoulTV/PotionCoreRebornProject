package net.kai_nulled.potioncore.effects;

import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandlerModifiable;

import java.util.concurrent.atomic.AtomicReference;

public class DisorganizationEffect extends MobEffect {
    public DisorganizationEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    public ItemStack getItemStack(int sltid, Entity entity) {
        AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
        entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
            _retval.set(capability.getStackInSlot(sltid).copy());
        });
        return _retval.get();
    }

    public void setItemStack(int sltid,ItemStack slt,Entity entity) {
        final int _slotid = sltid;
        final ItemStack _setstack = slt.copy();
        _setstack.setCount(slt.getCount());
        entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
            if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
                _modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
        });
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(pLivingEntity instanceof Player player) {
            if(!player.getInventory().isEmpty()) {
                int rnd = Mth.nextInt(RandomSource.create(), 0, 35);
                int rnd1 = Mth.nextInt(RandomSource.create(), 0, 35);
                while (rnd == rnd1) {
                    rnd = Mth.nextInt(RandomSource.create(), 0, 35);
                    rnd1 = Mth.nextInt(RandomSource.create(), 0, 35);
                }
                Inventory inventory = player.getInventory();
                ItemStack it1 = inventory.getItem(rnd);
                ItemStack it2 = inventory.getItem(rnd1);
                inventory.setItem(rnd1,it1);
                inventory.removeItem(rnd1,64);
                inventory.setItem(rnd,it2);
                inventory.setChanged();
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
