package com.carrotato.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import com.carrotato.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static void mainRegistry()
	{
		initializeBlock();
		registerBlock();
	}
	public static Block block_carrot;
	public static Block block_potato;
	public static Block block_baked;
	public static Block block_apple;
	public static Block block_melon;
	public static Block block_cookie;
	public static Block block_beef_raw;
	public static Block block_beef_unraw;
	public static Block ore_redsugar;
	public static Block block_redsugar;
	
	private static void initializeBlock() {
		block_carrot = new BlockGeneric(Material.plants).setBlockName("block_carrot").setCreativeTab(CreativeTabs.tabFood).setHardness(0.5F).setResistance(0.1F).setBlockTextureName(RefStrings.MODID + ":block_carrot");
		block_potato = new BlockGeneric(Material.plants).setBlockName("block_potato").setCreativeTab(CreativeTabs.tabFood).setHardness(0.5F).setResistance(0.1F).setBlockTextureName(RefStrings.MODID + ":block_potato");
		block_baked = new BlockGeneric(Material.plants).setBlockName("block_baked").setCreativeTab(CreativeTabs.tabFood).setHardness(0.5F).setResistance(0.1F).setBlockTextureName(RefStrings.MODID + ":block_baked");
		block_apple = new BlockGeneric(Material.plants).setBlockName("block_apple").setCreativeTab(CreativeTabs.tabFood).setHardness(0.5F).setResistance(0.1F).setBlockTextureName(RefStrings.MODID + ":block_apple");
		block_melon = new BlockGeneric(Material.plants).setBlockName("block_melon").setCreativeTab(CreativeTabs.tabFood).setHardness(5).setResistance(2).setBlockTextureName(RefStrings.MODID + ":block_melon");
		block_cookie = new BlockGeneric(Material.plants).setBlockName("block_cookie").setCreativeTab(CreativeTabs.tabFood).setHardness(0.5F).setResistance(0.1F).setBlockTextureName(RefStrings.MODID + ":block_cookie");
		block_beef_raw = new BlockGeneric(Material.cloth).setBlockName("block_beef_raw").setCreativeTab(CreativeTabs.tabFood).setHardness(1).setResistance(0.5F).setBlockTextureName(RefStrings.MODID + ":block_beef_raw");
		block_beef_unraw = new BlockGeneric(Material.rock).setBlockName("block_beef_unraw").setCreativeTab(CreativeTabs.tabFood).setHardness(2).setResistance(1).setBlockTextureName(RefStrings.MODID + ":block_beef_unraw");
		ore_redsugar = new BlockOre(Material.glass).setBlockName("ore_redsugar").setCreativeTab(CreativeTabs.tabBlock).setHardness(1).setResistance(0.5F).setBlockTextureName(RefStrings.MODID + ":ore_redsugar");
		block_redsugar = new BlockGeneric(Material.glass).setBlockName("block_redsugar").setCreativeTab(CreativeTabs.tabBlock).setHardness(2).setResistance(1F).setBlockTextureName(RefStrings.MODID + ":block_redsugar");
	}
	
	private static void registerBlock() {
		GameRegistry.registerBlock(block_carrot, block_carrot.getUnlocalizedName());
		GameRegistry.registerBlock(block_potato, block_potato.getUnlocalizedName());
		GameRegistry.registerBlock(block_baked, block_baked.getUnlocalizedName());
		GameRegistry.registerBlock(block_apple, block_apple.getUnlocalizedName());
		GameRegistry.registerBlock(block_melon, block_melon.getUnlocalizedName());
		GameRegistry.registerBlock(block_cookie, block_cookie.getUnlocalizedName());
		GameRegistry.registerBlock(block_beef_raw, block_beef_raw.getUnlocalizedName());
		GameRegistry.registerBlock(block_beef_unraw, block_beef_unraw.getUnlocalizedName());
		GameRegistry.registerBlock(ore_redsugar, ore_redsugar.getUnlocalizedName());
		GameRegistry.registerBlock(block_redsugar, block_redsugar.getUnlocalizedName());
	}
}