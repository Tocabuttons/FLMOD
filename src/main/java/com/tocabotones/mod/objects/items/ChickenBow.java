package com.tocabotones.mod.objects.items;

import com.tocabotones.mod.Plantilla;
import com.tocabotones.mod.init.ItemInit;
import com.tocabotones.mod.util.interfaces.IHasModel;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ChickenBow extends ItemBow implements IHasModel {

    public ChickenBow(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Plantilla.FLECHIPOLLATAB);
        setMaxDamage(800);
        setMaxStackSize(1);

        ItemInit.ITEMS.add(this);
    }

    // Numero de veces que se puede encantar
    @Override
    public int getItemEnchantability() {
        return 10;
    }

    @Override
    protected boolean isArrow(ItemStack stack) {
        if(stack.getItem() == ItemInit.FLECHIPOLLA){
            return true;
        } else return false;
    }

    @Override
    public void registerModels() {
        Plantilla.proxy.registerItemRenderer(this,0,"inventory");
    }

}
