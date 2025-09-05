package com.therealm18studios.oc2rcore.common.item;

import com.therealm18studios.oc2rcore.OC2RCore;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class Global {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OC2RCore.MOD_ID);
    public static final RegistryObject<Item> ELLIPTICAL = ITEMS.register("global", () -> new Item(new Item.Properties()));

    /// ////////////////////////////////////////////////////////////////

    public static void initialize(FMLJavaModLoadingContext context) {
        ITEMS.register(context.getModEventBus());
    }
    /// ////////////////////////////////////////////////////////////////

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> factory) {
        return ITEMS.register(name, factory);
    }

    private static <TBlock extends Block, TItem extends Item> RegistryObject<TItem> register(final RegistryObject<TBlock> block, final Function<TBlock, TItem> factory) {
        return register(block.getId().getPath(), () -> factory.apply(block.get()));
    }
}
