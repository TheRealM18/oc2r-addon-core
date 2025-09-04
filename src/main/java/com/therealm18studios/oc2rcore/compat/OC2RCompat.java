package com.therealm18studios.oc2rcore.compat;

import com.therealm18studios.oc2rcore.compat.items.*;
import dev.architectury.platform.Platform;

public class OC2RCompat {

    public static void OC2RComponents() {

        if (Platform.isModLoaded("oc2rc")) OC2RCItems.initialize();
        if (Platform.isModLoaded("oc2rpower")) OC2RPowerItems.initialize();
        if (Platform.isModLoaded("oc2rlibrary")) OC2RLibraryItems.initialize();
        if (Platform.isModLoaded("oc2rvs")) OC2RVSItems.initialize();
    }
}
