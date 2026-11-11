package com.guy75549.backrooms.registry;

import com.guy75549.backrooms.BackroomsMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BackroomsMod.MOD_ID);

    public static final RegistryObject<Item> ALMOND_WATER = ITEMS.register("almond_water",
            () -> new Item(new Item.Properties().food(ModFoods.ALMOND_WATER)));
    public static final RegistryObject<Item> YELLOW_WALLPAPER = ITEMS.register("yellow_wallpaper",
            () -> new BlockItem(ModBlocks.YELLOW_WALLPAPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HUMMING_LIGHT = ITEMS.register("humming_light",
            () -> new BlockItem(ModBlocks.HUMMING_LIGHT.get(), new Item.Properties()));
    public static final RegistryObject<Item> OLD_CARPET = ITEMS.register("old_carpet",
            () -> new BlockItem(ModBlocks.OLD_CARPET.get(), new Item.Properties()));

    private ModItems() {}
}
