package gfg.java.jumpstatements;

import java.util.Scanner;

public class break1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();
        int i;
        for (i = 0; i <= num; i++) {
            if (i == 3) {
                System.out.println("Stopped printinig because i= 3 ");
                break;
            }
            System.out.println(i);
        }

        sc.close();

    }
}
