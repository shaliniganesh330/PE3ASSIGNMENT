package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintChessBoardPatternTest {
    PrintChessBoardPattern object;
    @Before
    public void setUp() throws Exception {object=new PrintChessBoardPattern();
    }

    @After
    public void tearDown() throws Exception {object=null;
    }

    @Test
    public void testChessBoardPatternSucccess() {
        assertNotNull(object.chessBoardPattern());
    }
    @Test(expected = NullPointerException.class)
    public void testInvalid(){
        object = null;
        assertNotNull(object.chessBoardPattern());
    }
}