package NEW.Recursion;

public class Practice9 {
    public static void main(String[] args) {
        
        int n = 0;
        printFacto(n);

    }
    public static void printFacto(int n){
        int sum = 1;
        for (int i=1; i<=n; i++){
            sum*= i;
        }
        System.out.println(sum);

        System.out.println(printFactorial(n));
    }

    public static int printFactorial(int n){
        if (n <= 1) return 1;
        return n*printFactorial(n-1);
    }
}
