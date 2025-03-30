package gfg.java.switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Open Scanner once

        while (true) { // Infinite loop, will break if needed
            System.out.println("Select a number between 1 to 7 (or 0 to exit):");
            int day = sc.nextInt(); // Take input

            if (day == 0) { // Condition to exit the loop
                System.out.println("Exiting program...");
                break;
            }

            switch (day) {
                case 1:
                    System.out.println("The day of the week is Monday");
                    break;
                case 2:
                    System.out.println("The day of the week is Tuesday");
                    break;
                case 3:
                    System.out.println("The day of the week is Wednesday");
                    break;
                case 4:
                    System.out.println("The day of the week is Thursday");
                    break;
                case 5:
                    System.out.println("The day of the week is Friday");
                    break;
                case 6:
                    System.out.println("The day of the week is Saturday");
                    break;
                case 7:
                    System.out.println("The day of the week is Sunday");
                    break;
                default:
                    System.out.println("Invalid input! Please enter a number between 1 and 7.");
            }
        }

        sc.close(); // Close Scanner after exiting the loop
    }
}
