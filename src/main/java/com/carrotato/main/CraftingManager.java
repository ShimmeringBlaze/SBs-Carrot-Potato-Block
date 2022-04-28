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
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_carrot, 1), "###", "###", "###", '#', ModItems.ingot_carrot); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_carrot, 1), "###", "###", "###", '#', Items.carrot); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_carrot, 9), "#", '#', ModBlocks.block_carrot); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Items.carrot, 9), "#", '#', ModItems.ingot_carrot); // Ingots to items
		
		// Potatoes
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_potato, 1), "###", "###", "###", '#', ModItems.ingot_potato); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_potato, 1), "###", "###", "###", '#', Items.potato); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_potato, 9), "#", '#', ModBlocks.block_potato); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Items.potato, 9), "#", '#', ModItems.ingot_potato); // Ingots to items
		
		// Baked Potatoes
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_baked, 1), "###", "###", "###", '#', ModItems.ingot_baked); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_baked, 1), "###", "###", "###", '#', Items.baked_potato); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_baked, 9), "#", '#', ModBlocks.block_baked); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Items.baked_potato, 9), "#", '#', ModItems.ingot_baked); // Ingots to items
		
		// Apples
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_apple, 1), "###", "###", "###", '#', ModItems.ingot_apple); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_apple, 1), "###", "###", "###", '#', Items.apple); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_apple, 9), "#", '#', ModBlocks.block_apple); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Items.apple, 9), "#", '#', ModItems.ingot_apple); // Ingots to items
		
		// Melons
		GameRegistry.addRecipe(new ItemStack(Items.melon, 9), "#", '#', Blocks.melon_block); // Gives ability to uncraft melon blocks back into slices, for extra compression
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_melon, 1), "###", "###", "###", '#', ModItems.ingot_melon); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_melon, 1), "###", "###", "###", '#', Blocks.melon_block); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_melon, 9), "#", '#', ModBlocks.block_melon); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Blocks.melon_block, 9), "#", '#', ModItems.ingot_melon); // Ingots to items
		
		// Cookies
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_cookie, 1), "###", "###", "###", '#', ModItems.ingot_cookie); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_cookie, 1), "###", "###", "###", '#', Items.cookie); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_cookie, 9), "#", '#', ModBlocks.block_cookie); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Items.cookie, 9), "#", '#', ModItems.ingot_cookie); // Ingots to items
		
		// Raw Beef
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_beefraw, 1), "###", "###", "###", '#', ModItems.ingot_beefraw); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_beefraw, 1), "###", "###", "###", '#', Items.beef); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_beefraw, 9), "#", '#', ModBlocks.block_beefraw); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Items.beef, 9), "#", '#', ModItems.ingot_beefraw); // Ingots to items
		
		// Cooked Beef
		GameRegistry.addRecipe(new ItemStack(ModBlocks.block_beefunraw, 1), "###", "###", "###", '#', ModItems.ingot_beefunraw); // Ingots to blocks
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_beefunraw, 1), "###", "###", "###", '#', Items.cooked_beef); // Items to ingots
		GameRegistry.addRecipe(new ItemStack(ModItems.ingot_beefunraw, 9), "#", '#', ModBlocks.block_beefunraw); // Blocks to ingots
		GameRegistry.addRecipe(new ItemStack(Items.cooked_beef, 9), "#", '#', ModItems.ingot_beefunraw); // Ingots to items
		
		// Cooking
		GameRegistry.addSmelting(ModItems.ingot_potato, new ItemStack(ModItems.ingot_baked, 1), 3.15F);
		GameRegistry.addSmelting(ModBlocks.block_potato, new ItemStack(ModBlocks.block_baked, 1), 28.35F);
		GameRegistry.addSmelting(ModItems.ingot_beefraw, new ItemStack(ModItems.ingot_beefunraw, 1), 3.15F);
		GameRegistry.addSmelting(ModBlocks.block_beefraw, new ItemStack(ModBlocks.block_beefunraw, 1), 28.35F);
	}
}