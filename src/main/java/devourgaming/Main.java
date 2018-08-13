package devourgaming;

import devourgaming.object.tab.ToolTab;
import devourgaming.proxy.CommonProxy;
import devourgaming.util.Reference;
import devourgaming.util.handler.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.event.RegistryEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Mod.Instance(Reference.MOD_ID)
    public static Main instance;

    public static final CreativeTabs BlockTab = new ToolTab("Blocktab");
    public static final CreativeTabs EquipmentTab = new ToolTab("equipmenttab");
    public static final CreativeTabs MaterialTab = new ToolTab("materialtab");
    public static final CreativeTabs ToolTab = new ToolTab("tooltab");

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.preInitRegistries();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        RegistryHandler.initRegistries();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        RegistryHandler.postInitRegistries();
    }

    @Mod.EventHandler
    public void serverInit(FMLServerStartingEvent event) {
        RegistryHandler.serverRegistries(event);
    }

    @GameRegistry.ObjectHolder(Reference.MOD_ID)
    public static class Blocks {}

    @GameRegistry.ObjectHolder(Reference.MOD_ID)
    public static class Items {}

    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {
        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event) {}

        @SubscribeEvent
        public static void addBlocks(RegistryEvent.Register<Block> event) {}
    }
}
