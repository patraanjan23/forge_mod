package com.pokedev.testmod.init;

import com.pokedev.testmod.help.RegisterHelper;
import com.pokedev.testmod.items.testmodItem;
import net.minecraft.item.Item;

public class ModItems 
{
	public static Item testIngot = new testmodItem().setUnlocalizedName("testIngot");
	
	public static void init()
	{
		RegisterHelper.registerItem(testIngot);		
	}
	
}
