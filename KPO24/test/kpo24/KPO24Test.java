/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo24;

import java.io.File;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assume;

/**
 *
 * @author Qngdjas
 */
public class KPO24Test {

    //Тесты будут запускаться только под платформой Windows
    @BeforeClass
    public static void checkOs() throws Exception {
        Assume.assumeTrue(System.getProperty("os.name").toLowerCase().contains("windows"));
    }

    //Группа тестов для метода fileToList
    /**
     * Тест, что файла нет
     */
    @Test
    public void testNoFile() {
        File f = new File("KPO24NoFile.txt");
        ArrayList<String> result = KPO24.fileToList(f);
        Assert.assertNull(result);
    }

    /**
     * Тест, что файл есть
     */
    @Test
    public void testFileIsExists() {
        File f = new File("KPO24Text.txt");
        ArrayList<String> result = KPO24.fileToList(f);
        Assert.assertNotNull(result);
    }

    /**
     * Тест, что файл содержит информацию
     */
    @Test
    public void testNotNullContentEdit() {
        File f = new File("KPO24Text.txt");
        ArrayList<String> result = KPO24.fileToList(f);
        ArrayList<String> expected = new ArrayList<String>();
        Assert.assertNotEquals(expected, result);
    }

    /**
     * Тест, что файл не содержит информацию
     */
    @Test
    public void testVoidContentEdit() {
        File f = new File("KPO24VoidTest.txt");
        ArrayList<String> result = KPO24.fileToList(f);
        ArrayList<String> expected = new ArrayList<String>();
        Assert.assertEquals(expected, result);
    }

}
