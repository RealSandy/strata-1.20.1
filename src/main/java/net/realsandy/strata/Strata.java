package net.realsandy.strata;

import net.fabricmc.api.ModInitializer;

import net.realsandy.strata.block.ModBlocks;
import net.realsandy.strata.item.ModItemGroups;
import net.realsandy.strata.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Strata implements ModInitializer {
	public static final String MOD_ID = "strata";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}