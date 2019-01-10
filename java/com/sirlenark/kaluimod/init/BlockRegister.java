package com.sirlenark.kaluimod.init;

import java.util.ArrayList;
import java.util.List;

import com.sirlenark.kaluimod.items.blocks.BlockBase;
import com.sirlenark.kaluimod.items.blocks.BlockOres;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRegister {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>() ;
	
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
	
	public static final Block ORE_END = new BlockOres("ore_end","end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld","overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether","nether");


}
