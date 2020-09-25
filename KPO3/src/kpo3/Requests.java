/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qngdjas
 */
public class Requests {

    /**
     *
     * @param connection
     */
    public static void initializing(Connection connection) {
        sqlRequest1(connection, "Monday", "A303");
        sqlRequest2(connection, "Monday");
        sqlRequest3(connection, 2);
        sqlRequest4(connection, 2);
        //sqlRequest5(connection);
    }

    /**
     * ������ 1 ������� ���������� � ��������������, ���������� � �������� ����
     * ������ � �������� ���������
     *
     * @param connection
     * @param dayOfWeek
     * @param audience
     */
    public static void sqlRequest1(Connection connection, String dayOfWeek, String audience) {
        String SQL1 = "SELECT teachers.idTeacher, teachers.familyName, teachers.name, teachers.patronymic, objects.name, objects.day, objects.classroom\n"
                + "FROM teachers INNER JOIN objects ON teachers.idObject=objects.idObject\n"
                + "GROUP BY objects.day, objects.classroom\n"
                + "HAVING objects.day = \"" + dayOfWeek + "\" and objects.classroom = \"" + audience + "\";";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(SQL1);
            System.out.println("\n������ 1:");
            resultSet = statement.executeQuery(SQL1);
            System.out.println("\n=====================================================================\n");
            while (resultSet.next()) {
                int idTeacher = resultSet.getInt("teachers.idTeacher");
                String familyName = resultSet.getString("teachers.familyName");
                String name = resultSet.getString("teachers.name");
                String patronymic = resultSet.getString("teachers.patronymic");
                String subject = resultSet.getString("objects.name");
                String day = resultSet.getString("objects.day");
                String classroom = resultSet.getString("objects.classroom");
                System.out.println(idTeacher + " | " + familyName + " | " + name + " | " + patronymic + " | " + subject + " | " + day + " | " + classroom);
                System.out.println("\n=====================================================================\n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                resultSet.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * ������ 2 ������� ���������� � ��������������, ������� �� ����� ������� �
     * �� ������ ���� ������
     *
     * @param connection
     * @param dayOfWeek
     */
    public static void sqlRequest2(Connection connection, String dayOfWeek) {
        String SQL2 = "SELECT teachers.idTeacher, teachers.familyName, teachers.name, teachers.patronymic, objects.name, objects.day, objects.classroom\n"
                + "FROM teachers INNER JOIN objects ON teachers.idObject=objects.idObject\n"
                + "GROUP BY objects.classroom, objects.day\n"
                + "HAVING objects.day NOT IN (\"" + dayOfWeek + "\");";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(SQL2);
            System.out.println("������ 2:");
            resultSet = statement.executeQuery(SQL2);
            System.out.println("\n=====================================================================\n");
            while (resultSet.next()) {
                int idTeacher = resultSet.getInt("teachers.idTeacher");
                String familyName = resultSet.getString("teachers.familyName");
                String name = resultSet.getString("teachers.name");
                String patronymic = resultSet.getString("teachers.patronymic");
                String subject = resultSet.getString("objects.name");
                String day = resultSet.getString("objects.day");
                String classroom = resultSet.getString("objects.classroom");
                System.out.println(idTeacher + " | " + familyName + " | " + name + " | " + patronymic + " | " + subject + " | " + day + " | " + classroom);
                System.out.println("\n=====================================================================\n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                resultSet.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * ������ 3 ������� ��� ������, � ������� ���������� �������� ����������
     * �������
     *
     * @param connection
     * @param numberOfLessons
     */
    public static void sqlRequest3(Connection connection, int numberOfLessons) {
        String SQL3 = "select distinct day from objects group by day having count(distinct name)=" + numberOfLessons + ";";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(SQL3);
            System.out.println("������ 3:");
            resultSet = statement.executeQuery(SQL3);
            System.out.println("\n=====================================================================\n");
            while (resultSet.next()) {
                String day = resultSet.getString("objects.day");
                System.out.println(" | " + day + " | ");
                System.out.println("\n=====================================================================\n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                resultSet.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * ������ 4 ������� ��� ������, � ������� ������ �������� ����������
     * ���������
     *
     * @param connection
     * @param numberOfAudience
     */
    public static void sqlRequest4(Connection connection, int numberOfAudience) {
        String SQL4 = "select distinct day from objects group by day having count(distinct classroom)=" + numberOfAudience + ";";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(SQL4);
            System.out.println("������ 4:");
            resultSet = statement.executeQuery(SQL4);
            System.out.println("\n=====================================================================\n");
            while (resultSet.next()) {
                String day = resultSet.getString("objects.day");
                System.out.println(" | " + day + " | ");
                System.out.println("\n=====================================================================\n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                resultSet.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(Requests.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * ������ 5 ��������� ������ ������� �������� ���� ������ �� ��������� �����
     *
     * @param connection
     * @param numberOfAudience
     *
     * public static void sqlRequest5(Connection connection, String dayOfWeek) {
     * sql ������ �������� ������ ������� �������� ���� ������ �� ���������
     * ����� ���������� ������� ����� ���������� }
     */
}
