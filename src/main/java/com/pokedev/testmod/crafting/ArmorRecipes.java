package com.pokedev.testmod.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.pokedev.testmod.init.ModArmory;
import com.pokedev.testmod.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ArmorRecipes

{
	
	public static void init()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.CobaltChestPlate), new Object[] {"A A", "AAA", "AAA", 'A', ModItems.ingotCobalt});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.CobaltLeggins), new Object[] {"AAA", "A A", "A A", 'A', ModItems.ingotCobalt});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.CobaltHelmet), new Object[] {"AAA", "A A", 'A', ModItems.ingotCobalt});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.CobaltBoot), new Object[] {"A A", "A A", 'A', ModItems.ingotCobalt});
		
	}

}
