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

import org.spongepowered.api.util.Priority;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public interface ResourceManager {

    /**
     * Gets the {@link Resource} to the given {@link ResourceLocation} points
     * to. If there are multiple resources at this location, only the one is
     * the upper-most resource pack will be returned. If there are none, an
     * empty {@link Optional} is returned instead. To get all resources, use
     * {@link #getAllResources(ResourceLocation)}.
     *
     * @param location The resource location
     * @return The matching resource
     * @see #getAllResources(ResourceLocation)
     */
    Optional<Resource> getResource(ResourceLocation location);

    /**
     * Gets all the {@link Resource}s which a {@link ResourceLocation} points
     * to. To get only the resource in the upper-most resource pack, use
     * {@link #getResource(ResourceLocation)}.
     *
     * @param location The resource location
     * @return All matching resources
     * @see #getResource(ResourceLocation)
     */
    List<Resource> getAllResources(ResourceLocation location);

    /**
     * Gets the last {@link Resource} which matches any of the provided
     * {@link ResourceLocation}s. If a resource pack contains multiple of
     * the resources, the first one will be returned.
     *
     * @param locations Any of the locations to match.
     * @return The resource, if it exists
     */
    Optional<Resource> getAnyResource(ResourceLocation... locations);

    /**
     * Gets a list of all registered {@link ResourceLoader}s in order of priority.
     *
     * @return The resource loaders
     */
    List<ResourceLoader> getResourceLoaders();

    void reloadResources();

    /**
     * Registers a {@link ResourceLoader} with the given order priority.
     *
     * @param loader The loader
     * @param priority The load priority
     */
    void registerResourceLoader(ResourceLoader loader, Priority priority);

    /**
     * Unregisters the given {@link ResourceLoader}.
     *
     * @param loader The loader
     * @return True if it was removed, false if it wasn't registered
     */
    boolean unregisterResourceLoader(ResourceLoader loader);

    /**
     * Creates and registers a {@link ResourceLoader} from a filesystem {@link Path}. It must point
     * to either a directory or a zip archive.
     *
     * @param path The path to the file
     * @param priority The load priority
     * @return The created resource loader
     */
    Optional<ResourceLoader> registerFileResourceLoader(Path path, Priority priority);

    /**
     * Creates a new {@link ResourceLocation}.
     *
     * @param domain The domain
     * @param path The path
     * @return The new resource location
     */
    ResourceLocation newResourceLocation(String domain, String path);

}
