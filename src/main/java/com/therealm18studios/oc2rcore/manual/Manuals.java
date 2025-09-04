package com.therealm18studios.oc2rcore.manual;

import com.therealm18studios.oc2rcore.compat.items.*;
import dev.architectury.platform.Platform;
import li.cil.manual.api.ManualModel;
import li.cil.manual.api.Tab;
import li.cil.manual.api.prefab.tab.ItemStackTab;
import li.cil.manual.api.util.Constants;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

@OnlyIn(Dist.CLIENT)
public final class Manuals {

    private static final DeferredRegister<Tab> TABS = DeferredRegister.create(Constants.TAB_REGISTRY, Constants.MOD_ID);

    /// ////////////////////////////////////////////////////////////////

    public static void initialize() {
        TABS.register(FMLJavaModLoadingContext.get().getModEventBus());


        if (Platform.isModLoaded(OC2RCItems.MOD_ID)) {
            TABS.register(OC2RCItems.MOD_ID, () -> new ItemStackTab(
                ManualModel.LANGUAGE_KEY + "/" + OC2RCItems.MOD_ID + "/index.md",
                Component.translatable("manual." + OC2RCItems.MOD_ID + ".items"),
                new ItemStack(OC2RCItems.HARD_DRIVE_EXTRA_LARGE.getItem())));
        }


        // OC2R Power Components
        if (Platform.isModLoaded(OC2RPowerItems.MOD_ID)) {
            TABS.register(OC2RPowerItems.MOD_ID, () -> new ItemStackTab(
                ManualModel.LANGUAGE_KEY + "/" + OC2RPowerItems.MOD_ID + "/index.md",
                Component.translatable("manual." + OC2RPowerItems.MOD_ID + ".items"),
                new ItemStack(OC2RCItems.HARD_DRIVE_EXTRA_LARGE.getItem())));
        }


        // OC2R Power Components
        if (Platform.isModLoaded(OC2RLibraryItems.MOD_ID)) {
            TABS.register(OC2RLibraryItems.MOD_ID, () -> new ItemStackTab(
                ManualModel.LANGUAGE_KEY + "/" + OC2RLibraryItems.MOD_ID + "/index.md",
                Component.translatable("manual." + OC2RLibraryItems.MOD_ID + ".items"),
                new ItemStack(Items.BOOK)));
        }


        // OC2R Valkyrie Skies
        if (Platform.isModLoaded(OC2RVSItems.MOD_ID)) {
            TABS.register(OC2RVSItems.MOD_ID, () -> new ItemStackTab(
                ManualModel.LANGUAGE_KEY + "/" + OC2RVSItems.MOD_ID + "/index.md",
                Component.translatable("manual." + OC2RVSItems.MOD_ID + ".items"),
                new ItemStack(OC2RVSItems.SHIP_OPERATIONS_MODULE.getItem())));
        }
    }
}
