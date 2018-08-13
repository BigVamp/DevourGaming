package devourgaming.object.tab;

import devourgaming.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlockTab extends CreativeTabs {
    public BlockTab(String label) {
        super("blocktab");
        this.setBackgroundImageName("devour.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(BlockInit.ADAMANTINE_BRICK);
    }
}