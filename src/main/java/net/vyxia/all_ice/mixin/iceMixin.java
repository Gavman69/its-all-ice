package net.vyxia.all_ice.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.vyxia.all_ice.ItsAllIce;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Block.class)
public abstract class iceMixin extends AbstractBlock {

    public iceMixin(Settings settings) {
        super(settings);
    }

    /**
     * @reason Overwrite demanded me to add a reason
     * @author Vyxia
     */
	@Overwrite()
	public float getSlipperiness() {
        if (!ItsAllIce.CONFIG.enabled()) {
            return this.slipperiness;
        }
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