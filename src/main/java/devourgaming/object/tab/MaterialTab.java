package devourgaming.object.tab;

import devourgaming.init.MaterialInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MaterialTab extends CreativeTabs {
    public MaterialTab(String label) {
        super("materialtab");
        this.setBackgroundImageName("devour.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(MaterialInit.ADAMANTINE_INGOT);
    }
}