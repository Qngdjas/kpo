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
        //��������� ��������� �����
        //��������� �������� � ������ ������
    }

    //���������� ���� (bsd � map).
    //��������� ������ �� ����� (bsd).
    public static String readFile(String path) {
        //��������� ����� �� ����(path)
        String text = "";
        return text;
    }

    //�������������� ���������� � ������
    public static String parsing(String text) {
        //����������� ������� � ���������� ����������
        return text;
    }

    //��������� map-����
    public static void uploadInformation(String path, String text) {
        //��������� ���(text) � map-���� �� ����(path)
    }

    //����������� �� ����������� (map � map).
    //��������� ������ �� ����� (map) (����� ������������� ����)
    //���������� ���������� �� id
    public static String idSort(String text) {
        //��������� ����������
        return text;
    }

    //�������������� map-���� - ������� ������ ���������� � ���������� ���������������
    public static void overwriteInformation(String path, String text) {
        //�������������� map-���� �� ����(path)
    }

    //����������� ������ � ���� ����-����� (map � map).
    //��������� ������ �� ����� (map) (����� ������������� ����)
    //��������� ������ �� ����� �� ������ �� id
    public static String[] grouping(String text) {
        //��������� text �� ������
        String[] groupText = null;
        return groupText;
    }

    /*��������� ������ ���������� ������ �� �������, ����� ������� ������� ����
      ������, ���� �������� ���������� �������, �������������, ������ ����������
      �������������� ���������� (����������� ��� �� ������)*/
    public static String[] timeSort(String[] groupText) {
        return groupText;
    }

    /*��������� �� �������� ����� (�������� ����� �����, �� ��� ������� ������) 
      � ������������ ����� (�������� � ����� �����, � ����� ������)(map � pojo).*/
    //���������� ��������� ������ ��� ������� ���� ������
    //�� ��������� ������� ������ �������� ���� ��������� �������� �����
    public static String searchActive(String[] groupText) {
        String text = "";
        return text;
    }

    /*�������������� map-���� - �������� ������ ���������� � ���������� ������
      �� ��������� ������� (����� ������������� ����)*/
    //�� ������ ������� ��������� ������������ �����
    public static String searchWorked(String[] groupText) {
        String text = "";
        return text;
    }

    //��������� ������������ ����� (pojo).
    //������� ������ pojo �������� � ��������� ���� ���������� ������� (����� �����, ������, ������������)
    public static Employee[] data(String text) {
        Employee[] data = null;
        return data;
    }

    //����������� id � ��� (������ pojo � �� � ������ pojo).
    //������������� ����������� � ��
    public static Connection connection(String path) {
        return null;
    }

    //��������� ������ �������� ��� pojo-�������� � ���������� ��� ��� id
    public static void identificate() {
        //
    }
//�������� ���������� � �� (������ pojo � ��).
//�������������� ������ ������� �� ����� (map � map).
//� ������������ ������ ������� ��������� map-���� ������ ������� � �������� ��������� ������ (bsd � map)
//��������� ������ ��� ������ � ��� � ����� � �� �������.
    //Pojo

    public class Employee {
        //- id
        //- ���
        //- ����� �����
        //- ����� ������
        //- ������������ �����
    }
}
