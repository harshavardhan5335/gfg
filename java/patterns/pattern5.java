package gfg.java.patterns;

import java.util.Scanner;

public class pattern5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a rows : ");
        int rows = sc.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}