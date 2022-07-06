package com.tocabotones.mod.util.handlers;

import com.tocabotones.mod.entity.flechipollaarrow.EntityFlechipollaArrow;
import com.tocabotones.mod.entity.flechipollaarrow.RenderFlechipollaArrow;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRender(){
        RenderingRegistry.registerEntityRenderingHandler(EntityFlechipollaArrow.class, new IRenderFactory<EntityFlechipollaArrow>() {
            @Override
            public Render<? super EntityFlechipollaArrow> createRenderFor(RenderManager manager) {
                return new RenderFlechipollaArrow(manager);
            }
        });
    }
}
