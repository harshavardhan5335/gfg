package gfg.java.patterns;

import java.util.Scanner;

public class pattern4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = scanner.nextInt();
        for (int i = rows; i >= 1; --i) {
            for (int j = i; j >= 1; --j) {
                System.out.print(i+" ");
            }
            System.out.println(" ");

        }
        scanner.close();
    }
}
