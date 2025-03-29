package gfg.java.array;

public class array {

    public static void main(String[] args) {
        // Declaring
        int[] array;

        // Allocating memory to array
        array = new int[10];

        // combining both declaring and allocating
        int[] array2 = new int[10];
        System.out.println(array2.length);

        // declaring array literal (less java10version)
        int[] array3 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(array.length);
        for (int num : array3) {
            System.out.println(num);
        }

        // declaring array literal (java10version+++)
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int num1 : numbers) {
            System.out.println(num1);
        }
    }
}