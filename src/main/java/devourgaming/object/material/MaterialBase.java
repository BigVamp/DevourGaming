package devourgaming.object.material;

import devourgaming.Main;
import devourgaming.init.MaterialInit;
import devourgaming.util.Interface.IModel;
import net.minecraft.item.Item;

public class MaterialBase extends Item implements IModel {
    public MaterialBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.MaterialTab);
        MaterialInit.MATERIALS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}