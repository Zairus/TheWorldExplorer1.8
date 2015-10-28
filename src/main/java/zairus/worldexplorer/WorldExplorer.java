package zairus.worldexplorer;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import zairus.worldexplorer.block.WEBlocks;
import zairus.worldexplorer.item.WEItems;
import zairus.worldexplorer.proxy.WorldExplorerCommon;

@Mod(modid=WEConstants.CORE_MODID, name=WEConstants.CORE_NAME, version=WEConstants.CORE_VERSION)
public class WorldExplorer
{
	@Mod.Instance(WEConstants.CORE_MODID)
	public static WorldExplorer instance;
	
	@SidedProxy(clientSide="zairus.worldexplorer.proxy.WorldExplorerClient", serverSide="zairus.worldexplorer.proxy.WorldExplorerCommon")
	public static WorldExplorerCommon proxy;
	
	public static Logger logger;
	
	public static CreativeTabs tabWorldExplorer = new CreativeTabs("tabWorldExplorer") {
		@Override
		public Item getTabIconItem() {
			return WEItems.itemJournal;
		}
	};
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();
		
		WEItems.init();
		WEBlocks.init();
		
		proxy.preInit();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		WEItems.initModels();
		WEBlocks.initModels();
		
		proxy.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit();
	}
}
