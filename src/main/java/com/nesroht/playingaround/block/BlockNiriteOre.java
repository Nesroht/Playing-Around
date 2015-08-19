package com.nesroht.playingaround.block;

import com.nesroht.playingaround.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockNiriteOre extends BlockCommon{
    public BlockNiriteOre()
    {
        super();
        this.setBlockName(Names.Blocks.NIRITE_ORE);
        this.setBlockTextureName(Names.Blocks.NIRITE_ORE);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 3);
    }
}
