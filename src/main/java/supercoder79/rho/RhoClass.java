package supercoder79.rho;

import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.levelgen.DensityFunction;

public interface RhoClass {
    double compute(DensityFunction.FunctionContext ctx);

    default void init(ChunkPos pos) {

    }
}
