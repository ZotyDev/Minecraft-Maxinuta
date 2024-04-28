package dev.zoty.maxinuta.item;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.zoty.maxinuta.Maxinuta;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MaxinutaCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(
            Maxinuta.MOD_ID,
            Registries.CREATIVE_MODE_TAB
    );

    public static final RegistrySupplier<CreativeModeTab> MAXINUTA_TAB = CREATIVE_MODE_TABS.register(
            "maxinuta_tab",
            () -> CreativeTabRegistry.create(
                    Component.translatable("category.maxinuta"),
                    () -> new ItemStack(MaxinutaItems.FAIRY_DUST.get())
            )
    );

    public static void register() {
        CREATIVE_MODE_TABS.register();
    }
}
