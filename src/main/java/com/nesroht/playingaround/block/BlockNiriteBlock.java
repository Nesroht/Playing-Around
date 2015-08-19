package com.nesroht.playingaround.block;

import com.nesroht.playingaround.reference.Names;
import net.minecraft.block.material.Material;

public class BlockNiriteBlock extends BlockCommon
{
    public BlockNiriteBlock()
    {
        super(Material.iron);
        this.setBlockName(Names.Blocks.NIRITE_BLOCK);
        this.setBlockTextureName(Names.Blocks.NIRITE_BLOCK);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
    }
}
