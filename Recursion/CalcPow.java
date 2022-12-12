package Recursion;

public class CalcPow {
    public static void main(String[] args) {
        
        int x = 2;
        int n = 3;

        int ans = calcPow(x, n);
        System.out.println(ans);
    }

    public static int calcPow(int x, int n){

        if (n == 0) return 1;
        if (x == 0) return 0;

        int xPowernm1 = calcPow(x, n-1);
        int xPown = x * xPowernm1;

        return xPown;
    }
}
