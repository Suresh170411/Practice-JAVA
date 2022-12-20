package NEW.Recursion;

public class Practice8 {
    public static void main(String[] args) {    // calculate X^N (LOGn)
        int x = 3, n = 2;
        int res = calcPow(x, n);
        System.out.println(res);
    }
    public static int calcPow(int x, int n){
        if (n == 0) return 1;
        if (x == 0) return 0;

        if (n %2 == 0) {
            return calcPow(x, n/2) * calcPow(x, n/2);
        }else{
            return calcPow(x,n/2) * calcPow(x, n/2) * x;
        }
    }
}
