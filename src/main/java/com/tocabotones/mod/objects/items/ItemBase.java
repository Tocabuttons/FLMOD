package com.tocabotones.mod.objects.items;

import com.tocabotones.mod.Plantilla;
import com.tocabotones.mod.init.ItemInit;

import com.tocabotones.mod.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Plantilla.FLECHIPOLLATAB);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        Plantilla.proxy.registerItemRenderer(this,0, "inventory");
    }
}
