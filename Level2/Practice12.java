package Level2;

import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        p12AccountClass obj = new p12AccountClass();

        String name, email;
        int accNumber, cNumber;

        System.out.print("Enter Name: ");
        name = x.next();
        System.out.print("Accont Number: ");
        accNumber = x.nextInt();
        System.out.print("Contact Number: ");
        cNumber = x.nextInt();
        System.out.print("Email ID: ");
        email = x.next();

        obj.setHolderName(name);
        obj.setAccountNumber(accNumber);
        obj.setContactNumber(cNumber);
        obj.setEmialID(email);

        System.out.println("My name is: " + obj.getHolderName() +
                "\n My account num is: " + obj.getAccountNumber() +
                "\n My contact number is: " + obj.getContactNumber() +
                "\n My Email ID is: " + obj.getEmialID());


    }
}
