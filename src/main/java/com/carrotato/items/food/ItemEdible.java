package com.carrotato.items.food;

import com.carrotato.items.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemEdible extends ItemFood{
	public ItemEdible(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setAlwaysEdible();
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		if (!world.isRemote) {
			if(stack.getItem() == ModItems.edible_sugar) { // TODO: Figure out how to reduce the consumption time
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 2));
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 100, 2));
			} else if(stack.getItem() == ModItems.red_sugar) {
				player.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 1));
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 150, 1));
			}
		}
	}
}