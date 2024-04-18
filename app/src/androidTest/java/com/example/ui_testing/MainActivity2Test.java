package com.example.ui_testing;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

import static java.util.regex.Pattern.matches;

import androidx.test.core.app.ActivityScenario;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.filters.LargeTest;

@RunWith(JUnit4.class)
@LargeTest
public class MainActivity2Test {
    @Rule
    public IntentsTestRule<MainActivity2> intentsTestRule = new IntentsTestRule<>(MainActivity2.class);

    @Test
    public void testNavigateToMainActivity() {
        // Perform click on the button that should start a new activity
        onView(withId(R.id.btn4)).perform(click());

        // Verify if the intent (MainActivity) was started
        intended(hasComponent(MainActivity.class.getName()));

    }
}