package com.sirlenark.kaluimod.init;

import com.sirlenark.kaluimod.Main;
import com.sirlenark.kaluimod.items.blocks.BlockBase;
import com.sirlenark.kaluimod.items.blocks.BlockOres;
import com.sirlenark.kaluimod.util.handlers.EnumHandler;
import com.sirlenark.kaluimod.world.gen.WorldGenCustomOres;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {	
	
	public static void init() {
		//this work with ruby and sapphire, but i want only with ruby
		GameRegistry.addSmelting(BlockRegister.ORE_OVERWORLD , new ItemStack(ItemRegister.RUBY,1), 1.0F);
		
		/*
		just like this, but its not possible to find ore_overworld_ruby or sapphire
		GameRegistry.addSmelting(BlockRegister.ORE_OVERWORLD_ruby , new ItemStack(ItemRegister.RUBY,1), 1.0F);
		GameRegistry.addSmelting(BlockRegister.ORE_OVERWORLD_sapphire , new ItemStack(ItemRegister.Sapphire,1), 1.0F);
		*/
	}

}
