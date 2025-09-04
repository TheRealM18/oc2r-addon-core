package com.therealm18studios.oc2rcore.compat.items;

import com.therealm18studios.oc2rpower.item.Items;
import net.minecraft.world.item.ItemStack;

public class OC2RPowerItems {

    public static void initialize() {

    }

    // Mod ID
    public static final String MOD_ID = "oc2rpower";

    // Memory
    public static final ItemStack BATTERY_SMALL = new ItemStack(Items.BATTERY_SMALL.get());
    public static final ItemStack BATTERY_MEDIUM = new ItemStack(Items.BATTERY_MEDIUM.get());
    public static final ItemStack BATTERY_LARGE = new ItemStack(Items.BATTERY_LARGE.get());
    public static final ItemStack BATTERY_EXTRA_LARGE = new ItemStack(Items.BATTERY_EXTRA_LARGE.get());
}
