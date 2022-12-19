package NEW.Recursion;

public class Practice4 {
    public static void main(String[] args) {
        int n = 1;

    }
    public static void printNums(int n){
        if (n == 6){
            return;
        }

        System.out.print(n+" ");
        printNums(n+1);
    }
}
