package com.pokedev.testmod.init;

import net.minecraft.item.Item;

import com.pokedev.testmod.help.RegisterHelper;
import com.pokedev.testmod.items.testmodItem;

public class ModTools 

{

	public static Item cobalt_pickaxe = new testmodItem().setUnlocalizedName("cobalt_pickaxe");
	public static Item cobalt_sword = new testmodItem().setUnlocalizedName("cobalt_sword");
	public static Item cobalt_hoe = new testmodItem().setUnlocalizedName("cobalt_hoe");
	public static Item cobalt_shovel = new testmodItem().setUnlocalizedName("cobalt_shovel");
	public static Item cobalt_axe = new testmodItem().setUnlocalizedName("cobalt_axe");
	
	public static void init()
	{
		RegisterHelper.registerItem(cobalt_sword);
		RegisterHelper.registerItem(cobalt_pickaxe);
		RegisterHelper.registerItem(cobalt_hoe);
		RegisterHelper.registerItem(cobalt_shovel);
		RegisterHelper.registerItem(cobalt_axe);
	}
	
}
