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
 *
 * @author Qngdjas
 */
public class KPO23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File file = new File("KPO23Text.txt");
        int lines = matrixSize(file);
        int[][] fileMatrix = matrix(file, lines);
        matrixOutput(fileMatrix);
        matrixOutput(matrixTransposer(fileMatrix));
    }

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

    public static int[][] matrixTransposer(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int helper = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = helper;
            }
        }
        return matrix;
    }

    public static int matrixSize(File f) {
        int lines = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
            String read = null;
            while ((read = br.readLine()) != null) {
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
            return lines;
        }

    }

    public static int[][] matrix(File file, int matrixLength) {
        String[][] strMatrix = new String[matrixLength][];
        int[][] matrix = new int[matrixLength][matrixLength];
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String read = null;
            int count = 0;
            while ((read = reader.readLine()) != null) {
                strMatrix[count] = read.split(" ");
                count++;
            }
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
            return matrix;
        }

    }
}
