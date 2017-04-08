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

import java.nio.file.Path;
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

    Optional<Session> getSession();

    Optional<World> getLoadedWorld();

    Optional<Player> getClientPlayer();

    Optional<Server> getIntegratedServer();

    void loadWorld(String world);

    void joinServer(ServerEntry server);

    Value<Boolean> pause();

    Path getMinecraftDir();

    Path getResourcePacksDir();

    Path getAssetsDir();

}
