package devourgaming.init;

import devourgaming.world.dimension.DimensionCrimson;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {
    public static final DimensionType DIMENSION_CRIMSON = DimensionType.register("Crimson", "_crimson", 66, DimensionCrimson.class, false);

    public static void registerDimensions() {
        DimensionManager.registerDimension(66, DIMENSION_CRIMSON);
    }
}