package net.vyxia.all_ice.mixin;

import net.minecraft.block.Block;
import net.vyxia.all_ice.ItsAllIce;
import net.vyxia.all_ice.iceConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Block.class)
public class iceMixin {
    /**
     * @reason Felt like it
     * @author Vyxia
     */
	@Overwrite()
	public float getSlipperiness() {
        float v = 1.075F;
        switch (ItsAllIce.CONFIG.slipSetting()) {
            case blue_ice -> v = 0.989F;
            case ice -> v = 0.98F;
            case normal_block -> v = 0.6F;
            case custom -> v = ItsAllIce.CONFIG.customSlipness();
        }
        return v;
    }
}