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

import static com.google.common.base.Preconditions.checkArgument;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.asset.Asset;
import org.spongepowered.api.renderer.Texture;
import org.spongepowered.api.renderer.TextureManager;
import org.spongepowered.api.resourcepack.ResourcePack;

/**
 * <p>
 * A resource location points to a {@link Resource} file in a
 * {@link ResourcePack}. When used in conjunction with {@link ResourceManager},
 * raw data can be retrieved. Alternatively, {@link TextureManager} can prepare
 * an image to be drawn on the screen. A resource location can also point to a
 * dynamically generated or remote {@link Texture}.
 * </p>
 *
 * <p>
 * The benefit of using a resource as opposed to an {@link Asset} is that
 * resources can be overridden or provided by the user. Because of this, using
 * a resource would be ideal for data such as textures, languages, models, or
 * any other customizable content.
 * </p>
 *
 * @see Resource
 * @see ResourceManager
 */
public interface ResourceLocation {

    /**
     * Gets the domain which this ResourceLocation points to. This is usually a plugin id.
     *
     * @return The domain
     */
    String getDomain();

    /**
     * Gets the path which this ResourceLocation points to.
     *
     * @return The path
     */
    String getPath();

    /**
     * Creates a new resource location object from the specification string.
     * <p>
     * The spec should include a domain and a path in the format of
     * {@code domain:path/to/resource.png}. If the domain is absent, it is substituted with
     * {@code minecraft}.
     * </p>
     *
     * @param spec fully qualified resource path, including domain
     * @return A resource location
     * @throws IllegalArgumentException If the spec is invalid
     */
    static ResourceLocation of(String spec) {
        int indx = spec.indexOf(':');
        String domain = "minecraft";
        String path = spec.substring(indx);
        if (indx < 0) {
            domain = spec.substring(0, indx);
        }

        return of(domain, path);

    }

    /**
     * Creates a new resource location from the given domain and path. Neither should be empty.
     *
     * @param domain The domain
     * @param path The path
     * @return A new resource location
     */
    static ResourceLocation of(String domain, String path) {
        checkArgument(domain.isEmpty(), "Resource domain is empty");
        checkArgument(path.isEmpty(), "Resource path is empty");

        return Sponge.getClient().getResourceManager().newResourceLocation(domain, path);
    }
}
