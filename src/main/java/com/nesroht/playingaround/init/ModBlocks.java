package com.nesroht.playingaround.init;

import com.nesroht.playingaround.block.BlockCommon;
import com.nesroht.playingaround.block.BlockNiriteBlock;
import com.nesroht.playingaround.block.BlockNiriteFurnace;
import com.nesroht.playingaround.block.BlockNiriteOre;
import com.nesroht.playingaround.reference.Names;
import com.nesroht.playingaround.reference.Reference;
import com.nesroht.playingaround.tiles.niriteFurnaceTile;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockCommon oreNirite = new BlockNiriteOre();
    public static final BlockCommon blockNirite = new BlockNiriteBlock();
    public static final BlockNiriteFurnace furnaceNiriteOff = new BlockNiriteFurnace(false);
    public static final BlockNiriteFurnace furnaceNiriteOn = new BlockNiriteFurnace(true);

    public static void init()
    {
        GameRegistry.registerBlock(oreNirite, Names.Blocks.NIRITE_ORE);
        OreDictionary.registerOre(Names.Blocks.NIRITE_ORE, oreNirite);
        GameRegistry.registerBlock(blockNirite, Names.Blocks.NIRITE_BLOCK);
        GameRegistry.registerBlock(furnaceNiriteOff, Names.Blocks.NIRITE_FURNACE_OFF);
        GameRegistry.registerBlock(furnaceNiriteOn, Names.Blocks.NIRITE_FURNACE_ON);
        GameRegistry.registerTileEntity(niriteFurnaceTile.class, Names.Blocks.NIRITE_FURNACE_ON);
    }
}
