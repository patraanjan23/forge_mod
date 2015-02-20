package com.pokedev.testmod.init;

import com.pokedev.testmod.help.RegisterHelper;
import com.pokedev.testmod.items.testmodItem;
import net.minecraft.item.Item;

public class ModItems 
{
	public static Item testIngot = new testmodItem().setUnlocalizedName("testIngot");
	public static Item testItem2 = new testmodItem().setUnlocalizedName("testItem2");
	public static Item testItem3 = new testmodItem().setUnlocalizedName("testItem3");
	public static Item testItem4 = new testmodItem().setUnlocalizedName("testItem4");
	public static Item testItem5 = new testmodItem().setUnlocalizedName("testItem5");
	public static void init()
	{
		RegisterHelper.registerItem(testIngot);		
		RegisterHelper.registerItem(testItem2);
		RegisterHelper.registerItem(testItem3);
		RegisterHelper.registerItem(testItem4);
		RegisterHelper.registerItem(testItem5);
	}
	
}
