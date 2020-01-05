package Proyect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
    public DBConnection(int id, String name) {

        Connection myConnection = null;
        PreparedStatement getInsertDB = null;


        try {
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_task", "root", "");

            PreparedStatement getDB = myConnection.prepareStatement("INSERT INTO UserInfo (UserID, UserName) VALUES (?, ?)");
            getDB.setInt(1, id);
            getDB.setString(2, name);

            getDB.executeUpdate();

            System.out.println(id);
            System.out.println(name);


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
