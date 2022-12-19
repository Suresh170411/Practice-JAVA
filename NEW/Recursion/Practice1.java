package NEW.Recursion;

public class Practice1 {
    public static void main(String[] args) {
        int n = 5;
        calcFactorialBF(n);
    }
    public static void calcFactorialBF(int n){
        int sum = 1;
        for (int i=1; i<=n; i++){
            sum = sum*n;
        }
        System.out.println(sum);
    }
}
