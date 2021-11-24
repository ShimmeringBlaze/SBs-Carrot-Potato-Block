package com.carrotato.items.food;

import java.util.List;

import com.carrotato.items.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
public class ItemIngot extends ItemFood{

	public ItemIngot(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean bool) {
		
		if (this == ModItems.ingot_melon) {
			list.add("Did you seriously just stuff 9 whole");
			list.add("melons into a single ingot? What were you thinking?");
			list.add("Well, at least it's bound to be filling");
		}
	}
}
