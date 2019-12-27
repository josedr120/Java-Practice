package Assigments4;

public class Practice5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 5, 7};
        int[] arr2 = {2, 5, 4, 6};

        int z = arr1.length;
        int c = arr2.length;

        intersection(arr1, arr2, z, c);


    }

    // Function to find intersection
    static void intersection(int[] a, int[] b, int n, int m) {
        int i = 0, j = 0;

        while (i < n && j < m) {

            if (a[i] > b[j]) {
                j++;
            } else if (b[j] > a[i]) {
                i++;
            } else {
                // when both are equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }
}
