package com.pokedev.testmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.pokedev.testmod.crafting.Recipes;
import com.pokedev.testmod.help.Reference; //Manually added the import as eclipse was unable to do it for me
import com.pokedev.testmod.init.ModBlocks;
import com.pokedev.testmod.init.ModItems;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class testmod 
{
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();

	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		Recipes.init();

	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}


}
