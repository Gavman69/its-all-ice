package net.vyxia.all_ice;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.RangeConstraint;
import io.wispforest.owo.config.annotation.SectionHeader;

@Modmenu(modId = ItsAllIce.MOD_ID)
@Config(name = ItsAllIce.MOD_ID, wrapperName = "iceConfig")
public class iceConfigModel {
    public boolean enabled = true;

    public slipChoices slipSetting = slipChoices.sDefault;

    public enum slipChoices {
        sDefault, blue_ice, ice, normal_block, custom
    }

    @RangeConstraint(min = 0.6F, max = 1.5F, decimalPlaces = 3)
    public float customSlipness = 0.6F;
}
