package NEW.Recursion;

public class Practice5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n);
    }
    public static int printSum(int n){
        if (n <= 0) return n;
        return n+printSum(n-1);
    }
}
