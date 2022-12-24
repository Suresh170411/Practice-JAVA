package NEW.Recursion;

public class DigitSum {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(digitSum(n));
    }

    // DIGTI SUM recursive function -->
    public static int digitSum(int n){
        if (n == 0) return 0;
        return n%10+digitSum(n/10);
    }
    
}
