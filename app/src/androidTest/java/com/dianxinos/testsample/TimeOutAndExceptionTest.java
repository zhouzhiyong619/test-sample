package com.dianxinos.testsample;

import android.os.SystemClock;

import org.junit.Test;

/**
 * Created by zhouzhiyong on 15-8-3.
 */
public class TimeOutAndExceptionTest {

    @Test(timeout = 3000)
    public void testTimeOut(){
        SystemClock.sleep(10000);
    }

    @Test(expected = NumberFormatException.class)
    public void testException(){
        Integer.valueOf("a");
    }
}
