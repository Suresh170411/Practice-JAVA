package NEW.Recursion;

// FACTORIAL recursive solution-->
public class Practice1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcFactorial(n));
    }
    public static int calcFactorial(int n){
        
        if (n == 0 || n == 1) return 1;

        return n*calcFactorial(n-1);
    }
}
