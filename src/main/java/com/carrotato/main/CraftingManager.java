package com.carrotato.main;

import com.carrotato.blocks.ModBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	public static void mainRegistry() {
		addCraftRecipe();
	}
	public static void addCraftRecipe() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_carrot, 1), new Object[] { "###", "###", "###", '#', Items.carrot});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_potato, 1), new Object[] { "###", "###", "###", '#', Items.potato});
		GameRegistry.addRecipe(new ItemStack(Items.carrot, 9), new Object[] { "#", '#', Item.getItemFromBlock(ModBlocks.block_carrot) });
		GameRegistry.addRecipe(new ItemStack(Items.potato, 9), new Object[] { "#", '#', Item.getItemFromBlock(ModBlocks.block_potato) });
	}
}