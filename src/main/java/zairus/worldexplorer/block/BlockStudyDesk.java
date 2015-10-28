package zairus.worldexplorer.block;

import net.minecraft.block.material.Material;

public class BlockStudyDesk extends WEBlockFacingHorizontal
{
	public BlockStudyDesk()
	{
		super(Material.wood);
		this.setStepSound(soundTypeWood);
		this.setResistance(0.7F);
		this.setHardness(1.9F);
		this.setHarvestLevel("axe", 0);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.87F, 1.0F);
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
}
