package com.tocabotones.mod.init;




import com.tocabotones.mod.Plantilla;
import com.tocabotones.mod.entity.flechipollaarrow.EntityFlechipollaArrow;
import com.tocabotones.mod.util.References;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;

public class EntityInit {
    public static void registerEntities(){
        registerArrow("flechipolla_arrow", EntityFlechipollaArrow.class, References.ENTITY_FLECHIPOLLA_ARROW);
    }
    private static void registerArrow(String name, Class<? extends Entity> entity, int id)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(References.MOD_ID + ":" + name),
                entity, name, id, Plantilla.instance, 64, 20, true);
    }
}
