package dev.zoty.maxinuta;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Maxinuta {
    public static final String MOD_ID = "maxinuta";
    public static final String MOD_NAME = "Maxinuta";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        LOG.info("Initializing {}", MOD_NAME);
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
