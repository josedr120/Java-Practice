package Assigments7;

import java.util.HashMap;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        HashMap<Integer, String> obj = new HashMap<Integer, String>();

        obj.put(12, "Raj");
        obj.put(14, "Proveen");
        obj.put(5, "Gobi");
        obj.put(10, "Jose");
        obj.put(7, "David");

        System.out.println("Map Elements: " + obj);

        Scanner in = new Scanner(System.in);
        int userID;
        String pass;

        System.out.print("Enter UserID: ");
        userID = in.nextInt();
        System.out.print("Enter Pass: ");
        pass = in.next();

        if (obj.containsKey(userID) || obj.containsKey(pass)) {
            System.out.println("You have entered Correct userId and Password");
        }

        if (!obj.containsKey(userID) && !obj.containsKey(pass)) {
            System.out.println("Sorry, User UserId, Password are wrong!");
        }


    }
}
