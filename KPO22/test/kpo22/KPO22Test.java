/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo22;

import java.io.File;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Qngdjas
 */
public class KPO22Test {

    /**
     * Тест, что файла нет
     */
    @Test
    public void testNoFile() {
        File f = new File("KPO22NoFile.txt");
        ArrayList<String> result = KPO22.contentEdit(f);
        Assert.assertNull(result);
    }
    /**
     * Тест, что файл есть
     */
    @Test
    public void testFileIsExists() {
        File f = new File("KPO22Text.txt");
        ArrayList<String> result = KPO22.contentEdit(f);
        Assert.assertNotNull(result);
    }

    /**
     * Тест, что файл содержит информацию
     */
    @Test
    public void testNotNullContentEdit() {
        File f = new File("KPO22Text.txt");
        ArrayList<String> result = KPO22.contentEdit(f);
        ArrayList<String> expected = new ArrayList<String>();
        Assert.assertNotEquals(expected, result);
    }

    /**
     * Тест, что файл не содержит информацию
     */
    @Test
    public void testVoidContentEdit() {
        File f = new File("KPO22VoidTest.txt");
        ArrayList<String> result = KPO22.contentEdit(f);
        ArrayList<String> expected = new ArrayList<String>();
        Assert.assertEquals(expected, result);
    }
}
