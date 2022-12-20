package NEW.Recursion;

public class Practice14 {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(digitSum(n));
    }

    public static int digitSum(int n){
        if (n == 0) return 0;
        return n%10+digitSum(n/10);
    }
    
}
