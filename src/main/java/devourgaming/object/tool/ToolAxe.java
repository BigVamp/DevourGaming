package devourgaming.object.tool;

import devourgaming.Main;
import devourgaming.init.MaterialInit;
import devourgaming.util.Interface.IModel;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IModel {
	public ToolAxe(String name, ToolMaterial material) {
		super(material,  6.0F, -3.2F);
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