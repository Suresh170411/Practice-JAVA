package NEW.Recursion;

public class Practice3 {
    public static void main(String[] args) {
        int n = 1;
        printNumber(n);
    }
    public static void printNumber(int n){
        if (n == 6) return;
        System.out.print(n+" ");
        printNumber(n+1);
    }
}
