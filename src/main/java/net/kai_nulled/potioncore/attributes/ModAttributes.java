package net.kai_nulled.potioncore.attributes;

import net.kai_nulled.potioncore.PotionCore;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModAttributes {
    public  static final DeferredRegister<Attribute> ATTRIBUTES
            = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, PotionCore.MODID);

    public static final RegistryObject<Attribute> JUMP_HEIGHT = ATTRIBUTES.register("jump_height",
            () -> new RangedAttribute("potioncore.jumpHeight",0,-2048,2048).setSyncable(true));
    public static final RegistryObject<Attribute> DIG_SPEED = ATTRIBUTES.register("dig_speed",
            () -> new RangedAttribute("potioncore.digSpeed",1,-2048,2048).setSyncable(true));
    public static final RegistryObject<Attribute> PROJECTILE_DAMAGE = ATTRIBUTES.register("projectile_damage",
            () -> new RangedAttribute("potioncore.projectileDamage",1,0,Integer.MAX_VALUE).setSyncable(true));
    public static final RegistryObject<Attribute> MAGIC_DAMAGE = ATTRIBUTES.register("magic_damage",
            () -> new RangedAttribute("potioncore.magicDamage",1,-2048,Integer.MAX_VALUE).setSyncable(true));
    public static final RegistryObject<Attribute> DAMAGE_RESISTANCE = ATTRIBUTES.register("damage_resistance",
            () -> new RangedAttribute("potioncore.damageResistance",0,Integer.MIN_VALUE,1).setSyncable(true));
    public static final RegistryObject<Attribute> MAGIC_SHIELD = ATTRIBUTES.register("magic_shield",
            () -> new RangedAttribute("potioncore.magicShield",0,-2048,2048).setSyncable(true));

    @SubscribeEvent
    public static void register(FMLConstructModEvent event) {
        event.enqueueWork(() -> {
            ATTRIBUTES.register(FMLJavaModLoadingContext.get().getModEventBus());
        });
    }

    @SubscribeEvent
    public static void AddAttributeToMobs(EntityAttributeModificationEvent event) {
        event.add(EntityType.PLAYER,ModAttributes.DIG_SPEED.get());
        for (EntityType<? extends LivingEntity> entityType:event.getTypes()) {
            event.add(entityType,ModAttributes.DAMAGE_RESISTANCE.get());
            event.add(entityType,ModAttributes.MAGIC_DAMAGE.get());
            event.add(entityType,ModAttributes.MAGIC_SHIELD.get());
            event.add(entityType,ModAttributes.PROJECTILE_DAMAGE.get());
            event.add(entityType,ModAttributes.JUMP_HEIGHT.get());
        }
    }
}
