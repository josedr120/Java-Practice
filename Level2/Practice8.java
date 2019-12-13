/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level2;

import java.util.Scanner;

/**
 * @author josedr
 */
public class Practice8 {
    public static void main(String[] args) {
        String q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

        q1 = "What color are banana's?:\n" + "(a)red/green\n(b)Yellow\n(c)Blue";
        q2 = "What is H2O?:\n" + "(a)Water\n(b)Soil\n(c)Sand";
        q3 = "What color are apples?:\n" + "(a)red/green\n(b)Magenta\n(c)Blue";
        q4 = "In Java a String is the variable for Text?:\n" + "(a)True\n(b)False";
        q5 = "What is pi?:\n" + "(a)1.14\n(b)2.15\n(c)3.14";
        q6 = "What is a ki?:\n" + "(a)Bubles\n(b)Energy\n(c)Nothing";
        q7 = "What is a int variable?:\n" + "(a)String\n(b)Decimal\n(c)Integer";
        q8 = "Is Netflix is cool?:\n" + "(a)True\n(b)False";
        q9 = "Is DisneyPlus is new?:\n" + "(a)True\n(b)False\n(c)What is DisneyPlus?";
        q10 = "Is the human inmortal?:\n" + "(a)True\n(b)I dont know\n(c)False";


        p8Question[] questions = {
                new p8Question(q1, "b"),
                new p8Question(q2, "a"),
                new p8Question(q3, "a"),
                new p8Question(q4, "a"),
                new p8Question(q5, "c"),
                new p8Question(q6, "b"),
                new p8Question(q7, "c"),
                new p8Question(q8, "a"),
                new p8Question(q9, "a"),
                new p8Question(q10, "c")
        };
        takeTest(questions);
    }

    public static void takeTest(p8Question[] questions) {
        int score = 0;
        Scanner kInput = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = kInput.nextLine();

            if (answer.equals(questions[i].answer)) {
                score++;
            }
        }

        System.out.println("You got " + score + "/" + questions.length);
    }
}