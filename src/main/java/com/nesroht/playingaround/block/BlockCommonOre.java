package com.nesroht.playingaround.block;

import com.nesroht.playingaround.creativetab.CreativeTabCommon;
import com.nesroht.playingaround.init.ModBlocks;
import com.nesroht.playingaround.init.ModItems;
import com.nesroht.playingaround.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockCommonOre extends BlockOre {
    public BlockCommonOre() {
        this.setCreativeTab(CreativeTabCommon.COMMON_TAB);
        this.setResistance(5.0F);
        this.setHardness(3.0F);
        this.setHarvestLevel("pickaxe", 3);
    }
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == ModBlocks.oreWhiteDiamond ? ModItems.gemWhiteDiamond : Item.getItemFromBlock(this);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

