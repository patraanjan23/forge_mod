package com.pokedev.testmod.tabs;

import com.pokedev.testmod.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestmodTab extends CreativeTabs

{
    String name;
	public TestmodTab(int par1, String par2Str)
	{
		super (par1, par2Str);
		this.name = par2Str;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		if (this.name == "tabTestmod")
		{
			return ModItems.dustCobalt;
		}
		return null;
	}
	
}
