package com.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckConsecutiveNumTest {
    CheckConsecutiveNum ob;
    @Before
    public void setUp() throws Exception {
        ob=new  CheckConsecutiveNum();
    }

    @After
    public void tearDown() throws Exception {ob=null;
    }

    @Test
    public void consecutivenumbersuccess() {
        int[] array = {7, 6, 5, 4, 3, 2, 1};
        int n = array.length;
        String actual = ob.consecutivenumber(array, n);
        String expected = "Numbers are in a consecutive series";
        assertEquals(expected, actual);
    }

        @Test
        public void consecutivenumberfailure() {
            int[] array = {7,6,50,4,3,2,1};
            int n =array.length;
            String actual1 = ob.consecutivenumber(array,n);
            String expected1 = "Numbers are notreturn null; in consecutive series";
            assertNotEquals(expected1,actual1);
    }
}