package com.nesroht.playingaround.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {
    public static void init()
    {
        //Shaped Items
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordNirite), " s ", " s ", " t ", 's', ModItems.ingotNirite, 't', Items.stick));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.helmNirite), "sss", "s s", 's', ModItems.ingotNirite));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.plateNirite), "s s", "sss", "sss", 's', ModItems.ingotNirite));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.legsNirite), "sss", "s s", "s s", 's', ModItems.ingotNirite));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bootsNirite), "s s", "s s", 's', ModItems.ingotNirite));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockNirite), "sss", "sss", "sss", 's', ModItems.ingotNirite));
        //Shapeless Items


        //Smelting
        GameRegistry.addSmelting(ModBlocks.oreNirite, new ItemStack(ModItems.ingotNirite), 0.1F);
    }
}
