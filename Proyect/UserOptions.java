package Proyect1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserOptions {

    public void insertOption() throws SQLException {
        Connection myConnection;
        PreparedStatement getInsertDB;

        Scanner in = new Scanner(System.in);
        int id;
        String name;


        System.out.print("Enter ID: "); id = in.nextInt();
        System.out.print("Enter Name: "); name = in.next();

        new DBConnection();

        getInsertDB = myConnection.prepareStatement("INSERT INTO UserInfo (id, name) VALUES (?, ?)");
        getInsertDB.setInt(1, id);
        getInsertDB.setString(2, name);


        System.out.println("Hey you pass!!");





    }

    public void UpdateOption() {

    }
}
