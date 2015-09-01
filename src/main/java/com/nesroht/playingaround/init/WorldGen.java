package com.nesroht.playingaround.init;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGen implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX *16, chunkZ * 16);

        }
    }

    private void generateNether(World world, Random rand, int chunkX, int chunkZ){

    }

    private void generateSurface(World world, Random rand, int chunkX, int chunkZ){
        genNirite(world, rand, chunkX, chunkZ);
        genWhiteDiamond(world, rand, chunkX, chunkZ);
    }

    private void genWhiteDiamond(World world, Random rand, int chunkX, int chunkZ){
        for(int i = 0; i < 1; i++){
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(12);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModBlocks.oreWhiteDiamond, 8)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
    }

    private void genNirite(World world, Random rand, int chunkX, int chunkZ){
        for(int i = 0; i < 1; i++){
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(12);
            int randPosZ = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModBlocks.oreNirite, 8)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
    }
}
