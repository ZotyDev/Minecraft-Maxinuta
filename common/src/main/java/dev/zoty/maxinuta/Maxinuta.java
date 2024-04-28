package dev.zoty.maxinuta;


import dev.zoty.maxinuta.item.MaxinutaCreativeTabs;
import dev.zoty.maxinuta.item.MaxinutaItems;

public class Maxinuta
{
	public static final String MOD_ID = "maxinuta";

	public static void init() {
		MaxinutaCreativeTabs.register();
		MaxinutaItems.register();
	}
}
