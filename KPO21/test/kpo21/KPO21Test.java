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
     * Тест комбинаций пустой строки
     */
    @Test
    public void testCheckVoidString() {
        KPO21.check("");
        assertEquals("", outContent.toString());
    }

    /**
     * Тест комбинаций из 1 слова
     */
    @Test
    public void testCheckOneWordString() {
        KPO21.check("abs");
        assertEquals("", outContent.toString());
    }

    /**
     * Тест комбинаций из 2 слов
     */
    @Test
    public void testCheckTwoWordsString() {
        KPO21.check("abs sv");
        assertEquals("abs sv\n", outContent.toString());
    }

    /**
     * Тест комбинаций из трех слов
     */
    @Test
    public void testCheckThreeWordsString() {
        KPO21.check("abs sb bc");
        assertEquals("abs sb\nsb bc\n", outContent.toString());
    }
    /**
     * Тест, что строка со словами без комбинаций даст нам пустой ответ
     */
    @Test
    public void testCheckNoCombinationWordsString() {
        KPO21.check("abs bb kc");
        assertEquals("", outContent.toString());
    }

    /**
     * Тест, что строка с комбинациями из 3 слов не даст нам пустого ответа
     */
    @Test
    public void testCheckThreeWordsStringNotVoid() {
        KPO21.check("abs sb bc");
        assertNotEquals("", outContent.toString());
    }
    /**
     * Тест, что строка с комбинациями из 2 слов не даст нам пустого ответа
     */
    @Test
    public void testCheckTwoWordsNotVoid() {
        KPO21.check("abs sb");
        assertNotEquals("", outContent.toString());
    }
    /**
     * Тест, что строка с комбинациями из 4 слов не даст нам пустого ответа
     */
    @Test
    public void testCheckFourWordsNotNull() {
        KPO21.check("asbb ajb sab dsda");
        assertNotEquals("", outContent.toString());
    }
    /**
     * Тест, что пустая строка не выведет нам какого либо ответа
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
