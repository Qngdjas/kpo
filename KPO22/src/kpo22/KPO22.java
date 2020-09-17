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

    /**
     * Приложение, позволяющее прочитать текст Java-программы и все слова public
     * в объявлении атрибутов и методов класса заменить на слово private
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Инициализацмя файла
        File file = new File("KPO22Text.txt");
        //Чтение и преобразование данных из файла
        ArrayList<String> content = contentEdit(file);
        PrintWriter pWriter = null;
        try {
            //Очистка файла
            pWriter = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            //Запись новых данных в файл
            for (String str : content) {
                pWriter.println(str);
            }
        } catch (IOException ex) {
            Logger.getLogger(KPO22.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pWriter != null) {
                pWriter.close();
            }
        }
    }

    /**
     * Функция Читает содержимое файла, запоминает и изменяет согласно условиям задачи
     * @param f На вход подается файл
     * @return Возвращает лист с измененным содержанием
     */
    public static ArrayList<String> contentEdit(File f) {
        Scanner sc = null;
        ArrayList<String> strList = null;
        try {
            sc = new Scanner(f, "UTF-8");
            strList = new ArrayList<>();
            String readStr;
            //Пока есть, что считывать
            while (sc.hasNextLine()) {
                //Считываем построчно
                readStr = sc.nextLine();
                //Редактируем прочитанную строку
                strList.add(readStr.replaceAll("public", "private"));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KPO22.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (sc != null) {
                sc.close();
            }
            //Возвращаем результат
            return strList;
        }
    }
}
