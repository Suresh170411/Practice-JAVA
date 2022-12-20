package NEW.Recursion;

public class Practice9 {
    public static void main(String[] args) {
        
        int n = 5;
        printFacto(n);

    }
    public static void printFacto(int n){
        int sum = 1;
        for (int i=1; i<=n; i++){
            sum*= i;
        }
        System.out.println(sum);
    }
}
