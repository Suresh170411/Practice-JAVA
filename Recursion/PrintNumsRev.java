package Recursion;

public class PrintNumsRev {
    public static void main(String[] args) {
        int n = 5;
        printNums(n);
    }
    public static void printNums(int n){
        if (n == 0) return;
        System.out.println(n);
        printNums(n-1);
    }
}
