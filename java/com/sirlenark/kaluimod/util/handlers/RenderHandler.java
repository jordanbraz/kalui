package com.sirlenark.kaluimod.util.handlers;

import com.sirlenark.kaluimod.entity.EntityScorpion;
import com.sirlenark.kaluimod.entity.render.RenderScorpion;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRender() {
		RenderingRegistry.registerEntityRenderingHandler(EntityScorpion.class, new IRenderFactory<EntityScorpion>() {
			
			public Render<? super EntityScorpion> createRenderFor(RenderManager manager){
				
				return new RenderScorpion(manager);
			}
		});
	}
}
