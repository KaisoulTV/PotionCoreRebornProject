package net.kai_nulled.potioncore;

import com.mojang.logging.LogUtils;
import net.kai_nulled.potioncore.effects.ModEffects;
import net.kai_nulled.potioncore.potions.ModPotions;
import net.kai_nulled.potioncore.utils.BetterBrewingRecipes;
import net.kai_nulled.potioncore.utils.ModCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import org.slf4j.Logger;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

@Mod(PotionCore.MODID)
public class PotionCore
{
    public static final String MODID = "potioncore";
    private static final Logger LOGGER = LogUtils.getLogger();
    public PotionCore()
    {
        LOGGER.info("Loading Potion Core...");
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);
        ModCreativeTab.register(modEventBus);
        
        modEventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void makeRecipe(Potion a, Item b, Potion c) {
        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipes(a,b,c));
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            makeRecipe(Potions.AWKWARD,Items.CHARCOAL,ModPotions.ANTIDOTE.get());
            makeRecipe(ModPotions.ANTIDOTE.get(),Items.REDSTONE,ModPotions.LONG_ANTIDOTE.get());

            makeRecipe(Potions.AWKWARD,Items.HONEYCOMB,ModPotions.PURITY.get());
            makeRecipe(ModPotions.PURITY.get(),Items.REDSTONE,ModPotions.LONG_PURITY.get());

            makeRecipe(Potions.SLOW_FALLING,Items.FIREWORK_ROCKET,ModPotions.FLIGHT.get());
            makeRecipe(ModPotions.FLIGHT.get(),Items.REDSTONE,ModPotions.LONG_FLIGHT.get());

            makeRecipe(ModPotions.NAUSEA.get(),Items.RED_MUSHROOM,ModPotions.PERPLEXITY.get());
            makeRecipe(ModPotions.PURITY.get(),Items.REDSTONE,ModPotions.LONG_PERPLEXITY.get());

            makeRecipe(Potions.THICK,Items.CHEST,ModPotions.DISORGANIZATION.get());
            makeRecipe(ModPotions.DISORGANIZATION.get(),Items.REDSTONE,ModPotions.LONG_DISORGANIZATION.get());

            makeRecipe(Potions.AWKWARD,Items.GOLDEN_PICKAXE,ModPotions.HASTE.get());
            makeRecipe(ModPotions.HASTE.get(),Items.REDSTONE,ModPotions.LONG_HASTE.get());
            makeRecipe(ModPotions.HASTE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_HASTE.get());

            makeRecipe(Potions.AWKWARD,Items.OBSIDIAN,ModPotions.FATIGUE.get());
            makeRecipe(ModPotions.FATIGUE.get(),Items.REDSTONE,ModPotions.LONG_FATIGUE.get());
            makeRecipe(ModPotions.FATIGUE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_FATIGUE.get());

            makeRecipe(Potions.AWKWARD,Items.BOW,ModPotions.ARCHERY.get());
            makeRecipe(ModPotions.ARCHERY.get(),Items.REDSTONE,ModPotions.LONG_ARCHERY.get());
            makeRecipe(ModPotions.ARCHERY.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_ARCHERY.get());

            makeRecipe(ModPotions.ARCHERY.get(),Items.CLAY_BALL,ModPotions.KLUTZ.get());
            makeRecipe(ModPotions.KLUTZ.get(),Items.REDSTONE,ModPotions.LONG_KLUTZ.get());
            makeRecipe(ModPotions.KLUTZ.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_KLUTZ.get());

            makeRecipe(Potions.AWKWARD,Items.LAPIS_LAZULI,ModPotions.MAGIC_FOCUS.get());
            makeRecipe(ModPotions.MAGIC_FOCUS.get(),Items.REDSTONE,ModPotions.LONG_MAGIC_FOCUS.get());
            makeRecipe(ModPotions.MAGIC_FOCUS.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_MAGIC_FOCUS.get());

            makeRecipe(Potions.AWKWARD,Items.MUD,ModPotions.MAGIC_INHIBITION.get());
            makeRecipe(ModPotions.MAGIC_INHIBITION.get(),Items.REDSTONE,ModPotions.LONG_MAGIC_INHIBITION.get());
            makeRecipe(ModPotions.MAGIC_INHIBITION.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_MAGIC_INHIBITION.get());

            makeRecipe(Potions.AWKWARD,Items.DIAMOND_PICKAXE,ModPotions.REACH.get());
            makeRecipe(ModPotions.REACH.get(),Items.REDSTONE,ModPotions.LONG_REACH.get());
            makeRecipe(ModPotions.REACH.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_REACH.get());

            makeRecipe(Potions.AWKWARD,Items.POINTED_DRIPSTONE,ModPotions.RECOIL.get());
            makeRecipe(ModPotions.RECOIL.get(),Items.REDSTONE,ModPotions.LONG_RECOIL.get());
            makeRecipe(ModPotions.RECOIL.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_RECOIL.get());

