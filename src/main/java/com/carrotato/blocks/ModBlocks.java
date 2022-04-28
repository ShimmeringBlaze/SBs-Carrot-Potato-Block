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
	public static Block block_beefraw;
	public static Block block_beefunraw;
	
	private static void initializeBlock() {
		block_carrot = new BlockGeneric(Material.plants).setBlockName("block_carrot").setCreativeTab(CreativeTabs.tabFood).setHardness(0.5F).setResistance(0.1F).setBlockTextureName(RefStrings.MODID + ":block_carrot");
		block_potato = new BlockGeneric(Material.plants).setBlockName("block_potato").setCreativeTab(CreativeTabs.tabFood).setHardness(0.5F).setResistance(0.1F).setBlockTextureName(RefStrings.MODID + ":block_potato");
		block_baked = new BlockGeneric(Material.plants).setBlockName("block_baked").setCreativeTab(CreativeTabs.tabFood).setHardness(0.5F).setResistance(0.1F).setBlockTextureName(RefStrings.MODID + ":block_baked");
		block_apple = new BlockGeneric(Material.plants).setBlockName("block_apple").setCreativeTab(CreativeTabs.tabFood).setHardness(0.5F).setResistance(0.1F).setBlockTextureName(RefStrings.MODID + ":block_apple");
		block_melon = new BlockGeneric(Material.plants).setBlockName("block_melon").setCreativeTab(CreativeTabs.tabFood).setHardness(5).setResistance(2).setBlockTextureName(RefStrings.MODID + ":block_melon");
		block_cookie = new BlockGeneric(Material.plants).setBlockName("block_cookie").setCreativeTab(CreativeTabs.tabFood).setHardness(0.5F).setResistance(0.1F).setBlockTextureName(RefStrings.MODID + ":block_cookie");
		block_beefraw = new BlockGeneric(Material.cloth).setBlockName("block_beefraw").setCreativeTab(CreativeTabs.tabFood).setHardness(1).setResistance(0.5F).setBlockTextureName(RefStrings.MODID + ":block_beefraw");
		block_beefunraw = new BlockGeneric(Material.rock).setBlockName("block_beefunraw").setCreativeTab(CreativeTabs.tabFood).setHardness(2).setResistance(1).setBlockTextureName(RefStrings.MODID + ":block_beefunraw");
	}
	
	private static void registerBlock() {
		GameRegistry.registerBlock(block_carrot, block_carrot.getUnlocalizedName());
		GameRegistry.registerBlock(block_potato, block_potato.getUnlocalizedName());
		GameRegistry.registerBlock(block_baked, block_baked.getUnlocalizedName());
		GameRegistry.registerBlock(block_apple, block_apple.getUnlocalizedName());
		GameRegistry.registerBlock(block_melon, block_melon.getUnlocalizedName());
		GameRegistry.registerBlock(block_cookie, block_cookie.getUnlocalizedName());
		GameRegistry.registerBlock(block_beefraw, block_beefraw.getUnlocalizedName());
		GameRegistry.registerBlock(block_beefunraw, block_beefunraw.getUnlocalizedName());
	}
}