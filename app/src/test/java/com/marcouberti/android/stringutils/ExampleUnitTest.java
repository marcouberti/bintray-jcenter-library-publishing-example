package com.marcouberti.android.stringutils;

import com.marcouberti.android.lib.stringutils.StringUtils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void testConcat() throws Exception {
        assertEquals("ab", StringUtils.concat("a","b"));
        assertEquals("b", StringUtils.concat("","b"));
        assertEquals("b", StringUtils.concat(null,"b"));
        assertEquals("b", StringUtils.concat("b",null));
        assertEquals("", StringUtils.concat(null,null));
        assertEquals("marcouberti", StringUtils.concat("marco","uberti"));
    }
}