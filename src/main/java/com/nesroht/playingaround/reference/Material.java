package com.nesroht.playingaround.reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Material
{
    public static final class Tools
    {
        public static final Item.ToolMaterial NIRITE_TOOL = EnumHelper.addToolMaterial(Names.Materials.NIRITE, 4, 2300, 9F, 4F, 26);
        public static final Item.ToolMaterial WHITE_DIAMOND_TOOL = EnumHelper.addToolMaterial(Names.Materials.WHITE_DIAMOND, 4, 2300, 9F, 4F, 26);
    }
    public static final class Armor
    {
        public static final ItemArmor.ArmorMaterial NIRITE_ARMOR = EnumHelper.addArmorMaterial(Names.Materials.NIRITE, 40, new int[] {3, 8, 6, 3}, 26);
        public static final ItemArmor.ArmorMaterial WHITE_DIAMOND_ARMOR = EnumHelper.addArmorMaterial(Names.Materials.WHITE_DIAMOND, 40, new int[] {3, 8, 6, 3}, 26);
    }

}