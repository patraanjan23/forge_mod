package com.pokedev.testmod.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.pokedev.testmod.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 

{

	public static void init()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.testIngot), new Object[] {"ABA", "BCB", "ABA", 'A', Items.diamond, 'B', Items.snowball, 'C', Items.iron_ingot});
	}
}
