package gfg.java.patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int row = sc.nextInt();
        for (int i = row; i >= 1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
