package com.pokedev.testmod.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.pokedev.testmod.init.ModBlocks;
import com.pokedev.testmod.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 

{

	public static void init()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ingotTest), new Object[] {"ABA", "BCB", "ABA", 'A', Items.diamond, 'B', Items.snowball, 'C', Items.iron_ingot});
		
		
		GameRegistry.addSmelting(ModBlocks.oreTest, new ItemStack(ModItems.ingotTest), 0.5F);
		
		GameRegistry.addSmelting(ModItems.dustTest, new ItemStack(ModItems.ingotTest), 0.5F);
		GameRegistry.addSmelting(ModItems.dustCobalt, new ItemStack(ModItems.ingotCobalt), 1.2F);
		GameRegistry.addSmelting(ModItems.dustIron, new ItemStack(Items.iron_ingot), 0.8F);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustCobalt) , new Object[] {new ItemStack(ModItems.dustIron),(ModItems.dustTest),(ModItems.dustTest)});
	}
}