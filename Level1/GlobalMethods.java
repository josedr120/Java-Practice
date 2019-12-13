/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level1;

import java.util.Scanner;

/**
 * @author josedr
 */
public class GlobalMethods {


    public static void addFriends() {
        Scanner x = new Scanner(System.in);
        String name1, name2;

        System.out.print("Enter name 1: ");
        name1 = x.next();

        System.out.print("Enter name 2: ");
        name2 = x.next();

        System.out.println(name1 + " and " + name2 + " are friends");

    }

    public static boolean verifyNumber(int num) {
        return num >= 0;
    }


    public static String displayNames(String name) {
        String nameStr = name;

        String[] arrOfstr = nameStr.split(" ");

        for (String nameList : arrOfstr) {
            System.out.println(nameList);
        }


        return null;
    }
}
