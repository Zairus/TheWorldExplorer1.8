package zairus.worldexplorer.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zairus.worldexplorer.block.WEBlock;
import zairus.worldexplorer.item.WEItem;

public class WorldExplorerCommon
{
	public static final Minecraft mc = Minecraft.getMinecraft();
	
	public void preInit()
	{
		;
	}
	
	public void init()
	{
		;
	}
	
	public void postInit()
	{
		;
	}
	
	public void registerItem(WEItem item, String name)
	{
		GameRegistry.registerItem(item, name);
	}
	
	public void registerItemModel(WEItem item, int meta)
	{
	}
	
	public void registerItemModel(Item item, int meta, String texture)
	{
	}
	
	public void registerBlock(WEBlock block)
	{
		registerBlock(block, false);
	}
	
	public void registerBlock(WEBlock block, boolean model)
	{
		registerBlock(block, ItemBlock.class, model);
	}
	
	public void registerBlock(WEBlock block, Class <? extends ItemBlock> clazz, boolean model)
	{
		GameRegistry.registerBlock(block, clazz, block.getModName());
	}
	
	public void registerBlockModel(WEBlock block, int metadata)
	{
	}
}
