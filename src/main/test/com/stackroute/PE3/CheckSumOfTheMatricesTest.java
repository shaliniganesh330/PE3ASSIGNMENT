package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckSumOfTheMatricesTest {
    CheckSumOfTheMatrices sumOfMatricesob;
    @Before
    public void setUp() throws Exception {
        sumOfMatricesob = new CheckSumOfTheMatrices();
    }

    @After
    public void tearDown() throws Exception {
        sumOfMatricesob = null;
    }

    @Test
    public void testSumOfMatricesSuccess() {
        int rowsnumber,columnnumber;
        int[][] array1 = {{1,2},{3,4}, {5,6}};
        int[][] array2 = {{9,8},{7,6}, {5,4}};
        int[][] expected = {{10,10},{10,10},{10,10}};
        int[][] actual =  sumOfMatricesob.sumOfMatrices(3,2,array1,array2);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void testSumOfmatricesSuccess1() {
        int rowsnumber,columnnumber;
        int[][] array1 = {{1,2},{3,4}, {5,6},{7,6},{2,8}};
        int[][] array2 = {{9,8},{7,6}, {5,4},{2,3},{2,1}};
        int[][] expectedvalue = {{10,10},{10,10},{10,10},{9,9},{4,9}};
        int[][] actualvalue =  sumOfMatricesob.sumOfMatrices(5,2,array1,array2);
        assertArrayEquals(expectedvalue,actualvalue);
    }
    @Test
    public void testSumOfMatricesFailure1() {
        int[][] array1 = {{1,2},{3,4}};
        int[][] array2 = {{9,8}};
        int[][] expectedvalue = null;
        int[][] actualvalue =  sumOfMatricesob.sumOfMatrices(3,2,array1,array2);
        assertArrayEquals(expectedvalue,actualvalue);
    }
    @Test
    public void testSumOfMatricesFailure2() {
        int[][] array1 = {};
        int[][] array2 = {};
        int[][] expectedvalue = null;
        int[][] actualvalue =  sumOfMatricesob.sumOfMatrices(0,0,array1,array2);
        assertNull(actualvalue);
    }
}