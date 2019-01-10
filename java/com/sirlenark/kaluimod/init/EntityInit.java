package com.sirlenark.kaluimod.init;

import com.sirlenark.kaluimod.Main;
import com.sirlenark.kaluimod.entity.EntityScorpion;
import com.sirlenark.kaluimod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	
	public static void registerEntities() {
		registerEntity("scorpion", EntityScorpion.class, Reference.ENTITY_SCORPION, 50, 11437146, 000000);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.modid + ":" + name), entity, name, id, Main.instance, range, 1, true, color1,color2);
	}

}
