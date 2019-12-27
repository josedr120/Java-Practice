package Assigments4;

public class Practice6 {
    static int[] arr = {12, 3, 4, 15, 80, 500, 78, 56};

    public static void main(String[] args) {
        System.out.println(sum());
    }

    // method for sum of elements in an array
    static int sum() {
        int sum = 0; // initialize sum
        int i;

        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }
}
