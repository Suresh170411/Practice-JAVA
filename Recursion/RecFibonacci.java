package Recursion;

public class RecFibonacci {
    public static void printFibona(int a, int b, int n){

        if(n == 0){
            return;
        }

        int c = a+b;
        System.out.println(c);
        printFibona(b, c, n-1);         // printing FIBONACCI using RECURSION
    }

    public static void main(String[] args) {
        
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);

        int n = 7;
        printFibona(a, b, n-2);
    }
}
