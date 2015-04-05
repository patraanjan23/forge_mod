package com.pokedev.chocolate.help;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.pokedev.chocolate.Chocolate;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper 

{
	public static void registerBlock(Block block)	// Registers new blocks with forge
	{
		GameRegistry.registerBlock(block, Chocolate.MODID + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerItem(Item item)	// Registers new items
	{
		GameRegistry.registerItem(item, Chocolate.MODID + item.getUnlocalizedName().substring(5));
	}

}
