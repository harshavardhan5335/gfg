package gfg.java.array;

public class multidim {
    public static void main(String[] args) {
        int[][] array = { {1, 2, 3}, {1, 2, 3}, {1, 2, 3} };

        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
