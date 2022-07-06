package com.tocabotones.mod.init;

import com.tocabotones.mod.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block CHICKEN_BLOCK = new BlockBase("chicken_block", Material.GROUND);

}
