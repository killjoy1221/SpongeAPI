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
package org.spongepowered.api;

import org.spongepowered.api.data.value.mutable.Value;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.multiplayer.ServerEntry;
import org.spongepowered.api.multiplayer.Session;
import org.spongepowered.api.renderer.TextureManager;
import org.spongepowered.api.resource.ResourceManager;
import org.spongepowered.api.world.World;

import java.net.InetSocketAddress;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

/**
 * Represents the Minecraft client.
 */
public interface Client extends ThreadContext {

    /**
     * Gets the {@link ResourceManager} instance.
     *
     * @return The resource manager
     */
    ResourceManager getResourceManager();

    /**
     * Gets the {@link TextureManager} instance.
     *
     * @return The texture manager
     */
    TextureManager getTextureManager();

    /**
     * Gets the current session if it exists
     *
     * @return The session
     */
    Optional<Session> getSession();

    /**
     * Gets the currently loaded world, if any.
     *
     * @return The current world
     */
    Optional<World> getLoadedWorld();

    /**
     * Gets the current client player entity, if it exists.
     *
     * @return The client player
     */
    Optional<Player> getClientPlayer();

    /**
     * Gets the current integrated server instance if it is running.
     *
     * @return
     */
    Optional<Server> getIntegratedServer();

    /**
     * Loads a world save with the given name.
     *
     * @param world The world name or id
     */
    void loadWorld(String world);

    /**
     * Joins a server.
     *
     * @param server The server to join
     */
    void joinServer(ServerEntry server);

    /**
     * Joins a server using the given address.
     *
     * @param address The address to join
     */
    void joinServer(InetSocketAddress address);

    /**
     * Gets the list of servers saved in the multiplayer menu.
     *
     * @return The list of server entries
     */
    List<ServerEntry> getServerList();

    /**
     * Gets the current server being played on if it exists
     *
     * @return The current server
     */
    Optional<ServerEntry> getCurrentServer();

    /**
     * Gets the current pause state of the game. In singleplayer, pausing the game will also pause
     * the world. In multiplayer, it will only bring up the pause menu.
     *
     * @return The current pause state
     */
    Value<Boolean> pause();

    /**
     * Gets the current directory the game is running in.
     *
     * @return The current directory
     */
    Path getGameDirectory();

    /**
     * Gets the directory resource packs are stored in.
     *
     * @return The directory for resource packs
     */
    Path getResourcePacksDirectory();

    /**
     * Gets the directory game assets are and should be stored in.
     *
     * @return The directory for assets
     */
    Path getAssetsDirectory();

}
