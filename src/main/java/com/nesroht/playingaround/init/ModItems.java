package com.nesroht.playingaround.init;

import com.nesroht.playingaround.item.*;
import com.nesroht.playingaround.item.Armor.ItemCommonBoots;
import com.nesroht.playingaround.item.Armor.ItemCommonHelmet;
import com.nesroht.playingaround.item.Armor.ItemCommonLegs;
import com.nesroht.playingaround.item.Armor.ItemCommonPlate;
import com.nesroht.playingaround.item.Tools.ItemCommonAxe;
import com.nesroht.playingaround.item.Tools.ItemCommonHoe;
import com.nesroht.playingaround.item.Tools.ItemCommonPick;
import com.nesroht.playingaround.item.Tools.ItemCommonShovel;
import com.nesroht.playingaround.item.Weapons.ItemCommonSword;
import com.nesroht.playingaround.reference.Material;
import com.nesroht.playingaround.reference.Names;
import com.nesroht.playingaround.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Items
    public static final ItemCommon ingotNirite = new ItemCommon(Names.Items.NIRITE_INGOT);
    public static final ItemCommon gemWhiteDiamond = new ItemCommon(Names.Items.WHITE_DIAMOND_GEM);

    //Tools
    public static final ItemCommonAxe axeNirite = new ItemCommonAxe(Material.Tools.NIRITE_TOOL, Names.Tools.NIRITE_AXE);
    public static final ItemCommonShovel spadeNirite = new ItemCommonShovel(Material.Tools.NIRITE_TOOL, Names.Tools.NIRITE_SPADE);
    public static final ItemCommonPick pickNirite = new ItemCommonPick(Material.Tools.NIRITE_TOOL, Names.Tools.NIRITE_PICK);
    public static final ItemCommonHoe hoeNirite = new ItemCommonHoe(Material.Tools.NIRITE_TOOL, Names.Tools.NIRITE_HOE);
    public static final ItemCommonAxe axeWhiteDiamond = new ItemCommonAxe(Material.Tools.WHITE_DIAMOND_TOOL, Names.Tools.WHITE_DIAMOND_AXE);
    public static final ItemCommonShovel spadeWhiteDiamond = new ItemCommonShovel(Material.Tools.WHITE_DIAMOND_TOOL, Names.Tools.WHITE_DIAMOND_SPADE);
    public static final ItemCommonPick pickWhiteDiamond = new ItemCommonPick(Material.Tools.WHITE_DIAMOND_TOOL, Names.Tools.WHITE_DIAMOND_PICK);
    public static final ItemCommonHoe hoeWhiteDiamond = new ItemCommonHoe(Material.Tools.WHITE_DIAMOND_TOOL, Names.Tools.WHITE_DIAMOND_HOE);

    //Weapons
    public static final ItemCommonSword swordNirite = new ItemCommonSword(Material.Tools.NIRITE_TOOL, Names.Weapons.NIRITE_SWORD);
    public static final ItemCommonSword swordWhiteDiamond = new ItemCommonSword(Material.Tools.WHITE_DIAMOND_TOOL, Names.Weapons.WHITE_DIAMOND_SWORD);

    //Armor
    public static final ItemArmorCommon helmNirite = new ItemCommonHelmet(Material.Armor.NIRITE_ARMOR, "nirite", Names.Armor.NIRITE_HELM);
    public static final ItemArmorCommon plateNirite = new ItemCommonPlate(Material.Armor.NIRITE_ARMOR, "nirite", Names.Armor.NIRITE_PLATE);
    public static final ItemArmorCommon legsNirite = new ItemCommonLegs(Material.Armor.NIRITE_ARMOR, "nirite", Names.Armor.NIRITE_LEGS);
    public static final ItemArmorCommon bootsNirite = new ItemCommonBoots(Material.Armor.NIRITE_ARMOR, "nirite", Names.Armor.NIRITE_BOOTS);
    public static final ItemArmorCommon helmWhiteDiamond = new ItemCommonHelmet(Material.Armor.WHITE_DIAMOND_ARMOR, "whiteDiamond", Names.Armor.WHITE_DIAMOND_HELM);
    public static final ItemArmorCommon plateWhiteDiamond = new ItemCommonPlate(Material.Armor.WHITE_DIAMOND_ARMOR, "whiteDiamond", Names.Armor.WHITE_DIAMOND_PLATE);
    public static final ItemArmorCommon legsWhiteDiamond = new ItemCommonLegs(Material.Armor.WHITE_DIAMOND_ARMOR, "whiteDiamond", Names.Armor.WHITE_DIAMOND_LEGS);
    public static final ItemArmorCommon bootsWhiteDiamond = new ItemCommonBoots(Material.Armor.WHITE_DIAMOND_ARMOR, "whiteDiamond", Names.Armor.WHITE_DIAMOND_BOOTS);


    public static void init()
    {
        //Items
        GameRegistry.registerItem(ingotNirite, Names.Items.NIRITE_INGOT);
        GameRegistry.registerItem(gemWhiteDiamond, Names.Items.WHITE_DIAMOND_GEM);

        //Tools
        GameRegistry.registerItem(spadeNirite, Names.Tools.NIRITE_SPADE);
        GameRegistry.registerItem(axeNirite, Names.Tools.NIRITE_AXE);
        GameRegistry.registerItem(pickNirite, Names.Tools.NIRITE_PICK);
        GameRegistry.registerItem(hoeNirite, Names.Tools.NIRITE_HOE);
        GameRegistry.registerItem(spadeWhiteDiamond, Names.Tools.WHITE_DIAMOND_SPADE);
        GameRegistry.registerItem(axeWhiteDiamond, Names.Tools.WHITE_DIAMOND_AXE);
        GameRegistry.registerItem(pickWhiteDiamond, Names.Tools.WHITE_DIAMOND_PICK);
        GameRegistry.registerItem(hoeWhiteDiamond, Names.Tools.WHITE_DIAMOND_HOE);

        //Weapons
        GameRegistry.registerItem(swordNirite, Names.Weapons.NIRITE_SWORD);
        GameRegistry.registerItem(swordWhiteDiamond, Names.Weapons.WHITE_DIAMOND_SWORD);

        //Armor
        GameRegistry.registerItem(helmNirite, Names.Armor.NIRITE_HELM);
        GameRegistry.registerItem(plateNirite, Names.Armor.NIRITE_PLATE);
        GameRegistry.registerItem(legsNirite, Names.Armor.NIRITE_LEGS);
        GameRegistry.registerItem(bootsNirite, Names.Armor.NIRITE_BOOTS);
        GameRegistry.registerItem(helmWhiteDiamond, Names.Armor.WHITE_DIAMOND_HELM);
        GameRegistry.registerItem(plateWhiteDiamond, Names.Armor.WHITE_DIAMOND_PLATE);
        GameRegistry.registerItem(legsWhiteDiamond, Names.Armor.WHITE_DIAMOND_LEGS);
        GameRegistry.registerItem(bootsWhiteDiamond, Names.Armor.WHITE_DIAMOND_BOOTS);

    }
}
