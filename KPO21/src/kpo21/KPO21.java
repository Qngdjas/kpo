/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo21;

import java.util.Scanner;

/**
 * Приложение, позволяющее найти и вывести слова текста, для которых
 * последняя буква одного слова совпадает с первой буквой следующего слова
 * @author Qngdjas
 */
public class KPO21 {

    public static void main(String[] args) {
        //Ввод текста (Вызов функции ввода)
        String text = inputString();
        //Деление текста на слова
        String[] words = text.split("\\s");
        //Сравниваем слова друг с другом по очереди
        int i = 0;
        for (String str1 : words) {
            int j = 0;
            for (String str2 : words) {
                //Слово с самим собой не сравниваем
                if (i != j) {
                    //Если последняя буква первого слова совпадает с первой буквой второго
                    if (str1.substring(str1.length() - 1).equals(str2.substring(0, 1))) {
                        //Выводим эту пару
                        System.out.println(str1 + " " + str2);
                    }
                }
                j++;
            }
            i++;
        }
    }

    /**
     * Функция ввода данных с консоли
     *
     * @return Возвращает строку
     */
    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        //Считываем информацию с консоли
        String str = sc.nextLine();
        //Закрываем сканер
        sc.close();
        //Возвращаем результат
        return str;
    }

}
