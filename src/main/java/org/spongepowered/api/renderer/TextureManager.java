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
package org.spongepowered.api.renderer;

import org.spongepowered.api.resource.ResourceLocation;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.util.Optional;

public interface TextureManager {

    /**
     * Prepares a texture to be drawn. If the texture is not present, a
     * missing texture placeholder is used.
     *
     * @param res The location of the texture
     */
    void bindTexture(ResourceLocation res);

    /**
     * Loads a new texture into the given {@link ResourceLocation}. The new
     * texture will override any texture from a resource pack.
     * <br/>
     * A texture CANNOT be loaded twice. If it needs to be changed, use either
     * {@link #unloadTexture(ResourceLocation)} to unload the texture or load a
     * {@link DynamicTexture} to update it on the fly.
     *
     * @param res The location of the texture
     * @param texture The new texture to load
     * @return True if successful, false if not
     */
    boolean loadTexture(ResourceLocation res, TextureSource texture);

    /**
     * Unloads a texture which has previously been loaded.
     *
     * @param res The location of the texture.
     * @return True if successful, false if not
     */
    boolean unloadTexture(ResourceLocation res);

    /**
     * Gets a currently loaded texture or {@link Optional#empty() empty} if it
     * doesn't exist.
     *
     * @param res The location of the texture
     * @return The texture if it exists
     */
    Optional<Texture> getTexture(ResourceLocation res);

    /**
     * Creates a new texture from a {@link BufferedImage}. This can be
     * generated. For a texture which should be updated or changed, use
     * {@link #newDynamicTexture(BufferedImage)}.
     *
     * @param image The texture image
     * @return A new texture
     */
    Texture newTexture(BufferedImage image);

    /**
     * Creates a new {@link DynamicTexture} using a {@link BufferedImage}.
     * as the initial texture.
     *
     * @param image The initial texture image
     * @return A new dynamic texture
     */
    DynamicTexture newDynamicTexture(BufferedImage image);

    TextureSource newTextureSource(Path texture);

    TextureSource newTextureSource(URL texture);

    TextureSource newTextureSource(InputStream texture);

    TextureSource newTextureSource(BufferedImage texture);

}
