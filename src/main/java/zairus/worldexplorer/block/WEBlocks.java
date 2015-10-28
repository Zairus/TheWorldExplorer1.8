package zairus.worldexplorer.block;

import zairus.worldexplorer.WorldExplorer;

public class WEBlocks
{
	public static final WEBlock blockStudyDesk;
	
	static
	{
		blockStudyDesk = new BlockStudyDesk().setUnlocalizedName("BlockStudyDesk");
	}
	
	public static void init()
	{
		WorldExplorer.proxy.registerBlock(blockStudyDesk);
	}
	
	public static void initModels()
	{
		WorldExplorer.proxy.registerBlockModel(blockStudyDesk, 0);
	}
}
