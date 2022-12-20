package NEW.Recursion;

public class Practice14 {
    public static void main(String[] args) {
        System.out.println(powerOfN(2, 3));
    }
    public static int powerOfN(int x, int n){
        
        if (n == 0) return 1;
        return x*powerOfN(x, n-1);
    }
}
