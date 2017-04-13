package org.spongepowered.api.multiplayer;

import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

/**
 * Default player textures
 */
public class PlayerTextures {

    // SORTFIELDS:ON

    /**
     * The cape texture
     */
    public static final PlayerTexture CAPE = DummyObjectProvider.createFor(PlayerTexture.class, "CAPE");

    /**
     * The special elytra texture.
     */
    public static final PlayerTexture ELYTRA = DummyObjectProvider.createFor(PlayerTexture.class, "ELYTRA");

    /**
     * The player's main skin.
     */
    public static final PlayerTexture SKIN = DummyObjectProvider.createFor(PlayerTexture.class, "SKIN");

    // SORTFIELDS:OFF
}
