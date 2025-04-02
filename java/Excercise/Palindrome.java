package gfg.java.Excercise;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String strr = sc.nextLine();
        String str2 = "";
        int strlength = strr.length();

        for (int i = (strlength - 1); i >= 0; --i) {
            str2 = str2 + strr.charAt(i);
        }

        if (strr.toLowerCase().equals(str2.toLowerCase())) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}
