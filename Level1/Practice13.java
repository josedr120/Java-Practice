/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level1;

import java.util.ArrayList;

/**
 * @author josedr
 */
public class Practice13 {
    public static void main(String[] args) {
        String[] example1 = {"cat", "flag", "green", "country", "colors"};
        String[] example2 = {"cat", "dog", "red", "is", "am"};

        System.out.println("Longest word(s) of the dic: " + longestWords(example1) + longestWords(example2));


    }


    public static ArrayList<String> longestWords(String[] dictionary) {

        ArrayList<String> list = new ArrayList<>();
        int longest_length = 0;
        for (String str : dictionary) {
            int length = str.length();
            if (length > longest_length) {
                longest_length = length;
                list.clear();
            }
            if (length == longest_length) {
                list.add(str);
            }
        }

        return list;
    }
}
