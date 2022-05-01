package com.carrotato.blocks;

import java.util.Random;

import com.carrotato.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;

public class BlockOre extends Block {
	public BlockOre(Material material) {
		super(material);
	}
	
	public Item getItemDropped(EntityPlayer player) {
		if(this == ModBlocks.ore_redsugar) {
			if(EnchantmentHelper.getEnchantmentLevel(Enchantment.silkTouch.effectId, player.getHeldItem()) == 0) {
				return null;
			} else {
				return ModItems.red_sugar;
			}
		}
		return Item.getItemFromBlock(this);
	}
	
	public int quantityDropped(EntityPlayer player, Random rand) {
		if(this == ModBlocks.ore_redsugar && EnchantmentHelper.getEnchantmentLevel(Enchantment.silkTouch.effectId, player.getHeldItem()) != 0) {
			return 2 + rand.nextInt(1);
		}
		return 0;
	}

	public void onBlockDestroyedByPlayer(World world, EntityPlayer player) {
		if(!world.isRemote) {
			if(this == ModBlocks.ore_redsugar) {
				if(EnchantmentHelper.getEnchantmentLevel(Enchantment.silkTouch.effectId, player.getHeldItem()) == 0) {
					player.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 3));
					player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 2));
				}
			}
		}
	}
}