package com.carrotato.items;

import com.carrotato.items.food.ItemIngot;
import com.carrotato.lib.RefStrings;
import com.carrotato.items.food.ItemEdible;

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
	public static Item ingot_cookie;
	public static Item ingot_beef_raw;
	public static Item ingot_beef_unraw;
	public static Item debug_edible;
	public static Item edible_sugar;
	
	/* TODO: Fix the goddamn saturation values and stop reading the minecraft wiki for this shit, use the vanilla code for fucks sake
	 since it looks like the wiki and code values for saturation are different, you fucking lunatic */
	private static void initializeItem() {
		ingot_carrot = new ItemIngot(27, 32, false).setUnlocalizedName("ingot_carrot").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_carrot");
		ingot_potato = new ItemIngot(9, 9, false).setUnlocalizedName("ingot_potato").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_potato");
		ingot_baked = new ItemIngot(45, 54, false).setUnlocalizedName("ingot_baked").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_baked");
		ingot_apple = new ItemIngot(36, 22, false).setUnlocalizedName("ingot_apple").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_apple");
		ingot_melon = new ItemIngot(162, 97, false).setUnlocalizedName("ingot_melon").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_melon");
		ingot_cookie = new ItemIngot(18, 4, false).setUnlocalizedName("ingot_cookie").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_lazy");
		ingot_beef_raw = new ItemIngot(27, 16, true).setUnlocalizedName("ingot_beef_raw").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_beefraw");
		ingot_beef_unraw = new ItemIngot(72, 117, true).setUnlocalizedName("ingot_beef_unraw").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":ingot_beefunraw");
		debug_edible = new ItemEdible(0, 0, false).setUnlocalizedName("debug_edible");
		edible_sugar = new ItemEdible(1, 0.1F, false).setUnlocalizedName("edible_sugar").setCreativeTab(CreativeTabs.tabFood).setTextureName(RefStrings.MODID + ":edible_sugar");
	}
	
	private static void registerItem() {
		GameRegistry.registerItem(ingot_carrot, ingot_carrot.getUnlocalizedName());
		GameRegistry.registerItem(ingot_potato, ingot_potato.getUnlocalizedName());
		GameRegistry.registerItem(ingot_baked, ingot_baked.getUnlocalizedName());
		GameRegistry.registerItem(ingot_apple, ingot_apple.getUnlocalizedName());
		GameRegistry.registerItem(ingot_melon, ingot_melon.getUnlocalizedName());
		GameRegistry.registerItem(ingot_cookie, ingot_cookie.getUnlocalizedName());
		GameRegistry.registerItem(ingot_beef_raw, ingot_beef_raw.getUnlocalizedName());
		GameRegistry.registerItem(ingot_beef_unraw, ingot_beef_unraw.getUnlocalizedName());
		GameRegistry.registerItem(debug_edible, debug_edible.getUnlocalizedName());
		GameRegistry.registerItem(edible_sugar, edible_sugar.getUnlocalizedName());
	}
}
