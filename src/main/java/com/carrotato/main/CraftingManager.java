package com.carrotato.main;

import com.carrotato.blocks.ModBlocks;
import com.carrotato.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	public static void mainRegistry() {
		addCraftRecipe();
	}
	public static void addCraftRecipe() {
		// Carrots
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_carrot, 1), new Object[] { "###", "###", "###", '#', ModItems.ingot_carrot}); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_carrot, 1), new Object[] { "###", "###", "###", '#', Items.carrot}); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_carrot, 9), new Object[] { "#", '#', ModBlocks.block_carrot}); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Items.carrot, 9), new Object[] { "#", '#', ModItems.ingot_carrot}); // Ingots to items
		
		// Potatoes
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_potato, 1), new Object[] { "###", "###", "###", '#', ModItems.ingot_potato}); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_potato, 1), new Object[] { "###", "###", "###", '#', Items.potato}); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_potato, 9), new Object[] { "#", '#', ModBlocks.block_potato}); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Items.potato, 9), new Object[] { "#", '#', ModItems.ingot_potato}); // Ingots to items
		
		// Baked Potatoes
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_baked, 1), new Object[] { "###", "###", "###", '#', ModItems.ingot_baked}); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_baked, 1), new Object[] { "###", "###", "###", '#', Items.baked_potato}); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_baked, 9), new Object[] { "#", '#', ModBlocks.block_baked}); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Items.baked_potato, 9), new Object[] { "#", '#', ModItems.ingot_baked}); // Ingots to items
		
		// Apples
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_apple, 1), new Object[] { "###", "###", "###", '#', ModItems.ingot_apple}); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_apple, 1), new Object[] { "###", "###", "###", '#', Items.apple}); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_apple, 9), new Object[] { "#", '#', ModBlocks.block_apple}); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Items.apple, 9), new Object[] { "#", '#', ModItems.ingot_apple}); // Ingots to items
		
		// Melons
		GameRegistry.addRecipe(new ItemStack(Items.melon, 9), new Object[] {"#", '#', Blocks.melon_block}); // Gives ability to uncraft melon blocks back into slices, for extra compression
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_melon, 1), new Object[] {"###", "###", "###", '#', ModItems.ingot_melon}); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_melon, 1), new Object[] { "###", "###", "###", '#', Blocks.melon_block}); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_melon, 9), new Object[] { "#", '#', ModBlocks.block_melon}); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Blocks.melon_block, 9), new Object[] { "#", '#', ModItems.ingot_melon}); // Ingots to items
		
		// Cooking
		GameRegistry.addSmelting(ModItems.ingot_potato, new ItemStack(ModItems.ingot_baked, 1), 3.15F);
		GameRegistry.addSmelting(ModBlocks.block_potato, new ItemStack(ModBlocks.block_baked, 1), 28.35F);
	}
}