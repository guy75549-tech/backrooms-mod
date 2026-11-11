package com.guy75549.backrooms;

import com.guy75549.backrooms.registry.ModBlocks;
import com.guy75549.backrooms.registry.ModItems;
import com.guy75549.backrooms.registry.ModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BackroomsMod.MOD_ID)
public class BackroomsMod {
    public static final String MOD_ID = "backrooms";

    public BackroomsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModTabs.TABS.register(modEventBus);
    }
}
