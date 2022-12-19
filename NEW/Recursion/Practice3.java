package NEW.Recursion;

public class Practice3 {
    public static void main(String[] args) {
        int n = 5;
        printNumber(n);
    }
    public static void printNumber(int n){
        
        if (n == 0) return;
        System.out.print(n+" ");
        printNumber(n-1);
    }
}
