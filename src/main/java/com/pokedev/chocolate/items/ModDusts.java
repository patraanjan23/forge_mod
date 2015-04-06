package com.pokedev.chocolate.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.pokedev.chocolate.help.ChocolateModItem;
import com.pokedev.testmod.help.RegisterHelper;

public class ModDusts

{
	// First add vanilla dusts with respect to material tier
	public static Item dustWood = new ChocolateModItem().setUnlocalizedName("dustWood");
	public static Item dustDirt = new ChocolateModItem().setUnlocalizedName("dustDirt");
	public static Item dustStone = new ChocolateModItem().setUnlocalizedName("dustStone");
	public static Item dustCoal = new ChocolateModItem().setUnlocalizedName("dustCoal");
	public static Item dustCharcoal = new ChocolateModItem().setUnlocalizedName("dustCharcoal");
	public static Item dustIron = new ChocolateModItem().setUnlocalizedName("dustIron");
	public static Item dustGold = new ChocolateModItem().setUnlocalizedName("dustGold");
	public static Item dustDiamond = new ChocolateModItem().setUnlocalizedName("dustDiamond");
	public static Item dustObsidian = new ChocolateModItem().setUnlocalizedName("dustObsidian");
	// Add Alloys n Mixtures
	public static Item dustDirtyIron = new ChocolateModItem().setUnlocalizedName("dustDirtyIron");
	public static Item dustAngmallen = new ChocolateModItem().setUnlocalizedName("dustAngmallen");
	public static Item dustSteel = new ChocolateModItem().setUnlocalizedName("dustSteel");
	public static Item dustRefinedIron = new ChocolateModItem().setUnlocalizedName("dustRefinedIron");
	public static Item dustRefinedGold = new ChocolateModItem().setUnlocalizedName("dustRefinedGold");
	public static Item dustRefinedSteel = new ChocolateModItem().setUnlocalizedName("dustRefinedSteel");
	public static Item dustRefinedObsidian = new ChocolateModItem().setUnlocalizedName("dustRefinedObsidian");
	public static Item dustMixedMetal = new ChocolateModItem().setUnlocalizedName("dustMixedMetal");
	
	public static void init()
	{
		// Forge Reg
		RegisterHelper.registerItem(dustWood);
		RegisterHelper.registerItem(dustDirt);
		RegisterHelper.registerItem(dustStone);
		RegisterHelper.registerItem(dustCoal);
		RegisterHelper.registerItem(dustCharcoal);
		RegisterHelper.registerItem(dustIron);
		RegisterHelper.registerItem(dustGold);
		RegisterHelper.registerItem(dustDiamond);
		RegisterHelper.registerItem(dustObsidian);
			// Alloy
		RegisterHelper.registerItem(dustDirtyIron);
		RegisterHelper.registerItem(dustAngmallen);
		RegisterHelper.registerItem(dustSteel);
		RegisterHelper.registerItem(dustRefinedIron);
		RegisterHelper.registerItem(dustRefinedGold);
		RegisterHelper.registerItem(dustRefinedSteel);
		RegisterHelper.registerItem(dustRefinedObsidian);
		RegisterHelper.registerItem(dustMixedMetal);
		
		// Ore dictionary Reg
		OreDictionary.registerOre("dustWood", new ItemStack(dustWood));
		OreDictionary.registerOre("dustDirt", new ItemStack(dustDirt));
		OreDictionary.registerOre("dustStone", new ItemStack(dustStone));
		OreDictionary.registerOre("dustCoal", new ItemStack(dustCoal));
		OreDictionary.registerOre("dustCharcoal", new ItemStack(dustCharcoal));
		OreDictionary.registerOre("dustIron", new ItemStack(dustIron));
		OreDictionary.registerOre("dustGold", new ItemStack(dustGold));
		OreDictionary.registerOre("dustDiamond", new ItemStack(dustDiamond));
		OreDictionary.registerOre("dustObsidian", new ItemStack(dustObsidian));
			// Alloy
		OreDictionary.registerOre("dustDirtyIron", new ItemStack(dustDirtyIron));
		OreDictionary.registerOre("dustAngmallen", new ItemStack(dustAngmallen));
		OreDictionary.registerOre("dustSteel", new ItemStack(dustSteel));
		OreDictionary.registerOre("dustRefinedIron", new ItemStack(dustRefinedIron));
		OreDictionary.registerOre("dustRefinedGold", new ItemStack(dustRefinedGold));
		OreDictionary.registerOre("dustRefinedSteel", new ItemStack(dustRefinedSteel));
		OreDictionary.registerOre("dustRefinedObsidian", new ItemStack(dustRefinedObsidian));
		OreDictionary.registerOre("dustMixedMetal", new ItemStack(dustMixedMetal));
		
	}
}
