package NEW.Recursion;

public class Practice7 {
    public static void main(String[] args) {
        int n = 2;
        int x = 10;

        // System.out.println((int)Math.pow(x,n));

        int res = calcPower(x, n);
        System.out.println(res);

    }
    public static int calcPower(int x, int n){
        if (n == 0) return 1;
        if (x == 0) return 0;

        int xPownm1 = calcPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }
}
