package dev.zoty.maxinuta.item;

import dev.zoty.maxinuta.Maxinuta;
import dev.zoty.maxinuta.registry.internal.RegistrationFunction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MaxinutaCreativeTabs {
    public static final CreativeModeTab MAXINUTA_TAB = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .icon(() -> new ItemStack(MaxinutaItems.FAIRY_DUST))
            .title(Component.translatable("itemGroup.maxinuta"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(MaxinutaItems.FAIRY_DUST);
            })
            .build();

    public static void register(RegistrationFunction<CreativeModeTab> function) {
        function.register(BuiltInRegistries.CREATIVE_MODE_TAB, Maxinuta.asResource("maxinuta"), MAXINUTA_TAB);
    }
}
