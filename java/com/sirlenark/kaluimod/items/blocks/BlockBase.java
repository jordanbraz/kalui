package com.sirlenark.kaluimod.items.blocks;

import com.sirlenark.kaluimod.Main;
import com.sirlenark.kaluimod.init.BlockRegister;
import com.sirlenark.kaluimod.init.ItemRegister;
import com.sirlenark.kaluimod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{
	
	public BlockBase(String name, Material material) {		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		BlockRegister.BLOCKS.add(this);		
		ItemRegister.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));		
	}	
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "Inventory");
	}
		
}