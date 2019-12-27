package Assigments7;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        try {
            for (int i = 0; i < 10; i++) {
                String name;


                System.out.print("Enter: ");
                name = in.nextLine();

                if (arrList.contains(name) == true) {
                    System.out.println("Student name " + name + " is not possible to add in List");
                    break;
                } else {
                    arrList.add(name);
                    System.out.println(arrList);
                }

            }
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        }
    }
}
