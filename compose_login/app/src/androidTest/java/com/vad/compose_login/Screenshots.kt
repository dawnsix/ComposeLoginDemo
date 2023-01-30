package com.vad.compose_login

import androidx.compose.ui.test.junit4.createComposeRule
import com.karumi.shot.ScreenshotTest
import org.junit.Rule
import org.junit.Test

class Screenshots : ScreenshotTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun renderLoginScreen() {
        composeTestRule.setContent { LoginView() }
        compareScreenshot(composeTestRule)
    }
}