package com.pokedev.testmod.blocks;

import com.pokedev.testmod.help.Reference;
import com.pokedev.testmod.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockoreTest extends Block

{

	public BlockoreTest()
	{
		super(Material.iron);
		setBlockName("oreTest");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabTestmod);
		setStepSound(soundTypeStone);
		setHardness(5.0F);
		setResistance(120F);
		setHarvestLevel("pickaxe",2);
		setLightLevel(3F);
		
	}
	
}
