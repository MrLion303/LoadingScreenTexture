# LoadingScreenTexture

Mod cliente para Minecraft Java 1.20.1 con Minecraft Forge **47.4.18 o superior** de la rama compatible con 1.20.1.

El mod evita sobrescribir el método interno que procesa el logo de carga. Minecraft debe conservar su procesamiento nativo de la imagen y su transparencia para que no se muestre el fondo magenta como un bloque sólido.

## Textura del resource pack

El paquete debe incluir esta ruta exacta:

`assets/minecraft/textures/gui/title/mojangstudios.png`

Activa el paquete en las opciones de recursos del cliente. Si la textura no cambia, verifica que el archivo esté en esa ruta dentro del ZIP/carpeta del pack y que el pack esté habilitado.

## Corrección 1.0.1

- Retirada la sobrescritura de `LoadingOverlay$LogoTexture.getTextureImage`, que omitía el procesamiento original de Minecraft y provocaba que el color magenta se mostrara opaco.
- Retirada la configuración de Mixin que se utilizaba para esa sobrescritura.
- Conservada la compatibilidad declarada con Minecraft 1.20.1 y Forge 47.4.18 o superior dentro de la misma rama.

## Compilar y descargar

1. Abre la pestaña **Actions** del repositorio.
2. Abre la ejecución completada de **Compilar mod Forge 1.20.1**.
3. Descarga el artefacto `LoadingScreenTexture-Forge-1.20.1`.
4. Coloca el JAR en la carpeta `mods` de una instancia Forge 1.20.1.

El resultado de compilación confirma que el JAR se genera; la presentación visual de la textura debe validarse dentro de Minecraft con el resource pack concreto.
