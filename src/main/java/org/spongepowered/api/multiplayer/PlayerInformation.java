package org.spongepowered.api.multiplayer;

import org.spongepowered.api.data.value.mutable.OptionalValue;
import org.spongepowered.api.data.value.mutable.Value;
import org.spongepowered.api.profile.GameProfile;
import org.spongepowered.api.resource.ResourceLocation;
import org.spongepowered.api.text.Text;

import java.util.Optional;

/**
 * General information about a network player.
 */
public interface PlayerInformation {

    /**
     * Gets the owning profile
     *
     * @return The profile
     */
    GameProfile getProfile();

    /**
     * Gets the location of this player's skin if it exists
     *
     * @param type The texture type
     * @return The skin location
     */
    Optional<ResourceLocation> getTexture(PlayerTexture type);

    /**
     * Gets this player's current latency according to the server.
     *
     * @return The latency
     */
    int getLatency();

    /**
     * The player's display name as it appears in the tab list.
     *
     * @return The player name
     */
    OptionalValue<Text> name();

    /**
     * The player's display health as it appears in the tab list. Zero means the health is not
     * displayed.
     *
     * @return The player health
     */
    Value<Integer> health();
}
