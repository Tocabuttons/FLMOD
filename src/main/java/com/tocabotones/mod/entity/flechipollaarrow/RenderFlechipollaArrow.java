package com.tocabotones.mod.entity.flechipollaarrow;

import com.tocabotones.mod.util.References;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderFlechipollaArrow extends RenderArrow<EntityFlechipollaArrow> {

    public RenderFlechipollaArrow(RenderManager manager) {
        super(manager);

    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityFlechipollaArrow entity) {
        return new ResourceLocation(References.MOD_ID + ":textures/entity/arrows/flechipolla_arrow.png");
    }
}
