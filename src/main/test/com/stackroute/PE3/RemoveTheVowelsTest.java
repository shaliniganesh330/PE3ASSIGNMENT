package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveTheVowelsTest {
    RemoveTheVowels removeTheVowelsob ;
    @Before
    public void setUp() throws Exception {
        removeTheVowelsob = new RemoveTheVowels()  ;
    }

    @After
    public void tearDown() throws Exception {removeTheVowelsob = null;
    }

    @Test
    public void removeVowelsSuccess() {
        String expected = " Ind Untd Stts Grmny Egypt czchslvk";
        String[] names ={" India United States Germany Egypt czechoslovakia"};
        String actual = removeTheVowelsob.removeVowels(names);
        assertEquals(expected,actual);
    }
    @Test
    public void removeVowelsFailure() {
        String expected1 = null;
        String[] names ={" India United States Germany Egypt czechoslovakia"};
        String actual1 = removeTheVowelsob.removeVowels(names);
        assertNotEquals(expected1,actual1);
    }
    @Test
    public void removeVowelsEmpty() {
        String[] names ={""};
        String actual1 = removeTheVowelsob.removeVowels(names);
        assertEquals("",actual1);
    }
}