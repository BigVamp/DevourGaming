package devourgaming.object.tab;

import devourgaming.init.ToolInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ToolTab extends CreativeTabs {
    public ToolTab(String label) {
        super("tooltab");
        this.setBackgroundImageName("devour.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ToolInit.ADAMANTINE_SWORD);
    }
}