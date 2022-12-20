package NEW.Recursion;

public class TowerOfHanoi {
    public static int count=0;
    public static void main(String[] args) {
        int n = 3;
        TOH(n, "SOURCE", "HELPER", "DESTINATION");
        System.out.println("Number of operations required : "+count);
    }
    public static void TOH(int n, String source, String helper, String destination){
        count++;
        if (n == 1){
            System.out.println("transfer disk "+n+" from "+source+" to "+destination);
            return;
        }

        TOH(n-1, source,destination, helper);
        System.out.println("transfer disk "+n+" from "+source+" to "+destination);
        TOH(n-1,helper, source, destination);
    }
}
