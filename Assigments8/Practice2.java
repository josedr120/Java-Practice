package Assigments8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice2 {
    private static Set<Book> books = new HashSet<>(Arrays.asList(
            new Book(
                    1,
                    "Tarzan",
                    19.99
            ),
            new Book(
                    2,
                    "The Bible",
                    18.99
            )
    ));

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Set<Integer> list_id = new HashSet<Integer>();

        String name;
        int id;
        double price;

        System.out.print("Provide Book ID: ");
        id = in.nextInt();
        System.out.print("Provide Book Name: ");
        name = in.next();
        System.out.print("Provide Book Price: ");
        price = in.nextDouble();

        System.out.println(books.stream().filter(book -> book.getBook_id() == id).findFirst().get().getBook_name());

        list_id.add(id);

        if (list_id.contains(id)) {
            System.out.print("“Sorry, you are trying to enter repeated Book details.");
        } else {

            System.out.print("Yay!! Added.");
        }


    }
}

class Book {
    private int book_id;
    private String book_name;
    private double book_price;

    public Book(int book_id, String book_name, double book_price) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_price = book_price;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }
}
