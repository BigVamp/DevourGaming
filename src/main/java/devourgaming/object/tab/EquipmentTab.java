package devourgaming.object.tab;

import devourgaming.init.EquipmentInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EquipmentTab extends CreativeTabs {
    public EquipmentTab(String label) {
        super("equipmenttab");
        this.setBackgroundImageName("devour.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(EquipmentInit.ADAMANTINE_CHEST);
    }
}