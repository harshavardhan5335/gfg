package gfg.java.Excercise;

public class Fibonacci {
    public static int Fibo(int num) {
        if (num <= 1) {
            return num;
        }
        return Fibo(num - 1) + Fibo(num - 2);

    }

    public static void main(String[] args) {
        int num = 10;
        for (int i = 0; i <= num; i++) {
            System.out.print(Fibo(i) + "");
        }
    }
}
