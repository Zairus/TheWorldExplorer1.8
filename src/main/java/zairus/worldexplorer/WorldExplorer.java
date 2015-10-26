package zairus.worldexplorer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid=WEConstants.CORE_MODID, name=WEConstants.CORE_NAME, version=WEConstants.CORE_VERSION)
public class WorldExplorer
{
	@Mod.Instance(WEConstants.CORE_MODID)
	public static WorldExplorer instance;
	
	public static Logger logger;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		;
	}
}
