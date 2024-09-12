package net.vyxia.all_ice.mixin;

import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Block.class)
public class iceMixin {
    /**
     * @reason Felt like it
     * @author Vyxia
     */
	@Overwrite()
	public float getSlipperiness() {
        return 1.075F;
    }
}