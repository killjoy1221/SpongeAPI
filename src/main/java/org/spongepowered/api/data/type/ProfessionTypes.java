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
package org.spongepowered.api.data.type;

import org.spongepowered.api.Sponge;

import java.util.function.Supplier;

/**
 * An enumeration of vanilla {@link ProfessionType}s.
 */
public final class ProfessionTypes {

    // SORTFIELDS:ON

    public static final Supplier<ProfessionType> ARMORER = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "ARMORER");

    public static final Supplier<ProfessionType> BUTCHER = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "BUTCHER");

    public static final Supplier<ProfessionType> CARTOGRAPHER = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "CARTOGRAPHER");

    public static final Supplier<ProfessionType> CLERIC = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "CLERIC");

    public static final Supplier<ProfessionType> FARMER = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "FARMER");

    public static final Supplier<ProfessionType> FISHERMAN = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "FISHERMAN");

    public static final Supplier<ProfessionType> FLETCHER = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "FLETCHER");

    public static final Supplier<ProfessionType> LEATHERWORKER = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "LEATHERWORKER");

    public static final Supplier<ProfessionType> LIBRARIAN = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "LIBRARIAN");

    public static final Supplier<ProfessionType> MASON = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "MASON");

    public static final Supplier<ProfessionType> NITWIT = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "NITWIT");

    public static final Supplier<ProfessionType> NONE = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "NONE");

    public static final Supplier<ProfessionType> SHEPHERD = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "SHEPHERD");

    public static final Supplier<ProfessionType> TOOLSMITH = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "TOOLSMITH");

    public static final Supplier<ProfessionType> WEAPONSMITH = Sponge.getRegistry().getCatalogRegistry().provideSupplier(ProfessionType.class, "WEAPONSMITH");

    // SORTFIELDS:OFF

    private ProfessionTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
