package Recursion;

public class RecPrintSum {
    public static void printSum(int i, int n, int sum){

        if (i == n){
            sum+=i;
            System.out.println("sum is: "+sum);
            return;
        }

        sum+=i;
        printSum(i+1, n, sum);
    }

    public static int sumPrint(int n){
        if (n == 0){
            return n;
        }else {
            return n+sumPrint(n-1);
        }
    }

    public static void main(String[] args) {
        printSum(1, 5, 0);

        int n = 5;
        int res = sumPrint(n);
        System.out.println(res);
    }
}
