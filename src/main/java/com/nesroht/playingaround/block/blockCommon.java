package com.nesroht.playingaround.block;

import com.nesroht.playingaround.creativetab.CreativeTabCommon;
import com.nesroht.playingaround.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockCommon extends Block{
    public BlockCommon(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabCommon.COMMON_TAB);
    }
    public BlockCommon()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabCommon.COMMON_TAB);
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
