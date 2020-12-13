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
package org.spongepowered.api.resource.pack;

import net.kyori.adventure.text.Component;
import org.spongepowered.api.resource.meta.PackMeta;
import org.spongepowered.api.util.Nameable;

/**
 * Holds informational data about a {@link Pack}. It also functions as a
 * factory to create a new instance.
 */
public interface PackInfo extends Nameable {

    /**
     * Creates the pack associated with this pack info.
     *
     * <p>The returned pack may be a new instance or cached, depending on the
     * implementation.</p>
     *
     * @return The pack
     */
    Pack getPack();

    /**
     * Gets the title of the pack.
     *
     * @return The title
     */
    Component getTitle();

    /**
     * Gets the description of the pack.
     *
     * @return The description
     * @see PackMeta#getDescription()
     */
    Component getDescription();

    /**
     * Gets the version compatibility of the pack.
     *
     * @return The version compatibility
     */
    PackVersion getVersion();

    /**
     * Gets the priority of this pack, first or last.
     *
     * @return The priority
     */
    Priority getPriority();

    /**
     * Gets whether this pack is forced to be enabled at all times.
     *
     * @return True if forced enabled, false if disable-able
     */
    boolean isForced();

    /**
     * Gets whether this pack is order locked on top or bottom.
     *
     * @return True if order locked, false if order-able
     * @see #getPriority()
     */
    boolean isLocked();

    enum Priority {
        FIRST, LAST
    }
}