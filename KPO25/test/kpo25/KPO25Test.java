/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo25;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Qngdjas
 */
public class KPO25Test {

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
     * Тест наибольшей последовательности в 4 элемента
     */
    @Test
    public void testHighestConsistencyFourElement() {
        String[] in = {"ab", "abcd", "abc", "a"};
        KPO25.highestConsistency(in);
        assertEquals("Наибольшая последовательность цифр: 4\n", outContent.toString());
    }

    /**
     * Тест наибольшей последовательностb с 2 набором цифр одинаковой длины
     */
    @Test
    public void testHighestConsistencyDoubleEqualsLengthElements() {
        String[] in = {"ab", "abd", "abc", "a"};
        KPO25.highestConsistency(in);
        assertEquals("Наибольшая последовательность цифр: 3\n", outContent.toString());
    }

    /**
     * Тест наибольшей последовательностb с 3 набором цифр одинаковой длины
     */
    @Test
    public void testHighestConsistencyTripleEqualsLengthElements() {
        String[] in = {"abe", "abd", "abc", "a"};
        KPO25.highestConsistency(in);
        assertEquals("Наибольшая последовательность цифр: 3\n", outContent.toString());
    }

    /**
     * Тест наибольшей последовательностb с пустым набором данных
     *
     */
    @Test
    public void testHighestConsistencyVoid() {
        String[] in = {};
        KPO25.highestConsistency(in);
        assertEquals("Наибольшая последовательность цифр: 0\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

}
