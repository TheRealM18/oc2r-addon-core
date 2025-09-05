package com.therealm18studios.oc2rcore;

import com.therealm18studios.oc2rcore.common.item.ItemGroup;
import com.therealm18studios.oc2rcore.common.item.Global;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("oc2rcore")
public final class OC2RCore {

    public static String MOD_ID = "oc2rcore";

    public OC2RCore() {
        Global.initialize(FMLJavaModLoadingContext.get());
        ItemGroup.TAB_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
