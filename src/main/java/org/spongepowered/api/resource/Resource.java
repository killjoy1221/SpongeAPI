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
package org.spongepowered.api.resource;

import org.spongepowered.api.data.DataView;
import org.spongepowered.api.resourcepack.ResourcePack;

import java.io.InputStream;
import java.util.Optional;

/**
 * Represents arbitrary data which a {@link ResourceLocation} points toward.
 */
public interface Resource {

    /**
     * Gets the {@link ResourceLocation} which was used to get this resource.
     *
     * @return The resource location
     */
    ResourceLocation getResourceLocation();

    /**
     * Gets the {@link InputStream} which will contain the data of this resource.
     *
     * @return The input stream
     */
    InputStream getInputStream();

    /**
     * Gets the {@link ResourcePack} this resource came from.
     *
     * @return The resource pack
     */
    ResourcePack getResourcePack();

    /**
     * Gets any metadata which may be attached to this resource as a {@link DataView}
     * wrapped in an {@link Optional}. Metadata is located in a json resource with the same
     * {@link ResourceLocation}, but with {@code ".mcmeta"} appended to the path.
     * <p>
     * <p>If this resource has no metadata, empty is returned.</p>
     *
     * @return The metadata
     */
    Optional<DataView> getMetadata();

}
