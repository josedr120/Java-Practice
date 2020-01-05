package Proyect;

import java.util.Scanner;

public class Proyect1 {

    public static void main(String[] args) {
        new Proyect1().Menu();
    }

    Scanner in = new Scanner(System.in);

    int value;

    public void Menu() {
        System.out.println("Choose the option below");
        System.out.println("***************************");
        System.out.println("1 -> Insert");
        System.out.println("2 -> Update");
        System.out.println("3 -> Delete");
        System.out.println("4 -> View");
        System.out.println("5 -> Exit");

        System.out.print("Enter your option value: ");
        value = in.nextInt();

        int selection = value;

        switch (selection) {
            case 1:
                new UserOptions().insertOption();
                break;
        }

    }
}



