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
public class Practice5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int num;

        System.out.print("Input Number: ");
        num = x.nextInt();

        if (num == 5) {
            int i = 0;
            while (i < 4) {
                int total = num * i;

                System.out.println("5" + " x " + i + " = " + total);
                i++;
            }
        } else if (num == 8) {
            int i = 0;
            do {
                int total = num * i;

                System.out.println("8" + " x " + i + " = " + total);
                i++;
            } while (i < 5);
        } else if (num == 12) {
            for (int i = 0; i < 5; i++) {
                int total = num * i;
                System.out.println("12" + " x " + i + " = " + total);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                int total = num * i;
                System.out.println(num + " x " + i + " = " + total);
            }
        }

    }
}
