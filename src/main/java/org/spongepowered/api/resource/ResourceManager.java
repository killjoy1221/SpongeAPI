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

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

/**
 * The resource manager is in charge of loading {@link Resource Resources}.
 */
public interface ResourceManager {

    /**
     * Get the namespaces
     * @return
     */
    Set<String> getNamespaces();

    /**
     * Gets a loaded resource at the given path, or {@link Optional#empty()}
     * if it does not exist.
     *
     * @param path The path to the resource
     * @return The resource
     */
    Resource getResource(ResourcePath path) throws IOException;

    /**
     * Returns all of the resources which exist in each {@link Pack}.
     *
     * @return All of the resources
     */
    List<Resource> getResources(ResourcePath path);

    /**
     * Returns all {@link ResourcePath paths} within a directory from all the
     * resource domains.
     *
     * <p>This can be used for resources which can have multiple locations. For
     * example, {@code functions} and {@code loot_tables}.</p>
     *
     * <p>For example</p>
     * <pre>
     * manager.getResources("loot_tables", name -> name.endsWith(".json"));
     * </pre>
     *
     * @param path The path to search in
     * @param filter The file name filter
     * @return A collection of resource paths
     */
    Collection<ResourcePath> getResources(String path, Predicate<String> filter);

}
