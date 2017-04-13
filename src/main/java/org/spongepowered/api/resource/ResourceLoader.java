package org.spongepowered.api.resource;

import java.util.Optional;

/**
 * A resource loader is in charge of providing a resource from a given {@link ResourceLocation}.
 * The first time a resource is loaded, the resource manager will iterate through the loaders until
 * it reaches one which returns a {@link Resource}.
 */
public interface ResourceLoader {

    /**
     * Gets a new {@link Resource} from the given {@link ResourceLocation} if it exists. If
     * {@link Optional#empty() empty} is returned, the resource "falls back" to the next
     * resource loader in the chain.
     *
     * @param location The resource location
     * @return The resource
     */
    Optional<Resource> getResource(ResourceLocation location);

}
