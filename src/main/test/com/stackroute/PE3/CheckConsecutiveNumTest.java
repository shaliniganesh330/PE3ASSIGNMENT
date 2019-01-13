package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckConsecutiveNumTest {
    CheckConsecutiveNum consecutivenumberob;
    @Before
    public void setUp() throws Exception {
        consecutivenumberob=new  CheckConsecutiveNum();
    }

    @After
    public void tearDown() throws Exception {consecutivenumberob=null;
    }

    @Test
    public void testConsecutiveNumberSuccess() {
        int[] array = {7, 6, 5, 4, 3, 2, 1};
        int n = array.length;
        String actual = consecutivenumberob.consecutiveNumber(array, n);
        String expected = "Numbers are in a consecutive series";
        assertEquals(expected, actual);
    }

        @Test
        public void testConsecutiveNumberFailure() {
            int[] array = {7,6,50,4,3,2,1};
            int n =array.length;
            String actual1 = consecutivenumberob.consecutiveNumber(array,n);
            String expected1 = "Numbers are not in consecutive series";
            assertNotEquals(expected1,actual1);
    }
    @Test
    public void testConsecutiveNumberFailure1() {
        int[] array = {};
        int n =array.length;
        String actual1 = consecutivenumberob.consecutiveNumber(array,n);
        String expected1 = "Numbers are not in consecutive series";
        assertNotEquals(expected1,actual1);
    }
}