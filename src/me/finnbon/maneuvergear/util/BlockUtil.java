package me.finnbon.maneuvergear.util;

import org.bukkit.block.Block;

/**
 * A class used for generic {@link Block} methods
 */
public class BlockUtil {
    public static boolean isSolid(Block block) {
        return block.getType().isSolid();
    }
}
