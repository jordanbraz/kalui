package com.sirlenark.kaluimod.entity.render;

import com.sirlenark.kaluimod.entity.EntityScorpion;
import com.sirlenark.kaluimod.entity.model.ModelScorpion;
import com.sirlenark.kaluimod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScorpion extends RenderLiving<EntityScorpion>{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.modid + ":textures/entity/scorpion.png");

	public RenderScorpion(RenderManager manager) {
		super(manager, new ModelScorpion(), 0.5F);
		
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityScorpion entity) {
		return TEXTURES;
	}
	@Override
	protected void applyRotations(EntityScorpion entityLiving, float p_77043_2_, float rotationYaw,	float partialTicks) {
		
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	
	

}
