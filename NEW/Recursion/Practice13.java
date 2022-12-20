package NEW.Recursion;

public class Practice13 {
    public static void main(String[] args) {
        System.out.println(fun(3, 5));
    }
    public static int fun(int x, int y){
        if (x == 0) return y;
        else return fun(x-1, x+y);
    }
}
