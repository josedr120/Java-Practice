package Proyect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
    public DBConnection() {

        Connection myConnection = null;
        PreparedStatement getInsertDB = null;
        UserOptions userOptions = new UserOptions();


        try {
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_task", "root", "");
//            userOptions.AddUser(myConnection);

            System.out.println(userOptions.getInsert_id());
            System.out.println(userOptions.getInsert_name());


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

//    public void AddUser(@NotNull Connection myConnection) throws SQLException {
//
//        PreparedStatement getInsertDB = myConnection.prepareStatement("INSERT INTO UserInfo (UserID, UserName) VALUES (?, ?)");
//        getInsertDB.setInt(1, userOptions.insert_id);
//        getInsertDB.setString(2, userOptions.insert_name);
//
//        getInsertDB.executeUpdate();
//    }
}
