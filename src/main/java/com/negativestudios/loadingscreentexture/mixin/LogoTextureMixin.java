package com.negativestudios.loadingscreentexture.mixin;

import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.SimpleTexture.TextureImage;
import net.minecraft.server.packs.resources.ResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

/**
 * Uses the normal SimpleTexture resource lookup for the Mojang loading logo.
 * This allows ResourceManager to resolve the selected resource pack first.
 */
@Mixin(targets = "net.minecraft.client.gui.screens.LoadingOverlay$LogoTexture")
public abstract class LogoTextureMixin extends SimpleTexture {
    protected LogoTextureMixin() {
        super(null);
    }

    /**
     * @author LoadingScreenTexture
     * @reason Use the active resource manager for mojangstudios.png.
     */
    @Overwrite
    protected TextureImage getTextureImage(ResourceManager resourceManager) {
        return super.getTextureImage(resourceManager);
    }
}
