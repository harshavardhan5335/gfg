package gfg.java.Excercise;

import java.util.Scanner;

class simpleinterestcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Princiapal amount ");
        double Princiapal = sc.nextDouble();
        System.out.print("Enter the Rate of interest ");
        double Rateofinterest = sc.nextDouble();
        System.out.print("Enter the time (years) ");
        double Time = sc.nextDouble();
        simpleinterest(Princiapal, Rateofinterest, Time);
        sc.close();
    }

    public static void simpleinterest(double n, double v, double j) {
        System.out.println((n * v * j) / 100);

    }

}
