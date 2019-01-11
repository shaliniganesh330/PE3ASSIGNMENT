package com.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckSumOfTheMatricesTest {
    CheckSumOfTheMatrices ob;
    @Before
    public void setUp() throws Exception {
        ob = new CheckSumOfTheMatrices();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void sumofmatricessuccess() {
        int rowsnumber,columnnumber;
        int[][] array1 = {{1,2},{3,4}, {5,6}};
        int[][] array2 = {{9,8},{7,6}, {5,4}};
        int[][] expected = {{10,10},{10,10},{10,10}};
        int[][] actual =  ob.sumofmatrices(3,2,array1,array2);
        assertArrayEquals(expected,actual);
    }@Test
    public void sumofmatricessuccess1() {
        int rowsnumber,columnnumber;
        int[][] array1 = {{1,2},{3,4}, {5,6},{7,6},{2,8}};
        int[][] array2 = {{9,8},{7,6}, {5,4},{2,3},{2,1}};
        int[][] expected = {{10,10},{10,10},{10,10},{9,9},{4,9}};
        int[][] actual =  ob.sumofmatrices(5,2,array1,array2);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void sumofmatricesfailure1() {
        int[][] array1 = {{1,2},{3,4}};
        int[][] array2 = {{9,8}};
        int[][] expected1 = null;
        int[][] actual1 =  ob.sumofmatrices(3,2,array1,array2);
        assertArrayEquals(expected1,actual1);
    }
    @Test
    public void sumofmatricesfailure2() {
        int[][] array1 = {};
        int[][] array2 = {};
        int[][] expected2 = null;
        int[][] actual2 =  ob.sumofmatrices(0,0,array1,array2);
        assertArrayEquals(expected2,actual2);
    }

}