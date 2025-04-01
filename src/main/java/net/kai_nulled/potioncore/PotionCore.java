package net.kai_nulled.potioncore;

import com.mojang.logging.LogUtils;
import net.kai_nulled.potioncore.effects.ModEffects;
import net.kai_nulled.potioncore.potions.ModPotions;
import net.kai_nulled.potioncore.utils.ModCreativeTab;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;
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
        ItemStack ia = new ItemStack(Items.POTION); ia.setTag(new CompoundTag());
        ItemStack ic = new ItemStack(Items.POTION); ic.setTag(new CompoundTag());
        BrewingRecipeRegistry.addRecipe(
                Ingredient.of(PotionUtils.setPotion(ia,a)),
                Ingredient.of(b),
                PotionUtils.setPotion(ic,c));
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            if(Config.recipes[0]) makeRecipe(Potions.AWKWARD,Items.CHARCOAL,ModPotions.ANTIDOTE.get());
            if(Config.recipes[1]) makeRecipe(ModPotions.ANTIDOTE.get(),Items.REDSTONE,ModPotions.LONG_ANTIDOTE.get());

            if(Config.recipes[2]) makeRecipe(Potions.AWKWARD,Items.HONEYCOMB,ModPotions.PURITY.get());
            if(Config.recipes[3]) makeRecipe(ModPotions.PURITY.get(),Items.REDSTONE,ModPotions.LONG_PURITY.get());

            if(Config.recipes[4]) makeRecipe(Potions.SLOW_FALLING,Items.FIREWORK_ROCKET,ModPotions.FLIGHT.get());
            if(Config.recipes[5]) makeRecipe(ModPotions.FLIGHT.get(),Items.REDSTONE,ModPotions.LONG_FLIGHT.get());

            if(Config.recipes[6]) makeRecipe(ModPotions.NAUSEA.get(),Items.RED_MUSHROOM,ModPotions.PERPLEXITY.get());
            if(Config.recipes[7]) makeRecipe(ModPotions.PERPLEXITY.get(),Items.REDSTONE,ModPotions.LONG_PERPLEXITY.get());

            if(Config.recipes[8]) makeRecipe(Potions.AWKWARD,Items.GOLDEN_PICKAXE,ModPotions.HASTE.get());
            if(Config.recipes[9]) makeRecipe(ModPotions.HASTE.get(),Items.REDSTONE,ModPotions.LONG_HASTE.get());
            if(Config.recipes[10]) makeRecipe(ModPotions.HASTE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_HASTE.get());

            if(Config.recipes[11]) makeRecipe(Potions.AWKWARD,Items.OBSIDIAN,ModPotions.FATIGUE.get());
            if(Config.recipes[12]) makeRecipe(ModPotions.FATIGUE.get(),Items.REDSTONE,ModPotions.LONG_FATIGUE.get());
            if(Config.recipes[13]) makeRecipe(ModPotions.FATIGUE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_FATIGUE.get());

            if(Config.recipes[14]) makeRecipe(Potions.AWKWARD,Items.BOW,ModPotions.ARCHERY.get());
            if(Config.recipes[15]) makeRecipe(ModPotions.ARCHERY.get(),Items.REDSTONE,ModPotions.LONG_ARCHERY.get());
            if(Config.recipes[16]) makeRecipe(ModPotions.ARCHERY.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_ARCHERY.get());

            if(Config.recipes[17]) makeRecipe(ModPotions.ARCHERY.get(),Items.CLAY_BALL,ModPotions.KLUTZ.get());
            if(Config.recipes[18]) makeRecipe(ModPotions.KLUTZ.get(),Items.REDSTONE,ModPotions.LONG_KLUTZ.get());
            if(Config.recipes[19]) makeRecipe(ModPotions.KLUTZ.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_KLUTZ.get());

            if(Config.recipes[20]) makeRecipe(Potions.AWKWARD,Items.LAPIS_LAZULI,ModPotions.MAGIC_FOCUS.get());
            if(Config.recipes[21]) makeRecipe(ModPotions.MAGIC_FOCUS.get(),Items.REDSTONE,ModPotions.LONG_MAGIC_FOCUS.get());
            if(Config.recipes[22]) makeRecipe(ModPotions.MAGIC_FOCUS.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_MAGIC_FOCUS.get());

            if(Config.recipes[23]) makeRecipe(Potions.AWKWARD,Items.MUD,ModPotions.MAGIC_INHIBITION.get());
            if(Config.recipes[24]) makeRecipe(ModPotions.MAGIC_INHIBITION.get(),Items.REDSTONE,ModPotions.LONG_MAGIC_INHIBITION.get());
            if(Config.recipes[25]) makeRecipe(ModPotions.MAGIC_INHIBITION.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_MAGIC_INHIBITION.get());

            if(Config.recipes[26]) makeRecipe(Potions.AWKWARD,Items.DIAMOND_PICKAXE,ModPotions.REACH.get());
            if(Config.recipes[27]) makeRecipe(ModPotions.REACH.get(),Items.REDSTONE,ModPotions.LONG_REACH.get());
            if(Config.recipes[28]) makeRecipe(ModPotions.REACH.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_REACH.get());

            if(Config.recipes[29]) makeRecipe(Potions.AWKWARD,Items.POINTED_DRIPSTONE,ModPotions.RECOIL.get());
            if(Config.recipes[30]) makeRecipe(ModPotions.RECOIL.get(),Items.REDSTONE,ModPotions.LONG_RECOIL.get());
            if(Config.recipes[31]) makeRecipe(ModPotions.RECOIL.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_RECOIL.get());

            if(Config.recipes[32]) makeRecipe(Potions.AWKWARD,Items.EXPERIENCE_BOTTLE,ModPotions.REPAIR.get());
            if(Config.recipes[33]) makeRecipe(ModPotions.REPAIR.get(),Items.REDSTONE,ModPotions.LONG_REPAIR.get());
            if(Config.recipes[34]) makeRecipe(ModPotions.REPAIR.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_REPAIR.get());

            if(Config.recipes[35]) makeRecipe(ModPotions.REPAIR.get(),Items.WITHER_ROSE,ModPotions.RUST.get());
            if(Config.recipes[36]) makeRecipe(ModPotions.RUST.get(),Items.REDSTONE,ModPotions.LONG_RUST.get());
            if(Config.recipes[37]) makeRecipe(ModPotions.RUST.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_RUST.get());

            if(Config.recipes[38]) makeRecipe(Potions.AWKWARD,Items.SHIELD,ModPotions.SOLID_CORE.get());
            if(Config.recipes[39]) makeRecipe(ModPotions.SOLID_CORE.get(),Items.REDSTONE,ModPotions.LONG_SOLID_CORE.get());
            if(Config.recipes[40]) makeRecipe(ModPotions.SOLID_CORE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_SOLID_CORE.get());

            if(Config.recipes[41]) makeRecipe(ModPotions.NAUSEA.get(),Items.MINECART,ModPotions.SPIN.get());
            if(Config.recipes[42]) makeRecipe(ModPotions.SPIN.get(),Items.REDSTONE,ModPotions.LONG_SPIN.get());
            if(Config.recipes[43]) makeRecipe(ModPotions.SPIN.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_SPIN.get());

            if(Config.recipes[44]) makeRecipe(Potions.AWKWARD,Items.CALCITE,ModPotions.STEP_UP.get());
            if(Config.recipes[45]) makeRecipe(ModPotions.STEP_UP.get(),Items.REDSTONE,ModPotions.LONG_STEP_UP.get());
            if(Config.recipes[46]) makeRecipe(ModPotions.STEP_UP.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_STEP_UP.get());

            if(Config.recipes[47]) makeRecipe(Potions.AWKWARD,Items.ROTTEN_FLESH,ModPotions.VULNERABLE.get());
            if(Config.recipes[48]) makeRecipe(ModPotions.VULNERABLE.get(),Items.REDSTONE,ModPotions.LONG_VULNERABLE.get());
            if(Config.recipes[49]) makeRecipe(ModPotions.VULNERABLE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_VULNERABLE.get());

            if(Config.recipes[50]) makeRecipe(Potions.AWKWARD,Items.RED_MUSHROOM,ModPotions.NAUSEA.get());
            if(Config.recipes[51]) makeRecipe(ModPotions.NAUSEA.get(),Items.REDSTONE,ModPotions.LONG_NAUSEA.get());

            if(Config.recipes[52]) makeRecipe(Potions.AWKWARD,Items.DROPPER,ModPotions.CHANCE.get());
            if(Config.recipes[53]) makeRecipe(ModPotions.CHANCE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_CHANCE.get());

            if(Config.recipes[54]) makeRecipe(ModPotions.CHANCE.get(),Items.EMERALD,ModPotions.BLESS.get());
            if(Config.recipes[55]) makeRecipe(ModPotions.BLESS.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_BLESS.get());

            if(Config.recipes[56]) makeRecipe(ModPotions.CHANCE.get(),Items.WITHER_ROSE,ModPotions.CURSE.get());
            if(Config.recipes[57]) makeRecipe(ModPotions.CURSE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_CURSE.get());

            if(Config.recipes[58]) makeRecipe(ModPotions.ANTIDOTE.get(),Items.GLISTERING_MELON_SLICE,ModPotions.CURE.get());
            if(Config.recipes[59]) makeRecipe(ModPotions.WITHER.get(),Items.WITHER_ROSE,ModPotions.DISPEL.get());

            if(Config.recipes[60]) makeRecipe(Potions.AWKWARD,Items.WITHER_ROSE,ModPotions.WITHER.get());
            if(Config.recipes[61]) makeRecipe(ModPotions.WITHER.get(),Items.REDSTONE,ModPotions.LONG_WITHER.get());
            if(Config.recipes[62]) makeRecipe(ModPotions.WITHER.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_WITHER.get());

            if(Config.recipes[63]) makeRecipe(Potions.AWKWARD,Items.WHEAT,ModPotions.LOVE.get());
            if(Config.recipes[64]) makeRecipe(ModPotions.LOVE.get(),Items.REDSTONE,ModPotions.LONG_LOVE.get());
            if(Config.recipes[65]) makeRecipe(ModPotions.LOVE.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_LOVE.get());

            if(Config.recipes[66]) makeRecipe(Potions.AWKWARD,Items.IRON_INGOT,ModPotions.IRON_SKIN.get());
            if(Config.recipes[67]) makeRecipe(ModPotions.IRON_SKIN.get(),Items.REDSTONE,ModPotions.LONG_IRON_SKIN.get());
            if(Config.recipes[68]) makeRecipe(ModPotions.IRON_SKIN.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_IRON_SKIN.get());

            if(Config.recipes[69]) makeRecipe(Potions.AWKWARD,Items.DIAMOND,ModPotions.DIAMOND_SKIN.get());
            if(Config.recipes[70]) makeRecipe(ModPotions.DIAMOND_SKIN.get(),Items.REDSTONE,ModPotions.LONG_DIAMOND_SKIN.get());
            if(Config.recipes[71]) makeRecipe(ModPotions.DIAMOND_SKIN.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_DIAMOND_SKIN.get());

            if(Config.recipes[72]) makeRecipe(ModPotions.IRON_SKIN.get(),Items.WITHER_ROSE,ModPotions.BROKEN_ARMOR.get());
            if(Config.recipes[73]) makeRecipe(ModPotions.BROKEN_ARMOR.get(),Items.REDSTONE,ModPotions.LONG_BROKEN_ARMOR.get());
            if(Config.recipes[74]) makeRecipe(ModPotions.BROKEN_ARMOR.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_BROKEN_ARMOR.get());

            if(Config.recipes[75]) makeRecipe(Potions.AWKWARD,Items.LADDER,ModPotions.CLIMB.get());
            if(Config.recipes[76]) makeRecipe(ModPotions.CLIMB.get(),Items.REDSTONE,ModPotions.LONG_CLIMB.get());

            if(Config.recipes[77]) makeRecipe(Potions.AWKWARD,Items.ENCHANTED_BOOK,ModPotions.MAGIC_SHIELD.get());
            if(Config.recipes[78]) makeRecipe(ModPotions.MAGIC_SHIELD.get(),Items.REDSTONE,ModPotions.LONG_MAGIC_SHIELD.get());
            if(Config.recipes[79]) makeRecipe(ModPotions.MAGIC_SHIELD.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_MAGIC_SHIELD.get());

            if(Config.recipes[80]) makeRecipe(Potions.AWKWARD,Items.WITHER_ROSE,ModPotions.BROKEN_MAGIC_SHIELD.get());
            if(Config.recipes[81]) makeRecipe(ModPotions.BROKEN_MAGIC_SHIELD.get(),Items.REDSTONE,ModPotions.LONG_BROKEN_MAGIC_SHIELD.get());
            if(Config.recipes[82]) makeRecipe(ModPotions.BROKEN_MAGIC_SHIELD.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_BROKEN_MAGIC_SHIELD.get());

            if(Config.recipes[83]) makeRecipe(Potions.THICK,Items.SALMON,ModPotions.DROWN.get());
            if(Config.recipes[84]) makeRecipe(ModPotions.DROWN.get(),Items.REDSTONE,ModPotions.LONG_DROWN.get());
            if(Config.recipes[85]) makeRecipe(ModPotions.DROWN.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_DROWN.get());

            if(Config.recipes[86]) makeRecipe(Potions.HEALING,Items.TOTEM_OF_UNDYING,ModPotions.REVIVAL.get());
            if(Config.recipes[87]) makeRecipe(ModPotions.REVIVAL.get(),Items.REDSTONE,ModPotions.LONG_REVIVAL.get());
            if(Config.recipes[88]) makeRecipe(ModPotions.REVIVAL.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_REVIVAL.get());

            if(Config.recipes[89]) makeRecipe(Potions.AWKWARD,Items.ANVIL,ModPotions.WEIGHT.get());
            if(Config.recipes[90]) makeRecipe(ModPotions.WEIGHT.get(),Items.REDSTONE,ModPotions.LONG_WEIGHT.get());
            if(Config.recipes[91]) makeRecipe(ModPotions.WEIGHT.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_WEIGHT.get());

            if(Config.recipes[92]) makeRecipe(Potions.AWKWARD,Items.LIGHTNING_ROD,ModPotions.LIGHTNING.get());
            if(Config.recipes[93]) makeRecipe(Potions.THICK,Items.NETHERITE_INGOT,ModPotions.INVERT.get());

            if(Config.recipes[94]) makeRecipe(Potions.AWKWARD,Items.FLINT_AND_STEEL,ModPotions.FIRE.get());
            if(Config.recipes[95]) makeRecipe(ModPotions.FIRE.get(),Items.REDSTONE,ModPotions.LONG_FIRE.get());

            if(Config.recipes[96]) makeRecipe(Potions.AWKWARD,Items.REDSTONE,ModPotions.EXTEND.get());
            if(Config.recipes[97]) makeRecipe(ModPotions.EXTEND.get(),Items.REDSTONE,ModPotions.LONG_EXTEND.get());

            if(Config.recipes[98]) makeRecipe(Potions.LEAPING,Items.PISTON,ModPotions.LAUNCH.get());
            if(Config.recipes[99]) makeRecipe(ModPotions.LAUNCH.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_LAUNCH.get());

            if(Config.recipes[100]) makeRecipe(Potions.AWKWARD,Items.TNT,ModPotions.EXPLOSION.get());
            if(Config.recipes[101]) makeRecipe(ModPotions.EXPLOSION.get(),Items.TNT,ModPotions.STRONG_EXPLOSION.get());

            if(Config.recipes[102]) makeRecipe(ModPotions.EXPLOSION.get(),Items.IRON_BLOCK,ModPotions.BURST.get());
            if(Config.recipes[103]) makeRecipe(ModPotions.BURST.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_BURST.get());

            if(Config.recipes[104]) makeRecipe(Potions.AWKWARD,Items.CHORUS_FRUIT,ModPotions.RANDOM_TELEPORT.get());
            if(Config.recipes[105]) makeRecipe(ModPotions.RANDOM_TELEPORT.get(),Items.GLOWSTONE_DUST,ModPotions.STRONG_RANDOM_TELEPORT.get());
            if(Config.recipes[106]) makeRecipe(ModPotions.RANDOM_TELEPORT.get(),Items.GRASS_BLOCK,ModPotions.SURFACE_TELEPORT.get());
            if(Config.recipes[107]) makeRecipe(ModPotions.RANDOM_TELEPORT.get(),Items.WHITE_BED,ModPotions.SPAWN_TELEPORT.get());
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