            makeRecipe(Potions.AWKWARD,Items.EXPERIENCE_BOTTLE,ModPotions.REPAIR.get());
            makeRecipe(ModPotions.REPAIR.get(),Items.REDSTONE,ModPotions.LONG_REPAIR.get());
            makeRecipe(ModPotions.REPAIR.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_REPAIR.get());

            makeRecipe(ModPotions.REPAIR.get(),Items.WITHER_ROSE,ModPotions.RUST.get());
            makeRecipe(ModPotions.RUST.get(),Items.REDSTONE,ModPotions.LONG_RUST.get());
            makeRecipe(ModPotions.RUST.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_RUST.get());

            makeRecipe(Potions.AWKWARD,Items.SHIELD,ModPotions.SOLID_CORE.get());
            makeRecipe(ModPotions.SOLID_CORE.get(),Items.REDSTONE,ModPotions.LONG_SOLID_CORE.get());
            makeRecipe(ModPotions.SOLID_CORE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_SOLID_CORE.get());

            makeRecipe(ModPotions.NAUSEA.get(),Items.MINECART,ModPotions.SPIN.get());
            makeRecipe(ModPotions.SPIN.get(),Items.REDSTONE,ModPotions.LONG_SPIN.get());
            makeRecipe(ModPotions.SPIN.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_SPIN.get());

            makeRecipe(Potions.AWKWARD,Items.CALCITE,ModPotions.STEP_UP.get());
            makeRecipe(ModPotions.STEP_UP.get(),Items.REDSTONE,ModPotions.LONG_STEP_UP.get());
            makeRecipe(ModPotions.STEP_UP.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_STEP_UP.get());

            makeRecipe(Potions.AWKWARD,Items.ROTTEN_FLESH,ModPotions.VULNERABLE.get());
            makeRecipe(ModPotions.VULNERABLE.get(),Items.REDSTONE,ModPotions.LONG_VULNERABLE.get());
            makeRecipe(ModPotions.VULNERABLE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_VULNERABLE.get());

            makeRecipe(Potions.AWKWARD,Items.RED_MUSHROOM,ModPotions.NAUSEA.get());
            makeRecipe(ModPotions.NAUSEA.get(),Items.REDSTONE,ModPotions.LONG_NAUSEA.get());

            makeRecipe(Potions.AWKWARD,Items.DROPPER,ModPotions.CHANCE.get());
            makeRecipe(ModPotions.CHANCE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_CHANCE.get());

            makeRecipe(ModPotions.CHANCE.get(),Items.EMERALD,ModPotions.BLESS.get());
            makeRecipe(ModPotions.BLESS.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_BLESS.get());

            makeRecipe(ModPotions.CHANCE.get(),Items.WITHER_ROSE,ModPotions.CURSE.get());
            makeRecipe(ModPotions.CURSE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_CURSE.get());

            makeRecipe(ModPotions.ANTIDOTE.get(),Items.GLISTERING_MELON_SLICE,ModPotions.CURE.get());
            makeRecipe(ModPotions.WITHER.get(),Items.WITHER_ROSE,ModPotions.DISPEL.get());

            makeRecipe(Potions.AWKWARD,Items.WITHER_ROSE,ModPotions.WITHER.get());
            makeRecipe(ModPotions.WITHER.get(),Items.REDSTONE,ModPotions.LONG_WITHER.get());
            makeRecipe(ModPotions.WITHER.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_WITHER.get());

            makeRecipe(Potions.AWKWARD,Items.WHEAT,ModPotions.LOVE.get());
            makeRecipe(ModPotions.LOVE.get(),Items.REDSTONE,ModPotions.LONG_LOVE.get());
            makeRecipe(ModPotions.LOVE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_LOVE.get());

            makeRecipe(Potions.AWKWARD,Items.IRON_INGOT,ModPotions.IRON_SKIN.get());
            makeRecipe(ModPotions.IRON_SKIN.get(),Items.REDSTONE,ModPotions.LONG_IRON_SKIN.get());
            makeRecipe(ModPotions.IRON_SKIN.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_IRON_SKIN.get());

            makeRecipe(Potions.AWKWARD,Items.DIAMOND,ModPotions.DIAMOND_SKIN.get());
            makeRecipe(ModPotions.DIAMOND_SKIN.get(),Items.REDSTONE,ModPotions.LONG_DIAMOND_SKIN.get());
            makeRecipe(ModPotions.DIAMOND_SKIN.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_DIAMOND_SKIN.get());

            makeRecipe(ModPotions.IRON_SKIN.get(),Items.WITHER_ROSE,ModPotions.BROKEN_ARMOR.get());
            makeRecipe(ModPotions.BROKEN_ARMOR.get(),Items.REDSTONE,ModPotions.LONG_BROKEN_ARMOR.get());
            makeRecipe(ModPotions.BROKEN_ARMOR.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_BROKEN_ARMOR.get());

