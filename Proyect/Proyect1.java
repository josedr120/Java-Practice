package Proyect1;

import java.sql.SQLException;
import java.util.*;

public class UserMain {

    public static void main(String[] args) throws SQLException {
        new UserMain().Menu();
    }

    Scanner in = new Scanner(System.in);

    int value;

    public void Menu() throws SQLException {
        System.out.println("Choose the option below");
        System.out.println("***************************");
        System.out.println("1 -> Insert");
        System.out.println("2 -> Update");
        System.out.println("3 -> Delete");
        System.out.println("4 -> View");
        System.out.println("5 -> Exit");

        System.out.print("Enter your option value: "); value = in.nextInt();

        int selection = value;

        switch (selection) {
            case 1:
                new UserOptions().insertOption();
                break;
        }

    }
}



