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
 * Класс на модификацию информации
 *
 * @author Qngdjas
 */
public class InformationEditing {

    /**
     *
     * @param connection
     */
    public static void insertIntoObjects(Connection connection) {
        String SQL = "INSERT INTO objects (idObject, name, day, classroom) VALUES (NULL, 'Physics', 'Friday', 'D303');";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(SQL);
            System.out.println("\nЗапрос на добавление:");
            SQL = "SELECT * FROM objects";
            resultSet = statement.executeQuery(SQL);
            System.out.println("\n=====================================================================\n");
            while (resultSet.next()) {
                int idObject = resultSet.getInt("idObject");
                String subject = resultSet.getString("name");
                String day = resultSet.getString("day");
                String classroom = resultSet.getString("classroom");
                System.out.println(" | " + idObject + " | " + subject + " | " + day + " | " + classroom);
                System.out.println("\n=====================================================================\n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(InformationEditing.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(InformationEditing.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
