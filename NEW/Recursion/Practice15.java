package NEW.Recursion;

public class Practice15 {
    public static void main(String[] args) {
        System.out.println(GCD(60, 36));
    }
    public static int GCD(int a, int b){
        if (a == 0){
            return b;
        }
        return GCD(b%a, a);
    }
}
