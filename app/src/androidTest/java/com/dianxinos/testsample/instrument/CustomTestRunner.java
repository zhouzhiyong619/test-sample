package com.dianxinos.testsample.instrument;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;
import android.util.Log;

/**
 * Created by zhouzhiyong on 15-8-3.
 */
public class CustomTestRunner extends AndroidJUnitRunner {

    @Override
    public void onCreate(Bundle arguments) {
        super.onCreate(arguments);
        Log.i("TestSample","Test Runner OnCreate !");
    }
}
