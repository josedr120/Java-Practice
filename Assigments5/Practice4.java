package Assigments5;

import java.util.Comparator;
import java.util.TreeSet;

public class Practice4 {
    public static void main(String[] args) {
        //Creating empty TreeSet
        TreeSet<Integer> treeset = new TreeSet<Integer>();

        // Adding elements
        treeset.add(10);
        treeset.add(20);
        treeset.add(45);
        treeset.add(70);

        System.out.println("TreeSet " + treeset);


        Comparator comp = treeset.comparator();

        System.out.println("Comp: " + treeset.descendingSet());

    }
}
