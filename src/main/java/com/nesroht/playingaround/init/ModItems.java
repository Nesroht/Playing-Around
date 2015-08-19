package com.nesroht.playingaround.init;

import com.nesroht.playingaround.item.*;
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


    public static void init()
    {
        GameRegistry.registerItem(swordNirite, Names.Weapons.NIRITE_SWORD);
        GameRegistry.registerItem(ingotNirite, Names.Items.NIRITE_INGOT);
        GameRegistry.registerItem(helmNirite, Names.Armor.NIRITE_HELM);
        GameRegistry.registerItem(plateNirite, Names.Armor.NIRITE_PLATE);
        GameRegistry.registerItem(legsNirite, Names.Armor.NIRITE_LEGS);
        GameRegistry.registerItem(bootsNirite, Names.Armor.NIRITE_BOOTS);

    }
}
