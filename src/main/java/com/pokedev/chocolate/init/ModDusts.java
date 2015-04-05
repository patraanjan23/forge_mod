package com.pokedev.chocolate.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.pokedev.chocolate.dusts.ChocolateModDust;
import com.pokedev.testmod.help.RegisterHelper;

public class ModDusts

{
	// First add vanilla dusts with respect to material tier
	public static Item dustWood = new ChocolateModDust().setUnlocalizedName("dustWood");
	public static Item dustDirt = new ChocolateModDust().setUnlocalizedName("dustDirt");
	public static Item dustStone = new ChocolateModDust().setUnlocalizedName("dustStone");
	public static Item dustIron = new ChocolateModDust().setUnlocalizedName("dustIron");
	public static Item dustGold = new ChocolateModDust().setUnlocalizedName("dustGold");
	public static Item dustDiamond = new ChocolateModDust().setUnlocalizedName("dustDiamond");
	public static Item dustObsidian = new ChocolateModDust().setUnlocalizedName("dustObsidian");
	
	public static void init()
	{
		// Forge Reg
		RegisterHelper.registerItem(dustWood);
		RegisterHelper.registerItem(dustDirt);
		RegisterHelper.registerItem(dustStone);
		RegisterHelper.registerItem(dustIron);
		RegisterHelper.registerItem(dustGold);
		RegisterHelper.registerItem(dustDiamond);
		RegisterHelper.registerItem(dustObsidian);
		
		// Ore dictionary Reg
		OreDictionary.registerOre("dustWood", new ItemStack(dustWood));
		OreDictionary.registerOre("dustDirt", new ItemStack(dustDirt));
		OreDictionary.registerOre("dustStone", new ItemStack(dustStone));
		OreDictionary.registerOre("dustIron", new ItemStack(dustIron));
		OreDictionary.registerOre("dustGold", new ItemStack(dustGold));
		OreDictionary.registerOre("dustDiamond", new ItemStack(dustDiamond));
		OreDictionary.registerOre("dustObsidian", new ItemStack(dustObsidian));
		
	}
}
