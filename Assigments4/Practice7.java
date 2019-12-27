package Assigments4;

import java.util.Arrays;
import java.util.List;

public class Practice7 {
    public static void main(String[] args) {
        String[] str = new String[]{"F", "J", "D", "H", "B", "R"};

        List strList = Arrays.asList(str);

        System.out.println(strList.contains("J"));
        System.out.println(strList.contains("O"));
    }
}
