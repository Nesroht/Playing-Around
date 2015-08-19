package com.nesroht.playingaround.block;

import com.nesroht.playingaround.reference.Names;
import net.minecraft.block.material.Material;

public class BlockNiriteOre extends BlockCommon{
    public BlockNiriteOre()
    {
        super(Material.iron);
        this.setBlockName(Names.Blocks.NIRITE_ORE);
        this.setBlockTextureName(Names.Blocks.NIRITE_ORE);
    }
}
