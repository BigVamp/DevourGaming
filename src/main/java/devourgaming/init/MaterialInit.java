package devourgaming.init;

import net.minecraft.item.Item;
import java.util.ArrayList;
import java.util.List;

import devourgaming.object.material.MaterialBase;

public class MaterialInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    //Utility
    public static final Item AMTHEYST = new MaterialBase("amethyst");
    public static final Item ONYX = new MaterialBase("onyx");
    public static final Item RUBY = new MaterialBase("ruby");
    public static final Item SAPPHIRE = new MaterialBase("sapphire");
    public static final Item TOPAZ = new MaterialBase("topaz");
    public static final Item BITUMEN = new MaterialBase("bitumen");
    public static final Item MAGNESIUM = new MaterialBase("magnesium");
    public static final Item PHOSPHORITE = new MaterialBase("phosphorite");
    public static final Item POTASH = new MaterialBase("potash");
    public static final Item SALTPETER = new MaterialBase("saltpeter");
    public static final Item SULFUR = new MaterialBase("sulfur");
    //Adamantine
    public static final Item ADAMANTINE_INGOT = new MaterialBase("adamantine_ingot");
    public static final Item ADAMANTINE_DUST = new MaterialBase("adamantine_dust");
    public static final Item ADAMANTINE_NUGGET = new MaterialBase("adamantine_nugget");
    public static final Item ADAMANTINE_SMALL_SHEET = new MaterialBase("adamantine_small_sheet");
    public static final Item ADAMANTINE_MEDIUM_SHEET = new MaterialBase("adamantine_medium_sheet");
    public static final Item ADAMANTINE_LARGE_SHEET = new MaterialBase("adamantine_large_sheet");
}