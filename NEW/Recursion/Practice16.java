package NEW.Recursion;

public class Practice16 {
    static int count = 0;
    public static void main(String[] args) {
        int n = 5;
        int res = TOH(n, "A", "B", "C");
        System.out.println(res);
    }

    public static int TOH(int n,String source, String helper, String destination){
        count++;
        if (n == 1){
            return 1;
        }
        TOH(n-1, source, destination, helper);
        TOH(n-1, helper, source, destination);
        return count;
    }
}
