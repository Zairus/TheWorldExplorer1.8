package zairus.worldexplorer.item;

import net.minecraft.item.Item;
import zairus.worldexplorer.WorldExplorer;

public class WEItem extends Item
{
	private String modName;
	
	public WEItem()
	{
		this.setCreativeTab(WorldExplorer.tabWorldExplorer);
	}
	
	@Override
	public WEItem setUnlocalizedName(String unlocalizedName)
	{
		this.modName = unlocalizedName;
		super.setUnlocalizedName(unlocalizedName);
		return this;
	}
	
	public String getModName()
	{
		return this.modName;
	}
}
