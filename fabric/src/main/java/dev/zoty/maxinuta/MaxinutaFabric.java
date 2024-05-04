package dev.zoty.maxinuta;

import dev.zoty.maxinuta.item.MaxinutaCreativeTabs;
import dev.zoty.maxinuta.item.MaxinutaItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;

public class MaxinutaFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Maxinuta.LOG.info("Hello Fabric world!");

        Maxinuta.init();
        registerContent();
    }

    private static void registerContent() {
        MaxinutaItems.register(Registry::register);
        MaxinutaCreativeTabs.register(Registry::register);
    }
}
