package Recursion;

public class Practice {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(printFibo(n));   
    }

    public static int printFibo(int n){
        if (n <= 1){
            return 1;
        }
        return printFibo(n-1)+printFibo(n-2);
    }
}
