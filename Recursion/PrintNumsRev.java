package Recursion;

public class PrintNumsRev {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 1;
        printNumsRev(n1);
        System.out.println();
        printNums(n2);
    }
    public static void printNumsRev(int n){
        if (n == 0) return;
        System.out.print(n+" ");
        printNumsRev(n-1);
    }

    public static void printNums(int n){
        if (n == 6){
            return;
        }
        System.out.print(n+" ");
        printNums(n+1);
    }
}
