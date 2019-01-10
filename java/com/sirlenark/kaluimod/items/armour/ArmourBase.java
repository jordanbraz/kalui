package com.sirlenark.kaluimod.items.armour;

import com.sirlenark.kaluimod.Main;
import com.sirlenark.kaluimod.init.ItemRegister;
import com.sirlenark.kaluimod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;


public class ArmourBase extends ItemArmor implements IHasModel{
	public ArmourBase(String name, ArmorMaterial materialIn,int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)	{
		super(materialIn,renderIndexIn, equipmentSlotIn);
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
