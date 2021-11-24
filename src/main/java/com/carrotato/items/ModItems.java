package com.carrotato.items;

import com.carrotato.items.food.ItemIngot;
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
	public static Item ingot_baked;
	public static Item ingot_apple;
	public static Item ingot_melon;
	
	private static void initializeItem() {
		ingot_carrot = new ItemIngot(27, 32, false).setUnlocalizedName("ingot_carrot").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_carrot");
		ingot_potato = new ItemIngot(9, 9, false).setUnlocalizedName("ingot_potato").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_potato");
		ingot_baked = new ItemIngot(45, 54, false).setUnlocalizedName("ingot_baked").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_baked");
		ingot_apple = new ItemIngot(36, 22, false).setUnlocalizedName("ingot_apple").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_apple");
		ingot_melon = new ItemIngot(162, 97, false).setUnlocalizedName("ingot_melon").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_melon");
	}
	
	private static void registerItem() {
		GameRegistry.registerItem(ingot_carrot, ingot_carrot.getUnlocalizedName());
		GameRegistry.registerItem(ingot_potato, ingot_potato.getUnlocalizedName());
		GameRegistry.registerItem(ingot_baked, ingot_baked.getUnlocalizedName());
		GameRegistry.registerItem(ingot_apple, ingot_apple.getUnlocalizedName());
	}
}
