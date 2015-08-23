package com.nesroht.playingaround.item;

import com.nesroht.playingaround.creativetab.CreativeTabCommon;
import com.nesroht.playingaround.init.ModItems;
import com.nesroht.playingaround.reference.Material;
import com.nesroht.playingaround.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorCommon extends ItemArmor
{
    public String material = "";
    public ItemArmorCommon(int piece, ArmorMaterial mat, String type2)
    {
        super(mat, 0, piece);
        material = type2;
        setCreativeTab(CreativeTabCommon.COMMON_TAB);
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
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ModItems.helmNirite || stack.getItem() == ModItems.bootsNirite || stack.getItem() == ModItems.plateNirite){
            return Reference.MOD_ID + ":textures/armor/"+ material +"_layer1.png";
        }
        else if(stack.getItem() == ModItems.helmWhiteDiamond || stack.getItem() == ModItems.bootsWhiteDiamond || stack.getItem() == ModItems.plateWhiteDiamond){
            return Reference.MOD_ID + ":textures/armor/"+ material +"_layer1.png";
        }
        else if(stack.getItem() == ModItems.legsNirite || stack.getItem() == ModItems.legsWhiteDiamond){
            return Reference.MOD_ID + ":textures/armor/" + material +"_layer2.png";
        }
        else{
            return null;
        }

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }



    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
    {
        return null;
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
