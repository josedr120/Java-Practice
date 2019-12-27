package Level3;

public class Practice2 {
    static int[] intArray;

    public static void main(String[] args) throws Exception {
        intArray = new int[5];
        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;
        intArray[3] = 3;
        intArray[4] = 4;
        intArray[5] = 5;

        try {
            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
        }


        if (intArray.length == 5) {
            throw new Exception("Test");
        } else {
            System.out.println("Success");
        }


    }


    static void test() throws checkList {
        try {
            if (intArray.length != 5) {
                System.out.println("Elements are in List");
            }
        } catch (Exception o) {

        }
    }

    static class checkList extends Exception {
        checkList(String s) {
            super(s);
        }
    }


}
