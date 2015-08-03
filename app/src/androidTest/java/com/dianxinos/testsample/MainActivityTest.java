package com.dianxinos.testsample;

import android.support.test.annotation.UiThreadTest;
import android.support.test.rule.UiThreadTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

/**
 * Created by zhouzhiyong on 15-8-3.
 */
@Ignore
public class MainActivityTest {

    @Rule
    public UiThreadTestRule mUiThreadRule = new UiThreadTestRule();

    @BeforeClass
    public static void beforeClass() {
        Log.i("TestSample", "MainActivityTest Before Class");
    }

    @AfterClass
    public static void afterClass() {
        Log.i("TestSample", "MainActivityTest After Class");
    }

    @Before
    public void before() {
        Log.i("TestSample", "MainActivityTest Before Test");
    }

    @After
    public void tearDown() {
        Log.i("TestSample", "MainActivityTest After Test");
    }

    @UiThreadTest
    @Test
    public void testRunUiThread(){
        Log.i("TestSample", "MainActivityTest testRunUiThread "+Thread.currentThread().getName());
    }

    @Test
    public void testRunUiThread2(){
        Log.i("TestSample", "MainActivityTest testRunUiThread2 , thread name = "+Thread.currentThread().getName());
        try {
            mUiThreadRule.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Log.i("TestSample", "MainActivityTest testRunUiThread2 , thread name = "+Thread.currentThread().getName());
                }
            });
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
