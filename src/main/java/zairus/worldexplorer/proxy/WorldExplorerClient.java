package zairus.worldexplorer.proxy;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import zairus.worldexplorer.WEConstants;
import zairus.worldexplorer.block.WEBlock;
import zairus.worldexplorer.item.WEItem;

public class WorldExplorerClient extends WorldExplorerCommon
{
	@Override
	public void preInit()
	{
		;
	}
	
	@Override
	public void init()
	{
		;
	}
	
	@Override
	public void postInit()
	{
		;
	}
	
	@Override
	public void registerItem(WEItem item, String name)
	{
		super.registerItem(item, name);
	}
	
	@Override
	public void registerItemModel(WEItem item, int meta)
	{
		String itemId = WEConstants.CORE_MODID + ":" + item.getModName();
		WorldExplorerCommon.mc.getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(itemId, "inventory"));
	}
	
	@Override
	public void registerItemModel(Item item, int meta, String texture)
	{
		String itemId = WEConstants.CORE_MODID + ":" + texture;
		WorldExplorerCommon.mc.getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(itemId, "inventory"));
	}
	
	public void registerBlockModel(WEBlock block)
	{
		registerBlockModel(block, 0);
	}
	
	@Override
	public void registerBlockModel(WEBlock block, int meta)
	{
		Item item = Item.getItemFromBlock(block);
		
		if (item != null)
		{
			registerItemModel(item, meta, block.getModName());
		}
	}
}
