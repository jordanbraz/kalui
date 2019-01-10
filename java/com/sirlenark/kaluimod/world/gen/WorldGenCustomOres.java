package com.sirlenark.kaluimod.world.gen;

import java.util.Random;

import com.sirlenark.kaluimod.init.BlockRegister;
import com.sirlenark.kaluimod.items.blocks.BlockOres;
import com.sirlenark.kaluimod.util.handlers.EnumHandler;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator{

	private WorldGenerator ore_nether_ruby, ore_overworld_ruby, ore_end_ruby;
	private WorldGenerator ore_nether_sapphire, ore_overworld_sapphire, ore_end_sapphire;
	public WorldGenCustomOres(){
		ore_nether_ruby = new WorldGenMinable(BlockRegister.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.RUBY), 7, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_ruby = new WorldGenMinable(BlockRegister.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.RUBY), 7, BlockMatcher.forBlock(Blocks.STONE));
		ore_end_ruby = new WorldGenMinable(BlockRegister.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.RUBY), 7, BlockMatcher.forBlock(Blocks.END_STONE));
	
		ore_nether_sapphire = new WorldGenMinable(BlockRegister.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SAPPHIRE),5, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_sapphire = new WorldGenMinable(BlockRegister.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SAPPHIRE), 5, BlockMatcher.forBlock(Blocks.STONE));
		ore_end_sapphire = new WorldGenMinable(BlockRegister.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SAPPHIRE), 5, BlockMatcher.forBlock(Blocks.END_STONE));
	}
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case -1:
			runGenerator(ore_nether_ruby, world, random, chunkX, chunkZ, 50, 0, 100);	
			runGenerator(ore_nether_sapphire, world, random, chunkX, chunkZ, 50, 0, 100);break;
		case 0 :
			runGenerator(ore_overworld_ruby, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_overworld_sapphire, world, random, chunkX, chunkZ, 50, 0, 100);break;
		case 1 :
			runGenerator(ore_end_ruby, world, random, chunkX, chunkZ, 50, 0 ,256);
			runGenerator(ore_end_sapphire, world, random, chunkX, chunkZ, 50, 0, 100);break;
		}		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		
		if(minHeight > maxHeight || minHeight<0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight +1;
		for(int i=0; i < chance; i++) { 
			
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
		
	}
	
	
}
