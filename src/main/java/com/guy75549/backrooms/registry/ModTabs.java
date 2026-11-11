package com.guy75549.backrooms.registry;

import com.guy75549.backrooms.BackroomsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BackroomsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BACKROOMS_TAB = TABS.register("backrooms",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.backrooms"))
                    .icon(() -> new ItemStack(ModItems.ALMOND_WATER.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ALMOND_WATER.get());
                        output.accept(ModItems.YELLOW_WALLPAPER.get());
                        output.accept(ModItems.HUMMING_LIGHT.get());
                        output.accept(ModItems.OLD_CARPET.get());
                    })
                    .build());

    private ModTabs() {}
}
