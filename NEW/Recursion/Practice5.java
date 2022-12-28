package NEW.Recursion;

public class Practice5 {
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(printSum(n));
    }

    //print nums recursive functions
    public static int printSum(int n){
        if (n <= 1) return n;

        return n+ printSum(n-1);
    }

}
