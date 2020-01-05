package Assigments7;

public class Practice4 {
    public static void main(String[] args) {
        // array of size 7.
        int[] arr = new int[7];

        try {
            int i = arr[7];
            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught in catch block");
        } finally {
            System.out.println("finally block executed");
        }


    }
}
