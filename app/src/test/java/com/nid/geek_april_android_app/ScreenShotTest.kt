package com.nid.geek_april_android_app

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.nid.geek_april_android_app.ui.theme.Geek_april_android_appTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@RunWith(RobolectricTestRunner::class)
@Config(qualifiers = RobolectricDeviceQualifiers.Pixel7Pro)
class ScreenShotTest {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun cardsScreenTest() {
        composeRule.setContent {
            Geek_april_android_appTheme {
                Greeting("Android")
            }
        }
        composeRule
            .onRoot()
            .assertExists()
            .captureRoboImage()
    }
}
