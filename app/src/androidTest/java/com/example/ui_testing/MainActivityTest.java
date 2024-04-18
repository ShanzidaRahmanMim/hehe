package com.example.ui_testing;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

import static java.util.regex.Pattern.matches;

import androidx.test.core.app.ActivityScenario;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static androidx.test.espresso.assertion.ViewAssertions.matches;


@RunWith(JUnit4.class)
@LargeTest
public class MainActivityTest {
    @Before
    public void setup() {
        // Launch the activity to test
        ActivityScenario.launch(MainActivity.class);
    }
@Test
    public  void firstTest()
{
    // Check if the initial text is displayed
    onView(withId(R.id.text)).check(matches(withText("This is a colour changing text")));

    // Perform a click on button1
    onView(withId(R.id.btn1)).perform(click());
    // Check if the text changes to red text
    onView(withId(R.id.text)).check(matches(withText("This is red text")));

    // Perform a click on button2
    onView(withId(R.id.btn2)).perform(click());
    // Check if the text changes to green text
    onView(withId(R.id.text)).check(matches(withText("This is green text")));
}

@Test
public void checkTextChangesOnButtonClick() {
    onView(withId(R.id.button)).perform(click());
    onView(withId(R.id.textView)).check(matches(withText("Button Clicked!")));
}
}

