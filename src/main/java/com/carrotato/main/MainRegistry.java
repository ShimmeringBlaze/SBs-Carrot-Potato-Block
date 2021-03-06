package com.carrotato.main;

import com.carrotato.blocks.ModBlocks;
import com.carrotato.items.ModItems;
import com.carrotato.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod.EventHandler;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {
	
	@Instance(RefStrings.MODID)
	public static MainRegistry instance;
	
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent PreEvent) {
		ModItems.mainRegistry();
		ModBlocks.mainRegistry();
		CraftingManager.mainRegistry();
	}
}