package com.carrotato.items;

import com.carrotato.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	
	public static void mainRegistry()
	{
		initializeItem();
		registerItem();
	}
	
	public static Item ingot_carrot;
	public static Item ingot_potato;
	
	private static void initializeItem() {
		ingot_carrot = new Item()
				.setUnlocalizedName("ingot_carrot")
				.setCreativeTab(CreativeTabs.tabFood)
				.setTextureName(RefStrings.MODID + ":ingot_carrot");
		ingot_potato = new Item()
				.setUnlocalizedName("ingot_potato")
				.setCreativeTab(CreativeTabs.tabFood)
				.setTextureName(RefStrings.MODID + ":ingot_potato");
	}
	
	private static void registerItem() {
		GameRegistry.registerItem(ingot_carrot, ingot_carrot.getUnlocalizedName());
		GameRegistry.registerItem(ingot_potato, ingot_potato.getUnlocalizedName());
	}
}
