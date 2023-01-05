package NEW.Recursion;

public class Practice7 {
    public static void main(String[] args) {
        int x = 5;
        int n = 2;

        int res = calcPower(x, n);
        System.out.println(res);

        // System.out.println(Math.pow(x, n));
    }
    public static int calcPower(int x, int n){
        if (x == 0) return 0;
        if (n == 0) return 1;

        return x * calcPower(x, n-1);
    }
}
