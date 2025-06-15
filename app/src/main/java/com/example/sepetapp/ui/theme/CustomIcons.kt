package com.example.sepetapp.ui.theme

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.addPathNodes

/**
 * Özel simge tanımlamaları
 */
object CustomIcons {

    // CameraAlt simgesi
    val CameraAlt: ImageVector
        get() {
            if (_cameraAlt != null) {
                return _cameraAlt!!
            }
            _cameraAlt = ImageVector.Builder(
                name = "CameraAlt",
                defaultWidth = 24.0f,
                defaultHeight = 24.0f,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f
            ).apply {
                materialPath {
                    addPathNodes("M12,12m-3.2,0a3.2,3.2 0,1 1,6.4 0a3.2,3.2 0,1 1,-6.4 0")
                    addPathNodes("M9,2L7.17,4H4c-1.1,0 -2,0.9 -2,2v12c0,1.1 0.9,2 2,2h16c1.1,0 2,-0.9 2,-2V6c0,-1.1 -0.9,-2 -2,-2h-3.17L15,2H9zM12,17c-2.76,0 -5,-2.24 -5,-5s2.24,-5 5,-5s5,2.24 5,5S14.76,17 12,17z")
                }
            }.build()
            return _cameraAlt!!
        }
    private var _cameraAlt: ImageVector? = null

    // ErrorOutline simgesi
    val ErrorOutline: ImageVector
        get() {
            if (_errorOutline != null) {
                return _errorOutline!!
            }
            _errorOutline = ImageVector.Builder(
                name = "ErrorOutline",
                defaultWidth = 24.0f,
                defaultHeight = 24.0f,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f
            ).apply {
                materialPath {
                    addPathNodes("M11,15h2v2h-2zM11,7h2v6h-2zM11.99,2C6.47,2 2,6.48 2,12s4.47,10 9.99,10C17.52,22 22,17.52 22,12S17.52,2 11.99,2zM12,20c-4.42,0 -8,-3.58 -8,-8s3.58,-8 8,-8s8,3.58 8,8S16.42,20 12,20z")
                }
            }.build()
            return _errorOutline!!
        }
    private var _errorOutline: ImageVector? = null

    // QrCodeScanner simgesi
    val QrCodeScanner: ImageVector
        get() {
            if (_qrCodeScanner != null) {
                return _qrCodeScanner!!
            }
            _qrCodeScanner = ImageVector.Builder(
                name = "QrCodeScanner",
                defaultWidth = 24.0f,
                defaultHeight = 24.0f,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f
            ).apply {
                materialPath {
                    addPathNodes("M9.5,6.5v3h-3v-3H9.5 M11,5H5v6h6V5L11,5z")
                    addPathNodes("M9.5,14.5v3h-3v-3H9.5 M11,13H5v6h6V13L11,13z")
                    addPathNodes("M17.5,6.5v3h-3v-3H17.5 M19,5h-6v6h6V5L19,5z")
                    addPathNodes("M13,13h1.5v1.5H13V13z")
                    addPathNodes("M14.5,14.5H16V16h-1.5V14.5z")
                    addPathNodes("M16,13h1.5v1.5H16V13z")
                    addPathNodes("M17.5,14.5H19V16h-1.5V14.5z")
                    addPathNodes("M17.5,16H16v1.5h1.5V16z")
                    addPathNodes("M16,17.5h-1.5V19H16V17.5z")
                    addPathNodes("M17.5,19h-1.5v1.5H19V16h-1.5V19z")
                }
            }.build()
            return _qrCodeScanner!!
        }
    private var _qrCodeScanner: ImageVector? = null

    // ShoppingBasket simgesi
    val ShoppingBasket: ImageVector
        get() {
            if (_shoppingBasket != null) {
                return _shoppingBasket!!
            }
            _shoppingBasket = ImageVector.Builder(
                name = "ShoppingBasket",
                defaultWidth = 24.0f,
                defaultHeight = 24.0f,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f
            ).apply {
                materialPath {
                    addPathNodes("M17.21,9l-4.38,-6.56c-0.19,-0.28 -0.51,-0.42 -0.83,-0.42 -0.32,0 -0.64,0.14 -0.83,0.43L6.79,9L2,9c-0.55,0 -1,0.45 -1,1 0,0.09 0.01,0.18 0.04,0.27l2.54,9.27c0.23,0.84 1,1.46 1.92,1.46h13c0.92,0 1.69,-0.62 1.93,-1.46l2.54,-9.27L23,10c0,-0.55 -0.45,-1 -1,-1h-4.79zM9,9l3,-4.4L15,9L9,9zM12,17c-1.1,0 -2,-0.9 -2,-2s0.9,-2 2,-2 2,0.9 2,2 -0.9,2 -2,2z")
                }
            }.build()
            return _shoppingBasket!!
        }
    private var _shoppingBasket: ImageVector? = null

    // Inventory simgesi
    val Inventory: ImageVector
        get() {
            if (_inventory != null) {
                return _inventory!!
            }
            _inventory = ImageVector.Builder(
                name = "Inventory",
                defaultWidth = 24.0f,
                defaultHeight = 24.0f,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f
            ).apply {
                materialPath {
                    addPathNodes("M20,2L4,2c-1,0 -2,0.9 -2,2v3.01c0,0.72 0.43,1.34 1,1.69L3,20c0,1.1 1.1,2 2,2h14c0.9,0 2,-0.9 2,-2L21,8.7c0.57,-0.35 1,-0.97 1,-1.69L22,4c0,-1.1 -1,-2 -2,-2zM15,14L9,14v-2h6v2zM20,7L4,7L4,4l16,0v3z")
                }
            }.build()
            return _inventory!!
        }
    private var _inventory: ImageVector? = null

    // LocalGroceryStore simgesi
    val LocalGroceryStore: ImageVector
        get() {
            if (_localGroceryStore != null) {
                return _localGroceryStore!!
            }
            _localGroceryStore = ImageVector.Builder(
                name = "LocalGroceryStore",
                defaultWidth = 24.0f,
                defaultHeight = 24.0f,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f
            ).apply {
                materialPath {
                    addPathNodes("M7,18c-1.1,0 -1.99,0.9 -1.99,2S5.9,22 7,22s2,-0.9 2,-2S8.1,18 7,18zM17,18c-1.1,0 -1.99,0.9 -1.99,2s0.89,2 1.99,2s2,-0.9 2,-2S18.1,18 17,18zM7.17,14.75L7.17,14.75c0.09,0.17 0.25,0.25 0.42,0.25h10.82c0.36,0 0.67,-0.3 0.67,-0.67c0,-0.37 -0.3,-0.67 -0.67,-0.67L9.92,13.66c-0.25,0 -0.5,-0.25 -0.5,-0.5c0,-0.08 0.02,-0.16 0.06,-0.25l1.17,-2.25l6.92,0c0.42,0 0.8,-0.28 0.92,-0.7l1.33,-5.33c0.14,-0.56 -0.28,-1.08 -0.86,-1.08l0,0H7.5C7.22,3.55 7,3.77 7,4.05s0.22,0.5 0.5,0.5l0,0h10l-1.25,5H9.5L6.25,4.69c-0.14,-0.22 -0.38,-0.36 -0.64,-0.36H3.5C3.22,4.33 3,4.55 3,4.83s0.22,0.5 0.5,0.5h1.75l3.92,7.92z")
                }
            }.build()
            return _localGroceryStore!!
        }
    private var _localGroceryStore: ImageVector? = null
}

// Icons nesnesine uzantı olarak özel simgeleri ekle
val Icons.Custom: CustomIcons get() = CustomIcons
