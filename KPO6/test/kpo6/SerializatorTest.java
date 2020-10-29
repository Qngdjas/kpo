/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo6;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Qngdjas
 */
public class SerializatorTest {

    /**
     * Тест успешной сериализации
     */
    @Test
    public void testSerialization() {
        Subjects sub = new Subjects();
        sub.setName("music");
        sub.setDay("Wednesday");
        sub.setClassroom("A505");
        Teacher timetableData = new Teacher("1", "Kuropatkin Arnold Viktorovich", sub, "6", "18");
        String fileName = "src/kpo6/SerializableDataTest.txt";
        Serializator instance = new Serializator();
        boolean expResult = true;
        boolean result = instance.serialization(timetableData, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Тест десериализации
     */
    @Test
    public void testDeserialization() throws Exception {
        String fileName = "src/kpo6/SerializableDataTest.txt";
        Subjects sub = new Subjects();
        sub.setName("music");
        sub.setDay("Wednesday");
        sub.setClassroom("A505");
        Teacher expResult = new Teacher("1", "Kuropatkin Arnold Viktorovich", sub, "6", "18");
        Serializator instance = new Serializator();
        Teacher result = instance.deserialization(fileName);
        assertEquals(expResult, result);
    }

}
