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
package org.spongepowered.api.data.manipulator.mutable;

import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.manipulator.immutable.ImmutableConnectedDirectionData;
import org.spongepowered.api.data.value.SetValue;
import org.spongepowered.api.data.value.Value;
import org.spongepowered.api.util.Direction;

/**
 * Represents the "connected" {@link Direction}s that a block may have.
 * Examples may include {@link BlockTypes#GLASS_PANE},
 * {@link BlockTypes#IRON_BARS}, {@link BlockTypes#COBBLESTONE_WALL}, etc.
 */
public interface ConnectedDirectionData extends DataManipulator<ConnectedDirectionData, ImmutableConnectedDirectionData> {

    /**
     * Gets the {@link SetValue.Mutable} for the currently "connected"
     * {@link Direction}s.
     *
     * @return The immutable set value for connected directions
     * @see Keys#CONNECTED_DIRECTIONS
     */
    SetValue.Mutable<Direction> connectedDirections();

    /**
     * Gets the {@link Value.Mutable} for whether {@link Direction#NORTH} is
     * "connected".
     *
     * @return The value for the north direction
     * @see Keys#CONNECTED_NORTH
     */
    Value.Mutable<Boolean> connectedNorth();

    /**
     * Gets the {@link Value.Mutable} for whether {@link Direction#SOUTH} is
     * "connected".
     *
     * @return The value for the south direction
     * @see Keys#CONNECTED_SOUTH
     */
    Value.Mutable<Boolean> connectedSouth();

    /**
     * Gets the {@link Value.Mutable} for whether {@link Direction#EAST} is
     * "connected".
     *
     * @return The value for the east direction
     * @see Keys#CONNECTED_WEST
     */
    Value.Mutable<Boolean> connectedEast();

    /**
     * Gets the {@link Value.Mutable} for whether {@link Direction#WEST} is
     * "connected".
     *
     * @return The value for the west direction
     * @see Keys#CONNECTED_EAST
     */
    Value.Mutable<Boolean> connectedWest();

}