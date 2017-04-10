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

import org.spongepowered.api.Sponge;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;

/**
 * Contains methods for creating a new {@link Texture} from several sources.
 */
public final class TextureSources {


    public static TextureSource from(Texture texture) {
        return () -> texture;
    }

    public static TextureSource from(Path path) {
        return getTextureManager().newTextureSource(path);
    }

    public static TextureSource from(URL url) {
        return getTextureManager().newTextureSource(url);
    }

    /**
     * Creates a new {@link TextureSource} from the given {@link InputStream}.
     * The stream is not consumed until the texture is loaded. It is closed
     * afterwards.
     * @param input The input stream
     * @return
     */
    public static TextureSource from(InputStream input) {
        return getTextureManager().newTextureSource(input);
    }

    public static TextureSource from(BufferedImage image) {
        return getTextureManager().newTextureSource(image);
    }

    private static TextureManager getTextureManager() {
        return Sponge.getClient().getTextureManager();
    }

    private TextureSources() {
    }


}
