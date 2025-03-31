package gfg.java.jumpstatements;

import java.util.Scanner;

public class continue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();
        int i;
        for (i = 0; i <= num; i++) {
            if (i == 3)
                continue;
            System.out.println(i);
        }
        sc.close();
    }

}
