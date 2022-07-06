package com.tocabotones.mod.tabs;

import com.tocabotones.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FlechipollaTab extends CreativeTabs {

    public FlechipollaTab(String name) {
        super("flechipollamod");
        this.setBackgroundImageName("flechipollamod.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.LINGOTE_POLLO);
    }

}
