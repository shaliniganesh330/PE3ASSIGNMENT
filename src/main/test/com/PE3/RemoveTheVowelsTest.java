package com.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveTheVowelsTest {
    RemoveTheVowels ob ;
    @Before
    public void setUp() throws Exception {
        ob = new RemoveTheVowels()  ;
    }

    @After
    public void tearDown() throws Exception {ob = null;
    }

    @Test
    public void removevowelssuccess() {
        String expected = " Ind Untd Stts Grmny Egypt czchslvk";
        String[] names ={" India United States Germany Egypt czechoslovakia"};
        String actual = ob.removevowels(names);
        assertEquals(expected,actual);
    }
    @Test
    public void removevowelsfailure() {
        String expected1 = null;
        String[] names ={};
        String actual1 = ob.removevowels(names);
        assertEquals(expected1,actual1);
    }
//    @Test
//    public void removevowelsfailure1() {
//        String expected1 = null;
//        String[] names ={"1234"};
//        String actual1 = ob.removevowels(names);
//        assertEquals(expected1,actual1);
//    }

}