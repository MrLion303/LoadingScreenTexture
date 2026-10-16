package com.negativestudios.loadingscreentexture.mixin;

import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.server.packs.resources.ResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

/**
 * Makes the Mojang loading logo use the active resource manager.
 * The superclass implementation resolves the texture through the selected
 * resource packs instead of reading it directly from the game classpath.
 */
@Mixin(targets = "net.minecraft.client.gui.screens.LoadingOverlay$LogoTexture")
public abstract class LogoTextureMixin extends SimpleTexture {
    protected LogoTextureMixin() {
        super(null);
    }

    /**
     * @author LoadingScreenTexture
     * @reason Load the logo through the active resource manager.
     */
    @Overwrite
    protected TextureImage getTextureImage(ResourceManager resourceManager) {
        return super.getTextureImage(resourceManager);
    }
}
