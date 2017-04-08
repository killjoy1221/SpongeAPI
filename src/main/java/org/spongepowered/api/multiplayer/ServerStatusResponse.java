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

import org.spongepowered.api.network.status.StatusResponse;

/**
 * Represents the status response from the server as well as a few extra
 * details which the client adds.
 */
public interface ServerStatusResponse extends StatusResponse {

    /**
     * Gets the latency for this server in milliseconds. This is updated when
     * the server list is refreshed.
     *
     * @return The latency
     */
    long getLatency();

    /**
     * Returns true if this server is hosted on a client which has been opened
     * to LAN.
     *
     * @return True if this is on a local client, false if not
     */
    boolean isLocal();

    /**
     * Gets the brand this server is running on.
     * <br/>
     * e.g. Sponge, Forge, Vanilla, Bukkit, BungeeCord.
     *
     * @return The brand
     */
    String getBrand();

}
