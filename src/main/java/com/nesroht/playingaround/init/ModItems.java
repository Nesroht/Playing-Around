package com.nesroht.playingaround.init;

import com.nesroht.playingaround.item.*;
import com.nesroht.playingaround.item.Armor.ItemNiriteBoots;
import com.nesroht.playingaround.item.Armor.ItemNiriteHelmet;
import com.nesroht.playingaround.item.Armor.ItemNiriteLegs;
import com.nesroht.playingaround.item.Armor.ItemNiritePlate;
import com.nesroht.playingaround.item.Items.ItemNiriteIngot;
import com.nesroht.playingaround.item.Tools.ItemNiriteAxe;
import com.nesroht.playingaround.item.Tools.ItemNiriteHoe;
import com.nesroht.playingaround.item.Tools.ItemNiritePick;
import com.nesroht.playingaround.item.Tools.ItemNiriteShovel;
import com.nesroht.playingaround.item.Weapons.ItemNiriteSword;
import com.nesroht.playingaround.reference.Names;
import com.nesroht.playingaround.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemNiriteSword swordNirite = new ItemNiriteSword();
    public static final ItemCommon ingotNirite = new ItemNiriteIngot();
    public static final ItemArmorCommon helmNirite = new ItemNiriteHelmet();
    public static final ItemArmorCommon plateNirite = new ItemNiritePlate();
    public static final ItemArmorCommon legsNirite = new ItemNiriteLegs();
    public static final ItemArmorCommon bootsNirite = new ItemNiriteBoots();
    public static final ItemNiriteAxe axeNirite = new ItemNiriteAxe();
    public static final ItemNiriteShovel spadeNirite = new ItemNiriteShovel();
    public static final ItemNiritePick pickNirite = new ItemNiritePick();
    public static final ItemNiriteHoe hoeNirite = new ItemNiriteHoe();


    public static void init()
    {
        GameRegistry.registerItem(swordNirite, Names.Weapons.NIRITE_SWORD);
        GameRegistry.registerItem(ingotNirite, Names.Items.NIRITE_INGOT);
        GameRegistry.registerItem(helmNirite, Names.Armor.NIRITE_HELM);
        GameRegistry.registerItem(plateNirite, Names.Armor.NIRITE_PLATE);
        GameRegistry.registerItem(legsNirite, Names.Armor.NIRITE_LEGS);
        GameRegistry.registerItem(bootsNirite, Names.Armor.NIRITE_BOOTS);
        GameRegistry.registerItem(spadeNirite, Names.Tools.NIRITE_SPADE);
        GameRegistry.registerItem(axeNirite, Names.Tools.NIRITE_AXE);
        GameRegistry.registerItem(pickNirite, Names.Tools.NIRITE_PICK);
        GameRegistry.registerItem(hoeNirite, Names.Tools.NIRITE_HOE);


    }
}
