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
public class Practice9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in).useDelimiter("\n");
        String input;

        System.out.print("This string is: ");
        input = x.next();
        x.close();

        count(input);
    }

    public static void count(String g) {
        char[] ch = g.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int otherchat = 0;

        for (int i = 0; i < g.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                otherchat++;
            }
        }

        System.out.println("The string is: " + g);
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + otherchat);
    }
}
