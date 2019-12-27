package Assigments5;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<String> language = new ArrayList<String>();
        String lan = "Java, C#, C++, PHP, Python, JavaScript";

        String pipe = lan.replace(",", " | ");
        String colon = lan.replace(",", " : ");

        System.out.println(lan);
        System.out.println(pipe);
        System.out.println(colon);
    }
}
