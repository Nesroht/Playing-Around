package com.nesroht.playingaround.block;

import com.nesroht.playingaround.PlayingAround;
import com.nesroht.playingaround.container.niriteFurnaceContainer;
import com.nesroht.playingaround.creativetab.CreativeTabCommon;
import com.nesroht.playingaround.init.ModBlocks;
import com.nesroht.playingaround.reference.Constants;
import com.nesroht.playingaround.reference.Names;
import com.nesroht.playingaround.reference.Reference;
import com.nesroht.playingaround.tiles.FurnaceTile;
import com.nesroht.playingaround.utility.WorldHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class BlockFurnace extends BlockContainer {
    private final Random randomint = new Random();
    private boolean isUpdating;
    private FurnaceTile tile;

    public BlockFurnace(boolean Active) {
        super(Material.rock);
        this.setCreativeTab(CreativeTabCommon.COMMON_TAB);
        this.setBlockName("furnace");
        this.setBlockTextureName(this.getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
    }

    @Override
    public float getBlockHardness(World world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z) == 0 ? 10F : 20F;
    }

    @Override
    public Item getItemDropped(int no, Random rand, int clue)
    {
        return Item.getItemFromBlock(ModBlocks.furnace);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if (!world.isRemote)
        {
            player.openGui(PlayingAround.instance, Constants.NIRITE_FURNACE_GUI, world, x, y, z);
        }

        return true;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int meta)
    {
        FurnaceTile tile = ((FurnaceTile) world.getTileEntity(x, y, z));
        tile.invalidate();
        super.breakBlock(world, x, y, z, block, meta);
    }

    public void updateFurnaceBlockState(boolean isActive, World world, int x, int y, int z)
    {
        int meta = world.getBlockMetadata(x, y, z);
        TileEntity tile = world.getTileEntity(x, y, z);
        isUpdating = true;
        world.setBlock(x,y,z,ModBlocks.furnace);
        isUpdating = false;
        world.setBlockMetadataWithNotify(x, y, z, meta, 2);

        if (tile != null)
        {
            tile.validate();
            world.setTileEntity(x, y, z, tile);
        }
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entLiving, ItemStack stack)
    {
        switch (MathHelper.floor_double((double) (entLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3)
        {
            case 0: world.setBlockMetadataWithNotify(x, y, z, 2, 2); break;
            case 1: world.setBlockMetadataWithNotify(x, y, z, 5, 2); break;
            case 2: world.setBlockMetadataWithNotify(x, y, z, 3, 2); break;
            case 3: world.setBlockMetadataWithNotify(x, y, z, 4, 2); break;
            default: world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        TileEntity tile = world.getTileEntity(x, y, z);

        if (stack.hasTagCompound() && stack.stackTagCompound.getBoolean("PABlock"))
        {
            stack.stackTagCompound.setInteger("x", x);
            stack.stackTagCompound.setInteger("y", y);
            stack.stackTagCompound.setInteger("z", z);
            stack.stackTagCompound.setShort("BurnTime", (short) 0);
            stack.stackTagCompound.setShort("CookTime", (short) 0);

            tile.readFromNBT(stack.stackTagCompound);
        }
    }

    /*@SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random rand)
    {
        if (isActive)
        {
            int l = world.getBlockMetadata(x, y, z);
            float f = (float) x + 0.5F;
            float f1 = (float) y + 0.0F + rand.nextFloat() * 6.0F / 16.0F;
            float f2 = (float) z + 0.5F;
            float f3 = 0.52F;
            float f4 = rand.nextFloat() * 0.6F - 0.3F;

            if (l == 4)
            {
                world.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 5)
            {
                world.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 2)
            {
                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 3)
            {
                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
            }
        }
    }*/

    public int getRenderType(){
        return -1;
    }
    public boolean isOpaqueCube(){
        return false;
    }
    public boolean renderAsNormalBlock(){
        return false;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon)
    {
        this.blockIcon = icon.registerIcon(this.getTextureName());
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z)
    {
        return Item.getItemFromBlock(ModBlocks.furnace);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new FurnaceTile();
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}