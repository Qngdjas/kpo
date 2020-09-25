/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo3;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qngdjas
 */
public class KPO3 {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/kpo3";

    static final String USER = "root";
    static final String PASSWORD = "";

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Connection connection = null;
        try {
            //Установка соединения с БД
            connection = DataBaseConnection.link();
            //Вызов запросов
            Requests.initializing(connection);
            //Вставка строки в таблицу
            InformationEditing.insertIntoObjects(connection);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KPO3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KPO3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(KPO3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
