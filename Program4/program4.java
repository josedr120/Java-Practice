/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program4;

import java.util.Scanner;

/**
 * @author josedr
 */
public class program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String numStr;
        boolean numeric = true;

        System.out.print("Enter: ");
        numStr = input.next();

        try {
            int num = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if (numeric) {
            System.out.println(numStr + " is a number");
        } else {
            System.out.println(numStr + " is not a number");
        }


    }
}
