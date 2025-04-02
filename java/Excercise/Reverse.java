package gfg.java.Excercise;

public class Reverse {

    public static void main(String[] args) {
        int num = 1234;
        int Reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            Reverse = Reverse * 10 + remainder;
            num /= 10;
        }
        System.out.println(Reverse);
    }
}