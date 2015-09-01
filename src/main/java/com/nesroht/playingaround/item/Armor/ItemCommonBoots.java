package com.nesroht.playingaround.item.Armor;

import com.nesroht.playingaround.client.settings.Keybindings;
import com.nesroht.playingaround.init.ModItems;
import com.nesroht.playingaround.item.ItemArmorCommon;
import com.nesroht.playingaround.reference.Key;
import com.nesroht.playingaround.utility.ChatHelper;
import com.nesroht.playingaround.utility.IStepAssister;
import com.nesroht.playingaround.utility.PlayerChecks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraftforge.event.world.NoteBlockEvent;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemCommonBoots extends ItemArmorCommon implements IStepAssister {
    public static boolean canStepAssistNirite = true;
    public static boolean canStepAssistWhiteDiamond = true;
    public ItemCommonBoots(ArmorMaterial mat, String type, String name)
    {
        super(3, mat, type);
        this.setUnlocalizedName(name);
    }
    @Override
    public boolean canAssistStep(ItemStack stack, EntityPlayerMP player) {
        return player.getCurrentArmor(0) == stack;
    }
    public void toggleStepAssist(ItemStack boots, EntityPlayer player)
    {
        if (!boots.hasTagCompound())
        {
            boots.setTagCompound(new NBTTagCompound());
        }

        boolean value;

        if (boots.stackTagCompound.hasKey("StepAssist"))
        {
            boots.stackTagCompound.setBoolean("StepAssist", !boots.stackTagCompound.getBoolean("StepAssist"));
            value = boots.stackTagCompound.getBoolean("StepAssist");
        }
        else
        {
            boots.stackTagCompound.setBoolean("StepAssist", false);
            value = false;
        }

        if(boots.getItem()== ModItems.bootsNirite){canStepAssistNirite = value;}
        else if (boots.getItem()==ModItems.bootsWhiteDiamond){canStepAssistWhiteDiamond = value;}
        EnumChatFormatting e = value ? EnumChatFormatting.GREEN : EnumChatFormatting.RED;
        String s = value ? "pa.armor.enabled" : "pa.armor.disabled";
        player.addChatMessage(new ChatComponentTranslation("pa.armor.boots.stepassist_tooltip").appendText(" ")
                .appendSibling(ChatHelper.modifyColor(new ChatComponentTranslation(s), e)));
    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List tooltips, boolean unused)
    {
        String material = "";
        if (getMaterial(stack) == "nirite"){
            material = "Nirite";
        }
        else if(getMaterial(stack) == "whiteDiamond"){
            material = "White Diamond";
        }
        EnumChatFormatting a = EnumChatFormatting.BLUE;
        tooltips.add(String.format(a + StatCollector.translateToLocal("pa.armor.info"), material));
        tooltips.add(String.format(""));
        if(material == "White Diamond"){
            tooltips.add(String.format(
                    StatCollector.translateToLocal("pa.armor.flight.info"), getAmountOfPieces(player, stack)));

            tooltips.add("");
        }
        tooltips.add(String.format(
                StatCollector.translateToLocal("pa.armor.boots.stepassist.prompt"), Keyboard.getKeyName(Keyboard.KEY_LSHIFT) + " + " + Keyboard.getKeyName(Keybindings.mode.getKeyCode())));

        EnumChatFormatting e = canStep(stack) ? EnumChatFormatting.GREEN : EnumChatFormatting.RED;
        String s = canStep(stack) ? "pa.armor.enabled" : "pa.armor.disabled";
        tooltips.add(StatCollector.translateToLocal("pa.armor.boots.stepassist_tooltip") + " "
                + e + StatCollector.translateToLocal(s));
    }
    private boolean canStep(ItemStack stack)
    {
        if (stack.getItem() == ModItems.bootsNirite) {
            return canStepAssistNirite;
        }
        else if (stack.getItem() == ModItems.bootsWhiteDiamond){
            return canStepAssistWhiteDiamond;
        }
        else{
            return false;
        }
    }
}
