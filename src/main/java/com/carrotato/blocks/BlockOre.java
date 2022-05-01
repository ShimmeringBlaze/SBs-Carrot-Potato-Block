package com.carrotato.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockOre extends Block {
	public BlockOre(Material material) {
		super(material);
	}
	
	public Item getItemDropped() {
		if(this == ModBlocks.ore_redsugar) {
			return null;
		}
		return Item.getItemFromBlock(this);
	}

	public void onBlockDestroyedByPlayer(World world, EntityPlayer player) {
		if(!world.isRemote) {
			if(this == ModBlocks.ore_redsugar) {
				player.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 3));
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 2));
			}
		}
	}
}
