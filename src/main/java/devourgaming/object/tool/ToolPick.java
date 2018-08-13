package devourgaming.object.tool;

import devourgaming.Main;
import devourgaming.init.ToolInit;
import devourgaming.util.Interface.IModel;
import net.minecraft.item.ItemPickaxe;

public class ToolPick extends ItemPickaxe implements IModel {
	public ToolPick(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ToolTab);
		ToolInit.TOOLS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}