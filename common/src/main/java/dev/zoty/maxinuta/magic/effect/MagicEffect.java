package dev.zoty.maxinuta.magic.effect;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;

/**
 * Represents the effect of a magic spell.
 */
public interface IEffect {
    /**
     * Executes the effect on a specific entity (like a player or mob).
     *
     * @param entity The entity to apply the effect on.
     */
    void executeOnEntity(LivingEntity entity);

    /**
     * Executes the effect on a specific position in the world.
     *
     * @param level The world where the effect occurs.
     * @param position The position where the effect happens.
     */
    void executeOnPosition(ServerLevel level, BlockPos position);
}
