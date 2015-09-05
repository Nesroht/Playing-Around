package com.nesroht.playingaround.item;

import com.nesroht.playingaround.client.settings.Keybindings;
import com.nesroht.playingaround.creativetab.CreativeTabCommon;
import com.nesroht.playingaround.init.ModItems;
import com.nesroht.playingaround.reference.Reference;
import com.nesroht.playingaround.utility.IStepAssister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemArmorCommon extends ItemArmor {
    public String material = "";

    public ItemArmorCommon(int piece, ArmorMaterial mat, String type) {
        super(mat, 0, piece);
        material = type;
        setCreativeTab(CreativeTabCommon.COMMON_TAB);
        this.setMaxStackSize(1);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == ModItems.helmNirite || stack.getItem() == ModItems.bootsNirite || stack.getItem() == ModItems.plateNirite) {
            return Reference.MOD_ID + ":textures/armor/" + material + "_layer1.png";
        } else if (stack.getItem() == ModItems.helmWhiteDiamond || stack.getItem() == ModItems.bootsWhiteDiamond || stack.getItem() == ModItems.plateWhiteDiamond) {
            return Reference.MOD_ID + ":textures/armor/" + material + "_layer1.png";
        } else if (stack.getItem() == ModItems.legsNirite || stack.getItem() == ModItems.legsWhiteDiamond) {
            return Reference.MOD_ID + ":textures/armor/" + material + "_layer2.png";
        } else {
            return null;
        }

    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        canFly(player);
    }

    public static void canFly(EntityPlayer player) {
        ItemStack helmet = player.getCurrentArmor(3);
        ItemStack plate = player.getCurrentArmor(2);
        ItemStack legs = player.getCurrentArmor(1);
        ItemStack boots = player.getCurrentArmor(0);

        if (helmet != null && plate != null && legs != null && boots != null) {
            if (player.getCurrentArmor(3).getItem() == ModItems.helmWhiteDiamond && player.getCurrentArmor(0).getItem() == ModItems.bootsWhiteDiamond && player.getCurrentArmor(2).getItem() == ModItems.plateWhiteDiamond && player.getCurrentArmor(1).getItem() == ModItems.legsWhiteDiamond) {
                player.capabilities.allowFlying = true;
            }
        }
        else if (!player.capabilities.isCreativeMode) {
            player.capabilities.allowFlying = false;
            player.capabilities.isFlying = false;
        }
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List tooltips, boolean unused) {
        String material = "";
        if (getMaterial(stack) == "nirite"){
            material = "Nirite";
        }
        else if(getMaterial(stack) == "whiteDiamond"){
            material = "White Diamond";
        }
        EnumChatFormatting e = EnumChatFormatting.BLUE;
        tooltips.add(String.format(e + StatCollector.translateToLocal("pa.armor.info"), material));
        if(material == "White Diamond"){
            tooltips.add(String.format(""));
            tooltips.add(String.format(
                    StatCollector.translateToLocal("pa.armor.flight.info"), getAmountOfPieces(player, stack)));
        }

    }


    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
        return null;
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


    public int getAmountOfPieces(EntityPlayer player, ItemStack stack) {
        int value = 0;
        String material = getMaterial(stack);
        for (ItemStack stack2 : player.inventory.armorInventory) {
            if (stack2 != null) {
                if (material == "whiteDiamond") {
                    if (stack2.getItem() == ModItems.helmWhiteDiamond) {
                        value += 1;
                    } else if (stack2.getItem() == ModItems.plateWhiteDiamond) {
                        value += 1;
                    } else if (stack2.getItem() == ModItems.legsWhiteDiamond) {
                        value += 1;
                    } else if (stack2.getItem() == ModItems.bootsWhiteDiamond) {
                        value += 1;
                    }
                } else if (material == "nirite") {
                    if (stack2.getItem() == ModItems.helmNirite) {
                        value += 1;
                    } else if (stack2.getItem() == ModItems.plateNirite) {
                        value += 1;
                    } else if (stack2.getItem() == ModItems.legsNirite) {
                        value += 1;
                    } else if (stack2.getItem() == ModItems.bootsNirite) {
                        value += 1;
                    }
                }
            }
        }
        return value;
    }
    public String getMaterial(ItemStack stack){
        String material = "";
        if (material == "") {
            if (stack.getItem() == ModItems.helmWhiteDiamond) {
                material = "whiteDiamond";
            } else if (stack.getItem() == ModItems.plateWhiteDiamond) {
                material = "whiteDiamond";
            } else if (stack.getItem() == ModItems.legsWhiteDiamond) {
                material = "whiteDiamond";
            } else if (stack.getItem() == ModItems.bootsWhiteDiamond) {
                material = "whiteDiamond";
            } else if (stack.getItem() == ModItems.helmNirite) {
                material = "nirite";
            } else if (stack.getItem() == ModItems.plateNirite) {
                material = "nirite";
            } else if (stack.getItem() == ModItems.legsNirite) {
                material = "nirite";
            } else if (stack.getItem() == ModItems.bootsNirite) {
                material = "nirite";
            }
        }
        return material;
    }
}
