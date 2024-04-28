package dev.zoty.maxinuta.fabric;

import dev.zoty.maxinuta.Maxinuta;
import net.fabricmc.api.ModInitializer;

public class MaxinutaFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Maxinuta.init();
    }
}