package com.therealm18studios.oc2rcore.common.item;

import com.therealm18studios.oc2rcore.OC2RCore;
import com.therealm18studios.oc2rcore.compat.items.*;
import dev.architectury.platform.Platform;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ItemGroup {
    public static final DeferredRegister<CreativeModeTab> TAB_REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OC2RCore.MOD_ID);

    @SuppressWarnings("unused")
    public static final RegistryObject<CreativeModeTab> GLOBAL_TAB = TAB_REGISTER.register("global", () -> CreativeModeTab.builder()
        // Set name of tab to display
        .title(Component.translatable("item_group." + OC2RCore.MOD_ID + ".global"))
        // Set icon of creative tab
        .icon(() -> new ItemStack(Global.ELLIPTICAL.get()))
        // Add default items to tab
        .displayItems((params, output) -> {

            // Default Items
            output.accept(Global.ELLIPTICAL.get());

            // OC2R Components
            if (Platform.isModLoaded("oc2rc")) {
                // CPU Items
                output.accept(OC2RCItems.CPU_TIER_1);
                output.accept(OC2RCItems.CPU_TIER_2);
                output.accept(OC2RCItems.CPU_TIER_3);
                output.accept(OC2RCItems.CPU_TIER_4);

                // Memory Items
                output.accept(OC2RCItems.MEMORY_SMALL);
                output.accept(OC2RCItems.MEMORY_MEDIUM);
                output.accept(OC2RCItems.MEMORY_LARGE);
                output.accept(OC2RCItems.MEMORY_EXTRA_LARGE);

                // Hard Drive Items
                output.accept(OC2RCItems.HARD_DRIVE_SMALL);
                output.accept(OC2RCItems.HARD_DRIVE_MEDIUM);
                output.accept(OC2RCItems.HARD_DRIVE_LARGE);
                output.accept(OC2RCItems.HARD_DRIVE_EXTRA_LARGE);

                // Floppy Disks
                output.accept(OC2RCItems.FLOPPY_DISK);
                output.accept(OC2RCItems.MODERN_FLOPPY_DISK);
            }

            // OC2R Batteries
            if (Platform.isModLoaded("oc2rpower")) {

                // Battery Items
                output.accept(OC2RPowerItems.BATTERY_SMALL);
                output.accept(OC2RPowerItems.BATTERY_MEDIUM);
                output.accept(OC2RPowerItems.BATTERY_LARGE);
                output.accept(OC2RPowerItems.BATTERY_EXTRA_LARGE);
            }

            // OC2R Valkyrie Skies
            if (Platform.isModLoaded("oc2rvs")) {

                // Circuit Items
                output.accept(OC2RVSItems.SHIP_OPERATIONS_MODULE);
            }

            // OC2R DamOS Item
            if (Platform.isModLoaded("oc2rdamos")) {

                // OS Item
                output.accept(OC2RDamOSItems.DAMOS);
            }
        })
        .build()
    );
}
