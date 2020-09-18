/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Консольное приложение, позволяющее считать квадратную матрицу из файла,
 * вывести её на экран и транспонировать
 *
 * @author Qngdjas
 */
public class KPO23 {

    public static void main(String[] args) {
        //Инициализация файла
        File file = new File("KPO23Text.txt");
        //Подсчет размерности квадратной матрицы
        int lines = matrixSize(file);
        //Считывание матрицы из файла
        int[][] fileMatrix = matrix(file, lines);
        //Вывод матрицы на консоль
        matrixOutput(fileMatrix);
        //Транспонирование матрицы и вывод на консоль
        matrixOutput(matrixTransposer(fileMatrix));
    }

    /**
     * Метод вывода матрицы на экран
     *
     * @param matrix
     */
    public static void matrixOutput(int[][] matrix) {
        System.out.println("-------------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }

    /**
     * Метод транспонирования матрицы
     *
     * @param matrix На вход подается матрица
     * @return Возвращает транспонированную матрицу
     */
    public static int[][] matrixTransposer(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                //Меняем местами данные
                int helper = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = helper;
            }
        }
        return matrix;
    }

    /**
     * Метод определения размера массива
     *
     * @param f На вход подается файл
     * @return Возвращает количество строк в файле
     */
    public static int matrixSize(File f) {
        //Счетчик строк в файле
        int lines = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
            while ((br.readLine()) != null) {
                lines++;
            }
        } catch (IOException ex) {
            Logger.getLogger(KPO23.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(KPO23.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //Возвращаем размер матрицы
            return lines;
        }

    }

    /**
     * Метод чтения матрицы из файла
     *
     * @param file На вход подается файл
     * @param matrixLength И размер матрицы в этом файле
     * @return Возвращает масссив из файла
     */
    public static int[][] matrix(File file, int matrixLength) {
        //Стринговый массив для считывания данных из файла
        String[][] strMatrix = new String[matrixLength][];
        //Матрица, которую необходимо вывести
        int[][] matrix = new int[matrixLength][matrixLength];
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String read = null;
            int count = 0;
            //Заполняем строковой массив данными из файла
            while ((read = reader.readLine()) != null) {
                //Заполняем массив построчно
                strMatrix[count] = read.split(" ");
                count++;
            }
            //Преобразовываем String массив в int массив
            for (int i = 0; i < matrixLength; i++) {
                for (int j = 0; j < strMatrix[i].length; j++) {
                    matrix[i][j] = Integer.parseInt(strMatrix[i][j]);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(KPO23.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(KPO23.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //Возвращаем матрицу
            return matrix;
        }

    }
}
