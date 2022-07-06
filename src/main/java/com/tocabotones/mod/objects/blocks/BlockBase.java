package com.tocabotones.mod.objects.blocks;

import com.tocabotones.mod.Plantilla;
import com.tocabotones.mod.init.BlockInit;
import com.tocabotones.mod.init.ItemInit;
import com.tocabotones.mod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Plantilla.FLECHIPOLLATAB);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Plantilla.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
