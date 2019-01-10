package com.sirlenark.kaluimod.items.items;

import com.sirlenark.kaluimod.Main;
import com.sirlenark.kaluimod.init.ItemRegister;
import com.sirlenark.kaluimod.proxy.ClientProxy;
import com.sirlenark.kaluimod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		ItemRegister.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}
}
