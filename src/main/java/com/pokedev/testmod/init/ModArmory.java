package com.pokedev.testmod.init;

import com.pokedev.testmod.help.RegisterHelper;
import com.pokedev.testmod.items.testmodItem;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ModArmory

{

	public static Item CobaltChestPlate = new testmodItem().setUnlocalizedName("CobaltChestPlate");
	public static Item CobaltBoot = new testmodItem().setUnlocalizedName("CobaltBoot");
	public static Item CobaltHelmet = new testmodItem().setUnlocalizedName("CobaltHelmet");
	public static Item CobaltLeggins = new testmodItem().setUnlocalizedName("CobaltLeggins");
	
	public static void init()
	{
		RegisterHelper.registerItem(CobaltChestPlate);
		RegisterHelper.registerItem(CobaltBoot);
		RegisterHelper.registerItem(CobaltHelmet);
		RegisterHelper.registerItem(CobaltLeggins);
	}
	
}
