package com.example.task1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers.`is`

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.task1", appContext.packageName)
    }

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testOutputTextViewIsDisplayed() {
        onView(
            withId(`is`(R.id.output))
        ).check(
            matches(
                isDisplayed()
            )
        )
    }

    @Test
    fun testOutputTextViewHasVariableContent() {
        onView(
            withId(`is`(R.id.output))
        ).check(
            matches(
                withText("name: Ivan surname: Ivanov age: 37 height: 172.2")
            )
        )
    }
}