package Recursion;

public class Fibbonacci {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }

    public static int fib(int n){   // COUNTING....

        if (n <= 1) return 1;

        return fib(n-1) + fib(n-2);
    }
}
