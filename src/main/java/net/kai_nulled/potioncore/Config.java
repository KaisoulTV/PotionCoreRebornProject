package net.kai_nulled.potioncore;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.registries.ForgeRegistries;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = PotionCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.IntValue POTION_SICKNESS_REQ = BUILDER
            .comment("Set to 0 to disable, higher to set the requirements")
            .defineInRange("potion_sickness_req", 0, 0, Integer.MAX_VALUE);

    private static final ForgeConfigSpec.BooleanValue ENABLE_ANTIDOTE_RECIPE = BUILDER
            .comment("Enable antidote recipe?")
            .define("antidote_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_ANTIDOTE_RECIPE = BUILDER
            .comment("Enable long_antidote recipe?")
            .define("long_antidote_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_PURITY_RECIPE = BUILDER
            .comment("Enable purity recipe?")
            .define("purity_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_PURITY_RECIPE = BUILDER
            .comment("Enable long_purity recipe?")
            .define("long_purity_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_FLIGHT_RECIPE = BUILDER
            .comment("Enable flight recipe?")
            .define("flight_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_FLIGHT_RECIPE = BUILDER
            .comment("Enable long_flight recipe?")
            .define("long_flight_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_PERPLEXITY_RECIPE = BUILDER
            .comment("Enable perplexity recipe?")
            .define("perplexity_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_PERPLEXITY_RECIPE = BUILDER
            .comment("Enable long_perplexity recipe?")
            .define("long_perplexity_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_HASTE_RECIPE = BUILDER
            .comment("Enable haste recipe?")
            .define("haste_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_HASTE_RECIPE = BUILDER
            .comment("Enable long_haste recipe?")
            .define("long_haste_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_HASTE_RECIPE = BUILDER
            .comment("Enable strong_haste recipe?")
            .define("strong_haste_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_FATIGUE_RECIPE = BUILDER
            .comment("Enable fatigue recipe?")
            .define("fatigue_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_FATIGUE_RECIPE = BUILDER
            .comment("Enable long_fatigue recipe?")
            .define("long_fatigue_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_FATIGUE_RECIPE = BUILDER
            .comment("Enable strong_fatigue recipe?")
            .define("strong_fatigue_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_ARCHERY_RECIPE = BUILDER
            .comment("Enable archery recipe?")
            .define("archery_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_ARCHERY_RECIPE = BUILDER
            .comment("Enable long_archery recipe?")
            .define("long_archery_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_ARCHERY_RECIPE = BUILDER
            .comment("Enable strong_archery recipe?")
            .define("strong_archery_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_KLUTZ_RECIPE = BUILDER
            .comment("Enable klutz recipe?")
            .define("klutz_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_KLUTZ_RECIPE = BUILDER
            .comment("Enable long_klutz recipe?")
            .define("long_klutz_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_KLUTZ_RECIPE = BUILDER
            .comment("Enable strong_klutz recipe?")
            .define("strong_klutz_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_MAGIC_FOCUS_RECIPE = BUILDER
            .comment("Enable magic_focus recipe?")
            .define("magic_focus_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_MAGIC_FOCUS_RECIPE = BUILDER
            .comment("Enable long_magic_focus recipe?")
            .define("long_magic_focus_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_MAGIC_FOCUS_RECIPE = BUILDER
            .comment("Enable strong_magic_focus recipe?")
            .define("strong_magic_focus_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_MAGIC_INHIBITION_RECIPE = BUILDER
            .comment("Enable magic_inhibition recipe?")
            .define("magic_inhibition_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_MAGIC_INHIBITION_RECIPE = BUILDER
            .comment("Enable long_magic_inhibition recipe?")
            .define("long_magic_inhibition_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_MAGIC_INHIBITION_RECIPE = BUILDER
            .comment("Enable strong_magic_inhibition recipe?")
            .define("strong_magic_inhibition_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_REACH_RECIPE = BUILDER
            .comment("Enable reach recipe?")
            .define("reach_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_REACH_RECIPE = BUILDER
            .comment("Enable long_reach recipe?")
            .define("long_reach_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_REACH_RECIPE = BUILDER
            .comment("Enable strong_reach recipe?")
            .define("strong_reach_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_RECOIL_RECIPE = BUILDER
            .comment("Enable recoil recipe?")
            .define("recoil_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_RECOIL_RECIPE = BUILDER
            .comment("Enable long_recoil recipe?")
            .define("long_recoil_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_RECOIL_RECIPE = BUILDER
            .comment("Enable strong_recoil recipe?")
            .define("strong_recoil_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_REPAIR_RECIPE = BUILDER
            .comment("Enable repair recipe?")
            .define("repair_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_REPAIR_RECIPE = BUILDER
            .comment("Enable long_repair recipe?")
            .define("long_repair_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_REPAIR_RECIPE = BUILDER
            .comment("Enable strong_repair recipe?")
            .define("strong_repair_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_RUST_RECIPE = BUILDER
            .comment("Enable rust recipe?")
            .define("rust_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_RUST_RECIPE = BUILDER
            .comment("Enable long_rust recipe?")
            .define("long_rust_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_RUST_RECIPE = BUILDER
            .comment("Enable strong_rust recipe?")
            .define("strong_rust_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_SOLID_CORE_RECIPE = BUILDER
            .comment("Enable solid_core recipe?")
            .define("solid_core_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_SOLID_CORE_RECIPE = BUILDER
            .comment("Enable long_solid_core recipe?")
            .define("long_solid_core_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_SOLID_CORE_RECIPE = BUILDER
            .comment("Enable strong_solid_core recipe?")
            .define("strong_solid_core_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_SPIN_RECIPE = BUILDER
            .comment("Enable spin recipe?")
            .define("spin_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_SPIN_RECIPE = BUILDER
            .comment("Enable long_spin recipe?")
            .define("long_spin_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_SPIN_RECIPE = BUILDER
            .comment("Enable strong_spin recipe?")
            .define("strong_spin_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STEP_UP_RECIPE = BUILDER
            .comment("Enable step_up recipe?")
            .define("step_up_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_STEP_UP_RECIPE = BUILDER
            .comment("Enable long_step_up recipe?")
            .define("long_step_up_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_STEP_UP_RECIPE = BUILDER
            .comment("Enable strong_step_up recipe?")
            .define("strong_step_up_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_VULNERABLE_RECIPE = BUILDER
            .comment("Enable vulnerable recipe?")
            .define("vulnerable_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_VULNERABLE_RECIPE = BUILDER
            .comment("Enable long_vulnerable recipe?")
            .define("long_vulnerable_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_VULNERABLE_RECIPE = BUILDER
            .comment("Enable strong_vulnerable recipe?")
            .define("strong_vulnerable_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_NAUSEA_RECIPE = BUILDER
            .comment("Enable nausea recipe?")
            .define("nausea_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_NAUSEA_RECIPE = BUILDER
            .comment("Enable long_nausea recipe?")
            .define("long_nausea_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_CHANCE_RECIPE = BUILDER
            .comment("Enable chance recipe?")
            .define("chance_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_CHANCE_RECIPE = BUILDER
            .comment("Enable strong_chance recipe?")
            .define("strong_chance_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_BLESS_RECIPE = BUILDER
            .comment("Enable bless recipe?")
            .define("bless_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_BLESS_RECIPE = BUILDER
            .comment("Enable strong_bless recipe?")
            .define("strong_bless_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_CURSE_RECIPE = BUILDER
            .comment("Enable curse recipe?")
            .define("curse_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_CURSE_RECIPE = BUILDER
            .comment("Enable strong_curse recipe?")
            .define("strong_curse_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_CURE_RECIPE = BUILDER
            .comment("Enable cure recipe?")
            .define("cure_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_DISPEL_RECIPE = BUILDER
            .comment("Enable dispel recipe?")
            .define("dispel_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_WITHER_RECIPE = BUILDER
            .comment("Enable wither recipe?")
            .define("wither_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_WITHER_RECIPE = BUILDER
            .comment("Enable long_wither recipe?")
            .define("long_wither_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_WITHER_RECIPE = BUILDER
            .comment("Enable strong_wither recipe?")
            .define("strong_wither_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LOVE_RECIPE = BUILDER
            .comment("Enable love recipe?")
            .define("love_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_LOVE_RECIPE = BUILDER
            .comment("Enable long_love recipe?")
            .define("long_love_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_LOVE_RECIPE = BUILDER
            .comment("Enable strong_love recipe?")
            .define("strong_love_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_IRON_SKIN_RECIPE = BUILDER
            .comment("Enable iron_skin recipe?")
            .define("iron_skin_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_IRON_SKIN_RECIPE = BUILDER
            .comment("Enable long_iron_skin recipe?")
            .define("long_iron_skin_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_IRON_SKIN_RECIPE = BUILDER
            .comment("Enable strong_iron_skin recipe?")
            .define("strong_iron_skin_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_DIAMOND_SKIN_RECIPE = BUILDER
            .comment("Enable diamond_skin recipe?")
            .define("diamond_skin_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_DIAMOND_SKIN_RECIPE = BUILDER
            .comment("Enable long_diamond_skin recipe?")
            .define("long_diamond_skin_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_DIAMOND_SKIN_RECIPE = BUILDER
            .comment("Enable strong_diamond_skin recipe?")
            .define("strong_diamond_skin_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_BROKEN_ARMOR_RECIPE = BUILDER
            .comment("Enable broken_armor recipe?")
            .define("broken_armor_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_BROKEN_ARMOR_RECIPE = BUILDER
            .comment("Enable long_broken_armor recipe?")
            .define("long_broken_armor_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_BROKEN_ARMOR_RECIPE = BUILDER
            .comment("Enable strong_broken_armor recipe?")
            .define("strong_broken_armor_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_CLIMB_RECIPE = BUILDER
            .comment("Enable climb recipe?")
            .define("climb_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_CLIMB_RECIPE = BUILDER
            .comment("Enable long_climb recipe?")
            .define("long_climb_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_MAGIC_SHIELD_RECIPE = BUILDER
            .comment("Enable magic_shield recipe?")
            .define("magic_shield_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_MAGIC_SHIELD_RECIPE = BUILDER
            .comment("Enable long_magic_shield recipe?")
            .define("long_magic_shield_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_MAGIC_SHIELD_RECIPE = BUILDER
            .comment("Enable strong_magic_shield recipe?")
            .define("strong_magic_shield_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_BROKEN_MAGIC_SHIELD_RECIPE = BUILDER
            .comment("Enable broken_magic_shield recipe?")
            .define("broken_magic_shield_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_BROKEN_MAGIC_SHIELD_RECIPE = BUILDER
            .comment("Enable long_broken_magic_shield recipe?")
            .define("long_broken_magic_shield_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_BROKEN_MAGIC_SHIELD_RECIPE = BUILDER
            .comment("Enable strong_broken_magic_shield recipe?")
            .define("strong_broken_magic_shield_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_DROWN_RECIPE = BUILDER
            .comment("Enable drown recipe?")
            .define("drown_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_DROWN_RECIPE = BUILDER
            .comment("Enable long_drown recipe?")
            .define("long_drown_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_DROWN_RECIPE = BUILDER
            .comment("Enable strong_drown recipe?")
            .define("strong_drown_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_REVIVAL_RECIPE = BUILDER
            .comment("Enable revival recipe?")
            .define("revival_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_REVIVAL_RECIPE = BUILDER
            .comment("Enable long_revival recipe?")
            .define("long_revival_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_REVIVAL_RECIPE = BUILDER
            .comment("Enable strong_revival recipe?")
            .define("strong_revival_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_WEIGHT_RECIPE = BUILDER
            .comment("Enable weight recipe?")
            .define("weight_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_WEIGHT_RECIPE = BUILDER
            .comment("Enable long_weight recipe?")
            .define("long_weight_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_WEIGHT_RECIPE = BUILDER
            .comment("Enable strong_weight recipe?")
            .define("strong_weight_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LIGHTNING_RECIPE = BUILDER
            .comment("Enable lightning recipe?")
            .define("lightning_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_INVERT_RECIPE = BUILDER
            .comment("Enable invert recipe?")
            .define("invert_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_FIRE_RECIPE = BUILDER
            .comment("Enable fire recipe?")
            .define("fire_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_FIRE_RECIPE = BUILDER
            .comment("Enable long_fire recipe?")
            .define("long_fire_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_EXTEND_RECIPE = BUILDER
            .comment("Enable extend recipe?")
            .define("extend_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LONG_EXTEND_RECIPE = BUILDER
            .comment("Enable long_extend recipe?")
            .define("long_extend_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_LAUNCH_RECIPE = BUILDER
            .comment("Enable launch recipe?")
            .define("launch_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_LAUNCH_RECIPE = BUILDER
            .comment("Enable strong_launch recipe?")
            .define("strong_launch_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_EXPLOSION_RECIPE = BUILDER
            .comment("Enable explosion recipe?")
            .define("explosion_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_EXPLOSION_RECIPE = BUILDER
            .comment("Enable strong_explosion recipe?")
            .define("strong_explosion_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_BURST_RECIPE = BUILDER
            .comment("Enable burst recipe?")
            .define("burst_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_BURST_RECIPE = BUILDER
            .comment("Enable strong_burst recipe?")
            .define("strong_burst_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_RANDOM_TELEPORT_RECIPE = BUILDER
            .comment("Enable random_teleport recipe?")
            .define("random_teleport_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_STRONG_RANDOM_TELEPORT_RECIPE = BUILDER
            .comment("Enable strong_random_teleport recipe?")
            .define("strong_random_teleport_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_SURFACE_TELEPORT_RECIPE = BUILDER
            .comment("Enable surface_teleport recipe?")
            .define("surface_teleport_recipe",true);

    private static final ForgeConfigSpec.BooleanValue ENABLE_SPAWN_TELEPORT_RECIPE = BUILDER
            .comment("Enable spawn_teleport recipe?")
            .define("spawn_teleport_recipe",true);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    //public static boolean logDirtBlock;
    public static int potionSicknessReq;
    //public static String magicNumberIntroduction;
    public static boolean[] recipes = new boolean[108];

    private static boolean validateItemName(final Object obj)
    {
        return obj instanceof final String itemName && ForgeRegistries.ITEMS.containsKey(new ResourceLocation(itemName));
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        potionSicknessReq=POTION_SICKNESS_REQ.get();
        recipes[0] = ENABLE_ANTIDOTE_RECIPE.get();
        recipes[1] = ENABLE_LONG_ANTIDOTE_RECIPE.get();
        recipes[2] = ENABLE_PURITY_RECIPE.get();
        recipes[3] = ENABLE_LONG_PURITY_RECIPE.get();
        recipes[4] = ENABLE_FLIGHT_RECIPE.get();
        recipes[5] = ENABLE_LONG_FLIGHT_RECIPE.get();
        recipes[6] = ENABLE_PERPLEXITY_RECIPE.get();
        recipes[7] = ENABLE_LONG_PERPLEXITY_RECIPE.get();
        recipes[8] = ENABLE_HASTE_RECIPE.get();
        recipes[9] = ENABLE_LONG_HASTE_RECIPE.get();
        recipes[10] = ENABLE_STRONG_HASTE_RECIPE.get();
        recipes[11] = ENABLE_FATIGUE_RECIPE.get();
        recipes[12] = ENABLE_LONG_FATIGUE_RECIPE.get();
        recipes[13] = ENABLE_STRONG_FATIGUE_RECIPE.get();
        recipes[14] = ENABLE_ARCHERY_RECIPE.get();
        recipes[15] = ENABLE_LONG_ARCHERY_RECIPE.get();
        recipes[16] = ENABLE_STRONG_ARCHERY_RECIPE.get();
        recipes[17] = ENABLE_KLUTZ_RECIPE.get();
        recipes[18] = ENABLE_LONG_KLUTZ_RECIPE.get();
        recipes[19] = ENABLE_STRONG_KLUTZ_RECIPE.get();
        recipes[20] = ENABLE_MAGIC_FOCUS_RECIPE.get();
        recipes[21] = ENABLE_LONG_MAGIC_FOCUS_RECIPE.get();
        recipes[22] = ENABLE_STRONG_MAGIC_FOCUS_RECIPE.get();
        recipes[23] = ENABLE_MAGIC_INHIBITION_RECIPE.get();
        recipes[24] = ENABLE_LONG_MAGIC_INHIBITION_RECIPE.get();
        recipes[25] = ENABLE_STRONG_MAGIC_INHIBITION_RECIPE.get();
        recipes[26] = ENABLE_REACH_RECIPE.get();
        recipes[27] = ENABLE_LONG_REACH_RECIPE.get();
        recipes[28] = ENABLE_STRONG_REACH_RECIPE.get();
        recipes[29] = ENABLE_RECOIL_RECIPE.get();
        recipes[30] = ENABLE_LONG_RECOIL_RECIPE.get();
        recipes[31] = ENABLE_STRONG_RECOIL_RECIPE.get();
        recipes[32] = ENABLE_REPAIR_RECIPE.get();
        recipes[33] = ENABLE_LONG_REPAIR_RECIPE.get();
        recipes[34] = ENABLE_STRONG_REPAIR_RECIPE.get();
        recipes[35] = ENABLE_RUST_RECIPE.get();
        recipes[36] = ENABLE_LONG_RUST_RECIPE.get();
        recipes[37] = ENABLE_STRONG_RUST_RECIPE.get();
        recipes[38] = ENABLE_SOLID_CORE_RECIPE.get();
        recipes[39] = ENABLE_LONG_SOLID_CORE_RECIPE.get();
        recipes[40] = ENABLE_STRONG_SOLID_CORE_RECIPE.get();
        recipes[41] = ENABLE_SPIN_RECIPE.get();
        recipes[42] = ENABLE_LONG_SPIN_RECIPE.get();
        recipes[43] = ENABLE_STRONG_SPIN_RECIPE.get();
        recipes[44] = ENABLE_STEP_UP_RECIPE.get();
        recipes[45] = ENABLE_LONG_STEP_UP_RECIPE.get();
        recipes[46] = ENABLE_STRONG_STEP_UP_RECIPE.get();
        recipes[47] = ENABLE_VULNERABLE_RECIPE.get();
        recipes[48] = ENABLE_LONG_VULNERABLE_RECIPE.get();
        recipes[49] = ENABLE_STRONG_VULNERABLE_RECIPE.get();
        recipes[50] = ENABLE_NAUSEA_RECIPE.get();
        recipes[51] = ENABLE_LONG_NAUSEA_RECIPE.get();
        recipes[52] = ENABLE_CHANCE_RECIPE.get();
        recipes[53] = ENABLE_STRONG_CHANCE_RECIPE.get();
        recipes[54] = ENABLE_BLESS_RECIPE.get();
        recipes[55] = ENABLE_STRONG_BLESS_RECIPE.get();
        recipes[56] = ENABLE_CURSE_RECIPE.get();
        recipes[57] = ENABLE_STRONG_CURSE_RECIPE.get();
        recipes[58] = ENABLE_CURE_RECIPE.get();
        recipes[59] = ENABLE_DISPEL_RECIPE.get();
        recipes[60] = ENABLE_WITHER_RECIPE.get();
        recipes[61] = ENABLE_LONG_WITHER_RECIPE.get();
        recipes[62] = ENABLE_STRONG_WITHER_RECIPE.get();
        recipes[63] = ENABLE_LOVE_RECIPE.get();
        recipes[64] = ENABLE_LONG_LOVE_RECIPE.get();
        recipes[65] = ENABLE_STRONG_LOVE_RECIPE.get();
        recipes[66] = ENABLE_IRON_SKIN_RECIPE.get();
        recipes[67] = ENABLE_LONG_IRON_SKIN_RECIPE.get();
        recipes[68] = ENABLE_STRONG_IRON_SKIN_RECIPE.get();
        recipes[69] = ENABLE_DIAMOND_SKIN_RECIPE.get();
        recipes[70] = ENABLE_LONG_DIAMOND_SKIN_RECIPE.get();
        recipes[71] = ENABLE_STRONG_DIAMOND_SKIN_RECIPE.get();
        recipes[72] = ENABLE_BROKEN_ARMOR_RECIPE.get();
        recipes[73] = ENABLE_LONG_BROKEN_ARMOR_RECIPE.get();
        recipes[74] = ENABLE_STRONG_BROKEN_ARMOR_RECIPE.get();
        recipes[75] = ENABLE_CLIMB_RECIPE.get();
        recipes[76] = ENABLE_LONG_CLIMB_RECIPE.get();
        recipes[77] = ENABLE_MAGIC_SHIELD_RECIPE.get();
        recipes[78] = ENABLE_LONG_MAGIC_SHIELD_RECIPE.get();
        recipes[79] = ENABLE_STRONG_MAGIC_SHIELD_RECIPE.get();
        recipes[80] = ENABLE_BROKEN_MAGIC_SHIELD_RECIPE.get();
        recipes[81] = ENABLE_LONG_BROKEN_MAGIC_SHIELD_RECIPE.get();
        recipes[82] = ENABLE_STRONG_BROKEN_MAGIC_SHIELD_RECIPE.get();
        recipes[83] = ENABLE_DROWN_RECIPE.get();
        recipes[84] = ENABLE_LONG_DROWN_RECIPE.get();
        recipes[85] = ENABLE_STRONG_DROWN_RECIPE.get();
        recipes[86] = ENABLE_REVIVAL_RECIPE.get();
        recipes[87] = ENABLE_LONG_REVIVAL_RECIPE.get();
        recipes[88] = ENABLE_STRONG_REVIVAL_RECIPE.get();
        recipes[89] = ENABLE_WEIGHT_RECIPE.get();
        recipes[90] = ENABLE_LONG_WEIGHT_RECIPE.get();
        recipes[91] = ENABLE_STRONG_WEIGHT_RECIPE.get();
        recipes[92] = ENABLE_LIGHTNING_RECIPE.get();
        recipes[93] = ENABLE_INVERT_RECIPE.get();
        recipes[94] = ENABLE_FIRE_RECIPE.get();
        recipes[95] = ENABLE_LONG_FIRE_RECIPE.get();
        recipes[96] = ENABLE_EXTEND_RECIPE.get();
        recipes[97] = ENABLE_LONG_EXTEND_RECIPE.get();
        recipes[98] = ENABLE_LAUNCH_RECIPE.get();
        recipes[99] = ENABLE_STRONG_LAUNCH_RECIPE.get();
        recipes[100] = ENABLE_EXPLOSION_RECIPE.get();
        recipes[101] = ENABLE_STRONG_EXPLOSION_RECIPE.get();
        recipes[102] = ENABLE_BURST_RECIPE.get();
        recipes[103] = ENABLE_STRONG_BURST_RECIPE.get();
        recipes[104] = ENABLE_RANDOM_TELEPORT_RECIPE.get();
        recipes[105] = ENABLE_STRONG_RANDOM_TELEPORT_RECIPE.get();
        recipes[106] = ENABLE_SURFACE_TELEPORT_RECIPE.get();
        recipes[107] = ENABLE_SPAWN_TELEPORT_RECIPE.get();
    }
}
