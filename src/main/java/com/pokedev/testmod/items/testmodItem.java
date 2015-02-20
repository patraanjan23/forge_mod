package com.pokedev.testmod.items;


import com.pokedev.testmod.help.Reference;
import com.pokedev.testmod.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class testmodItem extends Item

{

	public testmodItem()
	{
		super();
		setCreativeTab(ModTabs.tabTestmod);
		
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		
		itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		
	}
	
	
}
