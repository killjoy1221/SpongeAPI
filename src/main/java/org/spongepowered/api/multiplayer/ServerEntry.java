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

import org.spongepowered.api.data.DataView;
import org.spongepowered.api.util.Tristate;

import java.net.InetSocketAddress;
import java.util.Optional;

/**
 * Represents a sever entry in the multiplayer server list.
 */
public interface ServerEntry {

    /**
     * Gets the address used to connect to this server.
     *
     * @return The address
     */
    InetSocketAddress getAddress();

    /**
     * Gets whether this server is allowed to send a resource pack.
     *
     * <p>{@link Tristate#TRUE TRUE} means it is allowed</p>
     * <p>{@link Tristate#FALSE FALSE} means it is not allowed</p>
     * <p>{@link Tristate#UNDEFINED UNDEFINED} means it will ask</p>
     *
     * @return
     */
    Tristate acceptsResourcePack();

    /**
     * Gets the name given to this server if it has one. If this server was
     * not added to the server list, then it will not have one.
     *
     * @return The name
     */
    Optional<String> getName();

    /**
     * Gets any additional info which is fetched from the server response. If
     * this server has not been pinged from the server list, this will return
     * empty.
     *
     * @return The status reponse
     */
    Optional<ServerStatusResponse> getStatusResponse();

    /**
     * Gets the raw data which this server is loaded from or saved to.
     *
     * @return The dataview
     */
    Optional<DataView> getDataView();


}
