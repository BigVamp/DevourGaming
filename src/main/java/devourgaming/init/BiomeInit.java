package devourgaming.init;

import devourgaming.world.biome.BiomeCrimson;
import devourgaming.world.biome.BiomeDimensionCrimson;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit {
    public static final Biome BIOME_CRIMSON = new BiomeCrimson();
    public static final Biome DIMENSION_CRIMSON = new BiomeDimensionCrimson();

    public static void registerBiomes() {
        initBiome(BIOME_CRIMSON, "BiomeCrimson", BiomeType.DESERT, Type.SPOOKY, Type.DENSE);
        initBiome(DIMENSION_CRIMSON, "DimensionCrimson", BiomeType.DESERT, Type.SPOOKY, Type.DENSE);
    }

    private static Biome initBiome(Biome biome, String name, BiomeManager.BiomeType biomeType, Type... types) {
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 0));
        BiomeManager.addSpawnBiome(biome);
        return biome;
    }
}