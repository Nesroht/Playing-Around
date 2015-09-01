package com.nesroht.playingaround.init;

import com.nesroht.playingaround.block.BlockCommon;
import com.nesroht.playingaround.block.BlockCommonOre;
import com.nesroht.playingaround.block.BlockNiriteFurnace;
import com.nesroht.playingaround.reference.Names;
import com.nesroht.playingaround.reference.Reference;
import com.nesroht.playingaround.tiles.niriteFurnaceTile;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockCommonOre oreNirite = new BlockCommonOre();
    public static final BlockCommonOre oreWhiteDiamond = new BlockCommonOre();
    public static final BlockCommon blockNirite = new BlockCommon();
    public static final BlockCommon blockWhiteDiamond = new BlockCommon();
    public static final BlockNiriteFurnace furnaceNiriteOff = new BlockNiriteFurnace(false);
    public static final BlockNiriteFurnace furnaceNiriteOn = new BlockNiriteFurnace(true);

    public static void init()
    {
        //Ore
        GameRegistry.registerBlock(oreWhiteDiamond, Names.Blocks.WHITE_DIAMOND_ORE).setBlockName(Names.Blocks.WHITE_DIAMOND_ORE).setBlockTextureName(Names.Blocks.WHITE_DIAMOND_ORE);
        OreDictionary.registerOre(Names.Blocks.WHITE_DIAMOND_ORE, oreWhiteDiamond);
        GameRegistry.registerBlock(oreNirite, Names.Blocks.NIRITE_ORE).setBlockName(Names.Blocks.NIRITE_ORE).setBlockTextureName(Names.Blocks.NIRITE_ORE);
        OreDictionary.registerOre(Names.Blocks.NIRITE_ORE, oreNirite);

        //Blocks
        GameRegistry.registerBlock(blockNirite, Names.Blocks.NIRITE_BLOCK).setBlockName(Names.Blocks.NIRITE_BLOCK).setBlockTextureName(Names.Blocks.NIRITE_BLOCK).setResistance(10.0F).setHardness(3.0F);
        GameRegistry.registerBlock(blockWhiteDiamond, Names.Blocks.WHITE_DIAMOND_BLOCK).setBlockName(Names.Blocks.WHITE_DIAMOND_BLOCK).setBlockTextureName(Names.Blocks.WHITE_DIAMOND_BLOCK).setResistance(10.0F).setHardness(3.0F);

        //Containers
        GameRegistry.registerBlock(furnaceNiriteOff, Names.Blocks.NIRITE_FURNACE_OFF);
        GameRegistry.registerBlock(furnaceNiriteOn, Names.Blocks.NIRITE_FURNACE_ON);
        GameRegistry.registerTileEntity(niriteFurnaceTile.class, Names.Blocks.NIRITE_FURNACE_ON);

    }
}
