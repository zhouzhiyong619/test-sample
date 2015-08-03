package com.dianxinos.testsample;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import org.junit.Ignore;

/**
 * Created by zhouzhiyong on 15-8-3.
 */
@Ignore
public class MainActivityTest2 extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivity mMainActivity;

    public MainActivityTest2() {
        super(MainActivity.class);
    }

    @Override
    public void setUp(){
        mMainActivity = getActivity();
        Log.i("TestSample","MainActivityTest2 setUp");
    }

    @Override
    public void tearDown(){
        Log.i("TestSample","MainActivityTest2 tearDown");
    }

    public void testAcitivy(){
        assertNotNull(mMainActivity);
        Log.i("TestSample", "MainActivityTest2 testAcitivy");
    }

}
