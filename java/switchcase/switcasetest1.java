package gfg.java.switchcase;

import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY ,
}

public class switcasetest1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Day today = Day.FRIDAY;
        switch (today) {
            case FRIDAY :
                System.out.println("its friday");
                break;

            case MONDAY:
                System.out.println("its monday dude");

                break;

            default:
                break;
        }

    }
}
