package Assigments5;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        try {
            ArrayList<String> language = new ArrayList<String>();
            language.add("Java");
            language.add("C#");
            language.add("JavaScript");
            language.add("C++");
            language.add("PHP");

            List<String> subArr = language.subList(2, 4);

            System.out.println(subArr);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown: " + e);
        }
    }
}
