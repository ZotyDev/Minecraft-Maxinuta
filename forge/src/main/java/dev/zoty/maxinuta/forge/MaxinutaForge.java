package dev.zoty.maxinuta.forge;

import dev.zoty.maxinuta.Maxinuta;
import dev.zoty.maxinuta.item.MaxinutaCreativeTabs;
import dev.zoty.maxinuta.item.MaxinutaItems;
import dev.zoty.maxinuta.registry.internal.RegistrationFunction;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegisterEvent;

import java.util.function.Consumer;

@Mod(Maxinuta.MOD_ID)
public class MaxinutaForge {
    public MaxinutaForge() {
        Maxinuta.LOG.info("Hello Forge world!");
        Maxinuta.init();
    }

    @Mod.EventBusSubscriber(modid = Maxinuta.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {
        @SubscribeEvent
        public static void registerContent(RegisterEvent event) {
            if (event.getRegistryKey() == Registries.ITEM) {
                register(event, MaxinutaItems::register);
            }
            if (event.getRegistryKey() == Registries.CREATIVE_MODE_TAB) {
                register(event, MaxinutaCreativeTabs::register);
            }
        }

        private static <T> void register(RegisterEvent event, Consumer<RegistrationFunction<T>> consumer) {
            consumer.accept((registry, id, value) -> event.register(registry.key(), id, () -> value));
        }
    }
}
