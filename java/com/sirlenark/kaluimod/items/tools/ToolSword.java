package com.sirlenark.kaluimod.items.tools;

import com.sirlenark.kaluimod.Main;
import com.sirlenark.kaluimod.init.ItemRegister;
import com.sirlenark.kaluimod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{
	public ToolSword(String name, ToolMaterial material)	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		ItemRegister.ITEMS.add(this);		
	}
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}

}
