package com.dianxinos.testsample;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by zhouzhiyong on 15-8-3.
 */
public class AssertTest {

    @Test
    public void assertThatTest() {
        assertTrue(true);

        assertFalse(false);

        assertNull(null);

        assertThat("aaa", is(equalTo("aaa")));

        assertThat("aaa", is("aaa"));

        assertThat("aaa", not("bbb"));

//        assertThat(str, endsWith("aaa"));

//        assertThat(str, startsWith("aaa"));

//        assertThat( map, hasEntry( "item1", "item2" ) );

//        assertThat( iterable, hasItem ( "item1" ) );

//        assertThat( map, hasKey ( "item1" ) );

//        assertThat( map, hasValue ( "item1" ) );
    }
}
