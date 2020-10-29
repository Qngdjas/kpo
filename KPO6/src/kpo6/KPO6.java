/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo6;

import java.io.InvalidObjectException;

/**
 *
 * @author Qngdjas
 */
public class KPO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // �������� ������� �������
        Subjects sub = new Subjects();
        sub.setName("music");
        sub.setDay("Wednesday");
        sub.setClassroom("A505");
        // �������� � ������ ������� �������
        Teacher ob = new Teacher("1", "Kuropatkin Arnold Viktorovich", sub, "6", "18");
        System.out.println(ob);
        String file = "src/kpo6/SerializableData.txt";
        Serializator sz = new Serializator();
        boolean b = sz.serialization(ob, file);
        // ��������� �������� static-����
        ob.setIdTeacher("12");
        // ��������� �������� non-static-����
        ob.setStudents("80");
        ob.setHours("8");
        // ������ � ����� �������
        Teacher res = null;
        try {
            res = sz.deserialization(file);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(res);
    }
}
