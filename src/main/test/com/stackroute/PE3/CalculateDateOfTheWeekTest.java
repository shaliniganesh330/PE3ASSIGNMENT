package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateDateOfTheWeekTest {
    CalculateDateOfTheWeek object;
    @Before
    public void setUp() throws Exception {object=new CalculateDateOfTheWeek();
    }

    @After
    public void tearDown() throws Exception {object=null;
    }

    @Test
    public void testCalculateDateOfWeekSuccess() {
        String expectedlValue="Mon 07/01/2019"+"\n"+"Sun 13/01/2019";
        String actualValue= object.calculateDateOfWeek();
        assertEquals(expectedlValue,actualValue);
    }
    @Test
    public void testWeekDateMethodFailure(){
        String expectedlValue="Mon 27/01/2019 "+"\n"+"Sun 13/01/2019 ";
        String actualValue=object.calculateDateOfWeek();
        assertNotEquals(expectedlValue,actualValue);
    }

    @Test
    public void testWeekDateMethodNeutral() {
        assertNotNull(object.calculateDateOfWeek());
    }
}