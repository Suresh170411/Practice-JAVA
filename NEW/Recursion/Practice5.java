package NEW.Recursion;

public class Practice5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n);
    }
    public static int printSum(int n){
        int sum = 0;
        if (n <= 0) return n;
        sum+= printSum(n-1);
        return sum;
    }
}
