package com.pokedev.testmod.init;

import com.pokedev.testmod.help.RegisterHelper;
import com.pokedev.testmod.items.testmodItem;
import net.minecraft.item.Item;

public class ModItems 
{
	public static Item ingotTest = new testmodItem().setUnlocalizedName("ingotTest");
	public static Item ingotCobalt = new testmodItem().setUnlocalizedName("ingotCobalt");
	
	public static Item dustCobalt = new testmodItem().setUnlocalizedName("dustCobalt");	
	public static Item dustTest = new testmodItem().setUnlocalizedName("dustTest");
	public static Item dustIron = new testmodItem().setUnlocalizedName("dustIron");
	
		
	public static void init()
	{
		RegisterHelper.registerItem(ingotTest);
		RegisterHelper.registerItem(ingotCobalt);
		
		RegisterHelper.registerItem(dustCobalt);
		RegisterHelper.registerItem(dustTest);
		RegisterHelper.registerItem(dustIron);
		
	}
	
}
