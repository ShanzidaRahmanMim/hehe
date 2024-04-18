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

import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.filters.LargeTest;

@RunWith(JUnit4.class)
@LargeTest
public class MainActivity2Test {
    @Rule
    public IntentsTestRule<MainActivity2> intentsTestRule = new IntentsTestRule<>(MainActivity2.class);

    @Test
    public void testNavigateToMainActivity() {

        onView(withId(R.id.btn4)).perform(click());


        intended(hasComponent(MainActivity.class.getName()));

    }


    @Test
    public void textViewTextMatches() {
        // Check if the text of the TextView matches the expected text

        Espresso.onView(ViewMatchers.withId(R.id.text1))
                .check(ViewAssertions.matches(ViewMatchers.withText("This is a text")));
    }


}