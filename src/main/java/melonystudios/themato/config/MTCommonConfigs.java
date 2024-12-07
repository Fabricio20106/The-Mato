package melonystudios.themato.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class MTCommonConfigs {
    public final BooleanValue ipeForestGeneration;
    public final BooleanValue theWoodsGeneration;

    public final BooleanValue matoFlowersGeneration;

    public MTCommonConfigs(ForgeConfigSpec.Builder builder) {
        builder.comment("Welcome to the Mato's config files. This will be used to turn on or off features from the mod, mainly related to world generation.");

        builder.push("worldGeneration");
        this.ipeForestGeneration = builder.comment("Allow Ipe Forests to generate?").translation("configs.themato.ipeForestGeneration").define("ipeForestGeneration", true);
        this.theWoodsGeneration = builder.comment("Allow The Woods (biome) to generate?").translation("configs.themato.theWoodsGeneration").define("theWoodsGeneration", true);
        this.matoFlowersGeneration = builder.comment("Allow flowers added by The Mato (roses, cyan roses and paeonias) to generate?").translation("configs.themato.matoFlowersGeneration").define("matoFlowersGeneration", true);
        builder.pop();
    }
}
