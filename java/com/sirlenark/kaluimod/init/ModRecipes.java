package com.sirlenark.kaluimod.init;

import com.sirlenark.kaluimod.Main;
import com.sirlenark.kaluimod.items.blocks.BlockOres;
import com.sirlenark.kaluimod.util.handlers.EnumHandler;

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
		GameRegistry.addSmelting(BlockRegister.ORE_OVERWORLD, new ItemStack(ItemRegister.RUBY,1), 1.0F);
	}

}
