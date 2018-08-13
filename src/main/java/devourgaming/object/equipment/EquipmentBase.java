package devourgaming.object.equipment;

import devourgaming.Main;
import devourgaming.init.EquipmentInit;
import devourgaming.util.Interface.IModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class EquipmentBase extends ItemArmor implements IModel {
	public EquipmentBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.EquipmentTab);
		EquipmentInit.EQUIPS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}