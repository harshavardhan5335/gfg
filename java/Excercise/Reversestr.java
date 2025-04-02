package gfg.java.Excercise;

import java.util.Scanner;

public class Reversestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str1 = sc.nextLine();
        String reversestr1 = "";
        for (int i = (str1.length() - 1); i >= 0; --i) {
            reversestr1 = reversestr1 + str1.charAt(i);
        }
        System.out.println(reversestr1);
        sc.close();
    }
}
