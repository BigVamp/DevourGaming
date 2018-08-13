package devourgaming.object.tool;

import devourgaming.Main;
import devourgaming.init.MaterialInit;
import devourgaming.util.Interface.IModel;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IModel {
	public ToolSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ToolTab);
		MaterialInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}