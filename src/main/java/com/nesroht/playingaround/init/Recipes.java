package com.nesroht.playingaround.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init()
    {
        //Shaped Items
            //Weapons
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordNirite), "s", "s", "t", 's', ModItems.ingotNirite, 't', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.swordWhiteDiamond), "s", "s", "t", 's', ModItems.gemWhiteDiamond, 't', "stickWood"));
            //Armors
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.helmNirite), "sss", "s s", 's', ModItems.ingotNirite));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.plateNirite), "s s", "sss", "sss", 's', ModItems.ingotNirite));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.legsNirite), "sss", "s s", "s s", 's', ModItems.ingotNirite));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bootsNirite), "s s", "s s", 's', ModItems.ingotNirite));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.helmWhiteDiamond), "sss", "s s", 's', ModItems.gemWhiteDiamond));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.plateWhiteDiamond), "s s", "sss", "sss", 's', ModItems.gemWhiteDiamond));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.legsWhiteDiamond), "sss", "s s", "s s", 's', ModItems.gemWhiteDiamond));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bootsWhiteDiamond), "s s", "s s", 's', ModItems.gemWhiteDiamond));
            //Tools
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickNirite),"sss"," t "," t ",'s',ModItems.ingotNirite,'t',"stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeNirite),"ss","st"," t",'s',ModItems.ingotNirite,'t',"stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeNirite),"ss","ts","t ",'s',ModItems.ingotNirite,'t',"stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spadeNirite),"s","t","t",'s',ModItems.ingotNirite,'t',"stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeNirite),"ss"," t"," t",'s',ModItems.ingotNirite,'t',"stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeNirite),"ss","t ","t ",'s',ModItems.ingotNirite,'t',"stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pickWhiteDiamond),"sss"," t "," t ",'s',ModItems.gemWhiteDiamond,'t',"stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeWhiteDiamond),"ss ","st "," t ",'s',ModItems.gemWhiteDiamond,'t',"stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.axeWhiteDiamond)," ss"," ts"," t ",'s',ModItems.gemWhiteDiamond,'t',"stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spadeWhiteDiamond)," s "," t "," t ",'s',ModItems.gemWhiteDiamond,'t',"stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeWhiteDiamond),"ss "," t "," t ",'s',ModItems.gemWhiteDiamond,'t',"stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hoeWhiteDiamond)," ss"," t "," t ",'s',ModItems.gemWhiteDiamond,'t',"stickWood"));
            //Items

            //Blocks
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockNirite), "sss", "sss", "sss", 's', ModItems.ingotNirite));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockWhiteDiamond), "sss", "sss", "sss", 's', ModItems.gemWhiteDiamond));

        //Shapeless Items
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotNirite, 9), ModBlocks.blockNirite));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.gemWhiteDiamond, 9), ModBlocks.blockWhiteDiamond));

        //Smelting
        GameRegistry.addSmelting(ModBlocks.oreNirite, new ItemStack(ModItems.ingotNirite), 0.1F);
        GameRegistry.addSmelting(ModBlocks.oreWhiteDiamond, new ItemStack(ModItems.gemWhiteDiamond), 0.1F);
    }
}
