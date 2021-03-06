/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Qngdjas
 */
public class Serializator {

    public boolean serialization(Teacher timetableData, String fileName) {
        boolean flag = false;
        File f = new File(fileName);
        ObjectOutputStream ostream = null;
        try {
            FileOutputStream fos = new FileOutputStream(f);
            if (fos != null) {
                ostream = new ObjectOutputStream(fos);
                ostream.writeObject(timetableData); // ������������
                flag = true;
            }
        } catch (FileNotFoundException e) {
            System.err.println("���� �� ����� ���� ������: " + e);
        } catch (NotSerializableException e) {
            System.err.println("����� �� ������������ ������������: " + e);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (ostream != null) {
                    ostream.close();
                }
            } catch (IOException e) {
                System.err.println("������ �������� ������");
            }
        }
        return flag;
    }

    public Teacher deserialization(String fileName) throws InvalidObjectException {
        File fr = new File(fileName);
        ObjectInputStream istream = null;
        try {
            FileInputStream fis = new FileInputStream(fr);
            istream = new ObjectInputStream(fis); // ��������������
            Teacher st = (Teacher) istream.readObject();
            return st;
        } catch (ClassNotFoundException ce) {
            System.err.println("����� �� ����������: " + ce);
        } catch (FileNotFoundException e) {
            System.err.println("���� ��� �������������� �� ����������: " + e);
        } catch (InvalidClassException ioe) {
            System.err.println("������������ ������ �������: " + ioe);
        } catch (IOException ioe) {
            System.err.println("����� I/O ������: " + ioe);
        } finally {
            try {
                if (istream != null) {
                    istream.close();
                }
            } catch (IOException e) {
                System.err.println("������ �������� ������ ");
            }
        }
        throw new InvalidObjectException("������ �� ������������");
    }

}
