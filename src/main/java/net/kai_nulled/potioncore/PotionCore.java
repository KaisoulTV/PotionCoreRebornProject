package net.kai_nulled.potioncore;

import com.mojang.logging.LogUtils;
import mezz.jei.api.JeiPlugin;
import net.kai_nulled.potioncore.attributes.ModAttributes;
import net.kai_nulled.potioncore.effects.ModEffects;
import net.kai_nulled.potioncore.potions.ModPotions;
import net.kai_nulled.potioncore.procedures.ModEventHandler;
import net.kai_nulled.potioncore.utils.BetterBrewingRecipes;
import net.kai_nulled.potioncore.utils.ModCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

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

            makeRecipe(Potions.THICK,Items.RED_MUSHROOM,ModPotions.PERPLEXITY.get());
            makeRecipe(ModPotions.PURITY.get(),Items.REDSTONE,ModPotions.LONG_PURITY.get());

            makeRecipe(Potions.THICK,Items.CHEST,ModPotions.DISORGANIZATION.get());
            makeRecipe(ModPotions.DISORGANIZATION.get(),Items.REDSTONE,ModPotions.LONG_DISORGANIZATION.get());
        });
    }
}
