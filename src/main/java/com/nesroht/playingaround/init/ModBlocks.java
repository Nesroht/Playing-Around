package com.nesroht.playingaround.init;

import com.nesroht.playingaround.block.BlockCommon;
import com.nesroht.playingaround.block.BlockNiriteBlock;
import com.nesroht.playingaround.block.BlockNiriteFurnace;
import com.nesroht.playingaround.block.BlockNiriteOre;
import com.nesroht.playingaround.reference.Names;
import com.nesroht.playingaround.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockCommon oreNirite = new BlockNiriteOre();
    public static final BlockCommon blockNirite = new BlockNiriteBlock();
    public static final BlockNiriteFurnace furnaceNirite = new BlockNiriteFurnace();

    public static void init()
    {
        GameRegistry.registerBlock(oreNirite, Names.Blocks.NIRITE_ORE);
        GameRegistry.registerBlock(blockNirite, Names.Blocks.NIRITE_BLOCK);
        GameRegistry.registerBlock(furnaceNirite, Names.Blocks.NIRITE_FURNACE);
    }
}
