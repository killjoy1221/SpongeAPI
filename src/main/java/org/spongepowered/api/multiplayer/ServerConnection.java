/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
