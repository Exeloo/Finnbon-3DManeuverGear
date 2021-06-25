package me.finnbon.maneuvergear.util;

import org.bukkit.Material;
import org.bukkit.block.Block;

import java.util.Arrays;
import java.util.List;

/**
 * A class used for generic {@link Block} methods
 */
public class BlockUtil {

    private static final List<Material> NON_SOLID = Arrays.asList(Material.AIR,
            Material.BROWN_MUSHROOM,
            Material.BLACK_BANNER,
            Material.BLUE_BANNER,
            Material.BROWN_BANNER,
            Material.CYAN_BANNER,
            Material.GRAY_BANNER,
            Material.GREEN_BANNER,
            Material.LIGHT_BLUE_BANNER,
            Material.LIGHT_GRAY_BANNER,
            Material.LIME_BANNER,
            Material.BREWING_STAND,
            Material.COCOA,
            Material.DEAD_BUSH,
            Material.DETECTOR_RAIL,
            Material.REDSTONE_LAMP,
            Material.KELP_PLANT,
            Material.NETHER_PORTAL,
            Material.END_ROD,
            Material.FIRE,
            Material.LAVA,
            Material.LEVER,
            Material.GRASS,
            Material.MELON_STEM,
            Material.NETHER_WART,
            Material.END_PORTAL,
            Material.POWERED_RAIL,
            Material.PUMPKIN_STEM,
            Material.RAIL,
            Material.REDSTONE_TORCH,
            Material.REDSTONE_WIRE,
            Material.RED_MUSHROOM,
            Material.RED_TULIP,
            Material.ACACIA_SAPLING,
            Material.SNOW,
            Material.SUGAR_CANE,
            Material.TORCH,
            Material.TRIPWIRE,
            Material.TRIPWIRE_HOOK,
            Material.VINE,
            Material.WATER);

    public static boolean isSolid(Block block) {
        return !NON_SOLID.contains(block.getType());
    }

}
