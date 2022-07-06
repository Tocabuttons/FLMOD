package com.tocabotones.mod.objects.items;

import com.tocabotones.mod.Plantilla;
import com.tocabotones.mod.entity.flechipollaarrow.EntityFlechipollaArrow;
import com.tocabotones.mod.init.ItemInit;
import com.tocabotones.mod.util.interfaces.IHasModel;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FlechipollaArrow extends ItemArrow implements IHasModel {

    public FlechipollaArrow(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Plantilla.FLECHIPOLLATAB);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter)
    {
        EntityFlechipollaArrow entityFlechipollaArrow  = new EntityFlechipollaArrow(worldIn, shooter);
        return entityFlechipollaArrow;
    }

    @Override
    public void registerModels() {
        Plantilla.proxy.registerItemRenderer(this,0,"inventory");
    }
}
