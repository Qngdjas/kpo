/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ���������� � ��
 *
 * @author Qngdjas
 */
public class DataBaseConnection {

    /**
     * ���������� � ��
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection link() throws ClassNotFoundException, SQLException {
        System.out.println("����������� JDBC ��������");
        Class.forName(KPO3.JDBC_DRIVER);
        System.out.println("���������� � ����� ������");
        return DriverManager.getConnection(KPO3.DATABASE_URL, KPO3.USER, KPO3.PASSWORD);
    }
}
