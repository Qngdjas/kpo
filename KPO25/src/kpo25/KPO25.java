/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo25;

import java.util.Scanner;

/**
 * Приложение, позволяющее найти в строке наибольшее число цифр, идущих подряд
 * (строка может содержать как одно, так и несколько слов)
 *
 * @author Qngdjas
 */
public class KPO25 {

    public static void main(String[] args) {
        //Ввод данных с консоли
        String[] input = inputString().split(" ");
        highestConsistency(input);
    }

    /**
     * Функция вывода наибольшей последовательности
     *
     * @param in На вход подается массив со строками, из которых выбирается
     * самая длинная
     */
    public static void highestConsistency(String[] in) {
        String answer = "";
        //Находим наибольшую последовательность цифр
        for (String input1 : in) {
            if (answer.length() < input1.length()) {
                answer = input1;
            }
        }
        //Выводим длину наибольшей последовательности
        System.out.println("Наибольшая последовательность цифр: " + answer.length());
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
