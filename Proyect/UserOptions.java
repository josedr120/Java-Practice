package Proyect;

import java.util.Scanner;

public class UserOptions {
    public int insert_id;
    public String insert_name;
    Scanner in = new Scanner(System.in);

    public int getInsert_id() {
        return insert_id;
    }

    public void setInsert_id(int insert_id) {
        this.insert_id = insert_id;
    }

    public String getInsert_name() {
        return insert_name;
    }

    public void setInsert_name(String insert_name) {
        this.insert_name = insert_name;
    }


    public void insertOption() {

        System.out.print("Enter ID: ");
        setInsert_id(in.nextInt());
        System.out.print("Enter Name: ");
        setInsert_name(in.next());


        new DBConnection(getInsert_id(), getInsert_name());
    }

}
