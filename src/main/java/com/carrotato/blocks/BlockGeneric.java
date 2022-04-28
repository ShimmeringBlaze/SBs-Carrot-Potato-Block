package com.carrotato.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class BlockGeneric extends Block{
	
	public BlockGeneric(Material material) {
		super(material);
	}
	
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean bool) {
		
		if (this == ModBlocks.block_beefraw) {
			list.add("Yep, it's a cubic meter of raw bovine meat");
		}
	}
}
