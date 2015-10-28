package zairus.worldexplorer.item;

import zairus.worldexplorer.WorldExplorer;


public class WEItems
{
	public static final WEItem itemJournal;
	
	static
	{
		itemJournal = new BookJournal().setUnlocalizedName("ItemJournal");
	}
	
	public static void init()
	{
		WorldExplorer.proxy.registerItem(itemJournal, itemJournal.getModName());
	}
	
	public static void initModels()
	{
		WorldExplorer.proxy.registerItemModel(itemJournal, 0);
	}
}
