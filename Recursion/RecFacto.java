package Recursion;

public class RecFacto {
    public static int calcFacto(int n){

        if (n == 1 || n==0){
            return 1;
        }

        // int fact_nm1 = calcFacto(n-1);      // calculation FACTORIAL using RECURSION
        // int fact_n = n*fact_nm1;
        // return fact_n;

        return n*calcFacto(n-1);
    }

    public static void main(String[] args) {
        int n = 5;

        int ans = calcFacto(n);
        System.out.println("Factorial of "+n+" is : "+ans);
    }
}
