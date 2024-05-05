package dev.zoty.maxinuta.quilt;

import dev.zoty.maxinuta.Maxinuta;
import dev.zoty.maxinuta.item.MaxinutaCreativeTabs;
import dev.zoty.maxinuta.item.MaxinutaItems;
import dev.zoty.maxinuta.registry.internal.RegistrationFunction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import java.util.function.Consumer;

public class MaxinutaQuilt implements ModInitializer {

    @Override
    public void onInitialize(ModContainer mod) {
        Maxinuta.LOG.info("Hello Quilt world!");
        Maxinuta.init();
        registerContent(mod);
    }

    private static void registerContent(ModContainer mod) {
        register(mod, MaxinutaItems::register);
        register(mod, MaxinutaCreativeTabs::register);
    }

    private static <T> void register(ModContainer mod, Consumer<RegistrationFunction<T>> consumer) {
        consumer.accept((registry, id, value) -> Registry.register(registry, id.toString(), value));
    }
}
