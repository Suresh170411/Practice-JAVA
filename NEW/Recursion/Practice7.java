package NEW.Recursion;

public class Practice7 {
    public static void main(String[] args) {
        

    }
    public static int calcPower(int x, int n){
        if (n == 0) return 1;
        if (x == 0) return 0;

        int xPownm1 = calcPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }
}
