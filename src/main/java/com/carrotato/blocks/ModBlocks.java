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
	
	private static void initializeBlock() {
		block_carrot = new BlockGeneric(Material.plants)
				.setBlockName("block_carrot")
				.setCreativeTab(CreativeTabs.tabFood)
				.setHardness(0.5F)
				.setResistance(0.1F)
				.setBlockTextureName(RefStrings.MODID + ":block_carrot");
		block_potato = new BlockGeneric(Material.plants)
				.setBlockName("block_potato")
				.setCreativeTab(CreativeTabs.tabFood)
				.setHardness(0.5F)
				.setResistance(0.1F)
				.setBlockTextureName(RefStrings.MODID + ":block_potato");
	}
	
	private static void registerBlock() {
		GameRegistry.registerBlock(block_carrot, block_carrot.getUnlocalizedName());
		GameRegistry.registerBlock(block_potato, block_potato.getUnlocalizedName());
	}
}