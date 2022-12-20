package NEW.Recursion;

public class Practice10 {
    public static void main(String[] args) {
        int n = 5;
        printNums(n);
        System.out.println();
        printNumsRev(1);
    }
    public static void printNums(int n){
        if (n == 0){
            return;
        }
        printNums(n-1);
        System.out.print(n+" ");
    }
    public static void printNumsRev(int n){
        if (n > 5){
            return;
        }
        printNumsRev(n+1);
        System.out.print(n+" ");
    }
}
