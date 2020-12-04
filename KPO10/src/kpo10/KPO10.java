/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo10;

import java.sql.Connection;

/**
 *
 * @author Qngdjas
 */
public class KPO10 {

    public static void main(String[] args) {
        //Считываем системное время
        //Выполняем алгоритм в нужный период
        //С наступлением нового периода пополнить map-файл новыми данными и прогнать процедуру заново (bsd в map)
    }

    //Распарсить файл (bsd в map).
    //Считываем данные из файла (bsd).
    public static String readFile(String path) {
        //Считываем текст по пути(path)
        String text = "";
        return text;
    }

    //Подготавливаем информацию к чтению
    public static String parsing(String text) {
        //Редактируем порядок и содержание информации
        return text;
    }

    //Дополняем map-файл
    public static void uploadInformation(String path, String text) {
        //Добавляем лог(text) в map-файл по пути(path)
    }

    //Упорядочить по сотрудникам (map в map).
    //Считываем данные из файла (map) (метод спроектирован выше)
    //Используем сортировку по id
    public static String idSort(String text) {
        //Сортируем информацию
        return text;
    }

    //Перезаписываем map-файл - удаляем старую информацию и записываем отсортированную
    public static void overwriteInformation(String path, String text) {
        //Перезаписываем map-файл по пути(path)
    }

    //Упорядочить данные в пары вход-выход (map в map).
    //Считываем данные из файла (map) (метод спроектирован выше)
    /*Разбиваем данные из файла на группы по id, таким образом получим либо
      четное, либо нечетное количество записей, следовательно, сможем установить
      местоположение сотрудника (отсутствует или на работе)*/
    public static String[] grouping(String text) {
        //Разбиваем text на группы
        String[] groupText = null;
        return groupText;
    }

    /*Сортируем каждую полученную группу по времени*/
    public static String[] timeSort(String[] groupText) {
        return groupText;
    }

    /*Разделить на активное время (известно время входа, но нет времени выхода) 
      и отработанное время (известно и время входа, и время выхода)(map и pojo).*/
    //Используем созданный массив для решения этой задачи
    //Из последних записей каждой нечетной пары формируем активное время
    public static String searchActive(String[] groupText) {
        String text = "";
        return text;
    }

    //Использованные данные удалить из файла (map в map).   
    /*Перезаписываем map-файл - урдаляем старую информацию и записываем список
      из активного времени (метод спроектирован выше)*/
    //Из четных записей формируем отработанное время
    public static String searchWorked(String[] groupText) {
        String text = "";
        return text;
    }

    //Посчитать отработанное время (pojo).
    //Создаем массив pojo объектов и заполняем поля имеющимися данными (время входа, выхода, отработанное)
    public static Employee[] data(String text) {
        Employee[] data = null;
        return data;
    }

    //Сопоставить id и ФИО (список pojo и бд в список pojo).
    //Устанавливаем соединением с БД
    public static Connection connection(String path) {
        return null;
    }

    //Выполняем группу запросов для pojo-объектов и определяем ФИО для id
    public static void identificate() {
        //Определяем ФИО
    }

    //Записать результаты в БД (список pojo в бд).
    //Устанавливаем соединением с БД (метод спроектирован выше)
    public static void send() {
        //Заливаем новые данные в БД
    }

//Посчитать данные для табеля – раз в месяц и по запросу.
    public static void getInfo() {
        //Подсчитать данные
    }

    //Pojo
    public class Employee {
        //- id
        //- ФИО
        //- время входа
        //- время выхода
        //- отработанное время
    }
}
