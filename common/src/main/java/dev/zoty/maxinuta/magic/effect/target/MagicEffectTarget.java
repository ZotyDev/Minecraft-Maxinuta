package dev.zoty.maxinuta.magic.effect.target;

import dev.zoty.maxinuta.magic.effect.IEffect;

/**
 * Represents the target of a magic effect.
 */
public interface IEffectTarget {
    /**
     * Applies the effect on this target.
     *
     * @param effect The effect to apply.
     */
    void applyEffect(IEffect effect);
}
