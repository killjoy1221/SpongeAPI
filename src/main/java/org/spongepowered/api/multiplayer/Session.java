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

import org.spongepowered.api.util.Identifiable;

/**
 * The session data for a user.
 */
public interface Session extends Identifiable {

    String getName();

    String getSessionID();

    Type getSessionType();

    /**
     * <p>Authenticates this session against mojang's session server.</p>
     *
     * <p>
     * Note: This may use network bandwidth, so it may lock up the thread
     * while it waits.
     * </p>
     *
     * @return The auth level of the user
     */
    Auth authenticate();

    enum Type {
        MOJANG,
        LEGACY
    }

    enum Auth {

        /**
         * Can play on multiplayer games
         */
        PREMIUM,
        /**
         * Can only play for 3 game days
         */
        DEMO,
        /**
         * No restriction on single-player, but cannot join multiplayer games.
         */
        UNKNOWN
    }
}
