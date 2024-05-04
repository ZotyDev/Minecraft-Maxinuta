package dev.zoty.maxinuta.registry.internal;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

@FunctionalInterface
public interface RegistrationFunction<T> {
    void register(Registry<T> registry, ResourceLocation id, T value);
}
