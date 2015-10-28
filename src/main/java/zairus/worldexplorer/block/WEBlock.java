package zairus.worldexplorer.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import zairus.worldexplorer.WorldExplorer;

public class WEBlock extends Block
{
	private String modName;
	
	protected WEBlock(Material material)
	{
		super(material);
		this.setCreativeTab(WorldExplorer.tabWorldExplorer);
	}
	
	public WEBlock setUnlocalizedName(String unlocalizedName)
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
