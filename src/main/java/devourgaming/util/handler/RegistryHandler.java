package devourgaming.util.handler;

import devourgaming.command.CDT;
import devourgaming.init.BiomeInit;
import devourgaming.init.BlockInit;
import devourgaming.init.DimensionInit;
import devourgaming.init.MaterialInit;
import devourgaming.util.Interface.IModel;
import devourgaming.world.gen.OreGen;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(MaterialInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for(Item item : MaterialInit.ITEMS) {
            if(item instanceof IModel) {
                ((IModel)item).registerModels();
            }
        }
        for(Block block: BlockInit.BLOCKS) {
            if(block instanceof IModel) {
                ((IModel)block).registerModels();
            }
        }
    }

    public static void preInitRegistries() {
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
        BiomeInit.registerBiomes();
        DimensionInit.registerDimensions();
       // EntityInit.registerEntities();
    }

    public static void initRegistries() {
       // OreDictionaryCompat.registerOres();
    }

    public static void postInitRegistries() {}

    public static void serverRegistries(FMLServerStartingEvent event) {
        event.registerServerCommand(new CDT());
    }
}
