package com.tocabotones.mod.init;

import com.tocabotones.mod.objects.items.ChickenBow;
import com.tocabotones.mod.objects.items.FlechipollaArrow;
import com.tocabotones.mod.objects.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit  {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Items
    public static final Item LINGOTE_POLLO = new ItemBase("ingot_chicken");

    //Bow
    public static final Item CHICKEN_BOW = new ChickenBow("chicken_bow");
    public static final Item FLECHIPOLLA = new FlechipollaArrow("flechipolla_arrow");

}
