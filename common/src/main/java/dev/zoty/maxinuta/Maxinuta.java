package dev.zoty.maxinuta;


import dev.zoty.maxinuta.item.MaxinutaCreativeTabs;
import dev.zoty.maxinuta.item.MaxinutaItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Maxinuta
{
	public static final String MOD_ID = "maxinuta";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static void init() {
		LOGGER.info("Initializing mod: " + MOD_ID);
		MaxinutaCreativeTabs.register();
		MaxinutaItems.register();
	}
}
