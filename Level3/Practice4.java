package Level3;

import java.util.Scanner;

interface Discounts {
    void discount();

    void tax();
}

public class Practice4 {

    Customers customers = new Customers();
    Scanner in = new Scanner(System.in);
    int cId = customers.getCustomer_id();

    public static void main(String[] args) {
        new Practice4().BookMenu();
    }

    public void BookMenu() {

    }
}

class Books {
    private int book_id;
    private String book_title;
    private String book_author;
    private String publisher;
    private double book_price;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }

    enum Category {
        Fantasy,
        Action,
        Drama,
        RealLifeShit
    }

}

class Customers extends Books implements Discounts {
    private int customer_id;
    private String customer_name;
    private String contact_number;
    private String email_id;
    private String address;


    @Override
    public void discount() {

    }

    @Override
    public void tax() {

    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}