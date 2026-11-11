package com.guy75549.backrooms.registry;

import com.guy75549.backrooms.BackroomsMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BackroomsMod.MOD_ID);

    public static final RegistryObject<Block> YELLOW_WALLPAPER = BLOCKS.register("yellow_wallpaper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).strength(1.5F, 6.0F)));
    public static final RegistryObject<Block> HUMMING_LIGHT = BLOCKS.register("humming_light",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)
                    .strength(0.5F).sound(SoundType.GLASS).lightLevel(state -> 15)));
    public static final RegistryObject<Block> OLD_CARPET = BLOCKS.register("old_carpet",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_CARPET).strength(0.1F)));

    private ModBlocks() {}
}
