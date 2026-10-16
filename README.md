# LoadingScreenTexture

Mod cliente para Minecraft Java 1.20.1 + Minecraft Forge 47.4.20.

El objetivo es permitir que el logo de la pantalla de carga use la textura `assets/minecraft/textures/gui/title/mojangstudios.png` del resource pack activo, sin cambiar el resto de la pantalla.

## Estado

Proyecto inicial. GitHub Actions compilará el JAR automáticamente. Antes de darlo por terminado, hay que verificar dentro de Minecraft que la textura personalizada se lea correctamente desde el pack activo.

## Compilar y descargar

1. Abre la pestaña **Actions** del repositorio.
2. Ejecuta **Compilar mod Forge 1.20.1** o espera a que termine después de un commit.
3. Abre la ejecución completada y descarga el artefacto `LoadingScreenTexture-Forge-1.20.1`.
4. Coloca el JAR en la carpeta `mods` de una instancia Forge 1.20.1.
5. Activa un resource pack que incluya `assets/minecraft/textures/gui/title/mojangstudios.png`.

Si el logo no cambia, adjunta el registro de inicio y la versión exacta de Forge para corregir la interceptación.

## Compatibilidad prevista

- Minecraft Java 1.20.1
- Minecraft Forge 47.4.20
- Cliente solamente; no requiere instalarse en servidores dedicados.
