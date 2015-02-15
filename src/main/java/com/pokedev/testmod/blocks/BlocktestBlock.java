package com.pokedev.testmod.blocks;


import com.pokedev.testmod.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlocktestBlock extends Block

{
	
	public BlocktestBlock()
	{
		super(Material.iron);
		setBlockName("testBlock");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
	}

}
