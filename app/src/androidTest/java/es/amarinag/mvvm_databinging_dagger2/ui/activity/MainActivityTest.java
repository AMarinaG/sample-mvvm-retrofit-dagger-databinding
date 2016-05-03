package es.amarinag.mvvm_databinging_dagger2.ui.activity;

import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.Log;
import es.amarinag.mvvm_databinging_dagger2.R;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import rx.android.plugins.RxAndroidSchedulersHook;
import rx.plugins.RxJavaObservableExecutionHook;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by AMarinaG on 29/04/2016.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {
  @Rule
  public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
      MainActivity.class);

  @Test
  public void testWaitForFragment() throws Exception {
    onView(withId(R.id.github_reycler)).check(matches(isCompletelyDisplayed()));
    onView(withId(R.id.github_reycler)).perform(RecyclerViewActions.actionOnItemAtPosition(2, click()));
  }
}