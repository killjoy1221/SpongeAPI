package org.spongepowered.api.multiplayer;

import org.spongepowered.api.profile.GameProfile;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

/**
 * Contains the current server info and population data
 */
public interface ServerConnection {

    /**
     * Gets the address of this server
     *
     * @return The address
     */
    InetSocketAddress getAddress();

    /**
     * Disconnects from this server and returns to the multiplayer screen.
     */
    void disconnect();

    /**
     * Gets all the players currently playing.
     *
     * @return The players
     */
    Collection<GameProfile> getPlayers();

    /**
     * Gets all the player information
     *
     * @return the player information
     */
    Collection<PlayerInformation> getPlayerInfo();

    /**
     * Gets the player information for a specific {@link GameProfile}.
     *
     * @param profile The profile
     * @return The player information
     */
    Optional<PlayerInformation> getPlayerInfo(GameProfile profile);

    /**
     * Gets the player information for a specific {@link UUID}.
     *
     * @param uniqueId The profile id
     * @return The player information
     */
    Optional<PlayerInformation> getPlayerInfo(UUID uniqueId);

    /**
     * Gets the player information for a specific name.
     *
     * @param name The player name
     * @return The player information
     */
    Optional<PlayerInformation> getPlayerInfo(String name);
}
