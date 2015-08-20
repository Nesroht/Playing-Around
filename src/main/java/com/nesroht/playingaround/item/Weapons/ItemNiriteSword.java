package com.nesroht.playingaround.item.Weapons;

import com.nesroht.playingaround.creativetab.CreativeTabCommon;
import com.nesroht.playingaround.reference.Material;
import com.nesroht.playingaround.reference.Names;
import com.nesroht.playingaround.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemNiriteSword extends ItemSword
{
    public ItemNiriteSword()
    {
        super(Material.Tools.NIRITE_TOOL);
        setCreativeTab(CreativeTabCommon.COMMON_TAB);
        this.setUnlocalizedName(Names.Weapons.NIRITE_SWORD);
        this.setMaxStackSize(1);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
