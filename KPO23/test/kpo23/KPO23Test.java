/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo23;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assume;
import org.junit.BeforeClass;

/**
 *
 * @author Qngdjas
 */
public class KPO23Test {

    //Тесты будут запускаться только под платформой Windows
    @BeforeClass
    public static void checkOs() throws Exception {
        Assume.assumeTrue(System.getProperty("os.name").toLowerCase().contains("windows"));
    }

    /**
     * Тест, что метод правильно транспонирует матрицу
     */
    @Test
    public void testMatrixRightTransposer() {
        int[][] matrix = {{21, 8, 14, 5, 9, 1},
        {12, 6, 1, 5, 2, 45},
        {15, 65, 4, 9, 8, 6},
        {12, 45, 7, 5, 15, 3},
        {151, 8, 8, 565, 1, 2},
        {184, 1, 0, 1, 12, 82}};
        int[][] expResult
                = {{21, 12, 15, 12, 151, 184},
                {8, 6, 65, 45, 8, 1},
                {14, 1, 4, 7, 8, 0},
                {5, 5, 9, 5, 565, 1},
                {9, 2, 8, 15, 1, 12},
                {1, 45, 6, 3, 2, 82}};
        int[][] result = KPO23.matrixTransposer(matrix);
        assertArrayEquals(expResult, result);
    }

    /**
     * Тест, что метод не вернет неправильно транспонированную матрицу
     */
    @Test
    public void testMatrixNoRightTransposer() {
        int[][] matrix = {{21, 8, 14, 5, 9, 1},
        {12, 6, 1, 5, 2, 45},
        {15, 65, 4, 9, 8, 6},
        {12, 45, 7, 5, 15, 3},
        {151, 8, 8, 565, 1, 2},
        {184, 1, 0, 1, 12, 82}};
        int[][] expResult
                = {{21, 12, 15, 12, 151, 184},
                {8, 6, 65, 45, 8, 1},
                {14, 1, 4, 7, 8, 0},
                {5, 5, 9, 5, 565, 1},
                {9, 2, 8, 15, 1, 12},
                {1, 45, 6, 3, 2, 82}};
        int[][] result = KPO23.matrixTransposer(matrix);
        assertArrayEquals(expResult, result);
    }

    /**
     * Тест, что файл с матрицей пустой
     */
    @Test
    public void testMatrixSizeIsEmpty() {
        File f = new File("KPO23VoidTest.txt");
        int expResult = 0;
        int result = KPO23.matrixSize(f);
        assertEquals(expResult, result);
    }

    /**
     * Тест, что файл с матрицей не пустой
     */
    @Test
    public void testMatrixSizeIsNoEmpty() {
        File f = new File("KPO23Text.txt");
        int expResult = 0;
        int result = KPO23.matrixSize(f);
        assertNotEquals(expResult, result);
    }

    /**
     * Тест, что файл с матрицей не существует
     */
    @Test
    public void testNoMatrixFile() {
        File f = new File("KPO23TextNoExists.txt");
        int expResult = -1;
        int result = KPO23.matrixSize(f);
        assertEquals(expResult, result);
    }

    /**
     * Тест, что программа правильно считывает длину из файла с матрицей
     */
    @Test
    public void testMatrixFileSize() {
        File f = new File("KPO23Text.txt");
        int expResult = 6;
        int result = KPO23.matrixSize(f);
        assertEquals(expResult, result);
    }

    //Набор тестов чтения из файла с правильным выводом значений
    /**
     * Тест верного чтения из файла
     */
    @Test
    public void testReadMatrix() {
        File file = new File("KPO23Text.txt");
        int matrixLength = 6;
        int[][] expResult
                = {{21, 8, 14, 5, 9, 1},
                {12, 6, 1, 5, 2, 45},
                {15, 65, 4, 9, 8, 6},
                {12, 45, 7, 5, 15, 3},
                {151, 8, 8, 565, 1, 2},
                {184, 1, 0, 1, 12, 82}};
        int[][] result = KPO23.matrix(file, matrixLength);
        assertArrayEquals(expResult, result);
    }

    /**
     * Тест, что матрица будет передана в программу правильно
     */
    @Test
    public void testReadNoWrongMatrix() {
        File file = new File("KPO23Text.txt");
        int matrixLength = 6;
        int[][] expResult
                = {{13, 8, 15, 5, 9, 1},
                {12, 6, 1, 5, 2, 45},
                {15, 65, 4, 9, 8, 6},
                {12, 45, 7, 5, 15, 3},
                {151, 8, 8, 565, 1, 2},
                {184, 1, 0, 1, 12, 82}};
        int[][] result = KPO23.matrix(file, matrixLength);
        assertNotEquals(expResult, result);
    }

}
