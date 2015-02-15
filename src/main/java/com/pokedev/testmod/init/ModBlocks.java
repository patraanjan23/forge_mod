package com.pokedev.testmod.init;

import net.minecraft.block.Block;

import com.pokedev.testmod.blocks.BlocktestBlock;
import com.pokedev.testmod.help.RegisterHelper;

public class ModBlocks

{

public static Block testBlock = new BlocktestBlock();
	
	public static void init()
	{
		RegisterHelper.registerBlock(testBlock);		
	}
	
}
