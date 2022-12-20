package NEW.Recursion;

public class Practice12 {
    public static void main(String[] args) {
        System.out.println(hani(4));
    }
    public static int hani(int x){
        if (x < 1) return 1;
        else return hani(x-1) + bani(x);
    }
    public static int bani(int x){
        if (x < 2) return 1;
        else return hani(x-1)+(x/2);
    }
}
