package com.pokedev.testmod.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.pokedev.testmod.init.ModArmory;
import com.pokedev.testmod.init.ModItems;
import com.pokedev.testmod.init.ModTools;

import cpw.mods.fml.common.registry.GameRegistry;

public class ToolRecipes 

{
	
	public static void init()
	{
		
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.cobalt_pickaxe), new Object[] {"AAA", " B ", " B ", 'A', ModItems.ingotCobalt, 'B', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.cobalt_sword), new Object[] {" A ", " A ", " B ", 'A', ModItems.ingotCobalt, 'B', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.cobalt_shovel), new Object[] {" A ", " B ", " B ", 'A', ModItems.ingotCobalt, 'B', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.cobalt_axe), new Object[] {"AA", "AB", " B", 'A', ModItems.ingotCobalt, 'B', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.cobalt_hoe), new Object[] {"AA", " B", " B", 'A', ModItems.ingotCobalt, 'B', Items.stick});
		
		
	}

}