            makeRecipe(Potions.AWKWARD,Items.LADDER,ModPotions.CLIMB.get());
            makeRecipe(ModPotions.CLIMB.get(),Items.REDSTONE,ModPotions.LONG_CLIMB.get());

            makeRecipe(Potions.AWKWARD,Items.ENCHANTED_BOOK,ModPotions.MAGIC_SHIELD.get());
            makeRecipe(ModPotions.MAGIC_SHIELD.get(),Items.REDSTONE,ModPotions.LONG_MAGIC_SHIELD.get());
            makeRecipe(ModPotions.MAGIC_SHIELD.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_MAGIC_SHIELD.get());

            makeRecipe(Potions.AWKWARD,Items.WITHER_ROSE,ModPotions.BROKEN_MAGIC_SHIELD.get());
            makeRecipe(ModPotions.BROKEN_MAGIC_SHIELD.get(),Items.REDSTONE,ModPotions.LONG_BROKEN_MAGIC_SHIELD.get());
            makeRecipe(ModPotions.BROKEN_MAGIC_SHIELD.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_BROKEN_MAGIC_SHIELD.get());

            makeRecipe(Potions.AWKWARD,Items.DIAMOND,ModPotions.DIAMOND_SKIN.get());
            makeRecipe(ModPotions.DIAMOND_SKIN.get(),Items.REDSTONE,ModPotions.LONG_DIAMOND_SKIN.get());
            makeRecipe(ModPotions.DIAMOND_SKIN.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_DIAMOND_SKIN.get());

            makeRecipe(Potions.THICK,Items.SALMON,ModPotions.DROWN.get());
            makeRecipe(ModPotions.DROWN.get(),Items.REDSTONE,ModPotions.LONG_DROWN.get());
            makeRecipe(ModPotions.DROWN.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_DROWN.get());

            makeRecipe(Potions.HEALING,Items.TOTEM_OF_UNDYING,ModPotions.REVIVAL.get());
            makeRecipe(ModPotions.REVIVAL.get(),Items.REDSTONE,ModPotions.LONG_REVIVAL.get());
            makeRecipe(ModPotions.REVIVAL.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_REVIVAL.get());

            makeRecipe(Potions.AWKWARD,Items.ANVIL,ModPotions.WEIGHT.get());
            makeRecipe(ModPotions.WEIGHT.get(),Items.REDSTONE,ModPotions.LONG_WEIGHT.get());
            makeRecipe(ModPotions.WEIGHT.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_WEIGHT.get());

            makeRecipe(Potions.AWKWARD,Items.LIGHTNING_ROD,ModPotions.LIGHTNING.get());
            makeRecipe(Potions.THICK,Items.NETHERITE_INGOT,ModPotions.INVERT.get());

            makeRecipe(Potions.AWKWARD,Items.FLINT_AND_STEEL,ModPotions.FIRE.get());
            makeRecipe(ModPotions.FIRE.get(),Items.REDSTONE,ModPotions.LONG_FIRE.get());

            makeRecipe(Potions.AWKWARD,Items.REDSTONE,ModPotions.EXTEND.get());
            makeRecipe(ModPotions.EXTEND.get(),Items.REDSTONE,ModPotions.LONG_EXTEND.get());

            makeRecipe(Potions.LEAPING,Items.PISTON,ModPotions.LAUNCH.get());
            makeRecipe(ModPotions.LAUNCH.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_LAUNCH.get());

            makeRecipe(Potions.AWKWARD,Items.TNT,ModPotions.EXPLOSION.get());
            makeRecipe(ModPotions.EXPLOSION.get(),Items.TNT,ModPotions.STRONG_EXPLOSION.get());

            makeRecipe(ModPotions.EXPLOSION.get(),Items.IRON_BLOCK,ModPotions.BURST.get());
            makeRecipe(ModPotions.BURST.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_BURST.get());

            makeRecipe(Potions.AWKWARD,Items.CHORUS_FRUIT,ModPotions.RANDOM_TELEPORT.get());
            makeRecipe(ModPotions.RANDOM_TELEPORT.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_RANDOM_TELEPORT.get());
            makeRecipe(ModPotions.RANDOM_TELEPORT.get(),Items.GRASS_BLOCK,ModPotions.SURFACE_TELEPORT.get());
            makeRecipe(ModPotions.RANDOM_TELEPORT.get(),Items.WHITE_BED,ModPotions.SPAWN_TELEPORT.get());
        });
    }

    private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

    public static void queueServerWork(int tick, Runnable action) {
        if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
            workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
    }

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
            workQueue.forEach(work -> {
                work.setValue(work.getValue() - 1);
                if (work.getValue() == 0)
                    actions.add(work);
            });
            actions.forEach(e -> e.getKey().run());
            workQueue.removeAll(actions);
        }
    }
}
