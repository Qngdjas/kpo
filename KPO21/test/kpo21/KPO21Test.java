/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo21;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Qngdjas
 */
public class KPO21Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    /**
     * Test of check method, of class KPO21.
     */
    @Test
    public void testCheckVoidString() {
        KPO21.check("");
        assertEquals("", outContent.toString());
    }

    /**
     * Test of check method, of class KPO21.
     */
    @Test
    public void testCheckOneWordString() {
        KPO21.check("abs");
        assertEquals("", outContent.toString());
    }

    /**
     * Test of check method, of class KPO21.
     */
    @Test
    public void testCheckTwoWordsString() {
        KPO21.check("abs sv");
        assertEquals("abs sv\n", outContent.toString());
    }

    /**
     * Test of check method, of class KPO21.
     */
    @Test
    public void testCheckThreeWordsString() {
        KPO21.check("abs sb bc");
        assertEquals("abs sb\nsb bc\n", outContent.toString());
    }

    /**
     * Test of check method, of class KPO21.
     */
    @Test
    public void testCheckThreeWordsStringNotVoid() {
        KPO21.check("abs sb bc");
        assertNotEquals("", outContent.toString());
    }
    /**
     * Test of check method, of class KPO21.
     */
    @Test
    public void testCheckTwoWordsNotVoid() {
        KPO21.check("abs sb");
        assertNotEquals("", outContent.toString());
    }
    /**
     * Test of check method, of class KPO21.
     */
    @Test
    public void testCheckFourWordsNotNull() {
        KPO21.check("asbb ajb sab dsda");
        assertNotEquals("", outContent.toString());
    }
    /**
     * Test of check method, of class KPO21.
     */
    @Test
    public void testCheckVoidStringHadNoContent() {
        KPO21.check("");
        assertNotEquals("abs sv", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
