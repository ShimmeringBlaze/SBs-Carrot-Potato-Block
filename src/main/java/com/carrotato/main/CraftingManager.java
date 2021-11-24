package com.carrotato.main;

import com.carrotato.blocks.ModBlocks;
import com.carrotato.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	public static void mainRegistry() {
		addCraftRecipe();
	}
	public static void addCraftRecipe() {
		// Carrots
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_carrot, 1), new Object[] { "###", "###", "###", '#', ModItems.ingot_carrot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_carrot, 1), new Object[] { "###", "###", "###", '#', Items.carrot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_carrot, 9), new Object[] { "#", '#', ModBlocks.block_carrot});
		GameRegistry.addRecipe(new ItemStack(Items.carrot, 9), new Object[] { "#", '#', ModItems.ingot_carrot});
		
		// Potatoes
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_potato, 1), new Object[] { "###", "###", "###", '#', ModItems.ingot_potato});
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_potato, 1), new Object[] { "###", "###", "###", '#', Items.potato});
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_potato, 9), new Object[] { "#", '#', ModBlocks.block_potato});
		GameRegistry.addRecipe(new ItemStack(Items.potato, 9), new Object[] { "#", '#', ModItems.ingot_potato});
		
		// Baked Potatoes
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_baked, 1), new Object[] { "###", "###", "###", '#', ModItems.ingot_baked});
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_baked, 1), new Object [] { "###", "###", "###", '#', Items.baked_potato});
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_baked, 9), new Object[] { "#", '#', ModBlocks.block_baked});
		GameRegistry.addRecipe(new ItemStack(Items.baked_potato, 9), new Object[] { "#", '#', ModItems.ingot_baked});
		
		// Cooking
		GameRegistry.addSmelting(ModItems.ingot_potato, new ItemStack(ModItems.ingot_baked, 1), 3.15F);
		GameRegistry.addSmelting(ModBlocks.block_potato, new ItemStack(ModBlocks.block_baked, 1), 28.35F);
	}
}