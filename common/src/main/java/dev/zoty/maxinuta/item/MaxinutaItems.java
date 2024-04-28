package dev.zoty.maxinuta.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.zoty.maxinuta.Maxinuta;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class MaxinutaItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            Maxinuta.MOD_ID,
            Registries.ITEM
    );

    public static final RegistrySupplier<Item> FAIRY_DUST = ITEMS.register(
            "fairy_dust",
            () -> new Item(new Item.Properties()
                    .arch$tab(MaxinutaCreativeTabs.MAXINUTA_TAB)
            )
    );

    public static void register() {
        ITEMS.register();
    }
}
