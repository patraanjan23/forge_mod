package com.pokedev.chocolate.items;

import com.pokedev.chocolate.help.ChocolateModItem;
import com.pokedev.chocolate.help.RegisterHelper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModIngots

{
	// Add ingots of the additional Dusts
	public static Item ingotDirtyIron = new ChocolateModItem().setUnlocalizedName("ingotDirtyIron");
	public static Item ingotAngmallen = new ChocolateModItem().setUnlocalizedName("ingotAngmallen");
	public static Item ingotSteel = new ChocolateModItem().setUnlocalizedName("ingotSteel");
	public static Item ingotRefinedIron = new ChocolateModItem().setUnlocalizedName("ingotRefinedIron");
	public static Item ingotRefinedGold = new ChocolateModItem().setUnlocalizedName("ingotRefinedGold");
	public static Item ingotRefinedSteel = new ChocolateModItem().setUnlocalizedName("ingotRefinedSteel");
	public static Item ingotObsidian = new ChocolateModItem().setUnlocalizedName("ingotObsidian");
	public static Item ingotRefinedObsidian = new ChocolateModItem().setUnlocalizedName("ingotRefinedObsidian");
	
	public static void init()
	{
		// Forge reg
		RegisterHelper.registerItem(ingotDirtyIron);
		RegisterHelper.registerItem(ingotAngmallen);
		RegisterHelper.registerItem(ingotSteel);
		RegisterHelper.registerItem(ingotRefinedIron);
		RegisterHelper.registerItem(ingotRefinedGold);
		RegisterHelper.registerItem(ingotRefinedSteel);
		RegisterHelper.registerItem(ingotObsidian);
		RegisterHelper.registerItem(ingotRefinedObsidian);
		// OreDictionary reg
		OreDictionary.registerOre("ingotDirtyIron", new ItemStack(ingotDirtyIron));
		OreDictionary.registerOre("ingotAngmallen", new ItemStack(ingotAngmallen));
		OreDictionary.registerOre("ingotSteel", new ItemStack(ingotSteel));
		OreDictionary.registerOre("ingotRefinedIron", new ItemStack(ingotRefinedIron));
		OreDictionary.registerOre("ingotRefinedGold", new ItemStack(ingotRefinedGold));
		OreDictionary.registerOre("ingotRefinedSteel", new ItemStack(ingotRefinedSteel));
		OreDictionary.registerOre("ingotObsidian", new ItemStack(ingotObsidian));
		OreDictionary.registerOre("ingotRefinedObsidian", new ItemStack(ingotRefinedObsidian));
	}
}
