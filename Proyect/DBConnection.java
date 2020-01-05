package Proyect1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
    public DBConnection() {

        Connection myConnection = null;
        PreparedStatement getInsertDB = null;

        try {
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_task", "root", "");

        }catch(SQLException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (myConnection != null) {
                try {
                    myConnection.close();
                } catch (SQLException ignore) {
                }
            }

            if (getInsertDB != null) {
                try {
                    getInsertDB.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

}
