package dev.zoty.maxinuta.item;

import dev.zoty.maxinuta.Maxinuta;
import dev.zoty.maxinuta.item.custom.FairyDustItem;
import dev.zoty.maxinuta.registry.internal.RegistrationFunction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class MaxinutaItems {
    public static final Item FAIRY_DUST = new FairyDustItem(new Item.Properties());

    public static void register(RegistrationFunction<Item> function) {
        function.register(BuiltInRegistries.ITEM, Maxinuta.asResource("fairy_dust"), FAIRY_DUST);
    }
}
