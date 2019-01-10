package com.sirlenark.kaluimod.items.blocks;

import com.sirlenark.kaluimod.Main;
import com.sirlenark.kaluimod.init.BlockRegister;
import com.sirlenark.kaluimod.init.ItemRegister;
import com.sirlenark.kaluimod.items.blocks.item.ItemBlockVariants;
import com.sirlenark.kaluimod.util.IHasModel;
import com.sirlenark.kaluimod.util.IMetaName;
import com.sirlenark.kaluimod.util.handlers.EnumHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockOres extends Block implements IHasModel, IMetaName{
	
	public static final PropertyEnum<EnumHandler.EnumType> VARIANT = PropertyEnum.<EnumHandler.EnumType>create("variant",EnumHandler.EnumType.class);
	
	private String name, dimension;
	
	
	public BlockOres(String name, String dimension) {	
		super(Material.ROCK);
		setHardness(3.0F);
		setUnlocalizedName(name);		
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumHandler.EnumType.RUBY));
		this.name = name;
		this.dimension = dimension;
		BlockRegister.BLOCKS.add(this);		
		ItemRegister.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
		setHarvestLevel("pickaxe", 4);			
	}
		
	@Override
	public int damageDropped(IBlockState state) {		
		return ((EnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {		
		return ((EnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.byMetadata(meta));
		
	}
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		for(EnumHandler.EnumType variant : EnumHandler.EnumType.values()){
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	@Override
	public String getSpecialName(ItemStack stack) {
		return EnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels()
	{
		for(int i = 0; i< EnumHandler.EnumType.values().length; i++) {
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "ore_"+ this.dimension +  "_" + EnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}

}
