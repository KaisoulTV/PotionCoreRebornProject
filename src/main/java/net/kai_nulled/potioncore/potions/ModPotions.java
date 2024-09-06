package net.kai_nulled.potioncore.potions;

import net.kai_nulled.potioncore.PotionCore;
import net.kai_nulled.potioncore.effects.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, PotionCore.MODID);

    public static final RegistryObject<Potion> ANTIDOTE = POTIONS.register("antidote",
            () -> new Potion(new MobEffectInstance(ModEffects.ANTIDOTE.get(),3600,0)));
    public static final RegistryObject<Potion> LONG_ANTIDOTE = POTIONS.register("long_antidote",
            () -> new Potion(new MobEffectInstance(ModEffects.ANTIDOTE.get(),9800,0)));

    public static final RegistryObject<Potion> PURITY = POTIONS.register("purity",
            () -> new Potion(new MobEffectInstance(ModEffects.PURITY.get(),3600,0)));
    public static final RegistryObject<Potion> LONG_PURITY = POTIONS.register("long_purity",
            () -> new Potion(new MobEffectInstance(ModEffects.PURITY.get(),9800,0)));

    public static final RegistryObject<Potion> FLIGHT = POTIONS.register("flight",
            () -> new Potion(new MobEffectInstance(ModEffects.FLIGHT.get(),3600,0)));
    public static final RegistryObject<Potion> LONG_FLIGHT = POTIONS.register("long_flight",
            () -> new Potion(new MobEffectInstance(ModEffects.FLIGHT.get(),9800,0)));

    public static final RegistryObject<Potion> PERPLEXITY = POTIONS.register("perplexity",
            () -> new Potion(new MobEffectInstance(ModEffects.PERPLEXITY.get(),3600,0)));
    public static final RegistryObject<Potion> LONG_PERPLEXITY = POTIONS.register("long_perplexity",
            () -> new Potion(new MobEffectInstance(ModEffects.PERPLEXITY.get(),9800,0)));

    public static final RegistryObject<Potion> DISORGANIZATION = POTIONS.register("disorganization",
            () -> new Potion(new MobEffectInstance(ModEffects.DISORGANIZATION.get(),3600,0)));
    public static final RegistryObject<Potion> LONG_DISORGANIZATION = POTIONS.register("long_disorganization",
            () -> new Potion(new MobEffectInstance(ModEffects.DISORGANIZATION.get(),9800,0)));

    public static final RegistryObject<Potion> SPAWN_TELEPORT = POTIONS.register("spawn_teleport",
            () -> new Potion(new MobEffectInstance(ModEffects.SPAWN_TELEPORT.get(),1,0)));

    public static final RegistryObject<Potion> SURFACE_TELEPORT = POTIONS.register("surface_teleport",
            () -> new Potion(new MobEffectInstance(ModEffects.SURFACE_TELEPORT.get(),1,0)));

    public static final RegistryObject<Potion> RANDOM_TELEPORT = POTIONS.register("random_teleport",
            () -> new Potion(new MobEffectInstance(ModEffects.RANDOM_TELEPORT.get(),1,0)));

    public static final RegistryObject<Potion> STRONG_RANDOM_TELEPORT = POTIONS.register("strong_random_teleport",
            () -> new Potion(new MobEffectInstance(ModEffects.RANDOM_TELEPORT.get(),1,1)));

    public static final RegistryObject<Potion> CURE = POTIONS.register("cure",
            () -> new Potion(new MobEffectInstance(ModEffects.CURE.get(),1,0)));

    public static final RegistryObject<Potion> DISPEL = POTIONS.register("dispel",
            () -> new Potion(new MobEffectInstance(ModEffects.DISPEL.get(),1,0)));

    public static final RegistryObject<Potion> INVERT = POTIONS.register("invert",
            () -> new Potion(new MobEffectInstance(ModEffects.INVERSION.get(),1,0)));

    public static final RegistryObject<Potion> LIGHTNING = POTIONS.register("lightning",
            () -> new Potion(new MobEffectInstance(ModEffects.LIGHTNING.get(),1,0)));

    public static final RegistryObject<Potion> LAUNCH = POTIONS.register("launch",
            () -> new Potion(new MobEffectInstance(ModEffects.LAUNCH.get(),1,0)));
    public static final RegistryObject<Potion> STRONG_LAUNCH = POTIONS.register("strong_launch",
            () -> new Potion(new MobEffectInstance(ModEffects.LAUNCH.get(),1,1)));

    public static final RegistryObject<Potion> CHANCE = POTIONS.register("chance",
            () -> new Potion(new MobEffectInstance(ModEffects.CHANCE.get(),1,0)));
    public static final RegistryObject<Potion> STRONG_CHANCE = POTIONS.register("strong_chance",
            () -> new Potion(new MobEffectInstance(ModEffects.CHANCE.get(),1,1)));

    public static final RegistryObject<Potion> BLESS = POTIONS.register("bless",
            () -> new Potion(new MobEffectInstance(ModEffects.BLESS.get(),1,0)));
    public static final RegistryObject<Potion> STRONG_BLESS = POTIONS.register("strong_bless",
            () -> new Potion(new MobEffectInstance(ModEffects.BLESS.get(),1,1)));

    public static final RegistryObject<Potion> CURSE = POTIONS.register("curse",
            () -> new Potion(new MobEffectInstance(ModEffects.CURSE.get(),1,0)));
    public static final RegistryObject<Potion> STRONG_CURSE = POTIONS.register("strong_curse",
            () -> new Potion(new MobEffectInstance(ModEffects.CURSE.get(),1,1)));

    public static final RegistryObject<Potion> BURST = POTIONS.register("burst",
            () -> new Potion(new MobEffectInstance(ModEffects.BURST.get(),1,0)));
    public static final RegistryObject<Potion> STRONG_BURST = POTIONS.register("strong_burst",
            () -> new Potion(new MobEffectInstance(ModEffects.BURST.get(),1,1)));

    public static final RegistryObject<Potion> EXPLOSION = POTIONS.register("explosion",
            () -> new Potion(new MobEffectInstance(ModEffects.EXPLODE.get(),1,0)));
    public static final RegistryObject<Potion> STRONG_EXPLOSION = POTIONS.register("strong_explosion",
            () -> new Potion(new MobEffectInstance(ModEffects.EXPLODE.get(),1,1)));

    public static final RegistryObject<Potion> LOVE = POTIONS.register("love",
            () -> new Potion(new MobEffectInstance(ModEffects.LOVE.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_LOVE = POTIONS.register("strong_love",
            () -> new Potion(new MobEffectInstance(ModEffects.LOVE.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_LOVE = POTIONS.register("long_love",
            () -> new Potion(new MobEffectInstance(ModEffects.LOVE.get(),9800,0)));

    public static final RegistryObject<Potion> FIRE = POTIONS.register("fire",
            () -> new Potion(new MobEffectInstance(ModEffects.FIRE.get(),3600,0)));
    public static final RegistryObject<Potion> LONG_FIRE = POTIONS.register("long_fire",
            () -> new Potion(new MobEffectInstance(ModEffects.FIRE.get(),9800,0)));

    public static final RegistryObject<Potion> IRON_SKIN = POTIONS.register("iron_skin",
            () -> new Potion(new MobEffectInstance(ModEffects.IRON_SKIN.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_IRON_SKIN = POTIONS.register("strong_iron_skin",
            () -> new Potion(new MobEffectInstance(ModEffects.IRON_SKIN.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_IRON_SKIN = POTIONS.register("long_iron_skin",
            () -> new Potion(new MobEffectInstance(ModEffects.IRON_SKIN.get(),9800,0)));

    public static final RegistryObject<Potion> DIAMOND_SKIN = POTIONS.register("diamond_skin",
            () -> new Potion(new MobEffectInstance(ModEffects.DIAMOND_SKIN.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_DIAMOND_SKIN = POTIONS.register("strong_diamond_skin",
            () -> new Potion(new MobEffectInstance(ModEffects.DIAMOND_SKIN.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_DIAMOND_SKIN = POTIONS.register("long_diamond_skin",
            () -> new Potion(new MobEffectInstance(ModEffects.DIAMOND_SKIN.get(),9800,0)));

    public static final RegistryObject<Potion> MAGIC_SHIELD = POTIONS.register("magic_shield",
            () -> new Potion(new MobEffectInstance(ModEffects.MAGIC_SHIELD.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_MAGIC_SHIELD = POTIONS.register("strong_magic_shield",
            () -> new Potion(new MobEffectInstance(ModEffects.MAGIC_SHIELD.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_MAGIC_SHIELD = POTIONS.register("long_magic_shield",
            () -> new Potion(new MobEffectInstance(ModEffects.MAGIC_SHIELD.get(),9800,0)));

    public static final RegistryObject<Potion> BROKEN_ARMOR = POTIONS.register("broken_armor",
            () -> new Potion(new MobEffectInstance(ModEffects.BROKEN_ARMOR.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_BROKEN_ARMOR = POTIONS.register("strong_broken_armor",
            () -> new Potion(new MobEffectInstance(ModEffects.BROKEN_ARMOR.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_BROKEN_ARMOR = POTIONS.register("long_broken_armor",
            () -> new Potion(new MobEffectInstance(ModEffects.BROKEN_ARMOR.get(),9800,0)));

    public static final RegistryObject<Potion> BROKEN_MAGIC_SHIELD = POTIONS.register("broken_magic_shield",
            () -> new Potion(new MobEffectInstance(ModEffects.BROKEN_MAGIC_SHIELD.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_BROKEN_MAGIC_SHIELD = POTIONS.register("strong_broken_magic_shield",
            () -> new Potion(new MobEffectInstance(ModEffects.BROKEN_MAGIC_SHIELD.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_BROKEN_MAGIC_SHIELD = POTIONS.register("long_broken_magic_shield",
            () -> new Potion(new MobEffectInstance(ModEffects.BROKEN_MAGIC_SHIELD.get(),9800,0)));

    public static final RegistryObject<Potion> CLIMB = POTIONS.register("climb",
            () -> new Potion(new MobEffectInstance(ModEffects.CLIMB.get(),3600,0)));
    public static final RegistryObject<Potion> LONG_CLIMB = POTIONS.register("long_climb",
            () -> new Potion(new MobEffectInstance(ModEffects.CLIMB.get(),9800,0)));

    public static final RegistryObject<Potion> EXTEND = POTIONS.register("extend",
            () -> new Potion(new MobEffectInstance(ModEffects.EXTEND.get(),3600,0)));
    public static final RegistryObject<Potion> LONG_EXTEND = POTIONS.register("long_extend",
            () -> new Potion(new MobEffectInstance(ModEffects.EXTEND.get(),9800,0)));

    public static final RegistryObject<Potion> DROWN = POTIONS.register("drown",
            () -> new Potion(new MobEffectInstance(ModEffects.DROWN.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_DROWN = POTIONS.register("strong_drown",
            () -> new Potion(new MobEffectInstance(ModEffects.DROWN.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_DROWN = POTIONS.register("long_drown",
            () -> new Potion(new MobEffectInstance(ModEffects.DROWN.get(),9800,0)));

    public static final RegistryObject<Potion> ARCHERY = POTIONS.register("archery",
            () -> new Potion(new MobEffectInstance(ModEffects.TRUE_SHOT.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_ARCHERY = POTIONS.register("strong_archery",
            () -> new Potion(new MobEffectInstance(ModEffects.TRUE_SHOT.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_ARCHERY = POTIONS.register("long_archery",
            () -> new Potion(new MobEffectInstance(ModEffects.TRUE_SHOT.get(),9800,0)));

    public static final RegistryObject<Potion> KLUTZ = POTIONS.register("klutz",
            () -> new Potion(new MobEffectInstance(ModEffects.KLUTZ.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_KLUTZ = POTIONS.register("strong_klutz",
            () -> new Potion(new MobEffectInstance(ModEffects.KLUTZ.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_KLUTZ = POTIONS.register("long_klutz",
            () -> new Potion(new MobEffectInstance(ModEffects.KLUTZ.get(),9800,0)));

    public static final RegistryObject<Potion> MAGIC_FOCUS = POTIONS.register("magic_focus",
            () -> new Potion(new MobEffectInstance(ModEffects.MAGIC_FOCUS.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_MAGIC_FOCUS = POTIONS.register("strong_magic_focus",
            () -> new Potion(new MobEffectInstance(ModEffects.MAGIC_FOCUS.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_MAGIC_FOCUS = POTIONS.register("long_magic_focus",
            () -> new Potion(new MobEffectInstance(ModEffects.MAGIC_FOCUS.get(),9800,0)));

    public static final RegistryObject<Potion> MAGIC_INHIBITION = POTIONS.register("magic_inhibition",
            () -> new Potion(new MobEffectInstance(ModEffects.MAGIC_INHIBITION.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_MAGIC_INHIBITION = POTIONS.register("strong_magic_inhibition",
            () -> new Potion(new MobEffectInstance(ModEffects.MAGIC_INHIBITION.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_MAGIC_INHIBITION = POTIONS.register("long_magic_inhibition",
            () -> new Potion(new MobEffectInstance(ModEffects.MAGIC_INHIBITION.get(),9800,0)));

    public static final RegistryObject<Potion> REACH = POTIONS.register("reach",
            () -> new Potion(new MobEffectInstance(ModEffects.REACH.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_REACH = POTIONS.register("strong_reach",
            () -> new Potion(new MobEffectInstance(ModEffects.REACH.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_REACH = POTIONS.register("long_reach",
            () -> new Potion(new MobEffectInstance(ModEffects.REACH.get(),9800,0)));

    public static final RegistryObject<Potion> RECOIL = POTIONS.register("recoil",
            () -> new Potion(new MobEffectInstance(ModEffects.RECOIL.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_RECOIL = POTIONS.register("strong_recoil",
            () -> new Potion(new MobEffectInstance(ModEffects.RECOIL.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_RECOIL = POTIONS.register("long_recoil",
            () -> new Potion(new MobEffectInstance(ModEffects.RECOIL.get(),9800,0)));

    public static final RegistryObject<Potion> REVIVAL = POTIONS.register("revival",
            () -> new Potion(new MobEffectInstance(ModEffects.REVIVAL.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_REVIVAL = POTIONS.register("strong_revival",
            () -> new Potion(new MobEffectInstance(ModEffects.REVIVAL.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_REVIVAL = POTIONS.register("long_revival",
            () -> new Potion(new MobEffectInstance(ModEffects.REVIVAL.get(),9800,0)));

    public static final RegistryObject<Potion> REPAIR = POTIONS.register("repair",
            () -> new Potion(new MobEffectInstance(ModEffects.REPAIR.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_REPAIR = POTIONS.register("strong_repair",
            () -> new Potion(new MobEffectInstance(ModEffects.REPAIR.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_REPAIR = POTIONS.register("long_repair",
            () -> new Potion(new MobEffectInstance(ModEffects.REPAIR.get(),9800,0)));

    public static final RegistryObject<Potion> RUST = POTIONS.register("rust",
            () -> new Potion(new MobEffectInstance(ModEffects.RUST.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_RUST = POTIONS.register("strong_rust",
            () -> new Potion(new MobEffectInstance(ModEffects.RUST.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_RUST = POTIONS.register("long_rust",
            () -> new Potion(new MobEffectInstance(ModEffects.RUST.get(),9800,0)));

    public static final RegistryObject<Potion> SOLID_CORE = POTIONS.register("solid_core",
            () -> new Potion(new MobEffectInstance(ModEffects.SOLID_CORE.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_SOLID_CORE = POTIONS.register("strong_solid_core",
            () -> new Potion(new MobEffectInstance(ModEffects.SOLID_CORE.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_SOLID_CORE = POTIONS.register("long_solid_core",
            () -> new Potion(new MobEffectInstance(ModEffects.SOLID_CORE.get(),9800,0)));

    public static final RegistryObject<Potion> SPIN = POTIONS.register("spin",
            () -> new Potion(new MobEffectInstance(ModEffects.SPIN.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_SPIN = POTIONS.register("strong_spin",
            () -> new Potion(new MobEffectInstance(ModEffects.SPIN.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_SPIN = POTIONS.register("long_spin",
            () -> new Potion(new MobEffectInstance(ModEffects.SPIN.get(),9800,0)));

    public static final RegistryObject<Potion> STEP_UP = POTIONS.register("step_up",
            () -> new Potion(new MobEffectInstance(ModEffects.STEP_UP.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_STEP_UP = POTIONS.register("strong_step_up",
            () -> new Potion(new MobEffectInstance(ModEffects.STEP_UP.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_STEP_UP = POTIONS.register("long_step_up",
            () -> new Potion(new MobEffectInstance(ModEffects.STEP_UP.get(),9800,0)));

    public static final RegistryObject<Potion> VULNERABLE = POTIONS.register("vulnerable",
            () -> new Potion(new MobEffectInstance(ModEffects.VULNERABLE.get(),3600,0)));
    public static final RegistryObject<Potion> STRONG_VULNERABLE = POTIONS.register("strong_vulnerable",
            () -> new Potion(new MobEffectInstance(ModEffects.VULNERABLE.get(),4800,1)));
    public static final RegistryObject<Potion> LONG_VULNERABLE = POTIONS.register("long_vulnerable",
            () -> new Potion(new MobEffectInstance(ModEffects.VULNERABLE.get(),9800,0)));

    //Extra vanilla potions
    public static final RegistryObject<Potion> HASTE = POTIONS.register("haste",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED,3600,0)));
    public static final RegistryObject<Potion> STRONG_HASTE = POTIONS.register("strong_haste",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED,4800,1)));
    public static final RegistryObject<Potion> LONG_HASTE = POTIONS.register("long_haste",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED,9800,0)));

    public static final RegistryObject<Potion> FATIGUE = POTIONS.register("fatigue",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN,3600,0)));
    public static final RegistryObject<Potion> STRONG_FATIGUE = POTIONS.register("strong_fatigue",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN,4800,1)));
    public static final RegistryObject<Potion> LONG_FATIGUE = POTIONS.register("long_fatigue",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN,9800,0)));

    public static final RegistryObject<Potion> NAUSEA = POTIONS.register("nausea",
            () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION,3600,0)));
    public static final RegistryObject<Potion> LONG_NAUSEA = POTIONS.register("long_nausea",
            () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION,9800,0)));

    public static final RegistryObject<Potion> WITHER = POTIONS.register("wither",
            () -> new Potion(new MobEffectInstance(MobEffects.WITHER,3600,0)));
    public static final RegistryObject<Potion> STRONG_WITHER = POTIONS.register("strong_wither",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED,4800,1)));
    public static final RegistryObject<Potion> LONG_WITHER = POTIONS.register("long_wither",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED,9800,0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
