package devourgaming.object.tool;

import devourgaming.Main;
import devourgaming.init.MaterialInit;
import devourgaming.util.Interface.IModel;
import net.minecraft.item.ItemPickaxe;

public class ToolPick extends ItemPickaxe implements IModel {
	public ToolPick(String name, ToolMaterial material) {
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