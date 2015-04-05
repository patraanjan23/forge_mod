package com.pokedev.chocolate;

import com.pokedev.chocolate.init.ModDusts;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(name = Chocolate.MODNAME, modid = Chocolate.MODID, version = Chocolate.VERSION)	//Tell forge "Oh hey, there's a new mod here to load."
public class Chocolate 
{
	public static final String MODNAME = "Chocolate";
	public static final String MODID = "Chocolate";
	public static final String VERSION = "Alpha";
	
	@Instance(value = Chocolate.MODID)	//Tell Forge what instance to use.
	public static Chocolate instance;
	
	//Going to call 3 Initialization steps for Forge. In these steps Forge adds All the items/blocks/recipes n everything of the mod.
	
	//“preInit” creates all your blocks, items, etc.
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModDusts.init();
	}
	//“init” registers recipes for example, as well as a few other things.
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
	}
	//“postInit” handles interaction with other mods for example.
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	
}
