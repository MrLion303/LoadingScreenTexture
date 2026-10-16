package com.negativestudios.loadingscreentexture;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(LoadingScreenTexture.MOD_ID)
public final class LoadingScreenTexture {
    public static final String MOD_ID = "loadingscreentexture";
    public static final Logger LOGGER = LogUtils.getLogger();

    public LoadingScreenTexture() {
        LOGGER.info("LoadingScreenTexture iniciado para Minecraft Forge 1.20.1.");
    }
}
