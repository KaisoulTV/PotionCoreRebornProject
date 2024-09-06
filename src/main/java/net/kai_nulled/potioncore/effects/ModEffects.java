package net.kai_nulled.potioncore.effects;

import net.kai_nulled.potioncore.PotionCore;
import net.kai_nulled.potioncore.attributes.ModAttributes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    private static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PotionCore.MODID);

    public static final RegistryObject<MobEffect> ANTIDOTE = MOB_EFFECTS.register("antidote",
            () -> new AntidoteEffect(MobEffectCategory.BENEFICIAL,52377));
    public static final RegistryObject<MobEffect> PURITY = MOB_EFFECTS.register("purity",
            () -> new PurityEffect(MobEffectCategory.BENEFICIAL,16777215));
    public static final RegistryObject<MobEffect> TRUE_SHOT = MOB_EFFECTS.register("true_shot",
            () -> new TrueShotEffect(MobEffectCategory.BENEFICIAL,10048768).addAttributeModifier(
                    ModAttributes.PROJECTILE_DAMAGE.get(),"1D988EDF-AFC8-4BD0-978B-731C5E6A4CCF",0.2, Operation.ADDITION));
    public static final RegistryObject<MobEffect> KLUTZ = MOB_EFFECTS.register("klutz",
            () -> new KlutzEffect(MobEffectCategory.HARMFUL,10066227).addAttributeModifier(
                    ModAttributes.PROJECTILE_DAMAGE.get(),"9E4189FD-B7DC-47A6-86F2-E295436C908B",-0.2, Operation.ADDITION));
    public static final RegistryObject<MobEffect> MAGIC_FOCUS = MOB_EFFECTS.register("magic_focus",
            () -> new MagicFocusEffect(MobEffectCategory.BENEFICIAL,15114239).addAttributeModifier(
                    ModAttributes.MAGIC_DAMAGE.get(),"778CE5EE-AC18-4C2E-9F20-3FC56504E114",0.2, Operation.ADDITION));
    public static final RegistryObject<MobEffect> MAGIC_INHIBITION = MOB_EFFECTS.register("magic_inhibition",
            () -> new MagicInhibitionEffect(MobEffectCategory.HARMFUL,10845875).addAttributeModifier(
                    ModAttributes.MAGIC_DAMAGE.get(),"6E86F524-4405-4FD9-9B89-30E61EDED8E0",-0.2, Operation.ADDITION));
    public static final RegistryObject<MobEffect> RECOIL = MOB_EFFECTS.register("recoil",
            () -> new RecoilEffect(MobEffectCategory.BENEFICIAL,34850));
    public static final RegistryObject<MobEffect> BURST = MOB_EFFECTS.register("burst",
            () -> new BurstEffect(MobEffectCategory.BENEFICIAL,6710886));
    public static final RegistryObject<MobEffect> EXPLODE = MOB_EFFECTS.register("explode",
            () -> new ExplodeEffect(MobEffectCategory.HARMFUL,3355443));
    public static final RegistryObject<MobEffect> FIRE = MOB_EFFECTS.register("fire",
            () -> new FireEffect(MobEffectCategory.HARMFUL,16733440));
    public static final RegistryObject<MobEffect> LIGHTNING = MOB_EFFECTS.register("lightning",
            () -> new LightningEffect(MobEffectCategory.HARMFUL,16776960));
    public static final RegistryObject<MobEffect> LAUNCH = MOB_EFFECTS.register("launch",
            () -> new LaunchEffect(MobEffectCategory.NEUTRAL,65280));
    public static final RegistryObject<MobEffect> VULNERABLE = MOB_EFFECTS.register("vulnerable",
            () -> new VulnerableEffect(MobEffectCategory.HARMFUL,5601024).addAttributeModifier(
                    ModAttributes.DAMAGE_RESISTANCE.get(),"20E5182D-B790-4B01-AB27-864693AC4600",-0.2, Operation.ADDITION));
    public static final RegistryObject<MobEffect> BROKEN_ARMOR = MOB_EFFECTS.register("broken_armor",
            () -> new BrokenArmorEffect(MobEffectCategory.HARMFUL,10583930).addAttributeModifier(
                    Attributes.ARMOR,"A617C18D-CEEE-45C9-811A-88916492F7FC",-1, Operation.ADDITION));
    public static final RegistryObject<MobEffect> BROKEN_MAGIC_SHIELD = MOB_EFFECTS.register("broken_magic_shield",
            () -> new BrokenMagicShieldEffect(MobEffectCategory.HARMFUL,11012960).addAttributeModifier(
                    ModAttributes.MAGIC_SHIELD.get(), "55F232CD-9193-47C8-802A-90904B2BF36E",-1, Operation.ADDITION));
    public static final RegistryObject<MobEffect> IRON_SKIN = MOB_EFFECTS.register("iron_skin",
            () -> new IronSkinEffect(MobEffectCategory.BENEFICIAL,13092807).addAttributeModifier(
                    Attributes.ARMOR,"1513EB09-4DB4-45CA-8682-E7F9CF6C26AB",1, Operation.ADDITION));
    public static final RegistryObject<MobEffect> DIAMOND_SKIN = MOB_EFFECTS.register("diamond_skin",
            () -> new DiamondSkinEffect(MobEffectCategory.BENEFICIAL,2873584).addAttributeModifier(
                    Attributes.ARMOR_TOUGHNESS,"634EB6C8-B872-4935-9AD3-712E9CF40FDC",1, Operation.ADDITION));
    public static final RegistryObject<MobEffect> SOLID_CORE = MOB_EFFECTS.register("solid_core",
            () -> new SolidCoreEffect(MobEffectCategory.BENEFICIAL,2236962).addAttributeModifier(
                    Attributes.KNOCKBACK_RESISTANCE,"42AB5B8A-EFCC-4A11-901F-BADDF54FF653",0.2, Operation.ADDITION));
    public static final RegistryObject<MobEffect> MAGIC_SHIELD = MOB_EFFECTS.register("magic_shield",
            () -> new MagicShieldEffect(MobEffectCategory.BENEFICIAL,16729770).addAttributeModifier(
                    ModAttributes.MAGIC_SHIELD.get(), "1406DBDB-F2C0-4DEB-959B-CF3232298C29",1, Operation.ADDITION));
    public static final RegistryObject<MobEffect> REVIVAL = MOB_EFFECTS.register("revival",
            () -> new RevivalEffect(MobEffectCategory.BENEFICIAL,16711680));
    public static final RegistryObject<MobEffect> STEP_UP = MOB_EFFECTS.register("step_up",
            () -> new StepUpEffect(MobEffectCategory.BENEFICIAL,3394611).addAttributeModifier(
                    ForgeMod.STEP_HEIGHT_ADDITION.get(),"A5579BE2-4CEC-40F0-962E-043C8B9F2ED5",1, Operation.ADDITION));
    public static final RegistryObject<MobEffect> REACH = MOB_EFFECTS.register("reach",
            () -> new ReachEffect(MobEffectCategory.BENEFICIAL,13120100).addAttributeModifier(
                    ForgeMod.ENTITY_REACH.get(),"53B999C8-14D2-45AC-988F-73EBE85B4AE7",1, Operation.ADDITION).addAttributeModifier(
                    ForgeMod.BLOCK_REACH.get(),"36D0F11A-2287-4491-A869-856F1F21C081",1, Operation.ADDITION));
    public static final RegistryObject<MobEffect> CLIMB = MOB_EFFECTS.register("climb",
            () -> new ClimbEffect(MobEffectCategory.BENEFICIAL,13391104));
    public static final RegistryObject<MobEffect> RUST = MOB_EFFECTS.register("rust",
            () -> new RustEffect(MobEffectCategory.HARMFUL,7811840));
    public static final RegistryObject<MobEffect> REPAIR = MOB_EFFECTS.register("repair",
            () -> new RepairEffect(MobEffectCategory.BENEFICIAL,7829367));
    public static final RegistryObject<MobEffect> FLIGHT = MOB_EFFECTS.register("flight",
            () -> new FlightEffect(MobEffectCategory.BENEFICIAL,5609983));
    public static final RegistryObject<MobEffect> RANDOM_TELEPORT = MOB_EFFECTS.register("random_teleport",
            () -> new RandomTeleportEffect(MobEffectCategory.NEUTRAL,52377));
    public static final RegistryObject<MobEffect> SURFACE_TELEPORT = MOB_EFFECTS.register("surface_teleport",
            () -> new SurfaceTeleportEffect(MobEffectCategory.NEUTRAL,65433));
    public static final RegistryObject<MobEffect> SPAWN_TELEPORT = MOB_EFFECTS.register("spawn_teleport",
            () -> new SpawnTeleportEffect(MobEffectCategory.NEUTRAL,10049023));
    public static final RegistryObject<MobEffect> LOVE = MOB_EFFECTS.register("love",
            () -> new LoveEffect(MobEffectCategory.NEUTRAL,16724787));
    public static final RegistryObject<MobEffect> DROWN = MOB_EFFECTS.register("drown",
            () -> new DrownEffect(MobEffectCategory.NEUTRAL,65535));
    public static final RegistryObject<MobEffect> WEIGHT = MOB_EFFECTS.register("weight",
            () -> new WeightEffect(MobEffectCategory.HARMFUL,5592405).addAttributeModifier(
                    ModAttributes.JUMP_HEIGHT.get(), "C8ACF9F4-15BF-4051-8F65-0F1EC586CDF7",-0.2, Operation.ADDITION));
    public static final RegistryObject<MobEffect> DISORGANIZATION = MOB_EFFECTS.register("disorganization",
            () -> new DisorganizationEffect(MobEffectCategory.HARMFUL,10027263));
    public static final RegistryObject<MobEffect> PERPLEXITY = MOB_EFFECTS.register("perplexity",
            () -> new PerplexityEffect(MobEffectCategory.NEUTRAL,10027263));
    public static final RegistryObject<MobEffect> EXTEND = MOB_EFFECTS.register("extend",
            () -> new ExtendEffect(MobEffectCategory.NEUTRAL,10027161));
    public static final RegistryObject<MobEffect> CHANCE = MOB_EFFECTS.register("chance",
            () -> new ChanceEffect(MobEffectCategory.NEUTRAL,255));
    public static final RegistryObject<MobEffect> BLESS = MOB_EFFECTS.register("bless",
            () -> new BlessEffect(MobEffectCategory.BENEFICIAL,6737151));
    public static final RegistryObject<MobEffect> CURSE = MOB_EFFECTS.register("curse",
            () -> new CurseEffect(MobEffectCategory.HARMFUL,0));
    public static final RegistryObject<MobEffect> CURE = MOB_EFFECTS.register("cure",
            () -> new CureEffect(MobEffectCategory.BENEFICIAL,16733695));
    public static final RegistryObject<MobEffect> DISPEL = MOB_EFFECTS.register("dispel",
            () -> new DispelEffect(MobEffectCategory.HARMFUL,10027161));
    public static final RegistryObject<MobEffect> INVERSION = MOB_EFFECTS.register("invert",
            () -> new InvertEffect(MobEffectCategory.BENEFICIAL,10092441));
    public static final RegistryObject<MobEffect> SPIN = MOB_EFFECTS.register("spin",
            () -> new SpinEffect(MobEffectCategory.HARMFUL,10079232));
    public static final RegistryObject<MobEffect> POTION_SICKNESS = MOB_EFFECTS.register("potion_sickness",
            () -> new PotionSickness(MobEffectCategory.HARMFUL,16711935));

    public static void register(IEventBus bus) {
        MOB_EFFECTS.register(bus);
    }
}
