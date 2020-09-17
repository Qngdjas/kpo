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
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String[] read = null;
            int i = 0;
            while ((read[i] = reader.readLine()) != null) {
                String[] words = read[i].split("\\s");
                for (String str : words) {
                    System.out.println(str);
                }
                i++;
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
        }
    }
    
}
