package net.vyxia.all_ice;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.vyxia.all_ice.iceConfig;

public class ItsAllIce implements ModInitializer {
	public static final String MOD_ID = "its-all-ice";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final iceConfig CONFIG = iceConfig.createAndLoad();

	@Override
	public void onInitialize() {
		LOGGER.info("why the fuck is it ALL FUCKING ICE");
	}
}