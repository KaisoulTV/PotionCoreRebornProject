package net.kai_nulled.potioncore.utils;

import net.kai_nulled.potioncore.PotionCore;
import net.kai_nulled.potioncore.potions.ModPotions;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB
            = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PotionCore.MODID);

    public static final RegistryObject<CreativeModeTab> POTION_CORE = CREATIVE_MODE_TAB.register("potioncore",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.POTION.asItem()))
                    .title(Component.translatable("creativetab.potioncore"))
                    .displayItems((pParameters, pOutput) -> {
                        for(RegistryObject<Potion> potion: ModPotions.POTIONS.getEntries()) {
                            ItemStack itemStack = new ItemStack(Items.POTION);
                            itemStack.setTag(new CompoundTag());
                            PotionUtils.setPotion(itemStack, potion.get());
                            pOutput.accept(itemStack);
                            ItemStack itemStack1 = new ItemStack(Items.SPLASH_POTION);
                            itemStack1.setTag(new CompoundTag());
                            PotionUtils.setPotion(itemStack1, potion.get());
                            pOutput.accept(itemStack1);
                            ItemStack itemStack2 = new ItemStack(Items.LINGERING_POTION);
                            itemStack2.setTag(new CompoundTag());
                            PotionUtils.setPotion(itemStack2, potion.get());
                            pOutput.accept(itemStack2);
                            ItemStack itemStack3 = new ItemStack(Items.TIPPED_ARROW);
                            itemStack3.setTag(new CompoundTag());
                            PotionUtils.setPotion(itemStack3, potion.get());
                            pOutput.accept(itemStack3);
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
