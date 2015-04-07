package com.pokedev.chocolate.items;

//import com.pokedev.chocolate.help.ChocolateModItem;
import com.pokedev.chocolate.help.RegisterHelper;
import com.pokedev.chocolate.tools.ChocolateModAxe;
import com.pokedev.chocolate.tools.ChocolateModHoe;
import com.pokedev.chocolate.tools.ChocolateModPickaxe;
import com.pokedev.chocolate.tools.ChocolateModShovel;
import com.pokedev.chocolate.tools.ChocolateModSword;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModTools

{
	// Adding Tool materials
	static Item.ToolMaterial DIRTYIRON = EnumHelper.addToolMaterial("DIRTYIRON", 1, 192, 5.0F, 1.5F, 9);
	static Item.ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 3, 1004, 7.0F, 4.5F, 3);
	static Item.ToolMaterial ANGMALLEN = EnumHelper.addToolMaterial("ANGMALLEN", 2, 142, 9.0F, 2.0F, 18);
	static Item.ToolMaterial REFINEDIRON = EnumHelper.addToolMaterial("REFINEDIRON", 2, 386, 8.67F, 3.5F, 12);
	static Item.ToolMaterial REFINEDGOLD = EnumHelper.addToolMaterial("REFINEDGOLD", 2, 277, 14.67F, 2.5F, 16);
	static Item.ToolMaterial REFINEDSTEEL = EnumHelper.addToolMaterial("REFINEDSTEEL", 3, 2566, 9.67F, 6.0F, 7);
	static Item.ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 3, 938, 12.0F, 0.5F, 15);
	static Item.ToolMaterial REFINEDOBSIDIAN = EnumHelper.addToolMaterial("REFINEDOBSIDIAN", 3, 3500, 14.67F, 10.0F, 13);
	//++Adding tools++
	//	#sword
	public static Item DirtyIronSword = new ChocolateModSword(DIRTYIRON).setUnlocalizedName("DirtyIronSword");
	public static Item SteelSword = new ChocolateModSword(STEEL).setUnlocalizedName("SteelSword");
	public static Item AngmallenSword = new ChocolateModSword(ANGMALLEN).setUnlocalizedName("AngmallenSword");
	public static Item RefinedIronSword = new ChocolateModSword(REFINEDIRON).setUnlocalizedName("RefinedIronSword");
	public static Item RefinedGoldSword = new ChocolateModSword(REFINEDGOLD).setUnlocalizedName("RefinedGoldSword");
	public static Item RefinedSteelSword = new ChocolateModSword(REFINEDSTEEL).setUnlocalizedName("RefinedSteelSword");
	public static Item ObsidianSword = new ChocolateModSword(OBSIDIAN).setUnlocalizedName("ObsidianSword");
	public static Item RefinedObsidianSword = new ChocolateModSword(REFINEDOBSIDIAN).setUnlocalizedName("RefinedObsidianSword");
	// #pickaxe
	public static Item DirtyIronPickaxe = new ChocolateModPickaxe(DIRTYIRON).setUnlocalizedName("DirtyIronPickaxe");
	public static Item SteelPickaxe = new ChocolateModPickaxe(STEEL).setUnlocalizedName("SteelPickaxe");
	public static Item AngmallenPickaxe = new ChocolateModPickaxe(ANGMALLEN).setUnlocalizedName("AngmallenPickaxe");
	public static Item RefinedIronPickaxe = new ChocolateModPickaxe(REFINEDIRON).setUnlocalizedName("RefinedIronPickaxe");
	public static Item RefinedGoldPickaxe = new ChocolateModPickaxe(REFINEDGOLD).setUnlocalizedName("RefinedGoldPickaxe");
	public static Item RefinedSteelPickaxe = new ChocolateModPickaxe(REFINEDSTEEL).setUnlocalizedName("RefinedSteelPickaxe");
	public static Item ObsidianPickaxe = new ChocolateModPickaxe(OBSIDIAN).setUnlocalizedName("ObsidianPickaxe");
	public static Item RefinedObsidianPickaxe = new ChocolateModPickaxe(REFINEDOBSIDIAN).setUnlocalizedName("RefinedObsidianPickaxe");
	// #axe
	public static Item DirtyIronAxe = new ChocolateModAxe(DIRTYIRON).setUnlocalizedName("DirtyIronAxe");
	public static Item SteelAxe = new ChocolateModAxe(STEEL).setUnlocalizedName("SteelAxe");
	public static Item AngmallenAxe = new ChocolateModAxe(ANGMALLEN).setUnlocalizedName("AngmallenAxe");
	public static Item RefinedIronAxe = new ChocolateModAxe(REFINEDIRON).setUnlocalizedName("RefinedIronAxe");
	public static Item RefinedGoldAxe = new ChocolateModAxe(REFINEDGOLD).setUnlocalizedName("RefinedGoldAxe");
	public static Item RefinedSteelAxe = new ChocolateModAxe(REFINEDSTEEL).setUnlocalizedName("RefinedSteelAxe");
	public static Item ObsidianAxe = new ChocolateModAxe(OBSIDIAN).setUnlocalizedName("ObsidianAxe");
	public static Item RefinedObsidianAxe = new ChocolateModAxe(REFINEDOBSIDIAN).setUnlocalizedName("RefinedObsidianAxe");
	// #shovel
	public static Item DirtyIronShovel = new ChocolateModShovel(DIRTYIRON).setUnlocalizedName("DirtyIronShovel");
	public static Item SteelShovel = new ChocolateModShovel(STEEL).setUnlocalizedName("SteelShovel");
	public static Item AngmallenShovel = new ChocolateModShovel(ANGMALLEN).setUnlocalizedName("AngmallenShovel");
	public static Item RefinedIronShovel = new ChocolateModShovel(REFINEDIRON).setUnlocalizedName("RefinedIronShovel");
	public static Item RefinedGoldShovel = new ChocolateModShovel(REFINEDGOLD).setUnlocalizedName("RefinedGoldShovel");
	public static Item RefinedSteelShovel = new ChocolateModShovel(REFINEDSTEEL).setUnlocalizedName("RefinedSteelShovel");
	public static Item ObsidianShovel = new ChocolateModShovel(OBSIDIAN).setUnlocalizedName("ObsidianShovel");
	public static Item RefinedObsidianShovel = new ChocolateModShovel(REFINEDOBSIDIAN).setUnlocalizedName("RefinedObsidianShovel");
	// #hoe
	public static Item DirtyIronHoe = new ChocolateModHoe(DIRTYIRON).setUnlocalizedName("DirtyIronHoe");
	public static Item SteelHoe = new ChocolateModHoe(STEEL).setUnlocalizedName("SteelHoe");
	public static Item AngmallenHoe = new ChocolateModHoe(ANGMALLEN).setUnlocalizedName("AngmallenHoe");
	public static Item RefinedIronHoe = new ChocolateModHoe(REFINEDIRON).setUnlocalizedName("RefinedIronHoe");
	public static Item RefinedGoldHoe = new ChocolateModHoe(REFINEDGOLD).setUnlocalizedName("RefinedGoldHoe");
	public static Item RefinedSteelHoe = new ChocolateModHoe(REFINEDSTEEL).setUnlocalizedName("RefinedSteelHoe");
	public static Item ObsidianHoe = new ChocolateModHoe(OBSIDIAN).setUnlocalizedName("ObsidianHoe");
	public static Item RefinedObsidianHoe = new ChocolateModHoe(REFINEDOBSIDIAN).setUnlocalizedName("RefinedObsidianHoe");
	
	// Registering
	public static void init()
	{
		RegisterHelper.registerItem(DirtyIronSword);
		RegisterHelper.registerItem(SteelSword);
		RegisterHelper.registerItem(AngmallenSword);
		RegisterHelper.registerItem(RefinedIronSword);
		RegisterHelper.registerItem(RefinedGoldSword);
		RegisterHelper.registerItem(RefinedSteelSword);
		RegisterHelper.registerItem(ObsidianSword);
		RegisterHelper.registerItem(RefinedObsidianSword);
		
		RegisterHelper.registerItem(DirtyIronPickaxe);
		RegisterHelper.registerItem(SteelPickaxe);
		RegisterHelper.registerItem(AngmallenPickaxe);
		RegisterHelper.registerItem(RefinedIronPickaxe);
		RegisterHelper.registerItem(RefinedGoldPickaxe);
		RegisterHelper.registerItem(RefinedSteelPickaxe);
		RegisterHelper.registerItem(ObsidianPickaxe);
		RegisterHelper.registerItem(RefinedObsidianPickaxe);
		
		RegisterHelper.registerItem(DirtyIronAxe);
		RegisterHelper.registerItem(SteelAxe);
		RegisterHelper.registerItem(AngmallenAxe);
		RegisterHelper.registerItem(RefinedIronAxe);
		RegisterHelper.registerItem(RefinedGoldAxe);
		RegisterHelper.registerItem(RefinedSteelAxe);
		RegisterHelper.registerItem(ObsidianAxe);
		RegisterHelper.registerItem(RefinedObsidianAxe);
		
		RegisterHelper.registerItem(DirtyIronShovel);
		RegisterHelper.registerItem(SteelShovel);
		RegisterHelper.registerItem(AngmallenShovel);
		RegisterHelper.registerItem(RefinedIronShovel);
		RegisterHelper.registerItem(RefinedGoldShovel);
		RegisterHelper.registerItem(RefinedSteelShovel);
		RegisterHelper.registerItem(ObsidianShovel);
		RegisterHelper.registerItem(RefinedObsidianShovel);
		
		RegisterHelper.registerItem(DirtyIronHoe);
		RegisterHelper.registerItem(SteelHoe);
		RegisterHelper.registerItem(AngmallenHoe);
		RegisterHelper.registerItem(RefinedIronHoe);
		RegisterHelper.registerItem(RefinedGoldHoe);
		RegisterHelper.registerItem(RefinedSteelHoe);
		RegisterHelper.registerItem(ObsidianHoe);
		RegisterHelper.registerItem(RefinedObsidianHoe);
		
	}
	
}
