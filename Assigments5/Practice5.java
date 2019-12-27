package Assigments5;

import java.util.HashSet;

public class Practice5 {
    public static void main(String[] args) {
        // Creating an empty HashSet
        HashSet<String>
                abs_col = new HashSet<String>();

        // Use add() method to add
        // elements into the HashSet
        abs_col.add("Welcome");
        abs_col.add("To");
        abs_col.add("The");
        abs_col.add("Jungle");
        abs_col.add("Geeks");

        // Displaying the HashSet
        System.out.println("The HashSet: " + abs_col);

        // Creating the array and using toArray()
        Object[] arr = abs_col.toArray();

        System.out.println("The array is: ");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
