/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qngdjas
 */
public class KPO22 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("KPO22Text.txt");
        Scanner reader = new Scanner(file, "UTF-8");
        ArrayList<String> content = contentEdit(reader);
        PrintWriter pWriter = null;
        try {
            pWriter = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            for (String str : content) {
                pWriter.println(str);
            }
        } catch (IOException ex) {
            Logger.getLogger(KPO22.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pWriter != null) {
                pWriter.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

    public static ArrayList<String> contentEdit(Scanner sc) {
        ArrayList<String> strList = new ArrayList<>();
        String readStr;
        while (sc.hasNextLine()) {
            readStr = sc.nextLine();
            strList.add(readStr.replaceAll("public", "private"));
        }
        return strList;
    }
}
