package net.kai_nulled.potioncore.procedures;

import net.kai_nulled.potioncore.PotionCore;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = PotionCore.MODID,bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModGlobalVars {
    public static List<MobEffect> potionList = new ArrayList<>();
    public static List<MobEffect> gpotionList = new ArrayList<>();
    public static List<MobEffect> bpotionList = new ArrayList<>();

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        for(MobEffect i: ForgeRegistries.MOB_EFFECTS) {
            potionList.add(i);
            if(i.isBeneficial()) gpotionList.add(i);
            else if (i.getCategory() == MobEffectCategory.HARMFUL) bpotionList.add(i);
        }
    }
}
