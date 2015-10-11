package evilcraft.block;

import com.google.common.collect.Sets;
import evilcraft.core.config.ConfigurableProperty;
import evilcraft.core.config.ConfigurableTypeCategory;
import evilcraft.core.config.extendedconfig.BlockContainerConfig;
import evilcraft.core.tileentity.upgrade.Upgrades;
import evilcraft.tileentity.TileWorking;

import java.util.Set;

/**
 * Config for the {@link SanguinaryEnvironmentalAccumulator}.
 * @author rubensworks
 *
 */
public class SanguinaryEnvironmentalAccumulatorConfig extends BlockContainerConfig {

    /**
     * The unique instance.
     */
    public static SanguinaryEnvironmentalAccumulatorConfig _instance;

    /**
     * The base blood usage in mB for recipes, this is multiplied with the cooldown time per recipe.
     */
    @ConfigurableProperty(category = ConfigurableTypeCategory.MACHINE, isCommandable = true, comment = "The base blood usage in mB for recipes, this is multiplied with the cooldown time per recipe.")
    public static int baseUsage = 100;

    /**
     * Make a new instance.
     */
    public SanguinaryEnvironmentalAccumulatorConfig() {
        super(
        	true,
            "sanguinaryEnvironmentalAccumulator",
            null,
            SanguinaryEnvironmentalAccumulator.class
        );
    }

    @Override
    public Set<Upgrades.Upgrade> getUpgrades() {
        return Sets.newHashSet(
                TileWorking.UPGRADE_EFFICIENCY,
                TileWorking.UPGRADE_SPEED,
                TileWorking.UPGRADE_TIER1,
                TileWorking.UPGRADE_TIER2,
                TileWorking.UPGRADE_TIER3);
    }
    
}
