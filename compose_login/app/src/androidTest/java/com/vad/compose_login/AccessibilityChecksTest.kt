package com.vad.compose_login

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.espresso.accessibility.AccessibilityChecks
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.vad.compose_login.ui.theme.Compose_loginTheme
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AccessibilityChecksTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setup() {
        composeTestRule.setContent {
            Compose_loginTheme {
                LoginView()
            }
        }
    }

    @Test
    fun a11yCheck_loginScreen() {
        var uname = composeTestRule.onNodeWithText("Username")
        uname.performTextInput("tester")
    }

    companion object {
        @BeforeClass
        @JvmStatic
        fun setupClass() {
            AccessibilityChecks.enable()
                .setRunChecksFromRootView(true)
        }
    }
}