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
