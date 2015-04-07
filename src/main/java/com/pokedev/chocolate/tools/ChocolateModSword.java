package com.pokedev.chocolate.tools;

import com.pokedev.chocolate.Chocolate;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;


public class ChocolateModSword extends ItemSword
{
	public final ToolMaterial toolMaterial;
	
	public ChocolateModSword(ToolMaterial EnumToolMaterial)
	{
		super(EnumToolMaterial);
		toolMaterial = EnumToolMaterial;
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(Chocolate.MODID + ":" + getUnlocalizedName().substring(5));
	}

}
