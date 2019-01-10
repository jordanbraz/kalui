package com.sirlenark.kaluimod.init;

import java.util.ArrayList;
import java.util.List;

import com.sirlenark.kaluimod.items.armour.ArmourBase;
import com.sirlenark.kaluimod.items.items.ItemBase;
import com.sirlenark.kaluimod.items.tools.ToolAxe;
import com.sirlenark.kaluimod.items.tools.ToolHoe;
import com.sirlenark.kaluimod.items.tools.ToolPickaxe;
import com.sirlenark.kaluimod.items.tools.ToolShovel;
import com.sirlenark.kaluimod.items.tools.ToolSword;
import com.sirlenark.kaluimod.util.IHasModel;
import com.sirlenark.kaluimod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemRegister{
	
	public static final List<Item> ITEMS = new ArrayList<Item>() ;
	
	//Material
	public static final ToolMaterial TOOL_RUBY = EnumHelper.addToolMaterial("tool_ruby", 4, 600, 9.0F, 4.0F, 10);
	public static final ToolMaterial TOOL_SAPPHIRE = EnumHelper.addToolMaterial("tool_sapphire", 5, 650, 10.0F, 4.0F, 12);
	public static final ArmorMaterial ARMOUR_RUBY = EnumHelper.addArmorMaterial("armour_ruby", Reference.modid + ":ruby", 40, new int[]{3, 7, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial ARMOUR_SAPPHIRE = EnumHelper.addArmorMaterial("armour_sapphire", Reference.modid + ":sapphire", 45, new int[]{4, 7, 8, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2.0F);
	//ITEM
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	
	
	//RUBY
	public static final Item AXE_RUBY = new ToolAxe("axe_ruby", TOOL_RUBY);
	public static final Item HOE_RUBY = new ToolHoe("hoe_ruby", TOOL_RUBY);
	public static final Item PICKAXE_RUBY = new ToolPickaxe("pickaxe_ruby", TOOL_RUBY);
	public static final Item SHOVEL_RUBY = new ToolShovel("shovel_ruby", TOOL_RUBY);
	public static final Item SWORD_RUBY = new ToolSword("sword_ruby", TOOL_RUBY);
	public static final Item HELMET_RUBY = new ArmourBase("helmet_ruby", ARMOUR_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_RUBY = new ArmourBase("chestplate_ruby", ARMOUR_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_RUBY = new ArmourBase("leggings_ruby",ARMOUR_RUBY,2,EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_RUBY = new ArmourBase("boots_ruby",ARMOUR_RUBY,1,EntityEquipmentSlot.FEET);	
	//SAPPHIRE
	public static final Item AXE_SAPPHIRE = new ToolAxe("axe_sapphire", TOOL_SAPPHIRE);
	public static final Item HOE_SAPPHIRE = new ToolHoe("hoe_sapphire", TOOL_SAPPHIRE);
	public static final Item PICKAXE_SAPPHIRE = new ToolPickaxe("pickaxe_sapphire", TOOL_SAPPHIRE);
	public static final Item SHOVEL_SAPPHIRE = new ToolShovel("shovel_sapphire", TOOL_SAPPHIRE);
	public static final Item SWORD_SAPPHIRE = new ToolSword("sword_sapphire", TOOL_SAPPHIRE);	
	public static final Item HELMET_SAPPHIRE = new ArmourBase("helmet_sapphire", ARMOUR_SAPPHIRE, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_SAPPHIRE = new ArmourBase("chestplate_sapphire", ARMOUR_SAPPHIRE, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_SAPPHIRE = new ArmourBase("leggings_sapphire",ARMOUR_SAPPHIRE,2,EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_SAPPHIRE = new ArmourBase("boots_sapphire",ARMOUR_SAPPHIRE,1,EntityEquipmentSlot.FEET);
	

}
