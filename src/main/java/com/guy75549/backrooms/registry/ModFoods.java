package com.guy75549.backrooms.registry;

import net.minecraft.world.food.FoodProperties;

public final class ModFoods {
    public static final FoodProperties ALMOND_WATER = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.6F)
            .alwaysEat()
            .build();

    private ModFoods() {}
}
