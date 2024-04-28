package dev.zoty.maxinuta.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.zoty.maxinuta.Maxinuta;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Maxinuta.MOD_ID)
public class MaxinutaForge {
    public MaxinutaForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Maxinuta.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Maxinuta.init();
    }
}