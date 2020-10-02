/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Консольное приложение, позволяющее из текстового файла ввести
 * последовательность строк. Выделить отдельные слова, разделяемые пробелами.
 * Написать метод поиска слова по образцу-шаблону. Вывести найденное слово в
 * другой файл
 *
 * @author Qngdjas
 */
public class KPO24 {

    //Шаблон
    static String pattern = "солнце";

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        File out = new File("KPO24Text.txt");
        File in = new File("KPO24Write.txt");
        //Считывание текста из файла
        ArrayList<String> content = fileToList(out);
        String text = "";
        for (String str : content) {
            text += str + " ";
        }
        //Деление текста на слова
        String[] words = text.split("\\s");
        for (String str : words) {
            System.out.println(str);
        }
        //Ищем нужные слова и выводим в файл
        searchPattern(words, in);
    }

    /**
     * Метод перевода текста из файла в список
     *
     * @param f На вход подается файл
     * @return Возвращает содержимое файла в виде листа
     */
    public static ArrayList<String> fileToList(File f) {
        Scanner reader = null;
        ArrayList<String> list = null;
        try {
            reader = new Scanner(f, "UTF-8");
            list = new ArrayList<>();
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KPO24.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (reader != null) {
                reader.close();
            }
            return list;
        }
    }

    /**
     * Метод поиска слова по шаблону
     *
     * @param data На вход подается слова для проверки с шаблоном
     * @param f И файл
     */
    public static void searchPattern(String[] data, File f) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(f);
            //Найденные слова выводим на консоль и записываем в файл
            for (String str : data) {
                if (str.equals(pattern)) {
                    System.out.println(str);
                    pw.println(str);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KPO24.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

}
