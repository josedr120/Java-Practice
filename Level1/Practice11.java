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
public class Practice11 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String input;

        System.out.print("Enter here: ");
        input = x.next();

        int textNum = Integer.parseInt(input);

        System.out.println("The Integer value is: " + textNum);

    }
}
