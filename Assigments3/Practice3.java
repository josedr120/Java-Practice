package Assigments3;

public class Practice3 {
    public static void main(String[] args) {
        String s1 = "Java is an object oriented programming language";
        String s2 = "Author name is James gosling";

        System.out.println("Index of A: " + s1.length() + ", " + s1.indexOf("a"));

        System.out.println("Character: " + s1.charAt(9) + ", " + s1.charAt(0) + ", " + s1.charAt(39) + ", " + s1.charAt(37));

        if (s1.equals(s2) == s2.equals(s1)) {
            System.out.println("Is not equal");
        } else {
            System.out.println("Is equal");
        }
    }
}
