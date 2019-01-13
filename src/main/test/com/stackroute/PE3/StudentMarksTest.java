package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks;
    private ByteArrayInputStream inputStream;
    @Before
    public void setUp() throws Exception {
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        inputStream.close();
    }

    @Test
    public void testGetNumOfStudentsSuccess() {
        String inputstring = "4 11 12 13 14";
        inputStream = new ByteArrayInputStream(inputstring.getBytes());
        System.setIn(inputStream);
        assertEquals("Success",studentMarks.getNumOfStudents());
    }

    @Test
    public void testGetNumOfStudentsFailure() {
        String inputstring = "4 11 120 13 14";
        inputStream = new ByteArrayInputStream(inputstring.getBytes());
        System.setIn(inputStream);
        assertNotEquals("Success",studentMarks.getNumOfStudents());
    }
    @Test(expected = NoSuchElementException.class)
    public void testInvalid(){
        String inputString = "2/0";
        inputStream = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(inputStream);
        assertNotEquals("Success",studentMarks.getNumOfStudents());
    }
}